package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        boolean result = first > second;
        System.out.println("10 > 9 " + result);
        result = first < second;
        System.out.println("10 < 9 " + result);
        result = first == second;
        System.out.println("10 = 9 " + result);
    }
}
