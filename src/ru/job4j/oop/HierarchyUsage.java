package ru.job4j.oop;

import java.util.concurrent.Callable;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport tp = car;
        Object obj = car;
        Object ocar = new Car();
        Car carFromObject = (Car) car;
        Object bycikle = new Bycikle();
     /*   Car cb = (Car) bycikle; */

    }
}
