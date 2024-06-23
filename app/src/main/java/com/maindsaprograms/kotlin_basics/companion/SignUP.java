package com.maindsaprograms.kotlin_basics.companion;
/*
* By using @JVMStatic Annotation we can able to access kotlin companion object variables and functions with the class name
* in another way af accessing of companion object variables or methods is  CompanionExample3.Companion
* */
public class SignUP {
    public void signUp(String mobileNo){
        // using @JVMStatic
        if(CompanionExample3.isValidateMobileNo(mobileNo)){

        }

        //another way af accessing of companion object variables or methods
        if (CompanionExample3.Companion.isValidateMobileNo(mobileNo)){

        }
    }
}
