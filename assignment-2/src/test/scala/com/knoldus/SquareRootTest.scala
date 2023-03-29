package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.language.postfixOps

class SquareRootTest extends AnyFlatSpec with Matchers {

  val rootObj = new SquareRoot

  "it" should "match with empty List if empty list is pass as parameter" in {
    val squaredList = List.empty
    val actualOutput = rootObj.squareRoot(squaredList)
    val expectedList = List()
    expectedList shouldBe actualOutput
  }

  "it" should "not match with List of element if empty list is pass as parameter" in {
    val squaredList = List.empty
    val actualOutput = rootObj.squareRoot(squaredList)
    val expectedList = List(2, 4)
    assert(expectedList != actualOutput)
  }

  "it" should "match with squareRoot List" in {
    val squaredList = List(4, 16, 25, 36)
    val actualOutput = rootObj.squareRoot(squaredList)
    val expectedList = List(2, 4, 5, 6)
    expectedList shouldBe actualOutput
  }

  "it" should "not match with other elements of squareRoot List of particular number" in {
    val squaredList = List(4, 16, 25, 36)
    val actualOutput = rootObj.squareRoot(squaredList)
    val expectedList = List(2, 10, 15, 6)
    assert(expectedList != actualOutput)
  }

  "it" should "return empty List if squaredList contain element less than 1 as element" in {
    val squaredList = List(-1, 16, 25, 36)
    val actualOutput = rootObj.squareRoot(squaredList)
    val expectedOutput = List()
    assert(expectedOutput == actualOutput)
  }

  "it" should "not match with List of element if squaredList contain element less than 1 as element" in {
    val squaredList = List(-1, 16, 25, 36)
    val actualOutput = rootObj.squareRoot(squaredList)
    val expectedOutput = List(2, 4, 5)
    assert(expectedOutput != actualOutput)
  }
}