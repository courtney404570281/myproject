package com.courtney

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    Student.pass = 50
    val stu = Student("Courtney", 10, 91)
    val stu1 = Student("Jennifer", 50, 48)
    val stu2 = Student("Griselda", 11, 33)
    val gs = GraduateStudent("Florence", 70, 59, 64)

    stu.print()
    stu1.print()
    stu2.print()
    gs.print()

    println("Highest Score: ${stu.highest()}" )
}

open class Student(var name: String?, var english: Int, var math: Int){

    companion object {
        @JvmStatic
        var pass = 40
        fun test(){
            println("testing")
        }
    }

    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    //fun passOrFailed () = if (getAverage() >=60) "PASS" else "FAILED"

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    open fun grading() = when (getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'C'
            else -> 'F'
        }

    open fun getAverage() = (english + math)/2

    fun nameCheck() = println(name?.length)

    fun highest() = if(english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }
}

class GraduateStudent(name: String?, english: Int, math: Int, var thesis: Int) : Student(name, english, math) {

    companion object {
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    override fun grading()= when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'C'
        else -> 'F'
    }

    override fun getAverage() = (english + math)/2
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

