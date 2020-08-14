package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdvertisementManager {
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds; // максимальное суммарное время рекламы

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() throws NoVideoAvailableException {
        if (storage.list().isEmpty())
            throw new NoVideoAvailableException();

        List<Advertisement> videos = new ArrayList<>(storage.list());

        videos.sort(Comparator.comparingInt(Advertisement::getDuration));
        videos.sort(Comparator.comparingLong(Advertisement::getAmountPerOneDisplaying));
        Collections.reverse(videos);

        // (14)
        List<Advertisement> shownAds = new ArrayList<>();

        int sumTime = timeSeconds;
        long amount = 0;

        for (Advertisement ad : videos) {
            if (ad.getDuration() <= sumTime && ad.getAmountPerOneDisplaying() > 0) {
                shownAds.add(ad);
                amount += ad.getAmountPerOneDisplaying();
                sumTime -= ad.getDuration();
            }
        }

        // (14)
        registerEvent(shownAds, amount, (timeSeconds - sumTime));


        showAds(shownAds);
    }

    private void showAds(List<Advertisement> shownAds) {
        shownAds.stream()
                .filter(ad -> ad.getHits() > 0)
                .peek(x -> ConsoleHelper.writeMessage(x.toString()))
                .forEach(Advertisement::revalidate);
    }

    // (14)
    private void registerEvent(List<Advertisement> shownAds, long amount, int totalDuration) {
        StatisticManager.getInstance().register(
                new VideoSelectedEventDataRow(shownAds, amount, totalDuration)
        );
    }
}