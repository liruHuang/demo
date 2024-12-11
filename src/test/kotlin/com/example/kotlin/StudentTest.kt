package com.example.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest(){
        val student = Student("Annie", 80, 50)
        Assertions.assertEquals(80, student.highest())
    }
    @Test
    fun averageTest(){
        val student = Student("Annie", 80, 50)
        Assertions.assertEquals((80+50)/2, student.getAverage())
    }

    @Test
    fun gradingTest(){
        val student = Student("Annie", 80, 50)
        Assertions.assertEquals('D', student.grading())
    }


}