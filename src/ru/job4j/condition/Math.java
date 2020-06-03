package ru.job4j.condition;

public class Math {
    public static int max(int first, int second) {
        int result = first > second ? first : second;

        return result;
    }

    public static String whichMax(int first, int second) {
        String result = first > second ? "first number is max" : "second number is max";
        String proverka = first == second ? "both numbers are the same" : result;
        return proverka;
    }

    public static void main(String[] args) {
        int res = Math.max(25, 36);
        System.out.println("Max from 25 & 36 is - " + res);
        String which = Math.whichMax(25, 36);
        System.out.println(which);
        System.out.println("Max from 27 & 27 is:");
        which = Math.whichMax(27, 27);
        System.out.println(which);
    }
}
