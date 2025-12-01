package org.example.Store;

import org.example.entities.Item;

import java.util.Map;

public class MenuStore {
    public Map<String, Item> pizzaStore = Map.of(
            "regular",new Item("Regular",50),
            "whole wheat", new Item("Whole Wheat",75)
    );
    public Map<String,Item> sauceStore = Map.of(
            "marinara sauce",new Item("Marinara sauce"),
            "pesto sauce", new Item("Pesto sauce")
    );

    public Map<String,Item> toppingStore = Map.of(
            "mozzarella cheese",new Item("Mozzarella cheese",30),
            "cheddar cheese", new Item("Cheddar cheese",35),
            "spinach", new Item("Spinach",20),
            "corn", new Item("Corn",15),
            "mushroom", new Item("Mushroom",15),
            "chicken", new Item("Chicken",50),
            "pepperoni", new Item("Pepperoni",45)
    );

    public Map<String,Item> drinkStore = Map.of(
            "pepsi",new Item("Pepsi",17),
            "7-up",new Item("7-up",19),
            "coke",new Item("Coke",20)
    );

    public Map<String,Item> dessertStore = Map.of(
            "lava cake",new Item("Lava Cake",95),
            "chocolate brownie" , new Item("Chocolate brownie",86)
    );
}
