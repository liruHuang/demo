package com.example.kotlin

import java.util.*


fun main() {

    val secret = Random().nextInt(10)+1
    println(secret);
//    val scanner = Scanner(System.`in`)
    var number= 0;
    while(number != secret){
        println("Please enter a number")
        number = readLine()!!.toInt()
//        number = scanner.nextInt()
        if( number > secret){
            println("Lower")
        }else if(number < secret){
            println("Higher")
        }else{
            println("Great!!!! The number is $number")
        }
    }


}