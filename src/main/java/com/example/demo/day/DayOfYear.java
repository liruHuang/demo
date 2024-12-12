package com.example.demo.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class DayOfYear {

    public static void main(String[] args) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        try {
            System.out.println("please enter the year(" + year + ")");
            String yearString = br.readLine();
            year = (yearString.length()>0) ? Integer.parseInt(yearString) : year;
            System.out.println(year);
            System.out.println("please enter the month(" + month + ")");
            String monthString = br.readLine();
            year = (monthString.length()>0) ? Integer.parseInt(yearString) : year;
            System.out.println(month);
            System.out.println("please enter the day(" + day + ")");
            String dayString = br.readLine();
            year = (dayString.length()>0) ? Integer.parseInt(yearString) : year;
            System.out.println(day);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int days = 0;
        for (int i = 0 ; i < months.length-1 ; i ++){
            days = days + months[i];
        }
        days += day;
        if (year % 400 ==0 || (year % 4 ==0 && year % 100 !=0)){
            days = days +1;
        }
        System.out.println(days);
    }


}
