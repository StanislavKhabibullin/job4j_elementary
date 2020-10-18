package ru.job4j.io;
import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean choose = true;
        int quantity = 11;
        while (choose) {
            System.out.println("Numbers of matches - " + quantity);
            System.out.println("Player1 enter numbers of matches you want to take :");
            int inp1 = Integer.valueOf(input.nextLine());
            quantity = quantity - inp1;
            if (quantity <= 0) {
                System.out.println("Player1 is winner");
                choose = false;
                break;
            }
            System.out.println("Numbers of matches - " + quantity);
            System.out.println("Player2 enter numbers of matches you want to take :");
            int inp2 = Integer.valueOf(input.nextLine());
            quantity = quantity - inp2;
            if (quantity <= 0) {
                System.out.println("Player2 is winner");
                choose = false;
                break;
            }

        }
    }

}
