package com.example.kotlin

import java.util.*


fun main() {
    val secret = Random().nextInt(10)+1
    val scanner = Scanner(System.`in`)
    for(i in 1..3){
        println("please enter a number")
        val number = scanner.nextInt()
        if (number > secret){
            println("Lower")
        }else if(number < secret){
            println("Higher")
        }else{
            println("Congra!! Number is $number")
            break
        }
    }

}