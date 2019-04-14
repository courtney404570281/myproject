package com.courtney

data class Ticket(val origin: Int, val destination: Int, val price: Int)

fun main() {
    val ticket = Ticket(20, 51, 420)
}