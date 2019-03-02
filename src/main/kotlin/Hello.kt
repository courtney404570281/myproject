fun main(args: Array<String>) {
    val h = Human(weight = 66.5f, height = 1.72f)
    println(h.bmi())
    //    println("Hello Kotlin!")
}

class Human (var name: String = "", var weight: Float, var height: Float){
    init {
        println("test $weight")
    }

    fun bmi(): Float {
        val bmi = weight / (height*height)
        return bmi
    }

    /*fun hello() {
        println("Hello Kotlin!")
    }*/
}