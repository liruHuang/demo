package com.example.kotlin

import java.util.*

fun main() {
    val stu = Student("Annie", 80, 66)
    stu.print()
    val t = 123
    println("test: $t")
    println("Highest score : ${stu.highest()}")



//    userInput()
}



class Student(var name : String?, var english : Int, var math : Int) {
    fun print() {
/*
        print(
            name + "\t" + english + "\t" + math + "\t"
                    + getAverage() + "\t"
                    + if (getAverage() >= 60) "PASS" else "FAILED")
*/
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")

    }

    fun getAverage() = (english + math) / 2

    fun passOrFailed() = if (getAverage() >= 60) "PASS" else "FAILED"

    fun grading() =  when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }


/*
    fun grading(): Char {
        var grading = when (getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
        return grading
    }
*/


    fun highest() = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
/*        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        return max
*/

/*      if(english > math) {
        max = english
         }else{
        max =math
*/


    fun check() = println(name?.length)

/*
    fun check() {
        println(name?.length)
    }
*/

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
        stu.check();
    }
}

