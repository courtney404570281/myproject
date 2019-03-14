package com.courtney

import java.lang.System.`in`
import java.util.*

fun main() {
    val scanner = Scanner(`in`)
    val secret = Random().nextInt(10) + 1
    println(secret)
    for (i in 1..4) {
        print("Please enter the number:")
        var number = scanner.nextInt()
        println("第${i}次：$number")
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Great! The number is $number")
            break;
        }
    }
}