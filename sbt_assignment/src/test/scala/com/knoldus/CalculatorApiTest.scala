package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorApiTest extends AnyFlatSpec {
  val calculatorApi = new CalculatorApi

  "CalculatorApi" should "return the correct addition" in {
    val result = calculatorApi.add(100,100)
    assertResult(200)(result)
  }

  it should "return the negative number" in {
    val result = calculatorApi.add(-16,8)
    assertResult(-8)(result)
  }

  it should "return the subtraction" in {
    val result = calculatorApi.sub(16,8)
    assertResult(8)(result)
  }

  it should "return the negative value after subtraction" in {
    val result = calculatorApi.sub(8,16)
    assertResult(-8)(result)
  }

  it should "return the correct multiplication" in {
    val result = calculatorApi.mul(10,10)
    assertResult(100)(result)
  }

  it should "return the negative value after multiplication" in {
    val result = calculatorApi.mul(10,-10)
    assertResult(-100)(result)
  }

  it should "return the correct division" in {
    val result = calculatorApi.div(100,10)
    assertResult(10)(result)
  }

  it should "return the negative value after division" in {
    val result = calculatorApi.div(-100,10)
    assertResult(-10)(result)
  }

  it should "return invalid as it is an exception" in {
    val result = calculatorApi.div(100,0)
    assertResult(0)(result)
  }

  it should "return the correct result" in {
    val result = calculatorApi.power(4,3)
    assertResult(64)(result)
  }

  it should "return the correct result when power is negative" in {
    val result = calculatorApi.power(2,-3)
    assertResult(0.125)(result)
  }

  it should "return the correct absolute value" in {
    val result = calculatorApi.absolute(-248)
    assertResult(248)(result)
  }

  it should "no change in the value" in {
    val result = calculatorApi.absolute(3)
    assertResult(3)(result)
  }

  it should "return the modulus" in {
    val result = calculatorApi.mod(45,3)
    assertResult(0)(result)
  }

  it should "return the negative value after taking mod" in {
    val result = calculatorApi.mod(-16,3)
    assertResult(-1)(result)
  }

  it should "return the first number as maximum" in {
    val result = calculatorApi.max(55,33)
    assertResult(55)(result)
  }

  it should "return the second number as maximum" in {
    val result = calculatorApi.max(55,555)
    assertResult(555)(result)
  }

  it should "return the first number as minimum" in {
    val result = calculatorApi.min(-6,1)
    assertResult(-6)(result)
  }

  it should "return the second number as minimum" in {
    val result = calculatorApi.min(8,6)
    assertResult(6)(result)
  }

}
