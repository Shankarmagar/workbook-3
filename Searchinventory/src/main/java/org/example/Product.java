package org.example;

public class Product {
    private int Id;
    private String name;
    private double price;

    public Product(int id, String name, double price)
    {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
