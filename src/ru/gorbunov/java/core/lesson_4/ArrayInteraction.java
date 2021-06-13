package ru.gorbunov.java.core.lesson_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayInteraction {
    public static ArrayList<String> getUniqueWords(String[] input){
        ArrayList<String> uniqueWords = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String temp = input[i];
            if (!(uniqueWords.contains(temp))) {
                uniqueWords.add(temp);
            }
        }
        return uniqueWords;
    }

    public static void countRepetitions (String[] input){
        ArrayList<String> uniqueWords = new ArrayList<>(getUniqueWords(input));
        Map<String, Integer> numberOfRepetitions = new HashMap<>();
        for (int i = 0; i < uniqueWords.size(); i++) {
            String temp = uniqueWords.get(i);
            int counter =0;
            for (int j = 0; j < input.length; j++) {
                if (temp.equals(input[j])) {
                    counter++;
                }
            }
            numberOfRepetitions.put(temp, counter);
        }
        System.out.println(numberOfRepetitions);
    }

}
