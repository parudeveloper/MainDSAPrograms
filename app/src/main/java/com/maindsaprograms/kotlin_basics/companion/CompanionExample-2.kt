package com.maindsaprograms.kotlin_basics.companion
/*
*
* Companion Object is equivalent of Static Key Word in Java
* We can able to call variable with out creating the object of tha class

* If we want only one copy of particular variable we can declare that variable with in companion object

*
* */
class Example1 {
    companion object {
        val staticValue = "Hello, Kotlin!"
        var mutableValue = 42
    }
}

fun main() {
    // Accessing companion object variables
    println(Example1.staticValue) // Output: Hello, Kotlin!
    println(Example1.mutableValue) // Output: 42

    // Modifying mutableValue
    Example1.mutableValue = 100
    println(Example1.mutableValue) // Output: 100


    // if we change the value any number of times it will refer to the same object in the memory
    Example1.mutableValue = 110
    println(Example1.mutableValue) // Output: 110


    // Checking identity hash codes
    val staticValueHashCode = System.identityHashCode(Example1.staticValue)
    val mutableValueHashCode = System.identityHashCode(Example1.mutableValue)

    println("Identity Hash Code of staticValue: $staticValueHashCode")
    println("Identity Hash Code of mutableValue: $mutableValueHashCode")
}
