package com.maindsaprograms.kotlin_basics

/*
* Function declared with Inline Keyword
* For Inline Functions, Function calls are replaced by Function bodies in compile time itself
* it enhance the performance of the application to reduce the control of execution at runtime during nested function calls
*
*
* In Simple Words if we want to use multiple functions calls with in the class we can use this inline function
* because this will reduce multiple function calls at run time it will run at compile time itself
* when we use inline Function it will replace the every function call with body
* */

inline fun performingOperation(a: Int, b: Int, operation: (a: Int, b: Int) -> Int): Int {
    return operation(a, b) // we are returning same function which we are passing above as parameter
}

fun main() {
    // This is Our Lambda Function
    val operation = { a: Int, b: Int -> a + b } // we are calling this function in two times in our program
    println(operation(30, 3))

    // Here we are using inline function // function call automatically replace with function body at compile time itself
    //this is Inline Function
    println(performingOperation(30, 40, operation))

}

