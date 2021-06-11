package ru.gorbunov.java.core.lesson__1;

import ru.gorbunov.java.core.lesson_3.Cat;
import ru.gorbunov.java.core.lesson_3.Man;
import ru.gorbunov.java.core.lesson_3.Obstacles;
import ru.gorbunov.java.core.lesson_3.Participants;
import ru.gorbunov.java.core.lesson_3.Robot;
import ru.gorbunov.java.core.lesson_3.Treadmill;
import ru.gorbunov.java.core.lesson_3.Wall;

public class Main {

    public static void main(String[] args) {
        ru.gorbunov.java.core.lesson_3.Participants[] participants = new Participants[3];
        ru.gorbunov.java.core.lesson_3.Obstacles[] obstacles = new Obstacles[5];

        participants[0] = new Man("Fedor");
        participants[1] = new Cat("Pluto");
        participants[2] = new Robot("R2D2");

        obstacles[0] = new ru.gorbunov.java.core.lesson_3.Wall();
        obstacles[1] = new ru.gorbunov.java.core.lesson_3.Treadmill();
        obstacles[2] = new ru.gorbunov.java.core.lesson_3.Wall();
        obstacles[3] = new Treadmill();
        obstacles[4] = new Wall();
        for (int i = 0; i < participants.length; i++){
            for (int j = 0; j < obstacles.length; j++) {
                if (!participants[i].Action(obstacles[j])) {
                    break;
                }
            }
        }
    }
}