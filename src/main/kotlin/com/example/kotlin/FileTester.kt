package com.example.kotlin

import java.io.File

fun main() {

    File("output.txt").bufferedReader().lines().forEach {
        println(it)
    }

/*
    File("output.txt").bufferedReader().forEachLine{
        println(it)
    }
*/


//    write()

}

private fun write() {

    //    File("output.txt").writeText("abcd")

    /*
        File("output.txt").printWriter().use {
            it.println("first line")
            it.println("second line")
            it.println("third line")
            }
    */
    File("output.txt").bufferedWriter().use{
        it.write("1st 1111111")
        it.write("2nd 22222222")
        it.write("3rd 33333333")
    }
}