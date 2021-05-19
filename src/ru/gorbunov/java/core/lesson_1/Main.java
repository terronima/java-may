package ru.gorbunov.java.core.lesson_1;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = new Participants[3];
        Obstacles[] obstacles = new Obstacles[5];

        participants[0] = new Man("Fedor");
        participants[1] = new Cat("Pluto");
        participants[2] = new Robot("R2D2");

        obstacles[0] = new Wall();
        obstacles[1] = new Treadmill();
        obstacles[2] = new Wall();
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
