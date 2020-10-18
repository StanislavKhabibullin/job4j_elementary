package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rob");
        student.setSurname("Shneider");
        student.setGroup("R1C1");
        student.setReceptDat(new Date());
        System.out.println("Student - " + student.getName() + "  " + student.getSurname()
        + System.lineSeparator() + "Group - " + student.getGroup()
        + System.lineSeparator() + "Date of reciepe" + student.getReceptDat());
    }
}
