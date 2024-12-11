package com.example.kotlin

import Human
import com.example.demo.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest(){
        val human = Human("Annie", 49f, 1.6f)
        Assertions.assertEquals(49f/(1.6f*1.6f),human.bmi())
    }

    @Test
    fun personBmiTest(){
        val person = Person(49f, 1.6f)
        Assertions.assertEquals(49f/(1.6f*1.6f),person.bmi())
    }
}