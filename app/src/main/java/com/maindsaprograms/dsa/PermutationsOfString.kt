package com.practicedsaprograms.dataStructureQuestions

fun printPermutations(prefix: String, str: String) {
    if (str.isEmpty()) {
        println(prefix)
    } else {
        for (i in str.indices) {
            val newPrefix = prefix + str[i]
            val newStr = str.substring(0, i) + str.substring(i + 1)
            printPermutations(newPrefix, newStr)
        }
    }
}

fun main() {
    println("Permutations of the string are:")
    printPermutations("", "abc")
}
