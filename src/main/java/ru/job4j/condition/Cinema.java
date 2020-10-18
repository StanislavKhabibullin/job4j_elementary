package ru.job4j.condition;

public class Cinema {
    public static void acess(int age) {
        System.out.println("If the age of customer is " + age);
        if (age >= 18) {
            System.out.println("You are welcome enjoy the adult film");
        } else {
            System.out.println("You are to young, look for other film");
        }
    }

    public static void main(String[] args) {
        Cinema.acess(14);
        Cinema.acess(18);
        Cinema.acess(37);
    }
}
