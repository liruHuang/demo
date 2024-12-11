package com.example.kotlin

fun main() {
    val list = listOf(3,6,4,1,3,2)
    println(list)
    println(list.get(2))
    val scores = listOf(67, 89, 50, 97)
    for( score in scores){
        println(score)
    }
    var mutableList = mutableListOf(7,5,3,2,1)
    mutableList.add(0)
    println(mutableList)

}