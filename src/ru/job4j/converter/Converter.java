package ru.job4j.converter;

public class Converter {
    public static float rubleToEvro(float value){
        float rsl=value/78;
        return rsl;
    }
    public static float rubleToDollar(float value){
        float rsl=value/71;
        return rsl;
    }
    public static void main (String[] args){
        float euro=Converter.rubleToEvro(200);
        System.out.println("200 Rubles = "+euro+" euro");
        float dollar=Converter.rubleToDollar(200);
        System.out.println("200 Rubles = "+dollar+" dollars");
    }
}
