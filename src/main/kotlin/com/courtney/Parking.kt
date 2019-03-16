package com.courtney

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter: LocalDateTime = LocalDateTime.of(2019, 3, 16, 10, 0, 0)
    val leave: LocalDateTime = LocalDateTime.of(2019, 3, 16, 12, 3, 0)

    val car = Car("AA-0001", enter)
    car.leave = leave
    var hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}

class Car(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value)) {
                field = value
            }
        }
    fun duration() = Duration.between(enter, leave).toMinutes()

}