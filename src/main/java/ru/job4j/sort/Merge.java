package ru.job4j.sort;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] src = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        int min = 0;

        while (i < src.length) {
            if (k < right.length && j < left.length && left[j] <= right[k]) {
                min = left[j];
                src[i] = min;
                j++;
                i++;
            }
            if (k < right.length && j < left.length && left[j] > right[k]) {
                min = right[k];
                src[i] = min;
                k++;
                i++;
            }
                if (k == right.length && j < left.length) {
                    src[i] = left[j];
                    j++;
                    i++;
                }
            if (j == left.length && k < right.length) {
                src[i] = right[k];
                k++;
                i++;
            }
            }
            return src;
        }

        public static void main(String[] args) {
            Merge process = new Merge();
            int[] rsl = process.merge(
                    new int[]{1, 3, 5},
                    new int[]{2, 4}
            );
            for (int i = 0; i < rsl.length; i++) {
                System.out.print(rsl[i] + " | ");
            }
        }

}
