package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                if (row == cell) {
                    System.out.print('X');
                }  else {
                    if (size - row - 1 == cell) {
                        System.out.print('X');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Slash.draw(7);
    }
}
