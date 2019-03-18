package com.courtney

fun main() {
    val list = listOf(1, 3, 4, 2, 5)
    println(list)
    val scores = listOf(68, 88, 90, 49, 50)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(68, 88, 90, 49, 50)
    mutableList.add(6)
    println(mutableList)
}