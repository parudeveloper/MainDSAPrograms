package com.practicedsaprograms.dataStructureQuestions



fun checkNumberOfOccurrences(s: String): Map<Char, Int> {
    val charCountMap = mutableMapOf<Char, Int>()

    for (char in s) {
        if (char in charCountMap) {
            charCountMap[char] = charCountMap[char]!! + 1
        } else {
            charCountMap[char] = 1
        }
    }

    return charCountMap
}

fun main() {
    print("Enter a string: ")
    val inputString = readln()

    val charCountMap = checkNumberOfOccurrences(inputString)

    println("Character occurrences:")
    for ((char, count) in charCountMap) {
        println("$char: $count")
    }
}