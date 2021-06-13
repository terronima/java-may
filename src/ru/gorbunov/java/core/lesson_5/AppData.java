package ru.gorbunov.java.core.lesson_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData {
    private String[] headers;
    private int[][] data;

    public void Read(File file) throws FileNotFoundException {
        try (BufferedReader in = new BufferedReader(
                new FileReader(file));
        ) {
            String str;
            List<String[]> CSVData = new ArrayList<>();
            int numberOfLines = 0;
            int numberOfColls = 0;
            while ((str = in.readLine()) != null) {
                numberOfLines++;
                String[] tokens = str.split(";");
                CSVData.add(tokens);
            }
            numberOfColls = CSVData.get(0).length;
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < numberOfLines; i++) {
                for (int j = 0; j < numberOfColls; j++) {
                    text.append(CSVData.get(i)[j]).append(" ");
                }
                text.append("\n");
            }
            System.out.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Write(File file, String[] headers, String[][] data) {
        try(BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            String[] assembledString = new String[data.length + 1];
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < headers.length; i++) {
                if (i ==  headers.length - 1) {
                    str.append(headers[i]);
                } else {
                    str.append(headers[i]).append(";");

                }
            }
//            str = new StringBuilder(str.substring(0, str.length() - 1));
            assembledString[0] = str.toString();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    if (j ==  data[0].length - 1) {
                        assembledString[i + 1] = data[i][j];
                    } else {
                        assembledString[i + 1] = data[i][j] + ";";
                    }
                }
            }
            for (int i = 0; i < assembledString.length; i++) {
                out.append(assembledString[i]).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "AppData{" +
                "headers=" + Arrays.toString(headers) +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
