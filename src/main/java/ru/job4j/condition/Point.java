package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distanc3D(Point other) {
        return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2)
                + Math.pow((other.z - this.z), 2));
    }

    public double distances(Point another) {
        return Math.sqrt(Math.pow((another.x - this.x), 2) + Math.pow((another.y - this.y), 2));
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
        Point first = new Point(0, 1, 4);
        Point second = new Point(2, 0, 4);
        double resultObject = first.distanc3D(second);
        System.out.println("Distance betweem point (0,1,4)&(2,0,4) is = " + resultObject);
    }
}
