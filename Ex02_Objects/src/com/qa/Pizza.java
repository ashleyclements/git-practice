package com.qa;

import java.util.Arrays;

public class Pizza {
    private String size;
    private String[] toppings;
    private double price;

    public Pizza(String size, String toppings[], double price){
        this.size = size;
        this.toppings = toppings;
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String[] getToppings() {
        return toppings;
    }

    public String toString() {
        return "Pizza size: " + size + "\n Pizza toppings: " + Arrays.toString(toppings) + "\n Price: " + price;
    }
}

