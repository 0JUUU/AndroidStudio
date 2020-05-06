package com.youngju.sentikotlin

fun main() {

    // 기능(함수)들의 집합체(객체)

    // 1. class - 자동차(시동, 운전) , 사람( 밥먹는다, 물먹는다), 식물(자란다, 죽는다), ...
    // 2. data class - set, get

    // 1. 코딩
    // 2. 호출
    var cls1 = HelloClass()
    var cls2 = HelloClass(10)

    // java
    // HelloClass cls = new HelloClass();

    println(cls2.age)

    var person = Person(5,"Senti")
    //println("$person.age : $person.name")
    println(person.name)
}

class HelloClass {
    var age:Int = 0
    init {

    }

    // def 생성자(java), 보조 생성자(java)
    constructor()           // 생성자 (특정한 값을 초기화) - 값을 넘겨서 초기화 불가능(안에서는 값 변경은 가능) : 기본 생성자
    constructor(age: Int) {     // 값을 넘기면서 초기화 가능 : 보조 constructor
        this.age = age
    }
}

data class Person(var age: Int, val name: String)