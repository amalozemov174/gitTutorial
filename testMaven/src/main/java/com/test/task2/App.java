package com.test.task2;

import lombok.SneakyThrows;

public class App {
    //Задача №2
    //Даны методы runExceptions. Сделать так, чтобы (код можно раскомментировать):
    //Первый метод выкидывал проверяемое исключение
    //Второй метод внутри себя выбрасывал непроверяемое исключение, но обрабатывал его
    //Третий метод выкидывал проверяемое исключение, но не содержал в сигнатуре метода этот тип ошибки
    public static void runExceptions() throws Exception {
        throw new Exception("Опачки");
        //throw new RuntimeException("Опачки");

    }

    public static void runExceptions2() {
        //throw new Exception("Опачки");
        try{
            throw new RuntimeException("Опачки");
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    @SneakyThrows
    public static void runExceptions3() {
        throw new Exception("Опачки");
        //throw new RuntimeException("Опачки");

    }

    public static void myGame() {
        //FileWriter writer = new FileWriter("1.txt");
    }
}
