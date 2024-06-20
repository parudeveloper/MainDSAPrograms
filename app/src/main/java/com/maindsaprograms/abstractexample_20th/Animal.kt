package com.practicedsaprograms.abstractexample

abstract class Animal(val name: String, val age: Int) {

    abstract fun makeSound()
    abstract fun move()
    fun describe() {
        println("Animal Name : $name")
        println("Animal Age : $age")

    }
}

class Lion(name: String, age: Int) : Animal(name, age) {
    override fun makeSound() {
        println("Lion Makes Roar Sound")
    }

    override fun move() {
        println("Lion Runs")
    }
}

class Elephant(name: String, age: Int) : Animal(name, age) {
    override fun makeSound() {
        println("Elephant Makes Trumpet Sound")
    }

    override fun move() {
        println("Elephant Walks")
    }
}
class Zoo1() {
    var lion = Lion("Lion", 40)
    var elephant = Elephant("Elephant", 40)
    val listOf = mutableListOf<Animal>()
    fun displayListOfAnimals(){
        listOf.add(lion)

    }

}

fun main() {
    val objZoo = Zoo1()
    objZoo.lion.describe()
    objZoo.lion.makeSound()
    objZoo.lion.move()

    objZoo.elephant.describe()
    objZoo.elephant.makeSound()
    objZoo.elephant.move()


}