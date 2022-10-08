package com.test.task3;

import lombok.SneakyThrows;
import lombok.Cleanup;

import java.io.FileWriter;

public class App {
    //Задача №3
    //Сделать в методе myGame так, чтобы writer закрывался, не писав при этом метод close.
    //Проверяемые ошибки должны быть проигнорированы

    @SneakyThrows
    public static void myGame() {
        @Cleanup FileWriter fileWriter = new FileWriter("..//resources//write.txt");
    }
}


