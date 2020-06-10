package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] array, int row) {
        int schet = 0;
        boolean temp = true;
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] != 'X') {
                temp = false;
            }
        }
        return temp;
    }

    public static boolean monoVertikal(char[][] array, int column) {
        int schet = 0;
        boolean temp = true;
        for (int i = 0; i < array[0].length; i++) {
            if (array[i][column] != 'X') {
                temp = false;
            }
        }
        return temp;
    }

    public static char[] extraDiagonal(char[][] array) {
        char[] rsl = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            rsl[i] = array[i][i];
        }
        return rsl;
    }
}
