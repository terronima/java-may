package ru.gorbunov.java.core.lesson_1;

import java.util.Random;

public class Treadmill implements Obstacles{
    public Integer value() {
        Random rng = new Random();
        Integer value = rng.nextInt(210);
        return value;
    }
}
