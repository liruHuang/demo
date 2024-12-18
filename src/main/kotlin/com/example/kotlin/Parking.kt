package com.example.kotlin

import java.time.LocalDateTime
import java.time.Duration

fun main() {
    val enter = LocalDateTime.of(2024,12,13,12,2,30);
    val exit = LocalDateTime.of(2024,12,13,15,34,1);
    val car = Car("AAA-1213", enter)
    car.exit = exit
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toInt()
    println(hours)


}
class Car(val id: String, val enter: LocalDateTime) {
    var exit : LocalDateTime ?= null
    set(value) {
        if (enter.isBefore(value))
            field = value
    }

    fun duration() :Long {
        return Duration.between(enter, exit).toMinutes()
    }


}