package ru.job4j.condition;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
              return ab + ac > bc && ab + bc > ac && bc + ac > ab;
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(3, 3, 3);
        System.out.println("Треугольник со сторонами 3;3;3 - " + result);
    }
}
