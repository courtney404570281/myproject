fun main(args: Array<String>) {

    var s = "abcde"
    // var s: String? = "abcde"
    // s = null
    println(s.length) // 5
    //println(s!!.length) // 表示需要自己處理 NulPointerException
    //println(s?.length) // 表示 Kotlin 自己處理 Null // Null
    println(s.get(3)) // d
    println(s.substring(3)) // de

    val h = Human(weight = 66.5f, height = 1.72f)
    println(h.bmi())
    //    println("Hello Kotlin!")

    //練習比較
    val score = 88;
    println(score > 80)
    val c: Char = 'A';
    println(c.toInt() > 50)
    println(c > 'a')
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