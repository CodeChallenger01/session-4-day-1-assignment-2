package com.knoldus

import scala.math.sqrt

class SquareRoot {

  /*This method is used to find the Square root of given Integer in List*/
  def squareRoot(squaredList: List[Int]): List[Int] = {
    try {
      if (squaredList.isEmpty) throw new NullPointerException("List is Empty")
      else {
        val squareRootList: List[Int] = squaredList.map { squaredNum =>
          if (squaredNum < 1) throw new ArithmeticException("Number Must be greater than 0")
          else sqrt(squaredNum).toInt
        }
        squareRootList
      }
    }
    catch {
      case ex: NullPointerException => Nil
      case ex: ArithmeticException => Nil
    }
  }
}
