package ru.job4j.сalculator;

public class Fit {
    public static double manWeight(double height){
        double rsl=(height-100)*1.15;
        return rsl;
    }
    public static double woomanWeight(double height){
        double rsl=(height-110)*1.15;
        return rsl;
    }
    public static void main(String[] args){
        double man=Fit.manWeight(178);
        System.out.println("Man weight = "+man+" kg");
        double wooman=Fit.woomanWeight(164);
        System.out.println("Wooman weight = "+wooman+" - kg");
    }
}
