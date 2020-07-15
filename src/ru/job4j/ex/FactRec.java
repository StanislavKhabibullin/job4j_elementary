package ru.job4j.ex;

public class FactRec {

    public static int rec(int num) {
        if (num == 1) {
            return 1;
        } else {
            return rec(num - 1) * num;
        }
    }

    public static void main(String[] args) {
        int res = rec(3);
        System.out.println(res);
    }
}
