package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //    2.1. Добавь в контроллер и представление по методу init(), пока без реализаций.
//    Они будут отвечать за инициализацию контроллера и представления.
    public void init() {
//  4.3. Реализуй метод init() представления. Он должен:
//  4.3.1. Вызывать инициализацию графического интерфейса initGui().
        initGui();
//  4.3.2. Добавлять слушателя событий нашего окна.
//  В качестве подписчика создай и используй объект класса FrameListener.
        FrameListener listener = new FrameListener(this);
//  В качестве метода для добавления подписчика используй подходящий метод из класса Window
//  от которого наследуется и наш класс через классы JFrame и Frame.
        addWindowListener(listener);
//  4.3.3. Показывать наше окно. Используй метод setVisible с правильным параметром.
//  На этом этапе приложение при запуске должно показывать окно,
//  которое можно растягивать, разворачивать, закрыть и т.д.
        setVisible(true);


    }

    //    2.4. Добавь в представление метод exit(), он должен вызывать exit() у контроллера.
    public void exit() {
        controller.exit();
    }


    //    4.1. Объяви методы initMenuBar() и initEditor() в классе View.
//    Они будут отвечать за инициализацию меню и панелей редактора.
    public void initMenuBar() {

    }

    //  Реализуй метод инициализации панелей редактора initEditor(). Он должен:
    public void initEditor() {
//  6.1. Устанавливать значение "text/html" в качестве типа контента для компонента htmlTextPane.
//  Найди и используй подходящий метод.
        htmlTextPane.setContentType("text/html");
//  6.2. Создавать новый локальный компонент JScrollPane на базе htmlTextPane.
        JScrollPane pane = new JScrollPane(htmlTextPane);
//  6.3. Добавлять вкладку в панель tabbedPane с именем "HTML"
//  и компонентом из предыдущего пункта.
        tabbedPane.add("HTML", pane);
//  6.4. Создавать новый локальный компонент JScrollPane на базе plainTextPane.
        JScrollPane newPane = new JScrollPane(plainTextPane);
//  6.5. Добавлять еще одну вкладку в tabbedPane с именем "Текст"
//  и компонентом из предыдущего пункта.
        tabbedPane.add("Текст", newPane);
//  6.6. Устанавливать предпочтительный размер панели tabbedPane.
        tabbedPane.setPreferredSize(new Dimension(300, 300));
//  6.7. Создавать объект класса TabbedPaneChangeListener
//  и устанавливать его в качестве слушателя изменений в tabbedPane.
        TabbedPaneChangeListener listener = new TabbedPaneChangeListener(this);
        tabbedPane.addChangeListener(listener);
//  6.8. Добавлять по центру панели контента текущего фрейма нашу панель с вкладками.
//  Получить панель контента текущего фрейма можно с помощью метода getContentPane(),
//  его реализация унаследовалась от JFrame.
//  Подумай, метод с какими параметрами необходимо вызвать, чтобы панель с вкладками отображалась по центру панели контента текущего фрейма.
//  После запуска приложения можно будет увидеть текущие результаты: две независимые закладки (HTML и Текст), в каждой из которых можно набирать свой текст.
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }

    //  4.2. Объяви в представлении метод initGui().
//  Он будет инициализировать графический интерфейс.
//  Вызови из него инициализацию меню initMenuBar(),
//  инициализацию редактора initEditor() и метод pack(),
//  реализацию которого мы унаследовали от класса JFrame.
//  Разберись что делает метод pack().
    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    // 5.1.2 ... сделай для него заглушку.
    public void selectedTabChanged() {

    }
}