package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        Licence licence = new Licence();
        licence.setOwner("Stanislav");
        licence.setModel("Chevrole aveo");
        licence.setCode("451ro50");
        licence.setCreated(new Date());
        System.out.println(licence.getOwner() + " has a car " + licence.getModel()
        + " with code " + licence.getCode() + " Date " + licence.getCreated());
    }
}
