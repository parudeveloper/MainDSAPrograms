package com.maindsaprograms.kotlin_basics
//Variable length parameter function
/*
*
*  varargs is the keyword for Variable Length Parameter function
*  allow you to pass a number of arguments to a function.
*  This can be particularly useful when you don't know in advance how many arguments will be passed
*
*
*  Multiple Varargs parameters is not possible in single function
* */
fun sumOfIntegers(vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
    return result
}

fun main() {
    println(sumOfIntegers(1, 2, 3, 4, 5, 6))
}