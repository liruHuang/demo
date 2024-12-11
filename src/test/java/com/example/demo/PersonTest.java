package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void bmiTest() {
        Person person = new Person("Annie", 49f, 1.6f);
        Assertions.assertEquals(49f/(1.6f*1.6f), person.bmi());
    }
}
