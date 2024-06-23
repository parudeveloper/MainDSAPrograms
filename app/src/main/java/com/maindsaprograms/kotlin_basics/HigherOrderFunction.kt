package com.maindsaprograms.kotlin_basics

/*
* Function which is having another Function as parameter is nothing but Higher Order Function
* or Function will return the lambda function
* */
fun exampleOfHigherOrderFun(intList: List<Int>, operation: (Int) -> Int): List<Int> {
    val mutableListOfInt = mutableListOf<Int>()
    for (i in intList) {
        mutableListOfInt.add(operation(i))
    }
    return mutableListOfInt
}

fun exampleHOF(intList: List<Int>, operation: (a: Int) -> Int): List<Int> {
    val mutableListOfInt = mutableListOf<Int>()
    for (i in intList) {
        mutableListOfInt.add(operation(i))
    }
    return mutableListOfInt

}

// this is another function which we are passing as parameter for above function
fun addition(a: Int): Int = a + 1
fun square(a: Int): Int = a * a


fun exampleHOFWillReturnLambda(a: Int, b: Int, operation: (a: Int, b: Int) -> Int): Int {
    return operation(a, b)
}

fun main() {

    val intArray = listOf(1, 2, 3, 4, 5)
    // Example : this(forEach) is the function which is accepting another function as parameter inside
    intArray.forEach { a ->
        Int
        println(a)
    }

    // calling higherOrder Function
    // Function will pass another function as Parameter
    println(exampleOfHigherOrderFun(intArray, ::addition))
    println(exampleHOF(intArray, ::square))

    val addition: (a: Int, b: Int) -> Int = { a: Int, b: Int ->
        a + b
    }
    println(exampleHOFWillReturnLambda(2, 3, addition))


}