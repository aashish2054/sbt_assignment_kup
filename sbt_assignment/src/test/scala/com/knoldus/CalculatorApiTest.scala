package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorApiTest extends AnyFlatSpec {
  val calculatorApi = new CalculatorApi

  "CalculatorApi" should "return the correct addition" in {
    val result = calculatorApi.ADD(100,100)
    assertResult(200)(result)
  }

  it should "return the negative number" in {
    val result = calculatorApi.ADD(-16,8)
    assertResult(-8)(result)
  }

  it should "return the subtraction" in {
    val result = calculatorApi.SUB(16,8)
    assertResult(8)(result)
  }

  it should "return the negative value after subtraction" in {
    val result = calculatorApi.SUB(8,16)
    assertResult(-8)(result)
  }

  it should "return the correct multiplication" in {
    val result = calculatorApi.MUL(10,10)
    assertResult(100)(result)
  }

  it should "return the negative value after multiplication" in {
    val result = calculatorApi.MUL(10,-10)
    assertResult(-100)(result)
  }

  it should "return the correct division" in {
    val result = calculatorApi.DIV(100,10)
    assertResult(10)(result)
  }

  it should "return the negative value after division" in {
    val result = calculatorApi.DIV(-100,10)
    assertResult(-10)(result)
  }

  it should "return invalid as it is an exception" in {
    val result = calculatorApi.DIV(100,0)
    assertResult(0)(result)
  }

  it should "return the correct result" in {
    val result = calculatorApi.POWER(4,3)
    assertResult(64)(result)
  }

  it should "return the correct result when power is negative" in {
    val result = calculatorApi.POWER(2,-3)
    assertResult(0.125)(result)
  }

  it should "return the correct absolute value" in {
    val result = calculatorApi.ABSOLUTE(-248)
    assertResult(248)(result)
  }

  it should "no change in the value" in {
    val result = calculatorApi.ABSOLUTE(3)
    assertResult(3)(result)
  }

  it should "return the modulus" in {
    val result = calculatorApi.MOD(45,3)
    assertResult(0)(result)
  }

  it should "return the negative value after taking mod" in {
    val result = calculatorApi.MOD(-16,3)
    assertResult(-1)(result)
  }

  it should "return the maximum of 2 numbers" in {
    val result = calculatorApi.MAX(52,3)
    assertResult(52)(result)
  }

  it should "return the minimum of 2 numbers" in {
    val result = calculatorApi.MIN(5,3)
    assertResult(3)(result)
  }

}
