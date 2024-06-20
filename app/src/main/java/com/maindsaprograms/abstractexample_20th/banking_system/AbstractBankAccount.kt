package com.maindsaprograms.abstractexample_20th.banking_system

import com.example.androidbasicslearning.banking_system.BankAccount

abstract class AbstractBankAccount(var availableBalance: Double) : BankAccount {
    //var availableBalance: Double = 0.0
    override fun getBalance(): Double {
        return availableBalance
    }

    override fun deposit(amount: Double) {
        availableBalance += amount
        println("Available Balance in Account after deposit  : $availableBalance")
    }

    override fun applyInterest() {
        println("Apply Interest ")
    }

    override fun withDraw(amount: Double) {
        if (amount <= availableBalance) {
            availableBalance -= amount
            println("Withdraw Amount is : $amount")
        } else {
            println("Insufficient funds Available funds :$availableBalance")
        }

    }


}