package com.practice.monads

object eitherObj {

  def main(args: Array[String]): Unit = {}

  def divide(x: Int, y: Int): Either[String, Int] =
    if (y == 0) Left("Cannot divide by zero")
    else Right(x / y)

  val result = divide(10, 0) match {
    case Right(r) => r
    case Left(e) => e
  }

//  println(result) // Output: Result: 5

    

}
