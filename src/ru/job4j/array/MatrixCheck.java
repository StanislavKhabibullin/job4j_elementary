package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] array, int row) {
        int schet = 0;
        boolean temp = true;
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] != 'X') {
                temp = false;
                break;
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
                break;
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

        for (int i = 0; i < MatrixCheck.extraDiagonal(board).length; i++) {
            if (board[i][i] == 'X') {
                temp = MatrixCheck.monoHorizontal(board, i) || MatrixCheck.monoVertikal(board, i);
                if (temp) {
                    break;
                }
            }
        }
        return temp;
    }
}
