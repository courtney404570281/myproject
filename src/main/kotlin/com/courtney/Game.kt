package com.courtney

import java.util.*
import kotlin.random.Random

fun main() {
    var secret = Random.nextInt(10)+1
    println(secret)
    var number = 0
    while (number != secret) {
        print("Please enter a number: ")
        number = Scanner(System.`in`).nextInt()
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Great! The number is: " + number)
        }
    }

}