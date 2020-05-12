package com.javarush.task.task32.task3209;

import javax.swing.text.html.HTMLDocument;
import java.io.File;

public class Controller {
    private View view;
    private HTMLDocument document;
    private File currentFile;

    public Controller(View view) {
        this.view = view;
    }

    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        view.setController(controller);
        view.init();
        controller.init();

    }

//    2.1. Добавь в контроллер и представление по методу init(), пока без реализаций.
//    Они будут отвечать за инициализацию контроллера и представления.
    public void init() {

    }

//    2.3. Добавь в контроллер метод exit(),
//    он должен вызывать статический метод exit у класса System.
    public void exit() {
        System.exit(0);
    }
}
