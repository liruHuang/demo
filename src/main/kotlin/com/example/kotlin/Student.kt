package com.example.kotlin

import java.util.*

fun main() {
    val stu = Student("Annie", 88, 66)
    stu.print()
    val t = 123
    println("test: $t")
    println("Highest score : ${stu.highest()}")



//    userInput()
}



class Student(var name : String?, var english : Int, var math : Int){
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t"
                + getAverage() + "\t"
                + if(getAverage() >= 60) "PASS" else "FAILED")
    }

    fun getAverage() :Int {
        return (english + math) / 2
    }

    fun highest() : Int{
        var max = if(english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        return max

       /*if(english > math) {
            max = english
        }else{
            max =math
        }*/
    }

    fun check(){
        println(name?.length)
    }
}

private fun userInput() {
    var scanner = Scanner(System.`in`)
//    print("please enter your name: ");
//    var name = scanner.next();
    var name = null
    print("enter your english score: ")
    var english = scanner.nextInt();
    print("enter your math score: ")
    var math = scanner.nextInt();
    val stu = Student(name, english, math)
    stu.print();
    stu.check()
}

