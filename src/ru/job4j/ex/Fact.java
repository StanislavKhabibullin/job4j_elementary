package ru.job4j.ex;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Input the number for factorial");
        Scanner scanner = new Scanner(System.in);
        int in = Integer.valueOf(scanner.nextLine());
        int rezult = Fact.calc(in);
        System.out.println(rezult);
    }

    public static int calc(int number) {
        int rezult = 1;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                rezult *= i;
            }
        }
        return rezult;

    }
}
