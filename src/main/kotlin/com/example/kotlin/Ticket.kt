package com.example.kotlin

import kotlin.random.Random
import kotlin.random.nextInt

data class Ticket(val origin: Int, val destination: Int, val price: Int)

fun main() {
    var ticket = Ticket(30, 78, 259)
    val str = "ASDFJ"
    println(str.validate())

    println((1..10).random())


}
fun String.validate() : Boolean {
    return this.length >= 8
}

fun IntRange.random() : Int{
    val r =  Random.nextInt(endInclusive - start +1) + start
    return r
}