package com.maindsaprograms.abstractexample_20th.softwere_system_for_home

import com.maindsaprograms.abstractexample_20th.softwere_system_for_home.Controllable

class Thermostat : Controllable {
    override fun turnOn() {
        println("Thermostat is turned ON")
    }

    override fun turnOff() {
        println("Thermostat is turned OFF")
    }

    override fun getStatus() {
        println("Status of Thermostat is ON")
    }
}