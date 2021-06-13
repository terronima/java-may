package ru.gorbunov.java.core.lesson_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final ArrayList<String[]> phoneBook = new ArrayList<>();

    public void AddInstance(String name, String phone){
        String[] contact = {name, phone};
        this.phoneBook.add(contact);
    }

    public void GetAllSimilar (String name) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i)[0].equals(name))
            System.out.println(Arrays.toString(phoneBook.get(i)));
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
