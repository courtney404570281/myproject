package student

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = Student("Courtney", 90, 77)
    stu.print()
    println("Highest Score: ${stu.highest()}" )
}

class Student(var name: String?, var english: Int, var math: Int){

    fun print(){
        print(name + "\t" + english + "\t" + math + "\t" +
                getAverage() + "\t" +
        if (getAverage() >=60) "PASS" else "FAILED")
        println("\t" + grading())
    }

    fun grading() = when (getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'C'
            else -> 'F'
        }

    fun getAverage() = (english + math)/2

    fun nameCheck(){
        println(name?.length)
    }

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

