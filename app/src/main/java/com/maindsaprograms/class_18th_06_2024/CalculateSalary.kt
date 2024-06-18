package com.maindsaprograms.class_18th_06_2024
/*
* "In an organization, salary of each employee is calculated on the basis of his basic salary. Every employee gets HRA, DA allowances. HRA is 35% of basic salary, DA is 45% of basic salary. For every employee there is TAX and PF deduction. TAX is calculate on the basis of Gross salary.
Gross Salary = Basic Salary + HRA + DA.
TAX is 20% of gross salary if gross salary is greater than 95000, 10 % if gross salary is between 70000 to 95000, is 5% if gross salary is between 40000 to 70000.
PF is 12% of basic salary.
Net Salary is calculated as : Net Salary = Gross Salary - TAX - PF.

There are two types of employees in the organization - Manager and Worker

If worker works in over time hours, worker gets per hour overtime (OT) benifits of 10 per hour.
For worker, gross salary is calculate as Gross Salary = Basic Salary + HRA + DA + OT hours * 10
And Net salary calculate as Net Salary = Gross Salary - TAX - PF

For managers, company pays bonus which depends on number of targets completed by manager. Company pays 2000 per target to Managers
For managers, gross salary is calculated as Gross Salary = Basic Salary + HRA + DA + Number of Targets Completed * 2000
and Net salary is calculated as Net Salary = Gross Salary - TAX - PF"
* */
open class Employee(protected val id: Long, protected val name: String, protected val bs: Float) {
    protected var hra: Float = 0f
    protected var da: Float = 0f
    protected var gs: Float = 0f
    protected var tax: Float = 0f
    protected var pf: Float = 0f
    protected var ns: Float = 0f

    open fun calGrossSalary() {
        hra = 0.35f * bs
        da = 0.45f * bs
        gs = bs + hra + da
    }

    open fun calNetSalary() {
        //20% of gross salary if gross salary is greater than 95000,
        // 10 % if gross salary is between 70000 to 95000, is 5% if gross salary is between 40000 to 70000.
        tax = if (gs >= 95000) 0.2f * bs
        else if (gs >= 70000) 0.1f * bs
        else if (gs >= 40000) 0.05f * bs
        else 0f

        pf = 0.12f * bs
        ns = gs - tax - pf
    }

    open fun printPaySlip() {
        println("Employee id : $id")
        println("Name        : $name")
        println("Basic Salary: $bs")
        println("HRA +       : $hra")
        println("DA +        : $da")
        println("Gross Salary: $gs")
        println("Tax -       : $tax")
        println("PF -        : $pf")
        println("Net salary  : $ns")
    }

}

class Worker(i: Long, n: String, salary: Float, val otHours: Float) : Employee(i, n, salary) {

    override fun calGrossSalary() {
        super.calGrossSalary()
        gs += otHours * 10
    }

    override fun printPaySlip() {
        println("Employee id : $id")
        println("Name        : $name")
        println("Basic Salary: $bs")
        println("HRA +       : $hra")
        println("DA +        : $da")
        println("OT Hours  10 : ${otHours * 10}")
        println("Gross Salary: $gs")
        println("Tax -       : $tax")
        println("PF -        : $pf")
        println("Net salary  : $ns")
    }

}

fun main() {
    val w = Worker(34212L, "Rahul Dev", 15000f, 23f)
    w.calGrossSalary()
    w.calNetSalary()
    w.printPaySlip()
}