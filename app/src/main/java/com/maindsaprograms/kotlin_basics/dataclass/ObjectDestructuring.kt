package com.maindsaprograms.kotlin_basics.dataclass

/*
* if the class s not the data class Object Destructuring is not possible
* We are extracting duplicate object from another
*
* if we want to use Destructuring concept for classes we need to use "Operator fun component1() = variable" like this we need to create (please find out example below)
*
* */
data class Medicine(
    var drugName: String, var drugQ: String, var drugBrand: String, var impact: String
)
class Medicine1(var drugName: String, var drugQ: String, var drugBrand: String, var impact: String){
    operator fun component1()= drugName
    operator fun component2()= drugQ
    operator fun component3()= drugBrand
    operator fun component4()= impact


}

fun main() {
    val medicine = Medicine("Arithmetician", "3 Pills", "QBrand", "Medium")

    val (dn, dq, db, di) = medicine
    println("Medicine Name $dn")
    println("Medicine Quantity $dq")
    println("Medicine Brand $db")
    println("Medicine Impact $di")


    // if we don't want to use total object we can declare un used field with _ and we can mention our own values
    val (_, _, _, dim) = medicine
    println("Impact of this medicine is $dim")

    val medicine1 = Medicine1("Arithmetician", "3 Pills", "QBrand", "Medium")
    var (dn1, dq1, db1, di1) = medicine1
    println("Medicine 1 Name $dn1")
    println("Medicine 1 Quantity $dq1")
    println("Medicine 1 Brand $db1")
    println("Medicine 1 Impact $di1")





}