package com.javarush.task.task32.task3209;

//5.2. Объяви класс ExceptionHandler.
// Это будет наш обработчик исключительных ситуаций,
// который ты в дальнейшем сможешь переопределить.
public class ExceptionHandler {

//    Пока добавь в него статический метод log(Exception e),
//    который будет выводить в консоль краткое описание проблемы
//    (используй метод toString у переданного исключения).
    public static void log(Exception e) {
        System.out.println(e.toString());
    }
}
