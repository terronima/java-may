package ru.gorbunov.java.core.lesson_5;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        AppData write = new AppData();
        File file = new File("D:\\text.txt");
        String[] headers = {"folder", "size", "content"};
        String[][] data = {{"text;200;files"}, {"work;400;text"}};
        write.Write(file, headers, data);

        AppData read = new AppData();
        read.Read(file);
    }
}
