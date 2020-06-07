package ru.job4j.loop;

public class MortGage {
    public static int year(int amount, int salary, double percent) {
        int count = 0;
        while (amount > 0) {
            count++;
            amount += amount * percent / 100;
            amount -= salary;
        }
        return count;
    }
}
