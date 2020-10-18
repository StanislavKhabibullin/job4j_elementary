package ru.job4j;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

public class SortSelected {
    public static int[] sort(int[] data) {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.minDiap(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            temp = data[i];
            data[i] = min;
            data[index] = temp;
        }
        return data;
    }
}
