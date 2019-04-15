package com.courtney

import java.io.File

fun main() {

//    Write()
}

private fun Write() {

    //    File("output.txt").writeText("abc123")

    // 不需要自己換行
    /*File("output.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
        it.println("3rd line")*/
    
    // 寫大量資料，用 bufferedWriter 效率較佳
    // 需要自己換行
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}