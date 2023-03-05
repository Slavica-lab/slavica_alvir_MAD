package com.example.ld_01_guessing_game

import kotlin.random.Random

fun main(): MutableList<Int> {
    fun randomGenerator(): Int {
        val digits = mutableListOf<Int>(0..9)
        var randomNumber = 0
        for (i in 1..4) {
            var counter = 1
            val randomDigit = digits.random()
            counter++
            randomNumber = randomDigit * 10 * counter
            digits.remove(randomDigit)
        }
        return randomNumber
    }

    println("Guess a 4 digit number:")
    val guess = readLine()
    println("You guessed: $guess")
    val randomNumber = randomGenerator()
    val correctlyGuessed = 0
    val correctPosition = 0
    println("Hello World !")
    //implizites datentypvergeben
    var number: Int = 5
    var name = "Slavica"

    println(number)
    println("my name is $name, nice to meet you!")


    //val ist eine Konstante
    val x = 12
    val y = 4

    name = "Max"

    println("result = ${x + y}")

    //Mark float with F
    val a: Float = 20F
    val b: Double = 20.0

    //Minute 14:30 -> zeigt dass variable nullable ist
}

fun <T : Comparable<T>> mutableListOf(elements: ClosedRange<T>): MutableList<T> {

}
