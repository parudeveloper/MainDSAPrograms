package com.maindsaprograms.kotlin_basics.dataclass

import com.maindsaprograms.kotlin_basics.Lazy_Initilization

/*
* we can store the data using data classes in kotlin
* data classes can hold the data
* data classes have special features
* 1.toString()
* 2.copy()
* 3.equals // it will check the contents of Objects
* 4.HashCode
*
*
* */
data class Employee(var name: String, var age: Int, var salary: Double)

fun main() {
    val obj = Employee("Yoga", 28, 60000.0)
    val obj2 = Employee("Yoga", 28, 60000.0)
    val obj1 = Employee("Ashok", 29, 50000.0)
    println(obj2.equals(obj1)) // it will check the contents of the object
    //val obj1 = Lazy_Initilization()

    println("This is  toString()")
    // implementing toString()
    println(obj.toString())


    println("This is To Copy")
    //Implementing copy() of Object
    val copyOfObject = obj.copy()
    println(copyOfObject)

    println("This is Equal to")
    println(copyOfObject.equals(obj))

    println("This is Hashcode")
    println(obj.hashCode())
}