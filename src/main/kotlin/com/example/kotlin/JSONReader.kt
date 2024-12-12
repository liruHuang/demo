package com.example.kotlin


import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://odws.hccg.gov.tw/001/Upload/25/opendataback/9059/27/385f68c2-95e6-48cd-a9f8-0d3ffa35554b.json")
    println(url.readText())

/*
    with (url.openConnection() as HttpURLConnection) {
        inputStream.bufferedReader().lines().forEach {
            println(it)
        }
*/
/*
        val br = inputStream.bufferedReader()
        var line = br.readLine()
        val json = StringBuffer()
        while (line != null) {
            json.append(line)
            line = br.readLine()
        }
        println(json.toString())
*/



}