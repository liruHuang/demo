package com.example.kotlin.student

import org.springframework.data.jpa.domain.AbstractPersistable_.id

fun main() {
    Student2.pass = 50
    val stu = Student2("Annie", 60, 50)
    val gstu = GraduatedStudent("Jane", 60, 70, 59)
    gstu.print()
    stu.print()
    stu.highest()
    Student2.test()
    val test = 123
    println("test : $test")


}

class GraduatedStudent(name: String, english: Int, math: Int,var thesis: Int): Student2(name, english, math){
    companion object{
        var pass = 70
    }
    override fun print(){
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}" )
    }
    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
    override fun getAverage() = (english+math+thesis)/3
}

open class Student2 (var name: String, var english: Int, var math: Int ) {
    companion object {
        @JvmStatic
        var pass = 60;
        fun test(){
            println("test")
        }
    }

    open fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    internal fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun getAverage(): Int {
        return (math + english) / 2
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    fun highest() = if (math > english) {
        println("math is highest: $math")
        math
    } else {
        println("english is highest: $english")
        english
    }
}
