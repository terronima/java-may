package ru.gorbunov.java.core.lesson__1;

import ru.gorbunov.java.core.lesson_3.Obstacles;
import ru.gorbunov.java.core.lesson_3.Participants;
import ru.gorbunov.java.core.lesson_3.Treadmill;
import ru.gorbunov.java.core.lesson_3.Wall;

import java.util.Random;

public class Cat implements Participants {
    String name;
    Random value = new Random();
    Integer jump = value.nextInt(2);
    Integer run = value.nextInt(50);
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean Action(Obstacles obstacle) {
        if (obstacle.getClass() == Treadmill.class) {
            if (this.run >= obstacle.value()) {
                System.out.printf("Кот %s пробежал дистанцию %s\n", this.name, obstacle.value());
                return true;
            } else {
                System.out.printf("Кот %s непробежал дистанцию %s, потому что у него лапки\n", this.name, obstacle.value());
                return false;
            }
        } else if (obstacle.getClass() == Wall.class) {
            if (this.run >= obstacle.value()) {
                System.out.printf("Кот %s перепрыгнул стену высотой %s\n", this.name, obstacle.value());
                return true;
            } else {
                System.out.printf("Кот %s неперепрыгнул стену высотой %s, потому что у него лапки\n", this.name, obstacle.value());
                return false;
            }
        }
        return false;
    }

}
