package com.example.kotlin

import org.hibernate.boot.jaxb.internal.stax.BufferedXMLEventReader
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class Item (val id: String, val name: String, val calories: Int, val price: Int) {
    override fun toString(): String {
        return "$id, $name, $calories, $price"
    }
}
/*

val menu = HashMap<String, Item>()
class McDonalds {
    init {

        val br = BufferedReader(FileReader("mcdonalds.txt"))
        var line = br.readLine()
        while (line != null) {
            val tokens = line.split(",")
            val item = Item (tokens[0], tokens[1], tokens[2].toInt(), tokens[3].toInt())
            menu.put(item.id, item)
            line = br.readLine()

        }
    }

    fun printMenu(){
        menu.entries.forEach {
            println(it.value)
        }
    }
}
*/

fun main() {
/*
    val mcDonalds = McDonalds()
    mcDonalds.printMenu()
*/

    File("mcdonalds.txt").bufferedReader().lines().forEach {
        println(it)
    }
}