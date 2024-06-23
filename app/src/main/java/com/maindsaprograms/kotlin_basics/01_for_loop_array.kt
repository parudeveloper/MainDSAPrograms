package com.maindsaprograms.kotlin_basics

fun main() {
    val intArray = arrayOf<Int>(23, 45, 65, 78, 9, 21, 32, 43, 54, 65, 76, 87)

    // Print Array Values along with Indexes using basic for loop
    println(" Print Array Values along with Indexes using basic for loop")
    for (i in 0..intArray.size - 1) {
        println("Array position $i and Value is ${intArray[i]}")
    }


    println()
    //Print Array Values along with Indexes using indices
    println("Print Array Values along with Indexes using indices")
    for (i in intArray.indices) {
        println("Array position $i and Value is ${intArray[i]}")

    }



    //Printing Array Values and positions using until with out mentioning the size of the array
    println()
    println("Printing Array Values and positions using until with out mentioning the size of the array ")
    for (i in 0 until intArray.size) {
        println("Array position $i and Value is ${intArray[i]}")
    }


    println()
    //Print only Array value with out index
    println("Print only Array value with out index")
    for (values in intArray) {
        println("$values")
    }
}