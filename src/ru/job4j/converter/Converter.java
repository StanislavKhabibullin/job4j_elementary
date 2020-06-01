package ru.job4j.converter;

public class Converter {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static float rubleToEvro(float value) {
        float rsl = value / 80;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 70;
        return rsl;
    }

    @SuppressWarnings(value = "checkstyle:MethodParamPad")
    public static void main(String[] args) {
        float euro = Converter.rubleToEvro(200);
        System.out.println("200 Rubles = " + euro + " euro");
        float dollar = Converter.rubleToDollar(200);
        System.out.println("200 Rubles = " + dollar + " dollars");
        int in = 140;
        int expected = 2;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("140 Rubbles = 2, test Result :" + passed);

    }
}
