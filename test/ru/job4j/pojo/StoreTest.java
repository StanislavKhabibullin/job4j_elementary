package ru.job4j.pojo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void indexOfNulThird() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] prods = new Product[5];
        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;
        assertThat(Store.indexOfNull(prods), is(3));
    }

    public void whenFirstNull() {
        Product egg = new Product("Egg", 19);
        Product[] prods = new Product[5];
        prods[1] = egg;
        assertThat(Store.indexOfNull(prods), is(0));
    }

    public void whenNoNull() {
        Product egg = new Product("Egg", 19);
        Product[] prods = new Product[1];
        prods[0] = egg;
        assertThat(Store.indexOfNull(prods), is(-1));
    }
}