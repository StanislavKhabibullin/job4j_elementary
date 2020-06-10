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

    public static boolean isWith(char[][] board) {
        boolean temp = false;
        char[] diag = new char[board.length];
        diag = MatrixCheck.extraDiagonal(board);
        for (int i = 0; i < diag.length; i++) {
            if (diag[i] == 'X') {
                temp = MatrixCheck.monoHorizontal(board, i) | MatrixCheck.monoVertikal(board, i);
                if (temp) {
                    break;
                }
            }
        }
        return temp;
    }
}
