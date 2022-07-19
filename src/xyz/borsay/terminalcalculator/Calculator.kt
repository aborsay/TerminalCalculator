package xyz.borsay.terminalcalculator
var total = 0

class Calculator {

    fun addToTotal(numberToAdd: Int){
        total += numberToAdd
    }
    fun subFromTotal(numberToSubtract: Int){
        total -= numberToSubtract
    }
    fun multiplyTotalBy(numberToMultiplyBy: Int){
        total *= numberToMultiplyBy
    }

    fun divideTotalBy(numberToDivideBy: Int){
        total /= if(numberToDivideBy == 0) 1 else numberToDivideBy
    }
    fun setTotalTo0(){
        total = 0
    }
    fun getTotal(): Int{
        return total
    }
}