package com.courtney

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest{
    @Test
    fun bmiTest() {
        val human = Human("Courtney", 66.5f, 1.72f);
        Assertions.assertEquals(66.5f / (1.72f*1.72f) ,human.bmi());
    }
}