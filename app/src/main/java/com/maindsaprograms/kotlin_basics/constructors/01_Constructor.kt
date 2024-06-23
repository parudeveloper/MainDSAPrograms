package com.maindsaprograms.kotlin_basics.constructors

/*
* Constructor
*
*  we Have Primary and Secondary constructors for class
* if we want to use Secondary constructor should invoke primary constructor explicitly (This is Mandatory)
* if we want to use any other Secondary constructor -->
* it Should be invoke primary constructor or it should be invoke any other constructor which is invoking primary constructor
*
* */
class Person(val name: String, val city: String) {

    var age: Int = 0
    var mobileNO :String = ""

    //if we want to use Secondary constructor should invoke primary constructor explicitly (This is Mandatory)
    constructor(n: String, c: String, age: Int) : this(n, c) {
        this.age = age

    }

    //if we want to use any other Secondary constructor
    //it Should be invoke primary constructor or it should be invoke any other constructor which is invoking primary constructor
    constructor(n: String, c: String, a: Int,mobileNO:String) : this(n, c,a) {
        this.mobileNO =mobileNO

    }
}