package com.maindsaprograms.kotlin_basics
// writing table program using lambda function

/*
* Lambda Function Definition :
* It is Name Less Function and
* Its store value in to variable
* and we can pass that variable to any other function as Parameter
* Below function return type is : Function Invocation like ((a: Int, b: Int))
* */
val operation: (a: Int, b: Int) -> Int = { a: Int, b: Int ->
    Int
    var result = 0
    for (count in 1..b) {
        println("result $count  $a = ${count * a}")
        result = count * a
    }
    result
}
val isEvenOdd = { value: Int ->
    Int
    var result = ""
    for (i in 1..value) {
        if (i % 2 == 0) {
            result = "Given Integer Number $i is Even Number"
            println(result)
        } else {
            result = "Given Integer Number $i is Odd Number"
            println(result)
        }
    }
    result

}
val additionLambdaFunction: (a: Int, b: Int) -> Int = { a: Int, b: Int ->
    Int
    var result = 0
    result = a + b
    result

}

fun passLambdaFunAsParameter(a: Int, b: Int, operation: (a: Int, b: Int) -> Int): Int {
    return operation(a, b) + a + b
}

fun main() {
    println(operation(2, 10))

    // we can store the lambda function value in to variable
    val evenOdNumberCheck = isEvenOdd(10)
    // println(evenOdNumberCheck)

    println(additionLambdaFunction(100, 200))


    //This is Lambda function which we need pass as Parameter
    val multiplication = { a: Int, b: Int -> (a * b) }

    // calling Function -> Lambda function as Parameter
    println(passLambdaFunAsParameter(1, 2, multiplication))
}