package com.maindsaprograms.kotlin_basics

/*
* Infix function
* we can call infix function with out using . and braces
* Infix functions must be member functions or extension functions with a single parameter.
*
* */

fun Int.isRotate(str: String): String {
    return str.repeat(this)
}

infix fun Int.isRotateInfix(str: String): String {
    return str.repeat(this)
}

class Addition(val numOne: Int) {
    infix fun plus(numberTwo: Int): Addition {
        return Addition(this.numOne + numberTwo)
    }
}

fun main() {

    val num = 3
    // this is normal extension function
    // we are calling extension function using . and braces
    println(num.isRotate("Mallangi"))


    //here this is infix function calling with out . and braces
    // this is more readable format
    println(num isRotateInfix "Paramesh")


    val addition = Addition(20)

    val result = addition plus 20
    println(result.numOne)
}