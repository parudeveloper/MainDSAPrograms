package com.maindsaprograms.abstractexample_20th.softwere_system_for_home

import com.maindsaprograms.abstractexample_20th.softwere_system_for_home.Controllable

class SecurityCamera : Controllable {
    var isBoolean: Boolean = false
    override fun turnOn() {
        isBoolean = true
        println("Camera is Turned On")

    }

    override fun turnOff() {
        println("Camera is Turned Off")

    }

    override fun getStatus() {
        if (isBoolean){
            println("Camera is Turned ON")
        }else{
            println("Camera is Turned OFF")
        }


    }

}