package com.courtney

import java.time.LocalDateTime

fun main() {
    val parkingLot = HashMap<String, Car?>()
    var enter = LocalDateTime.of(2019, 3, 20, 10, 0, 0);
    var car : Car? = Car("AAA-001", enter)
    parkingLot.put(car!!.id, car)
    car = Car("BBB-002", enter.plusMinutes(15))
    parkingLot.put(car.id, car)
    // Car1 Leaving
    var leave = LocalDateTime.of(2019, 3, 20, 11, 0, 0)
    car = parkingLot.get("AAA-001")
    car?.leave = leave
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
    // Car2 Leaving
    car = parkingLot.get("BBB-002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

    /*val list = listOf(1, 3, 4, 2, 5)
    println(list)
    val scores = listOf(68, 88, 90, 49, 50)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(68, 88, 90, 49, 50)
    mutableList.add(6)
    println(mutableList)*/
}