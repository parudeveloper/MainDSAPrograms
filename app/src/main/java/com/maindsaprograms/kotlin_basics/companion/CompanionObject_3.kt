package com.maindsaprograms.kotlin_basics.companion
/*
* If we want to use Companion Object Methods or Variables in Java
* we need to annotate companion object with  @JvmStatic
*  in another way af accessing of companion object variables or methods is  CompanionExample3.Companion

* */

class CompanionExample3(){

    companion object{
        // @JVMStatic instructs kotlin compiler to treat this method as Static method
        @JvmStatic
        fun isValidateMobileNo(mobileNo:String) = "[1-9][0-9]{9}".toRegex().matches(mobileNo)
    }
}