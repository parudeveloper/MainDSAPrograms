package com.practicedsaprograms.dataStructureQuestions

fun removeCharsFromFirstString(first: String, second: String): String {
    val result = StringBuilder()

    for (char in first) {
        var shouldRemove = false
        for (removeChar in second) {
            if (char == removeChar) {
                shouldRemove = true
                break
            }
        }
        if (!shouldRemove) {
            result.append(char)
        }
    }
    return result.toString()
}

fun main() {


    val resultString = removeCharsFromFirstString("Mallangir", "Mallangi")

    println("Resulting string after removing characters: $resultString")
}
