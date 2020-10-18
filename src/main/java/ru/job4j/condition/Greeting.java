package ru.job4j.condition;

public class Greeting {
        public static void main(String[] args)    {
        String idea;
        idea = "I like Java very much!";
        System.out.println(idea);
        idea = String.format("%s But I am a newbie.", idea);
        int year = 2020;
        idea = String.format("%s %d", idea, year);
        System.out.println(idea);
    }
}
