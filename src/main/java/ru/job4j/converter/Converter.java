package ru.job4j.converter;

/**
 * Converter
 * convert rubbles to euro & dollars
 * @author Rikol skhabibullin@yandex.ru
 */

public class Converter {
    /**
     * convert Rubbles to Euro
     * @param value - include Rubbles
     * @return - how much euro you can buy on value Rubbles
     */
        public static int rubleToEvro(int value) {
        int rsl = value / 80;
        return rsl;
    }

    /**
     *
     * @param value - include Rubbles
     * @return how much dollar you can buy on value Rubbles
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * main - основной метод в котором происходит выполнение программы и вывод результата в консоль
     * @param args - понятия не имею для чего это нужно
     */
    public static void main(String[] args) {
        float euro = Converter.rubleToEvro(200);
        System.out.println("200 Rubles = " + euro + " euro");
        float dollar = Converter.rubleToDollar(200);
        System.out.println("200 Rubles = " + dollar + " dollars");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("140 Rubbles = 2, test Result :" + passed);
    }
}
