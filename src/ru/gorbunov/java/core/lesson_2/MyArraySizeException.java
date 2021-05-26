package ru.gorbunov.java.core.lesson_2;

public class MyArraySizeException extends Exception{
    String str;
    public MyArraySizeException(String message){
        this.str = message;
    }
    public String toString(){
        return ("MyException Occurred: "+str) ;
    }
}
