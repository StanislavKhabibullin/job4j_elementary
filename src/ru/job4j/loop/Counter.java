package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int result = 0;
        for (int index = start; index <= finish; index++) {
            result = result + index;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("summ from 0 to 5 = " + Counter.sum(0, 5));
        System.out.println("summ from 0 to 10 = " + Counter.sum(0, 10));
        System.out.println("summ from 0 to 5 = " + Counter.sum(3, 8));
        System.out.println("summ from 0 to 5 = " + Counter.sum(1, 1));
    }
}
