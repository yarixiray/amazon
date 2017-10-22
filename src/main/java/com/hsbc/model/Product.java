package com.hsbc.model;

public class Product {
    private double price;
    private String name;
    private int count;

    public double getSubTotalPrice(){
        return price*count;
    }

    public Product(double price, String name, int qty) {
        this.price = price;
        this.name = name;
        this.count = qty;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
