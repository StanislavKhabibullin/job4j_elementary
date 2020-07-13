package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("There is no such element in massiv");
        }
        System.out.println("Element index = " + rsl);
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] mas = {"first", "second"};
            String word1 = "third";
            String word2 = "first";
            FindEl.indexOf(mas, word1);
            FindEl.indexOf(mas, word2);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
