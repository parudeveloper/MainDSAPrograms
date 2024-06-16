package com.practicedsaprograms.dataStructureQuestions

fun findFirstNonRepeatingChar(s: String): Char? {
    val charCountMap = mutableMapOf<Char, Int>()

    for (char in s) {
        if (char in charCountMap) {
            charCountMap[char] = charCountMap[char]!! + 1
        } else {
            charCountMap[char] = 1
        }
    }
    for (char in s) {
        if (charCountMap[char] == 1) {
            return char
        }
    }
    return null
}

fun main() {

    val firstNonRepeatingChar = findFirstNonRepeatingChar("Mallangi")

    if (firstNonRepeatingChar != null) {
        println("The first non-repeating character is '$firstNonRepeatingChar'.")
    } else {
        println("There are no non-repeating characters in the string.")
    }
}
