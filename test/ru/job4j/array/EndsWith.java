package ru.job4j.array;

import org.junit.Test;

public class EndsWith {
    public static boolean endsWithCheck(char[] word, char[] ends) {
        boolean temp = true;
        for (int i = 0; i < word.length; i++) {
            if (ends.length - 1 - i < 0) {
                break;
            }
            if (ends[ends.length - 1 - i] != word[word.length - 1 - i]) {
                temp = false;
                break;
            }
        }
        return temp;
    }
}


