package com.maindsaprograms.kotlin_basics

import android.provider.ContactsContract.Data

/*
* We can not use lateinit property for Primitive Data types (Int,Char,Double)
*
* late init means we telling to the compile that we will initialize the value later point of time
* we need to use type var only not val
* mainly it will use -> initialization of non-nullable variables
*
* */

class Example() {
    lateinit var data: String
    fun checkingLateinit() {
        data = "Mallangi Parameswar Reddy" // this is the initialization of late in init variable as usual
        if (::data.isInitialized) { // To Avoid compile time crashing we need use this condition for late init initialization check
            println("Late init Value is initialized")
        } else {
            println("Late init Value is not initialized")

        }
    }
}

fun main() {
    val example = Example()
    example.checkingLateinit()


}
