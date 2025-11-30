package org.example.entities;

public class Item {
    private String name;
    private double price;

    public Item(String name,double price){
        this.name = name;
        this.price = price;
    }

    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
}
