package com.knoldus

object Driver extends App {
  val rootObj = new SquareRoot
  val squaredList = List(4, 16, 25, 36)
  val actualOutput = rootObj.squareRoot(squaredList)
  println(actualOutput)
}
