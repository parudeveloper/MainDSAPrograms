package com.maindsaprograms.kotlin_basics.nestedclass
/*
* Inner class means class inside the another class we will declare using inner Keyword
* we can able to access the outer class variables also
* */
class MediaPlayList1() {
    var nextSong: String = "" // this outside nested class variable we can access with in the inner class

   inner class Playlist() {
        fun playNextSong(): String {
            nextSong = "PlayNextSong" // this is outer class variable
            return nextSong
        }
    }
}

fun main() {
    val obj = MediaPlayList.Playlist()
    println(obj.playNextSong())

}