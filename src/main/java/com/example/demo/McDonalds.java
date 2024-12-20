package com.example.demo;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class McDonalds {

    Map<Integer, Item> menu = new HashMap<>();
    public McDonalds() {

        File file = new File("mcdonalds.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                Item item = new Item(
                        Integer.parseInt(tokens[0]),
                        tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3]));
                menu.put(item.getId(), item);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void printMenu() {
        for (Map.Entry<Integer, Item> itemEntry : menu.entrySet()) {
            System.out.println(itemEntry.getValue());
        }
    }

    public static void main(String[] args) {
        McDonalds mcdonalds = new McDonalds();
        mcdonalds.printMenu();
    }
}

class Item {
    int id;
    String name;
    int calories;
    int price;

    @Override
    public String toString() {
        return id + "," + name + "," + calories + "," + price + "," + price;
    }

    public Item(int id, String name, int calories, int price) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}