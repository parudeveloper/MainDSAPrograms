package com.practicedsaprograms.abstractexample

class Zoo(){
    var lion = Lion("Lion", 40)
    var lion1 = Lion("Lion", 40)
    var lion2 = Lion("Lion", 40)

    var list = mutableListOf<Animal>()
    fun display() {
        list.add(lion)
        list.add(lion1)
        list.add(lion2)
    }
}

fun main() {
    var obj = Zoo()

}