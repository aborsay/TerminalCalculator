package xyz.borsay.terminalcalculator

import kotlin.random.Random

var currentCalculator =  Calculator()

fun main(agrs: Array<String>){
    enterFirstNumber()
    for(i in 1..15){
        val numberToBeUsed = Random.nextInt(1,10)
        val currentTotal = currentCalculator.getTotal()

        when(Random.nextInt(1, 5)){
            0 ->{
                currentCalculator.addToTotal(numberToBeUsed)
                println("$i) The system did addition: $currentTotal + $numberToBeUsed = ${currentCalculator.getTotal()}")
            }
            1 ->{
                currentCalculator.subFromTotal(numberToBeUsed)
                println("$i) The system subtracted a number: $currentTotal - $numberToBeUsed = ${currentCalculator.getTotal()}")

            }
            2 -> {
                currentCalculator.multiplyTotalBy(numberToBeUsed)
                println("$i) The system likes to multiply: $currentTotal * $numberToBeUsed = ${currentCalculator.getTotal()}")

            }
            else -> {
                currentCalculator.divideTotalBy(numberToBeUsed)
                println("$i) The system decided to do division: $currentTotal / $numberToBeUsed = ${currentCalculator.getTotal()}")

            }
        }

    }
}

fun enterFirstNumber(){
    currentCalculator.addToTotal(7)
}