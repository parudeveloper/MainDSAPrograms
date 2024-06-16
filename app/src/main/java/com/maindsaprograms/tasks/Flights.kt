package com.maindsaprograms.tasks

/*
* Write a program to store details of n flights as flight id,
* source airport, destination airport, fare charges in array

Search for flights for given source and destination airport
* */
data class Flight(
    var id: Long,
    var sourceAirport: String,
    var destinationAirport: String,
    var fare: Double
)

class FlightDetails {
    private lateinit var flightDetails: Array<Flight>

    fun storeFlightDetails() {
        print("Enter NO of Flight Details  : ")
        val n = readln().toInt()

        println("Enter details of $n Flight : ")

        flightDetails = Array<Flight>(n) {

            print("Enter Flight id: ")
            val flightId = readln().toLong()

            print("Enter Source Airport Name : ")
            val sourceAirport = readln()

            print("Enter Destination Airport Name : ")
            val destinationAirport = readln()

            print("Enter Fare Charges: ")
            val fare = readln().toDouble()

            Flight(flightId, sourceAirport, destinationAirport, fare)
        }
    }

    fun searchFlightDetails() {
        print("Enter the source airport to search: ")
        val searchSource = readlnOrNull()

        print("Enter the destination airport to search: ")
        val searchDestination = readlnOrNull()

        println("\nMatching flights:")
        var found = false
        for (flight in flightDetails) {
            if (flight.sourceAirport.equals(searchSource, ignoreCase = true) &&
                flight.destinationAirport.equals(searchDestination, ignoreCase = true)
            ) {
                println("Flight ID: ${flight.id}, Source: ${flight.sourceAirport}, Destination: ${flight.destinationAirport}, Fare: ${flight.fare}")
                found = true
            }
        }
        if (!found) {
            println("No flights found from $searchSource to $searchDestination.")
        }
    }

    fun printFlightDetails() {
        println("----------Flight Details    ----------")
        println("Id\t Source Airport Name\t Destination Airport Name\t Fare")
        flightDetails.forEach {
            println("${it.id}\t ${it.sourceAirport} \t ${it.destinationAirport} \t ${it.fare}")
        }
    }

}
fun main() {
    val flightDetails = FlightDetails()
    flightDetails.storeFlightDetails()
    flightDetails.printFlightDetails()
    flightDetails.searchFlightDetails()

}