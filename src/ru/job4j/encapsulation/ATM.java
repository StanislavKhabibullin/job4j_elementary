package ru.job4j.encapsulation;

public class ATM {
    public static void main(String[] args) {
        Account bill = new Account();
        bill.addMoney(100);
        bill.balance = 50;
        System.out.println(bill.balance);
    }

}
