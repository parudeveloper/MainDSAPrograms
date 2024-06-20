package com.maindsaprograms.abstractexample_20th.banking_system

import com.maindsaprograms.abstractexample_20th.banking_system.AbstractBankAccount

class CurrentAccount(availableBalance: Double) : AbstractBankAccount(availableBalance),
    BankAccount {
        var minimumBalance = 500.00
    override fun withDraw(amount: Double) {
        if (amount >= minimumBalance){
            availableBalance-=amount
            println("Withdraw Amount is $amount and Available Balance is : $availableBalance")
        }
        else{
            println("Your Account Minimum Balance is Below 500 Please maintaining")
        }
    }


}