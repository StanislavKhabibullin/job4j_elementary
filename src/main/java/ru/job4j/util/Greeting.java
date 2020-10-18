package ru.job4j.util;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You are welcome. What is your name?");
        String name = input.nextLine();
        System.out.println(name + " glad to see you");
    }

}
