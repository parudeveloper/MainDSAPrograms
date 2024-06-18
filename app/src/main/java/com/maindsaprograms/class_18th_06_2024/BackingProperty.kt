package com.maindsaprograms.class_18th_06_2024

class Psngr {
    // _name -> is backing property of name property
    private var _name: String = ""
    private var name: String = _name

    fun assignName(n: String) {
        _name = n.filter { !( it in ('0'..'9')) }
        name = _name
    }

    fun getName() = name
}

fun main() {
    val p = Psngr()
    p.assignName("Sammy 123Hello")
    println("Name = ${p.getName()}")
}