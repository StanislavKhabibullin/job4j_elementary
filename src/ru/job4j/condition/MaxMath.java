package ru.job4j.condition;

/**
 * Тернарный оператор
 */
public class MaxMath {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = third > max(first, second) ? third : max(first, second);
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = fourth > max(first, second, third) ? fourth : max(first, second, third);
        return result;
    }

    public static String whichMax(int first, int second) {
        String result = first > second ? "first number is max" : "second number is max";
        String proverka = first == second ? "both numbers are the same" : result;
        return proverka;
    }

    public static void main(String[] args) {
        int res = MaxMath.max(25, 36, 48);
        System.out.println("Max from 25 & 36 & 48 is - " + res);
        res = MaxMath.max(27, 27, 27, 1);
        System.out.println("Max from 27 & 27 & 27 & 1 is:" + res);
    }

}
