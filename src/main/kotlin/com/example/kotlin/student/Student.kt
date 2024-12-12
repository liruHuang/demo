package com.example.kotlin.student

import java.util.*

fun main() {
    Student.pass = 50;

    val stu = Student("Annie", 80, 66)
    val stu2 = Student("Hank", 65, 43)
    val stu3 = Student("Eric", 45, 87)
    val gstu = GraduatesStudent("Jack", 79,45,50)
    stu.print()
    stu2.print()
    stu3.print()
    gstu.print()
    val t = 123
    println("test: $t")
    println("Highest score : ${stu.highest()}")



//    userInput()
}

class GraduatesStudent(name : String?, english : Int , math : Int, var thesis: Int) : Student(name, english, math) {
    var pass = 70;
    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun getAverage() = (math + english + thesis) / 3

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}



open class Student(var name : String?, var english : Int, var math : Int) {

    companion object {
        @JvmStatic
        var pass = 60;
        fun test() {
            println("test")
        }
    }

    open fun print() {
/*
        print(
            name + "\t" + english + "\t" + math + "\t"
                    + getAverage() + "\t"
                    + if (getAverage() >= 60) "PASS" else "FAILED")
*/
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")

    }

    open fun getAverage() = (english + math) / 2

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

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

