package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.demo.school.Student;

public class StudentTest {

    @Test
    void highestTest() {
        Student student = new Student("Annie",80, 90);
        Assertions.assertEquals(90, student.highest());
    }

    @Test
    void averageTest() {
        Student student = new Student("Annie",80, 90);
        Assertions.assertEquals((80+90)/2, student.getAverage());
    }
}
