package ru.job4j.condition;

public class TrgArea {
    public static boolean exist(double a, double b, double c) {
        return a + c > b && b + c > a && b + a > c;
    }

    public static double trgsquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double src = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return src;
    }

       public static double period(double a, double b, double c) {
        double rsl = ((a + b + c) / 2);
        return rsl;
    }

    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double square = -1;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        Point third = new Point(x3, y3);
        double a = first.distances(second);
        double b = first.distances(third);
        double c = second.distances(third);
        double p = TrgArea.period(a, b, c);
        if (this.exist(a, b, c)) {
            square = this.trgsquare(a, b, c);
        }
        return square;
    }

    public static void main(String[] args) {
        TrgArea first = new TrgArea();
        TrgArea second = new TrgArea();
        double rez1 = first.area(0, 0, 0, 2, 2, 0);
        double rez2 = second.area(3, 7, 10, -11, 6, 900);
        System.out.println(rez1);
        System.out.println(rez2);
    }
}
