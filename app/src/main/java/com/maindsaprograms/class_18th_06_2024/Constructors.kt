package com.maindsaprograms.class_18th_06_2024

class Person(val name: String, val city: String) {

    var age: Int = 0
    var mobileNo: String = ""

    init {
        println("Init block is executed and name = $name and city = $city")
    }

    // Secondary constructor should invoke primary constructor explicitly directly or indirectly
    constructor(n: String, c: String, a: Int) : this(n, c) {
        println("Start of secondary constructor")
        age = a
        println("Secondary constructor executed and value of age = $age")
    }

    constructor(n: String, c: String, a: Int, m: String): this(n, c, a) {
        println("Another secondary constructor started")
        mobileNo = m
        println("Mobile No. = $mobileNo")
    }

    init {
        println("This is init block number 2")
    }

    init {
        println("This is init block number 3")
    }
}

fun main() {
    val person = Person("John", "New York", 28)
    val p2 = Person("Rita", "Chicago", 28, "7852413369")
}