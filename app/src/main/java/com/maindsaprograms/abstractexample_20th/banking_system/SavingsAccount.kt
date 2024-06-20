package com.maindsaprograms.abstractexample_20th.banking_system

import com.maindsaprograms.abstractexample_20th.banking_system.AbstractBankAccount

class SavingsAccount(availableBalance : Double): AbstractBankAccount(availableBalance),BankAccount {

    override fun applyInterest() {
        //super.applyInterest()
        val interestRate = 0.05 // Example interest rate
        val interest = availableBalance * interestRate
        availableBalance += interest
        println("Interest calculated and added: $availableBalance")
    }

}