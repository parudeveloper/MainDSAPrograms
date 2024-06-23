package com.maindsaprograms.kotlin_basics.nestedclass

/*
* Nested class means class inside another class is nothing but nested classes
* we can not access the parameters of outer class
* if we want to use any parameters or functions we need to declare with in the Nested Class
* */
class MediaPlayList() {
    var nextSong: String = "" // this outside nested class variable

    class Playlist() {
        private var nextSong = "" // we need to create variable with in the class
        fun playNextSong(): String {
            nextSong = "PlayNextSong"
            return nextSong
        }
    }
}

fun main() {
    val obj = MediaPlayList.Playlist()
    println(obj.playNextSong())

}