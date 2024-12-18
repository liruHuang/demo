package com.example.demo.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {

        LocalDateTime enter = LocalDateTime.of(2024, 12,23,
                4,15,30);
        LocalDateTime exit = LocalDateTime.of(2024,12,23,
                9,20,20);
        Car car = new Car("AAB-1111", enter);
        car.setExit(exit);
        System.out.println(car.getDuration());
        long duration = (long)Math.ceil(car.getDuration()/60.0);
        System.out.println(duration);
        System.out.println(30*duration);


        // java8();
        // java();


    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);

        LocalDateTime local = LocalDateTime.now();
        System.out.println(local);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(local));
        System.out.println(local.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2024,12,15,12,00,12);
        System.out.println(other);
    }

    private static void java() {
        Date date  = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String dateStr = "2025-05-30 20:33:00" ;
        try {
            Date other = sdf.parse(dateStr);
            System.out.println(other);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 8);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        System.out.println(calendar.getTime());
    }
}
