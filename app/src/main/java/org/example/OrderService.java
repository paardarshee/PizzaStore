package org.example;

import org.example.Store.MenuStore;
import org.example.Store.PromotionStore;
import org.example.entities.Item;

import java.util.ArrayList;

public class OrderService {
    Order order;
    MenuStore menu;
    PromotionStore promotions;
    public OrderService(){
        order = new Order();
        menu = new MenuStore();
        promotions = new PromotionStore();
    }
    public void selectPizza(String type){
        if(menu.pizzaStore.containsKey(type.toLowerCase())) {
            this.order.setPizza(type.toLowerCase());
            System.out.println("Base pizza of type " + type + " Added");
        }else {
            System.out.println("Base Pizza Type " + type + " not available");
        }
    }
    public void selectSauce(String name){
        if(menu.sauceStore.containsKey(name.toLowerCase())) {
            this.order.setSauce(name.toLowerCase());
            System.out.println(name + " Added");
        }else {
            System.out.println(name + " not available");
        }
    }
    public void addTopping(String name){
        if(menu.toppingStore.containsKey(name.toLowerCase()) && !order.getToppings().contains(name.toLowerCase())) {
            ArrayList<String> toppings = order.getToppings();
            toppings.add(name.toLowerCase());
            this.order.setToppings(toppings);
            System.out.println(name + " Added");
        }else {
            System.out.println(name + " not available");
        }
    }
    public void addTopping(ArrayList<String> toppingNames){
        for(String toppingName:toppingNames){
            this.addTopping(toppingName);
        }
    }
    public void addDesert(String name){
        if(menu.dessertStore.containsKey(name.toLowerCase()) && !order.getDesserts().contains(name)) {
            ArrayList<String> desserts = order.getDesserts();
            desserts.add(name.toLowerCase());
            this.order.setDessert(desserts);
            System.out.println(name + " Added");
        }else {
            System.out.println(name + " not available");
        }
    }
    public void addDrink(String name){
        if(menu.drinkStore.containsKey(name.toLowerCase()) && !order.getDrinks().contains(name)) {
            ArrayList<String> drinks = order.getDrinks();
            drinks.add(name.toLowerCase());
            this.order.setDrink(drinks);
            System.out.println(name + " Added");
        }else {
            System.out.println(name + " not available");
        }
    }
    public void addPromotion(String promotion){
        if(promotions.promotions.containsKey(promotion.toLowerCase())){
            this.order.setPromotion(promotion.toLowerCase());
        }
    }
    public double applyDiscount(double total){
        if(!order.getDesserts().isEmpty() && !order.getDrinks().isEmpty()){
            double discount = promotions.getPromotion(order.getPromotion());
            return total*(100-discount)/100;
        }
        return total;
    }
    public double getFinalPrice(){
        if(order.getPizza().isEmpty()){
            System.out.println("Base Pizza Type Missing");
        }
        else if(order.getToppings().isEmpty()){
            System.out.println("Add at least one topping");
        }else {
            double total = 0;
            Item pizza = menu.pizzaStore.get(order.getPizza());
            total += pizza.getPrice();
            for (String toppingName : order.getToppings()) {
                Item topping = menu.toppingStore.get(toppingName);
                total += topping.getPrice();
            }
            for (String dessertName : order.getDesserts()) {
                Item dessert = menu.dessertStore.get(dessertName);
                total += dessert.getPrice();
            }
            for (String drinkName : order.getDrinks()) {
//                System.out.println(drinkName);
                Item drink = menu.drinkStore.get(drinkName);
                total += drink.getPrice();
            }

            double discountedPrice = this.applyDiscount(total);
            return discountedPrice;
        }
        return 0;
    }
    public void checkout(){
        double discountedPrice = this.getFinalPrice();
        System.out.println("Your order costs "+discountedPrice);
    }
}
