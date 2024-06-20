package com.maindsaprograms.abstractexample_20th.banking_system

import com.maindsaprograms.abstractexample_20th.banking_system.AbstractBankAccount

class FixedDepositAccount(availableBalance: Double, var fixedTerm: Boolean) :
    AbstractBankAccount(availableBalance), BankAccount {

    override fun withDraw(amount: Double) {
        if (fixedTerm) {
            super.withDraw(amount)
        } else {
            println("Your Fixed Deposit term is not yet completed so you cant perform the Transaction ")
        }
    }
}