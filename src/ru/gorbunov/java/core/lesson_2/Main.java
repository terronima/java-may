package ru.gorbunov.java.core.lesson_2;



public class Main {
    static void sumArr(String[][]stringArr) throws MyArraySizeException {
        int sum = 0;
        if ((stringArr[0].length != 4) || (stringArr[1].length != 4)) {
            throw new MyArraySizeException("Array is " + stringArr.length + "*"  +stringArr[0].length + ", wrong size, should be 4*4");
        }
        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < stringArr[0].length; j++) {
                System.out.print(stringArr[i][j] + " ");
                try {
                    sum += Integer.parseInt(stringArr[i][j]) ;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("\nThe value is not a number in ", i, j);
                }
            }
            System.out.println();
        }
        System.out.println("Total sum of all elements in the array is: " + sum);
    }
    public static void main(String[] args) throws MyArraySizeException {
        // write your code here
        String[][] stringArr = new String[4][4];
        int counter = 0;
        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < stringArr[0].length; j++) {
                stringArr[i][j] = Integer.toString(counter);
                counter++;
//                if (i == 2 && j == 3) {
//                    stringArr[i][j] = "c";
//                }
            }
        }
        sumArr(stringArr);
    }
    }
