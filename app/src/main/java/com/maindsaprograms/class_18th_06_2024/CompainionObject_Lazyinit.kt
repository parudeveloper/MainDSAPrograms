package com.maindsaprograms.class_18th_06_2024

/*"Point-Of-Sale Application:(POS)
POS is used in shopping mall for bill printing at checkout counter. At checkout counter operator
feeds data about customer as customer name, mobile number, address and sale details of n items such
as item id, item name, price and quantity. At the end customer receivers a detailed bill which
includes customer details, purchase details and total bill amount.
Write a program to simulate POS application. "
*/

// 1200 3 = 3600
// 1000 2 = 2000

// toString, copy, hashCode, equals, component N
data class Customer(val name: String, val mobileNo: String, val address: String)

data class SaleItem(val id: Long, val name: String, val price: Float, val qty: Int)

class Bill {

    companion object {
        var nextBillNo: Long = 1000L
    }

    val billNo: Long

    constructor() {
        billNo = nextBillNo
        nextBillNo++
        println("Object created")
    }
    lateinit var customer: Customer
    lateinit var saleItems: Array<SaleItem>


    val totalBill: Float by lazy {
        println("Start of total bill calculation")

        var t = 0f
        if(::saleItems.isInitialized) {
            saleItems.forEach {
                t += it.qty * it.price
            }
        }

        println("End of total bill calculation")
        t  // return value of lambda that will be assigned to totalBil property
    }


    fun inputSellDetails() {
        print("Enter customer name : ")
        val name = readln()

        print("Enter customer mobile number: ")
        val mobileNo = readln()

        print("Enter customer address: ")
        val address = readln()

        customer = Customer(name, mobileNo, address)

        print("How many sell items: ")
        val n = readln().toInt()

        println("Enter details of $n sell items: ")

        saleItems = Array<SaleItem>(n)
        {
            print("Enter product id: ")
            val id = readln().toLong()
            print("Enter product name: ")
            val name = readln()

            print("Enter unit price: ")
            val price = readln().toFloat()

            print("Enter sell quantity: ")
            val qty = readln().toInt()

            SaleItem(id, name, price, qty)
        }
    }

    fun printBill() {
        println("Bill No.      : $billNo")
        if(::customer.isInitialized) {
            println("----------Customer Details----------")
            println("Name      : ${customer.name}")
            println("Mobile No.: ${customer.mobileNo}")
            println("Address   : ${customer.address}")
        }
        println("----------Sale Details    ----------")
        println("Id\t Name\t Price\t Qty\t Amount")
        saleItems.forEach {
            println("${it.id}\t ${it.name} \t ${it.price} \t ${it.qty} \t ${it.qty * it.price}")
        }

        println("-------------------------------------")
        println("Total Bill Amount: $totalBill")
    }
}

fun main() {
    val bill = Bill()

    bill.inputSellDetails()

    bill.printBill()

}