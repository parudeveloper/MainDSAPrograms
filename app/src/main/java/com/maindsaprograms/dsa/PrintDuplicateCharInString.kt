package com.practicedsaprograms.dataStructureQuestions

fun countCharacterOccurrence(s: String): Map<Char, Int> {
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

fun printDuplicateChars(s: String) {
    val charCountMap = countCharacterOccurrence(s)

    println("Duplicate characters:")
    for ((char, count) in charCountMap) {
        if (count > 1) {
            println("$char: $count")
        }
    }
}

fun main() {


    printDuplicateChars("Mallangi")
}
