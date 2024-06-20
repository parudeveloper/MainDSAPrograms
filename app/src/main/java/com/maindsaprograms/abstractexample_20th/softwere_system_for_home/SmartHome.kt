package com.maindsaprograms.abstractexample_20th.softwere_system_for_home

import com.maindsaprograms.abstractexample_20th.softwere_system_for_home.Controllable

class SmartHome {

    private val devices: MutableList<Controllable> = mutableListOf()

    fun addDevice(device: Controllable) {
        devices.add(device)
    }

    fun turnOffAllDevices() {
        devices.forEach { it.turnOn() }
    }

    fun getStatusOfAllDevices() {
        devices.map { it.getStatus() }
    }
}

fun main() {
    var smartHome: SmartHome = SmartHome()

    var obj1 = Light()
    var obj2 = SecurityCamera()
    var obj3 = Thermostat()

    smartHome.addDevice(obj1)
    smartHome.addDevice(obj2)
    smartHome.addDevice(obj3)

    smartHome.turnOffAllDevices()
    smartHome.getStatusOfAllDevices()

}