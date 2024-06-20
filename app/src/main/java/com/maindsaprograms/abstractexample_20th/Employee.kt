package com.practicedsaprograms.abstractexample

abstract class Employee(val name: String, val id: Int) {
    abstract fun calculateSalary(): Double
    fun displayDetails() {
        println("Employee Name is : $name")
        println("Employee id  is : $id")

    }

}

class Manager(name: String, id: Int, var bonus: Double, var salary: Double) : Employee(name, id) {

    override fun calculateSalary(): Double {
        println("Project Allowance : $bonus ")
        println("Salary : $salary ")
        return salary + bonus
    }
}

class Developer(name: String, id: Int, var projectAllowance: Double, var salary: Double) :
    Employee(name, id) {
    override fun calculateSalary(): Double {
        println("Project Allowance : $projectAllowance ")
        println("Salary : $salary ")
        return salary + projectAllowance
    }
}

class Company() {
    var manager1 = Manager("Ashok", 12, 10000.00, 23000.00)
    var manager2 = Manager("Ashok_1", 13, 12000.00, 24000.00)
    var manager3 = Manager("Ashok_2", 14, 13000.00, 25000.00)
    var manager4 = Manager("Ashok_3", 15, 14000.00, 26000.00)


    var developer = Developer("Abhishek",1123,20000.0,98788.0)
    var developer1 = Developer("Abhishek_1",2311,19873.0,67646.0)
    var developer2 = Developer("Abhishek_2",4245,23432.0,43543.0)

}

fun main() {
    val company = Company()
    company.manager1.displayDetails()
    println("Total Salary of Employee is : ${company.manager1.calculateSalary()}")

    company.developer.displayDetails()
    println("Total Salary of Employee is : ${company.developer.calculateSalary()}")
}