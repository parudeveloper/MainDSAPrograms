package com.maindsaprograms.kotlin_basics;

public class Demo {
    public void display() {
        DefaultParametsrsKt.cricketKit4("MRF",2,4);

        //With out @JVMOverloads we cant able to use kotlin default parameters concept in Java


        //Using @JVMOverLoads we can able to use Kotlin Default value function in Java Code
        //as we say Kotlin is Interoperable language so we can use java methods in kotlin
        DefaultParametsrsKt.cricketKit5(2,4);
    }
}
