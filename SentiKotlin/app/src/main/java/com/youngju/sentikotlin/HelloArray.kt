package com.youngju.sentikotlin

fun main() {
    // 1. 배열
    // 2. loop (반복)
    // 3. casting(캐스팅 - 가볍게 볼 것임)

    // 1. 배열 = {"","",""}
    var arr1 = listOf("1","2")              // 수정 불가 (java : ArrayList <= 수정 가능)
    var arr2 = mutableListOf("1","2")       // 수정할 수 있음

    arr2.add("3")

    // 2. 반복문 (향상된 반복문)
    for(item in arr1) {
        println(item)
    }

    for((index,item) in arr1.withIndex()) {
        println("$index :  $item")
    }

    // 3. casting object <String, int, long, ....> // Any - auto casting

    var hello: Any ="hello"
    if(hello is String) {
        var str: String = hello
    }
}