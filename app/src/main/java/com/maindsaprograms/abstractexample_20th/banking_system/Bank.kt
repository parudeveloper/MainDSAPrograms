package com.maindsaprograms.abstractexample_20th.banking_system



class Bank {
    var savingsAccount = mutableListOf<SavingsAccount>()
    var fixedDepositAccount = mutableListOf<FixedDepositAccount>()
    var currentAccount = mutableListOf<CurrentAccount>()

    var ashokSavingsAccountAccount = SavingsAccount(3000.0)
    var ashokFixedDepositAccount = FixedDepositAccount(3000.0,true)
    var ashokCurrentAccount = CurrentAccount(3000.0)

    fun addSavingsAccount(){
        savingsAccount.add(ashokSavingsAccountAccount)
    }


}

fun main() {
    val bank = Bank()
    bank.ashokFixedDepositAccount.withDraw(5000.00)
}