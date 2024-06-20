package com.maindsaprograms.class_21st_o6_2024

fun filterAndGroupCities(cityData: List<Pair<String, Int>>): List<Pair<Char, List<String>>>
{
    val filteredcity=cityData.filter { pair -> pair.second>100000 }
    val grpby=filteredcity.groupBy {pair->pair.first[0] }
    val result = mutableListOf<Pair<Char, List<String>>>()
    for ((letter, cityList) in grpby) {
        val cityNames = cityList.map { pair -> pair.first }
        result.add(letter to cityNames)

    }

    return result

}
fun main()
{
    var lit= mutableListOf(Pair("ara",1000000),Pair("bok",10000),
        Pair("art",100003),Pair("doo",200000))
    var result=filterAndGroupCities(lit)
    result.forEach {pair->
        println(" ${pair.first} : ${pair.second}")

    }
}