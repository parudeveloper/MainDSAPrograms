package com.maindsaprograms.kotlin_basics

// This is normal function ( Parameters Passing through Function)
fun cricketKit(batBrand: String, noOfBats: Int, noOfBalls: Int) {
    println("Cricket Kit is having $batBrand and $noOfBats and $noOfBalls")

}
//Default parameters passing through Function
//no need to pass last parameter because we declaring with in the function as default parameter
fun cricketKit1(batBrand: String, noOfBats: Int, noOfBalls: Int = 7) { //noOfBalls is default parameter
    println("Cricket Kit is having $batBrand and $noOfBats and $noOfBalls")

}

// if we pass default parameter in the middle of the function
// we need to call this function in different way
// Named Parameters
fun cricketKit2(batBrand: String ="CoCOBurro", noOfBats: Int, noOfBalls: Int) { //noOfBalls is default parameter
    println("Cricket Kit is having $batBrand and $noOfBats and $noOfBalls")

}

fun cricketKit3(batBrand: String , noOfBats: Int, noOfBalls: Int) { //noOfBalls is default parameter
    println("Cricket Kit is having $batBrand and $noOfBats and $noOfBalls")

}


fun main() {
    cricketKit("MRF",3,10)

    //default parameters concept
    cricketKit1("MRF",3)

    // This concept is called Named Parameters it will supports few languages one is kotlin
    //cricketKit2(noOfBats = 3, noOfBalls = 20)
    cricketKit2(noOfBats = 2, noOfBalls = 3) // Named Parameters

}