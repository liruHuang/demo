package com.example.kotlin

import java.io.*
import java.util.function.Consumer

val menu = HashMap<String, Item>()
class McDonalds {

    init {
        val file = File("mcdonalds.txt")

        val br = BufferedReader(FileReader(file))
        var line = br.readLine()
        while (line != null) {
            val tokens = line.split(",")
            val item = Item(tokens[0], tokens[1],tokens[2].toInt(),tokens[3].toInt())
            menu.put(item.id, item)
            line = br.readLine()
        }
    }

    fun printMenu () {
        menu.entries.forEach {
            println(it.value)
        }
    }
}


fun main() {
    val McDonalds = McDonalds()
    McDonalds.printMenu();
}



data class Item (val id : String, val name : String, val calorie : Int, val price : Int) {
    override fun toString(): String {
        return "$id, $name, $price, $id"
    }
}