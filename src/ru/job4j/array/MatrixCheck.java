package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] array, int row) {
        int schet = 0;
        boolean temp = false;
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] == 'X') {
                schet++;
            }
        }
        if (schet == array[row].length) {
            temp = true;
        }
        return temp;
    }

    public static boolean monoVertikal(char[][] array, int column) {
        int schet = 0;
        boolean temp = false;
        for (int i = 0; i < array[0].length; i++) {
            if (array[i][column] == 'X') {
                schet++;
            }
        }
        if (schet == array[0].length) {
            temp = true;
        }
        return temp;
    }
}
