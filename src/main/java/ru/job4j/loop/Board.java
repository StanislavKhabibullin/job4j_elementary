package ru.job4j.loop;

public class Board {
    public static void paint(int weight, int height) {
        for (int row = 1; row <= height; row++) {
            for (int index = 1; index <= weight; index++) {
                if ((row + index) % 2 == 0) {
                    System.out.print('X');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board.paint(3, 3);
        Board.paint(7, 7);
    }
}
