package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-2);
        possibleDiv(9);
    }

    public static void possibleDiv(int in) {
        if (in == 0) {
            System.out.println("Divizion by " + in + " Alert division by zero!!!");
        }
        if (in < 0) {
            System.out.println("Divizion by " + in + " Alert division by negative numbers");
        }
        if (in > 0) {
            System.out.println("Divizion by " + in + " Correct divizion");
        }
    }
}
