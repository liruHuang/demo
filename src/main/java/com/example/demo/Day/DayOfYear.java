package com.example.demo.Day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day  = now.get(Calendar.DAY_OF_MONTH);
        try {
            System.out.println("please enter year: (" + year + ")");
            String yearString = reader.readLine();
            year = (yearString.length() > 0 ) ? Integer.parseInt(yearString) : year;
            System.out.println(year);

            System.out.println("please enter month: (" + month + ")");
            String monthString = reader.readLine();
            month = (monthString.length() > 0 ? Integer.parseInt(monthString) : month);
            System.out.println(month);

            System.out.println("please enter day: (" + day + ")");
            String dayString = reader.readLine();
            day = (dayString.length() > 0 ? Integer.parseInt(dayString) : day);
            System.out.println(day);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
