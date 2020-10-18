package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                for (int j = point + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        array[point] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
        }
        return array;
    }

}
