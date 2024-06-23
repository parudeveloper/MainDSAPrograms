package com.maindsaprograms.kotlin_basics

/*
* Lazy Initialization Means---> I don't want to access the data member at the time of object Instantiation
* Why because it will consuming process and memory consuming process
* I want to use this property only when it is being used for very first time
*we are delaying the initialization until we are using that variable
*
* I Just want to use that property when ever we are using at first time
* Only when we use it for very 1st time
* it is val type so we cant re assign the value
*
*
* Difference Btn Late init and Lazy Initialization
*
* Late init we only use for Non Primitive Data types vs But Lazy init will used for any type of variables
* Late init only applied for var vd But Lazy initialization only applied for val
*
* */

class Lazy_Initilization(){
    // we can use any type of variables
    // only applied for val
    val name:String by lazy {
        print("Welcome to ")
        "Learning Kotlin"
    }
}

fun main() {
    val obj = Lazy_Initilization() // class obj declaration

    //We are accessing at very 1st time
    println(obj.name)

    //we are accessing again
    println(obj.name)
}