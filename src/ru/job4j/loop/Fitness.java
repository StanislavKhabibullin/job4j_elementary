package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nikolai) {
        int count = 0;
        while (ivan <= nikolai) {
            ivan = ivan * 3;
            nikolai = nikolai * 2;
            count++;
        }
        return count;
    }
}
