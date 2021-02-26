package com.knoldus

import com.knoldus.CalculatorApi

class CalculatorImpl() {
  def option(input: Int, first: Int,second: Int): AnyVal = {
    val calculator = new CalculatorApi
    input match {
      case 1 => calculator.ADD(first, second)

      case 2 => calculator.SUB(first, second)

      case 3 => calculator.MUL(first, second)

      case 4 => calculator.DIV(first, second)

      case 5 => calculator.POWER(first, second)

      case 6 => calculator.ABSOLUTE(first)

      case 7 => calculator.MOD(first, second)

      case 8 => calculator.MAX(first, second)

      case 9 => calculator.MIN(first, second)
    }
  }
}

object CalImplement {
  def main(args: Array[String]): Unit = {
    val calculate = new CalculatorImpl

    println("-----Select an Operation to perform-----")
    println("1- Add")

    println("2- Subtract")

    println("3- Multiply")

    println("4- Divide")

    println("5- Power")

    println("6- Absolute Value")

    println("7- Modulus")

    println("8- Max of two no")

    println("9- Min of two no")
    val input = io.StdIn.readInt()

    if(input>=1 && input<=9)
    {
      if(input==6)
      {
        println("Enter the number")

        val num = io.StdIn.readInt()

        println(calculate.option(input,num,0))
      }
      else {
        println("Enter Two Numbers")

        val first = io.StdIn.readInt()
        val second = io.StdIn.readInt()

        println(calculate.option(input,first,second))
      }
    }
    else
      println("Enter a number from 1 to 9")
  }
}
