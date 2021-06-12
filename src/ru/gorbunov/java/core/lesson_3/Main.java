package ru.gorbunov.java.core.lesson_3;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox = new Box<>(apple, 30);
        Box<Orange> orangeBox = new Box<>(orange, 10);
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
    }
}
