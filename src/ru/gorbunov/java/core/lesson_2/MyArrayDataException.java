package ru.gorbunov.java.core.lesson_2;

public class MyArrayDataException extends NumberFormatException{
    int row;
    int col;

    public MyArrayDataException(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public MyArrayDataException(String s, int row, int col) {
        super(s);
        this.row = row;
        this.col = col;
        System.out.println(s + " row " + this.row + ", col " + this.col);

    }
}
