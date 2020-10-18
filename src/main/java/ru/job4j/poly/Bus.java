package ru.job4j.poly;

public class Bus implements Transport {
    private int price;
    private int quantity;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void drive() {

    }

    @Override
    public void numberOfPassengers(Integer number) {
        this.quantity = number;

    }

    @Override
    public float fillUp(float litr) {
        return litr * this.price;
    }
}
