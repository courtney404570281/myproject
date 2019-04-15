package com.courtney

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    var counter = 1

    // thread
    /*var ms = measureTimeMillis {
        for (n in 1..100_000) {
            thread{
                counter ++
            }
        }
    }*/

    // GlobalScope
    var ms = measureTimeMillis {
        for (n in 1..100_000) {
            GlobalScope.launch {
                counter ++
            }
        }
    }
    println(ms)

}