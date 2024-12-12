package com.example.kotlin

import java.util.*

data class Ticket(val origin : Int, val destination : Int, val price : Int)

fun main() {
    val ticket = Ticket (30, 59, 23)
    val str = "abcd"
    val random = 1..10
    println(random.random())
    print(str.validate())
}

fun String.validate() : Boolean {
    return this.length >= 6 ;
}

fun IntRange.random() : Int{
    val random = Random().nextInt(endInclusive - start) + start
    return random
}