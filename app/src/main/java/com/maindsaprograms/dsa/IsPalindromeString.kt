package com.practicedsaprograms.dataStructureQuestions

fun isPalindrome(string: String): Boolean {
    var left = 0
    var right = string.length - 1

    while (left <= right) {
        if (string[left] != string[right]) {
            return false
        }
        left++
        right--
    }
    return true

}

fun main() {
    println("Given String is  ${isPalindrome("bad")}")
}