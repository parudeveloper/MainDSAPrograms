package com.maindsaprograms.class_18th_06_2024
/*
*
* Program to delete a node by position.
Program to delete a node by value.
Program to insert node at given position



* */
class LinkedList {

    var first: Node? = null
    var last: Node? = null

    inner class Node {
        var data: Int = 0
        var next: Node? = null

        constructor(d: Int) {
            data = d
            if(first == null) {
                first = this
                last = this
            } else {
                last?.next = this
                last = this
            }
        }
    }

    fun add(d: Int) {
        Node(d)
    }

    fun printList() {
        var t = first

        while(t != null) {
            println(t.data)
            t = t.next
        }
    }
}

fun main() {
    val list = LinkedList()

    list.add(30)
    list.add(25)
    list.add(83)
    list.add(7)

    list.printList()
}