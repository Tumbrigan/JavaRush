package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//  5.1. Объяви класс TabbedPaneChangeListener
//  реализующий интерфейс ChangeListener в пакете listeners.
//  Этот класс будет слушать и обрабатывать изменения состояния панели вкладок.
//  Реализуй в этом классе:

public class TabbedPaneChangeListener implements ChangeListener {
    private View view;

    //  5.1.1. Конструктор, принимающий представление в виде параметра
//  и сохраняющий во внутреннее поле view класса.
    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    //    5.1.2. Переопредели метод из интерфейса ChangeListener,
//    он должен вызывать метод selectedTabChanged() у представления.
//    Последнего метода еще нет, сделай для него заглушку.
    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}
