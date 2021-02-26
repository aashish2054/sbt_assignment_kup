package com.knoldus

class CalculatorApi {

  def ADD (firstNum : Int , secondNum : Int) : Int  = {          // This method is for adding two numbers
    firstNum + secondNum
  }


  def SUB(firstNum : Int , secondNum : Int) : Int = {            // This method is for subtracting number2 from number1
    firstNum - secondNum
  }


  def MUL(firstNum : Int , secondNum : Int) : Int = {            // This method is for multiplying two numbers
    firstNum * secondNum
  }


  def DIV (firstNum : Int , secondNum : Int) : Int = {            // This method is for division
    if (secondNum==0)
    {
      println("Denominator cannot be zero")
      0
    }
    else
      firstNum / secondNum
  }


  def POWER(firstNum: Int, secondNum: Int): Double = {             // This method is calculates power of a number
    Math.pow(firstNum, secondNum)
  }


  def ABSOLUTE(number:Int):Int = {                                  // This method calculates absolute value
    Math.abs(number)
  }


  def MOD(firstNum:Int , secondNum:Int):Int = {                     // This Method is for calculating modulus
    firstNum % secondNum
  }


  def MAX(firstNum:Int , secondNum:Int):Int = {                     // This Method calculates maximum among two number
    if(firstNum > secondNum)
      firstNum
    else
      secondNum
  }


  def MIN(firstNum:Int,secondNum:Int):Int = {                       // Method for calculating minimum among two numbers
    if(firstNum<secondNum)
      firstNum
    else
      secondNum
  }
}
