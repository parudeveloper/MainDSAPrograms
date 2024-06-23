package com.maindsaprograms.kotlin_basics

/*
* if our function is having single statement in it we can able to write a function in single line
* Reduce the Boilerplate Code
*
* If We have only one Statement too return we can use this Single Line Statement
* */

//This is normal function
fun square(a: Int, b: Int): Int {
    var result = a + b
    return result
}

//This is called single line Function with return something
fun singleLineSquareFunction(a: Int, b: Int): Int = a + b


// This is normal function which we are writing regularly
fun showMsg1(msg :String) {
    println(msg)
}

// This is return Statement with out returning anything
fun showMsg (msg : String) = println(msg)