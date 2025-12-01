package org.example;

import java.util.ArrayList;

public class Order {
    public String pizza;
    public String sauce;
    public ArrayList<String>toppings;
    public ArrayList<String>desserts;
    public ArrayList<String>drinks;
    public String promotion;
    public Order(){
        this.toppings = new ArrayList<>();
        this.desserts = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.pizza = "";
        this.sauce = "";
        this.promotion="default";
    }
    public String getPizza(){
        return this.pizza;
    }
    public String getSauce(){
        return this.sauce;
    }
    public ArrayList<String> getToppings(){
        return this.toppings;
    }
    public ArrayList<String> getDesserts(){
        return this.desserts;
    }
    public ArrayList<String> getDrinks(){
        return this.drinks;
    }
    public String getPromotion(){
        return this.promotion;
    }
    public void setPizza(String type){
        this.pizza = type;
    }
    public void setSauce(String sauce){
        this.sauce = sauce;
    }
    public void setToppings(ArrayList<String>toppings){
        this.toppings = toppings;
    }
    public void getDessert(ArrayList<String> desserts){
        this.desserts = desserts;
    }
    public void getDrink(ArrayList<String> drinks){
        this.drinks = drinks;
    }
    public void setPromotion(String promotion){
        this.promotion = promotion;
    }
}
