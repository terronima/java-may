package ru.gorbunov.java.core.lesson__1;

import ru.gorbunov.java.core.lesson_3.Obstacles;

import java.util.Random;

public class Treadmill implements Obstacles {

    public Integer value() {
        Random rng = new Random();
        Integer value = rng.nextInt(210);
        return value;
    }
}