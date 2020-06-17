package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distances(Point other) {
    return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double xx = x2 - x1;
        double yy = y2 - y1;
        double rsl = Math.sqrt(Math.pow(xx, 2) + Math.pow(yy, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 1, 2, 0);
        System.out.println("Distance betweem point (0,1)&(0,2) is = " + result);
        Point first = new Point(0, 1);
        Point second = new Point(2, 0);
        double resultObject = first.distances(second);
        System.out.println("Distance betweem point (0,1)&(0,2) is = " + resultObject);
    }
}
