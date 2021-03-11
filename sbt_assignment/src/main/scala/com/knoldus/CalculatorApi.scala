package com.knoldus

class CalculatorApi {

  def add (firstNum : Int , secondNum : Int) : Int  = { firstNum + secondNum}

  def sub(firstNum : Int , secondNum : Int) : Int = {firstNum - secondNum}

  def mul(firstNum : Int , secondNum : Int) : Int = {firstNum * secondNum}

  def div (firstNum : Int , secondNum : Int) : Int = {if (secondNum==0) {

      0
    }
    else {
      firstNum / secondNum
  }
  }

  def power(firstNum: Int, secondNum: Int): Double = {Math.pow(firstNum, secondNum)}

  def absolute(number:Int):Int = { Math.abs(number)}

  def mod(firstNum:Int , secondNum:Int):Int = {firstNum % secondNum}

  def max(firstNum:Int , secondNum:Int):Int = {
    if(firstNum > secondNum) {
      firstNum
    } else {
      secondNum
    }
  }

  def min(firstNum:Int,secondNum:Int):Int = {
    if(firstNum<secondNum) {
      firstNum
    } else {
      secondNum
    }
  }
}
