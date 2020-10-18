package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (third >= second && third >= first) {
            result = third;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = ThreeMax.max(1, 2, 3);
        System.out.println("From numbers 1; 2; 3; Max is - " + rsl);
    }
}
