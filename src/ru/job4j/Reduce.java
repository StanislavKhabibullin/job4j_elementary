package ru.job4j;

public class Reduce {
    private int[] array;

    /**
     * @param mas методе to не подхватывает значения аргумента из за конфликта имени поля и имени аргумента
     *           думаю из за этого происходит ошибка, заменил аргумент на mas[]
     */
    public void to(int[] mas) {
        array = mas;
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
