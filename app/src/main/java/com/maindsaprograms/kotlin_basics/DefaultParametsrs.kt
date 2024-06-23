package com.maindsaprograms.kotlin_basics

fun cricketKit4(batBrand: String, noOfBats: Int, noOfBalls: Int) {
    println("Cricket Kit is having $batBrand and $noOfBats and $noOfBalls")

}

// If we mention @JVMOverLoads We can able to use this code in Java Also
@JvmOverloads
fun cricketKit5(batBrand: String ="BandK", noOfBats: Int, noOfBalls: Int) {
    println("Cricket Kit is having $batBrand and $noOfBats and $noOfBalls")

}