package com.maindsaprograms.dsa


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
    val charCountMap = checkNumberOfOccurrences("AshokAshok")

    for ((char, count) in charCountMap) {
        println("$char : $count")
    }
}

