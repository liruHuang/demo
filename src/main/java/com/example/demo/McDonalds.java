package com.example.demo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class McDonalds{
    Map<String, Item> menu = new HashMap<>();
    public McDonalds(){
        File file = new File("mcdonalds.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                Item item = new Item(
                        tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3]));
                menu.put(item.id,item);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printMenu(){
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
            System.out.println(itemEntry.getValue());
        }
    }

    public static void main(String[] args) {
        McDonalds mcdonalds = new McDonalds();
        mcdonalds.printMenu();
    }

}

class Item{
    String id;
    String name;
    int calorie;
    int price;

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + calorie + "\t" + price;
    }

    public Item(String id, String name, int calorie, int price) {
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }
}