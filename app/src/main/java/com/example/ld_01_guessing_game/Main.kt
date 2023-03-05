package com.example.ld_01_guessing_game
/*Generate a random 4-digit number. The number must not contain repeating digits. Ask the user to guess the 4-digit number. The output should be in the format "n:m", where "n" is the number of digits guessed correctly regardless of their position, and "m" is the number of digits guessed correctly at their correct position. Here are some examples:
Generated number: 8576
•	User input: 1234, Output: 0:0
•	User input: 5678, Output: 4:1
•	User input: 5555, Output: 1:1
•	User input: 3586, Output: 3:2

Once the user guesses the correct number, the game is over.
*/
fun main() {
    val generatedNumber = randomGenerator()
    do {
        println("Guess a 4 digit number:")
        val input = readLine()
        if (input != null){
            var correctDigits = countCorrectDigits(input, generatedNumber)
            var exactlyCorrectDigits = countExactlyCorrectDigits(input, generatedNumber)

            println("User input:" + input + ", Output: " + correctDigits.toString() + ":" + exactlyCorrectDigits.toString())
        }
    }while(input != generatedNumber)
    println("Your guess was correct!")
    }
fun randomGenerator(): String {
    val digits = mutableListOf<Int>()
    digits.addAll(0 .. 9)
    var randomNumber = ""
    for (i in 1..4) {
        val randomDigit = digits.random()
        randomNumber += randomDigit
        digits.remove(randomDigit)
    }
    return randomNumber
}
//var vs. val: val is read only
fun countExactlyCorrectDigits(input: String, generatedNumber: String): Int {
    var counter = 0
    //indices returns the range of valid character indices for this char sequence
    for (i in input.indices){
        if(input[i]==generatedNumber[i]){
            counter ++
        }
    }
    return counter
}

fun countCorrectDigits(input: String, generatedNumber: String): Int {
    var counter = 0
    for (i in generatedNumber.indices) {
        if(input.contains(generatedNumber[i])){
            counter ++
        }
    }
    return counter
}