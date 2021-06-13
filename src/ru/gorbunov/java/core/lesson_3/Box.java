package ru.gorbunov.java.core.lesson_3;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private final T innerObject;
    public ArrayList<T> storage;
    private float weight;

    public Box(T object, int amount) {
        this.innerObject = object;
        ArrayList<T> stor = new ArrayList<>();
        for (int i = 0; i < amount ; i++) {
            stor.add(object);
        }
        this.storage = stor;
    }

    public T getInnerObject() {
        return innerObject;
    }

    public float getWeight() {
        this.weight += storage.size() * storage.get(0).getWeight();
        return this.weight;
    }

    public boolean compare(Box<?> box) {
        return box.weight == this.weight;
    }
}
