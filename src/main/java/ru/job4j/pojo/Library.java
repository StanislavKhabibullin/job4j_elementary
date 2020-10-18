package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Difficult to be God", 350);
        Book second = new Book("Clean code", 120);
        Book third = new Book("Phsychology  aikido", 185);
        Book fourth = new Book("I want and i be", 317);
        Book[] lib = new Book[4];
        lib[0] = first;
        lib[1] = second;
        lib[2] = third;
        lib[3] = fourth;
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " - " + lib[i].getCount());
        }
        System.out.println("Change place 0 --> 3");
        Book temp = lib[0];
        lib[0] = lib[3];
        lib[3] = temp;
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " - " + lib[i].getCount());
        }
        System.out.println("Books with name: Clean code ");
        for (int i = 0; i < lib.length; i++) {
            if (lib[i].getName().equals("Clean code")) {
                System.out.println(lib[i].getName() + " - " + lib[i].getCount());
            }
        }
    }
}
