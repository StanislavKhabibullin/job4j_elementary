package ru.job4j.condition;

public class TrgArea {
    private Point first;
    private Point second;
    private Point third;

    public TrgArea(Point ab, Point bc, Point ca) {
        this.first = ab;
        this.second = bc;
        this.third = ca;
    }

    public static boolean exist(double a, double b, double c) {
        return a + c > b && b + c > a && b + a > c;
    }

    public static double period(double a, double b, double c) {
        double rsl = ((a + b + c) / 2);
        return rsl;
    }

    public double area() {
        double square = -1;
        double a = this.first.distances(second);
        double b = this.first.distances(third);
        double c = this.second.distances(third);
        double p = TrgArea.period(a, b, c);
        if (this.exist(a, b, c)) {
            square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return square;
    }

    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        TrgArea temp;
        temp = new TrgArea(first, second, third);
        double rez1 = temp.area();
        System.out.println(rez1);
        first = new Point(7, 7);
        second = new Point(-10, 100);
        third = new Point(900, 5);
        temp = new TrgArea(first, second, third);
        System.out.println(temp.area());
    }
}
