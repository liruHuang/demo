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
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("please enter year: (" + year + ")");
            String yearString = br.readLine();
            year = (yearString.length() > 0) ? Integer.parseInt(yearString) : year;
            if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
                months[1]=29;
            }
            System.out.println(year);
            System.out.println("please enter month: (" + month + ")");
            String monthString = br.readLine();
            month = (monthString.length() > 0) ? Integer.parseInt(monthString) : month;
            System.out.println(month);
            System.out.println("please enter day: ( " + day + ")");
            String dayString = br.readLine();
            day = (dayString.length() > 0) ? Integer.parseInt(dayString) :day;
            if(day> months[month-1]){
                System.out.println("enter a valid day");
                return;
            }
            System.out.println(day);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int days = 0;
        for (int i = 0 ; i < month-1 ; i ++){
            days += months[i];
        }
        days += day ;
 /*       if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0) {
            days ++ ;
        }
*/
        System.out.println(days);

    }


}
