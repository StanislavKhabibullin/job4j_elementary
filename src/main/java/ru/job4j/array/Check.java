package ru.job4j.array;

public class Check {
    public static boolean moon(boolean[] array) {
        boolean temp = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) {
                temp = false;
                break;
            }
        }
        return temp;
    }
}
