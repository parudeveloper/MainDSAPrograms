package com.maindsaprograms.kotlin_basics.companion

/*
*
* Companion Object is equivalent of Static Key Word in Java
* We can able to call variable with out creating the object of tha class

* If we want only one copy of particular variable we can declare that variable with in companion object

*
* */
class ExampleCompanionObject() {
    companion object {

        var number: Int = 0
        fun increment(): Int {
            return number++
        }
    }

    var number1: Int = 0

    fun increment1(): Int {
        return number1++
    }
}

fun main() {
    val obj = ExampleCompanionObject()

    println("With Out Companion Object")
    obj.increment1()
    println(obj.number1)

    obj.increment1()
    println(obj.number1)

    val mutableValueHashCode = System.identityHashCode(obj.number1)
    println(mutableValueHashCode)

    println()
    println("With Companion Object")

    ExampleCompanionObject.increment()
    println(ExampleCompanionObject.number)

    ExampleCompanionObject.increment()
    println(ExampleCompanionObject.number)



    val staticValueHashCode = System.identityHashCode(ExampleCompanionObject.number)
    println(staticValueHashCode)


}