package ru.gorbunov.java.core.lesson__1;

import ru.gorbunov.java.core.lesson_3.Obstacles;
import ru.gorbunov.java.core.lesson_3.Participants;
import ru.gorbunov.java.core.lesson_3.Treadmill;
import ru.gorbunov.java.core.lesson_3.Wall;

import java.util.Random;

public class Robot implements Participants {
    String name;
    Random value = new Random();
    Integer jump = value.nextInt(5);
    Integer run = value.nextInt(200);
    public Robot(String name) {
        this.name = name;
    }


    @Override
    public boolean Action(Obstacles obstacle) {
        if (obstacle.getClass() == Treadmill.class) {
            if (this.run >= obstacle.value()) {
                System.out.printf("Робот %s пробежал дистанцию %s\n", this.name, obstacle.value());
                return true;
            } else {
                System.out.printf("Робот %s непробежал дистанцию %s, бесполезная железяка\n", this.name, obstacle.value());
                return false;
            }
        } else if (obstacle.getClass() == Wall.class) {
            if (this.run >= obstacle.value()) {
                System.out.printf("Робот %s перепрыгнул стену высотой %s\n", this.name, obstacle.value());
                return true;
            } else {
                System.out.printf("Робот %s неперепрыгнул стену высотой %s, бесполезная железяка\n", this.name, obstacle.value());
                return false;
            }
        }
        return false;
    }
}
