package com.example.demo.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime exit;

    public Car(String id, LocalDateTime enter){
        this.id = id;
        this.enter = enter;
    }

    public void exit(){
        exit = LocalDateTime.now();
    }

    public long getDuration(){
        Duration duration = Duration.between(enter, exit);
        return duration.toMinutes();
    }

    public void setExit(LocalDateTime exit){
        if(exit.isAfter(enter)){
            this.exit = exit;
        }
    }

}
