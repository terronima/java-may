package ru.gorbunov.java.core.lesson_1;

import java.util.Random;

public class Wall implements Obstacles{


    @Override
    public Integer value() {
        Random rng = new Random();
        Integer value = rng.nextInt(5);
        return value;
    }
}
