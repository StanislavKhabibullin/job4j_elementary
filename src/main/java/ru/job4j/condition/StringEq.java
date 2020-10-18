package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean acess = root.equals(login);
        return acess;
    }

    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAcess = StringEq.check(your);
        System.out.println(userHasAcess);
    }
}
