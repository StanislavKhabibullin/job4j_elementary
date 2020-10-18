package ru.job4j;

public class Reduce {
    private int[] array;

    /**
     * отсутствует ключевое слово this в конструкторе
     */
    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce exp = new Reduce();
        exp.to(array);
        exp.print();
    }

}
