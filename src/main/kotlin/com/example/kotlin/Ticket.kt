package com.example.kotlin

import java.util.*

data class Ticket(val origin : Int, val destination : Int, val price : Int)

fun main() {
    val ticket = Ticket(30, 80, 12)
    val str = "asdfghj"
    println(str.validate())
    var ran = 1..20
    println(ran.random())
}


fun String.validate() : Boolean {
    return this.length >= 5;
}

fun IntRange.random() : Int {
    val r = Random().nextInt(endInclusive - start) + start
    return r;
}