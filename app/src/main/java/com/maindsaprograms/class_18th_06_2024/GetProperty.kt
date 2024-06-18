package com.maindsaprograms.class_18th_06_2024





class Passenger {
    var name: String = ""
        get() {
            // field -> backing field
            println("Get method of name is executed")
            return field.uppercase()
        }
        set(value) {
            println("Set method of name is executed")
            val filtered = value.filter { !(it in ('0'..'9')) }
            field = filtered
        }
    var age: Int = 0
        set(value) {
            if(value < 0 ) {
                field = 0
            } else {
                field = value
            }
        }
}

fun main() {
    val p = Passenger()

    p.name = "John3 Derek"
    p.age = -34
    println("Name = ${p.name}")
    println("Age  = ${p.age}")
}


