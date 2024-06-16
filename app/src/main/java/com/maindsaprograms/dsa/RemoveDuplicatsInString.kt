package com.practicedsaprograms.dataStructureQuestions

fun removeDuplicateChar(inputString: String): String {
    val resultStringBuilder = StringBuilder()
    var prevChar: Char? = null

    for (char in inputString) {
        if (char != prevChar) {
            resultStringBuilder.append(char)
            prevChar = char
        }
    }
    return resultStringBuilder.toString()
}

fun main() {
    println("${removeDuplicateChar("Mallangi")}")
}