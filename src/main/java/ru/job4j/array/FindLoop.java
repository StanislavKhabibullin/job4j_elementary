package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] array, int el) {
        int rst = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] array, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (array[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
