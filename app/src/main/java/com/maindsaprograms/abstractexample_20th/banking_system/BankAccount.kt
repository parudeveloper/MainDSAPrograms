package com.maindsaprograms.abstractexample_20th.banking_system

interface BankAccount {
    fun deposit(amount: Double)
    fun withDraw(amount: Double)
    fun getBalance(): Double
    fun applyInterest()
}