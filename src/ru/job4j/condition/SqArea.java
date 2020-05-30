package ru.job4j.condition;

public class SqArea {
    public static double square(int p,int k){
        double a=p/(2*(k+1));
        double rsl=k*Math.pow(a,2);
        return rsl;
    }
    public static void main(String[] args){
        double result=SqArea.square(6,2);
        System.out.println("Figure square is = "+result);
    }
}
