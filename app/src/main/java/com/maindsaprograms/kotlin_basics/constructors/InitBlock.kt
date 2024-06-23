package com.maindsaprograms.kotlin_basics.constructors

/*
* We can have multiple init blocks in the Class
* Init blocks will execute immediately after primary constructor execution
* Sequence is Primary Constructor --> Init Block --> Secondary Constructor
* */
class ExampleInit(val name: String, var city: String) {


    var age: Int = 0
    var mobileNO: String = ""

    // Init block will execute immediately after the execution of Primary constructor
    init {
        println("This is InitBlock 1")
        println("Primary constructors Values Name : $name and City : $city")
    }

    //if we want to use Secondary constructor should invoke primary constructor explicitly (This is Mandatory)
    constructor(n: String, c: String, age: Int) : this(n, c) {
        println("This is Secondary Constructor Starting")
        this.age = age
        println("$age")
        println("This is Secondary Constructor Ending")

    }

    //if we want to use any other Secondary constructor
    //it Should be invoke primary constructor or it should be invoke any other constructor which is invoking primary constructor

    init {
        println("Mobile Number is accessing with in Init Block $mobileNO")
    }
    constructor(n: String, c: String, a: Int, mobileNO: String) : this(n, c, a) {
        println("This is another Secondary Constructor Starting")
        this.mobileNO = mobileNO
        println("$mobileNO")
        println("This is another Secondary Constructor Ending")

    }
}

fun main() {
    var obj = ExampleInit("Mallangi", "HYD", 20)
    var obj1 = ExampleInit("Mallangi", "HYD", 20, "9909090909")
}