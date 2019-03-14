package com.courtney

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest() {
        val student = Student("Courtney", 88, 50)
        Assertions.assertEquals(88, student.highest())
    }

    @Test
    fun getAverageTest() {
        val student = Student("Courtney", 88, 50)
        Assertions.assertEquals((88+50)/2, student.getAverage())
    }

    @Test
    fun gradingTest() {
        val student = Student("Courtney", 88, 50)
        Assertions.assertEquals('C', student.grading())
    }

}