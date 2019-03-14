package com.courtney

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import Person

class PersonTest{
    @Test
    fun humanBmiTest() {
        val human = Human("Courtney", 66.5f, 1.72f);
        Assertions.assertEquals(66.5f / (1.72f*1.72f) ,human.bmi());
    }
    @Test
    fun personBmiTest() {
        val person = Person(66.5f, 1.72f)
        Assertions.assertEquals(66.5f / (1.72f*1.72f), person.bmi())
    }
}