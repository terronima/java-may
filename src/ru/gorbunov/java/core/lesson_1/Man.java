package ru.gorbunov.java.core.lesson_1;

import java.util.Random;

public class Man implements Participants{
    String name;
    Random value = new Random();
    Integer jump = value.nextInt(2);
    Integer run = value.nextInt(100);
    public Man(String name) {
        this.name = name;
    }

    @Override
    public boolean Action(Obstacles obstacle) {
        if (obstacle.getClass() == Treadmill.class) {
            if (this.run >= obstacle.value()) {
                System.out.printf("Человек %s пробежал дистанцию %s\n", this.name, obstacle.value());
                return true;
            } else {
                System.out.printf("Человек %s непробежал дистанцию %s\n", this.name, obstacle.value());
                return false;
            }
        } else if (obstacle.getClass() == Wall.class) {
            if (this.run >= obstacle.value()) {
                System.out.printf("Человек %s перепрыгнул стену высотой %s\n", this.name, obstacle.value());
                return true;
            } else {
                System.out.printf("Человек %s неперепрыгнул стену высотой %s\n", this.name, obstacle.value());
                return false;
            }
        }
        return false;
    }
}
