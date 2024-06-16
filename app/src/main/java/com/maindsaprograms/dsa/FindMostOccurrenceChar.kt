package com.practicedsaprograms.dataStructureQuestions

fun countCharacterOccurrences(s: String): Map<Char, Int> {
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

fun findMostRecurringChar(s: String): Char? {
    val charCountMap = countCharacterOccurrences(s)

    var mostRecurringChar: Char? = null
    var maxCount = 0

    for ((char, count) in charCountMap) {
        if (count > maxCount) {
            maxCount = count
            mostRecurringChar = char
        }
    }

    return mostRecurringChar
}

fun main() {


    val mostRecurringChar = findMostRecurringChar("aaaanbhjmajsdnja")

    if (mostRecurringChar != null) {
        println("The most recurring character is " +
                "'$mostRecurringChar' with ${countCharacterOccurrences("aaaanbhjmajsdnja")[mostRecurringChar]} occurrences.")
    } else {
        println("No recurring characters found.")
    }
}
