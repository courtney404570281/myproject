package com.courtney

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    Student.pass = 50
    val stu = Student("Courtney", 10, 91)
    val stu1 = Student("Elizabeth", 50, 48)
    val stu2 = Student("Georgina", 11, 33)
    stu.print()
    stu1.print()
    stu2.print()
    println("Highest Score: ${stu.highest()}" )
}

class Student(var name: String?, var english: Int, var math: Int){

    companion object {
        @JvmStatic
        var pass = 40
        fun test(){
            println("testing")
        }
    }

    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    //fun passOrFailed () = if (getAverage() >=60) "PASS" else "FAILED"

    fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    fun grading() = when (getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'C'
            else -> 'F'
        }

    fun getAverage() = (english + math)/2

    fun nameCheck() = println(name?.length)

    fun highest() = if(english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }
}

private fun userInput() {

    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
    var name = scanner.next()
    // var name = null
    print("Please enter student's english: ")
    var english = scanner.nextInt()
    print("Please enter student's math: ")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()

}

