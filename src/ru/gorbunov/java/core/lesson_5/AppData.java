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
            String str = null;
            List<String[]> CSVData = new ArrayList();
            int numberOfLines = 0;
            int numberOfRows = 0;
            while ((str = in.readLine()) != null) {
                numberOfLines++;
                String[] tokens = str.split(";");
                CSVData.add(tokens);
            }
            numberOfLines = CSVData.size();
            numberOfRows = CSVData.get(0).length;
            this.headers = CSVData.get(0);
            for (int i = 1; i < numberOfLines; i++) {
                for (int j = 1; j < numberOfRows; j++) {
                    this.data[i][j] = Integer.parseInt(CSVData.get(i)[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Write(File file, String[] headers, int[][] data) {
        try(BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            String[] assembledString = new String[headers.length];
            String str = null;
            for (int i = 0; i < headers.length; i++) {
                str += headers[i] + ";";
            }
            str = str.substring(0, str.length()-1);
            assembledString[0] = str;
            for (int i = 1; i < data.length; i++) {
                for (int j = 0; j < assembledString[0].length(); j++) {
                    assembledString[i] = data[i][j] + ";";
                }
                assembledString[i] = assembledString[i].substring(0, assembledString[i].length() - 1);
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
