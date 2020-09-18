package com.javarush.task.task39.task3913;

import com.javarush.task.task39.task3913.query.IPQuery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser implements IPQuery {
    private List<LogEntry> entries = new ArrayList<>();
    private List<File> logs = new ArrayList<>();

    public LogParser(Path logDir) {
    }


    @Override
    public int getNumberOfUniqueIPs(Date after, Date before) {
        return getUniqueIPs(after, before).size();
    }

    @Override
    public Set<String> getUniqueIPs(Date after, Date before) {
        Set<String> ips = new HashSet<>();
        List<LogEntry> entries = getFilteredLogEntries(after, before);
        for (LogEntry entry : entries){
            ips.add(entry.getIp());
        }
        return ips;
    }

    private List<LogEntry> getFilteredLogEntries(Date after, Date before){
        List<LogEntry> logs = new ArrayList<>();
        for (LogEntry entry : entries){
            if (isDateInRange(entry.getDateOfEvent(), after, before)){
                logs.add(entry);
            }
        }
        return logs;
    }

    private boolean isDateInRange(Date check, Date after, Date before) {
        boolean fits = before == null || check.before(before) || check.equals(before);
        return fits && (after == null || check.after(after) || check.equals(after));
    }

    private List<LogEntry> getFilteredLogEntriesStrong(Date after, Date before){
        List<LogEntry> logs = new ArrayList<>();
        for (LogEntry entry : entries){
            if (isDateInRangeStrong(entry.getDateOfEvent(), after, before)){
                logs.add(entry);
            }
        }
        return logs;
    }
    private boolean isDateInRangeStrong(Date check, Date after, Date before) {
        boolean fits = before == null || check.before(before);
        return fits && (after == null || check.after(after));
    }

    @Override
    public Set<String> getIPsForUser(String user, Date after, Date before) {
        List<LogEntry> entries = getFilteredLogEntries(after, before);
        Set<String> ips = new HashSet<>();
        for (LogEntry entry : entries){
            if (user.equals(entry.getName())){
                ips.add(entry.getIp());
            }
        }
        return ips;
    }

    @Override
    public Set<String> getIPsForEvent(Event event, Date after, Date before) {
        List<LogEntry> entries = getFilteredLogEntries(after, before);
        Set<String> ips = new HashSet<>();
        for (LogEntry entry : entries){
            if (event == entry.getEvent()){
                ips.add(entry.getIp());
            }
        }
        return ips;
    }

    @Override
    public Set<String> getIPsForStatus(Status status, Date after, Date before) {
        List<LogEntry> entries = getFilteredLogEntries(after, before);
        Set<String> ips = new HashSet<>();
        for (LogEntry entry : entries){
            if (status == entry.getStatus()){
                ips.add(entry.getIp());
            }
        }
        return ips;
    }

    private class LogEntry {
        private String ip;
        private String name;
        private Date dateOfEvent;
        private Event event;
        private Integer eventNumber = null;
        private Status status;
        public LogEntry(String log){
            parseIP(log);
            parseName(log);
            parseDate(log);
            parseEvent(log);
            parseStatus(log);
        }
        private Pattern pattern = Pattern.compile("(?<ip>[\\d]+.[\\d]+.[\\d]+.[\\d]+)\\s" +
                "(?<name>[a-zA-Z ]+)\\s" +
                "(?<date>[\\d]+.[\\d]+.[\\d]+ [\\d]+:[\\d]+:[\\d]+)\\s" +
                "(?<event>[\\w]+)\\s?(" +
                "(?<taskNumber>[\\d]+)|)\\s" +
                "(?<status>[\\w]+)");
        private void parseIP(String log){
            Matcher matcher = pattern.matcher(log);
            matcher.find();
            ip = matcher.group("ip");
        }
        private void parseName(String log){
            Matcher matcher = pattern.matcher(log);
            matcher.find();
            name = matcher.group("name");
        }
        private void parseDate(String log){
            Matcher matcher = pattern.matcher(log);
            matcher.find();
            String sDate = matcher.group("date");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.US);
            try{
                dateOfEvent = simpleDateFormat.parse(sDate);
            } catch (ParseException e){
                e.printStackTrace();
            }
        }
        private void parseEvent(String log){
            Matcher matcher = pattern.matcher(log);
            matcher.find();
            event = Event.valueOf(matcher.group("event"));
            if ((event == Event.SOLVE_TASK) || (event == Event.DONE_TASK)){
                eventNumber = Integer.parseInt(matcher.group("taskNumber"));
            }
        }
        private void parseStatus(String log){
            Matcher matcher = pattern.matcher(log);
            matcher.find();
            status = Status.valueOf(matcher.group("status"));
        }

        public String getIp() {
            return ip;
        }

        public String getName() {
            return name;
        }

        public Date getDateOfEvent() {
            return dateOfEvent;
        }

        public Event getEvent() {
            return event;
        }

        public Integer getEventNumber() {
            return eventNumber;
        }

        public Status getStatus() {
            return status;
        }
    }
}