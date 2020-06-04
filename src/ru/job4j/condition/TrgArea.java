package ru.job4j.condition;

public class TrgArea {
    public static double trgsquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double src = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return src;
    }

    public static void main(String[] args) {
        double result = TrgArea.trgsquare(2, 2, 2);
        System.out.println("If a=2, b=2, c=2, then treangle square = " + result);
    }
}
