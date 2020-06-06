package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean calc(int number) {
        boolean log = true;
        if (number == 1) {
            log = false;
        }
        for (int index = 2; index < number; index++) {
                if (number % index == 0) {
                log = false;
                break;
            }
        }
        return log;
    }
}
