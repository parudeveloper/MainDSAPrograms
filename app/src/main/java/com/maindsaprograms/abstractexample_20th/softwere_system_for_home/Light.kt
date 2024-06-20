package com.maindsaprograms.abstractexample_20th.softwere_system_for_home

import com.maindsaprograms.abstractexample_20th.softwere_system_for_home.Controllable

class Light : Controllable {
    private var isBoolean: Boolean = false
    override fun turnOn() {
        isBoolean = true
        println("Light is Turned ON ")
    }

    override fun turnOff() {
        println("Light is Turned off")
    }

    override fun getStatus() {
        if (isBoolean) {
            println("Status of the Light is On")
        } else {
            println("Status of the Light is Off")
        }
    }
}