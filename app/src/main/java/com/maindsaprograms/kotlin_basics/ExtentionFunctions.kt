package com.maindsaprograms.kotlin_basics
//Rotation of String
/*
*
* Extension Function
* We are adding our custom function to the exiting function with out using inheritance
* The Ability to add our function to the Exiting class
*
* */
fun Int.isEven(): String {
    var returnStatement = ""
    if (this % 2 == 0) {
        returnStatement = "Given Number $this is Even Number"
    } else {
        returnStatement = "Given Number $this is Odd Number"
    }
    return returnStatement
}

// Example
fun Int.isMultiplication(b: Int) {
    for (i in 1..b) {
        println("$this * $i = ${this * i}")
    }
}

fun List<Int>.sumOfElements(): Int {
    var sumOfIntegers = 0
    for (i in this) {
        sumOfIntegers += i
    }
    return sumOfIntegers
}

fun String.OvelsCount(): Int {
    val vowels = "AEIOUaeiou"
    var count = 0
    for (char in this) {
        for (vCount in vowels) {
            if (char == vCount) {
                count++
            }
        }
    }
    return count
}




fun main() {

    println("Checking Even or Odd Number")
    val num = 20
    println(num.isEven())

    println("Multiplication Table")
    val tableNumber = 2
    tableNumber.isMultiplication(10)

    println("Sum Of Integer Elements")
    val intList = listOf(1, 3, 4, 6, 7, 8, 9, 10)
    println(intList.sumOfElements())

    println("Printing vowel Count")
    val name = "maaeiou"
    println(name.OvelsCount())
}