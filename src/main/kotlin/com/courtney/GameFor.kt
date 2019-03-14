package com.courtney

import java.lang.System.`in`
import java.util.*

fun main() {
    val scanner = Scanner(`in`)
    for (i in 1..5) {
        print("Please enter the number:")
        var number = scanner.nextInt()
        println("第${i}次：$number")
    }
}