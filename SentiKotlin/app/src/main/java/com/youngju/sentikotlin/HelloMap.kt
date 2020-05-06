package com.youngju.sentikotlin

fun main() {
    // map - key, value pair (JSON도) name! senti(value)
    // {"name":"senti"}

    var map1 = mapOf(Pair("name","senti"))
    var map2 = mutableMapOf<String, String>()         // type
    map2.put("name","senti")
    map2.put("age","1")

    // key
    println(map2.keys)
    for(map in map2) {
        println(map.value)
    }
}