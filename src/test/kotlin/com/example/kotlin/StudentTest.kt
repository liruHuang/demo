package com.example.kotlin

import com.example.kotlin.student.Student2
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class StudentTest {
    @Test
    fun averageTest(){
        val stu = Student2("Annie", 80, 60)
        Assertions.assertEquals((80+60)/2, stu.getAverage())
    }

    @Test
    fun highestTest(){
        val stu = Student2("Annie", 80, 60)
        Assertions.assertEquals(80,stu.highest())
    }

    @Test
    fun gradingTest(){
        val stu = Student2("Annie", 80, 60)
        Assertions.assertEquals('C',stu.grading())
    }


}