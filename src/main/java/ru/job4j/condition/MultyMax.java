package ru.job4j.condition;

public class MultyMax {
    public static int max(int first, int second, int fird) {
        int result = first > second ? first : second;
        result = result > fird ? result : fird;
        return result;
    }

    public static void main(String[] args) {
        int rsl = MultyMax.max(1, 5, 9);
        System.out.println(" из 1; 5; 9 максимальное значение - " + rsl);
    }
}
