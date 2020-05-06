package com.youngju.sentikotlin

fun main() {
    val hello1 : String = "Hello, World!"         // final : 바꿀 수 없는 상수
    var hello2 : String?         // int, String, float, double, ...
        // ? 가 있으면 null을 넣을 수 있다는 의미 / 없으면 null 못 넣음
                                // null - String hello  = "123"; --> = null; (자바는 가능)
    hello2 = "123"
    print(hello1)
    println(hello2)
}

fun hello(): String { // void // private void hello() {} // private String hello() {}
    return ""
}