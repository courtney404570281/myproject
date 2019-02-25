fun main(args: Array<String>) {
//    println("Hello Kotlin!")
    val h = Human(66.5f, 1.72f)
    println(h.bmi())
}

class Human (var weight: Float, var height: Float){

    fun bmi(): Float {
        val bmi = weight / (height*height)
        return bmi
    }

    /*fun hello() {
        println("Hello Kotlin!")
    }*/
}