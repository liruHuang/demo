package com.example.demo;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks);
        System.out.println(stocks.get("2330"));
        System.out.println("------");
        for(String key : stocks.keySet()){
            System.out.println(stocks.get(key));
        }

        // set();
        // list();
        // arrayTest();
    }

    private static void set() {
        HashSet<Integer> set = new HashSet();
        set.add(5);
        set.add(3);
        set.add(7);
        set.add(3);
        System.out.println(set);
        for(int n : set ){
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        System.out.println(list);
        list.get(0);
        list.get(3);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(60, 80, 88, 43, 99);
        for(Integer score : scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[2] = 3;

        int[] scores = {60, 80, 88, 43, 99};
        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("-------");
        for(int n : scores) {
            System.out.println(n);
        }
    }
}
