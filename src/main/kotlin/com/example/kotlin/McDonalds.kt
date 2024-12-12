package com.example.kotlin

import java.io.*

fun main() {
/*
    val file = File("mcdonalds.txt")
    file.bufferedReader().lines().forEach {
        println(it)
    }
*/
    val file = File("mcdonalds.txt")
    file.bufferedReader().use{
        readLine()
    }


}

data class Item (val id : String, val name : String, val calorie : Int, val price : Int)