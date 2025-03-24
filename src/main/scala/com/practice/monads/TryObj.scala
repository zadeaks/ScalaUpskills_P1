package com.practice.monads

import scala.util.Try

object TryObj {

  def main(args: Array[String]): Unit = {}

  val failedTry: Try[Int] = Try(10 / 0)
  println(failedTry)

  val successfulTry: Try[Int] = Try(10 / 2)
  println(successfulTry)

//  --------------------------------------------------------------

  try {
    val result = 10 / 0
  } catch {
    case e: Exception => println("Error occurred: " + e.getMessage)
  }


//  Or

  val result = Try(10 / 0).getOrElse("Computation failed 2")
  println(result) // Output: Computation failed

  import scala.util.{Try, Failure}

  val resultNew = Try(10 / 0).failed.map(_.getMessage).get
  println(resultNew) // Success(/ by zero)

  val result3 = Try(10).map(_ / 0)  // Success(20)
  println(result3) // Success(/ by zero)

  val result5 = Try(10 / 0).getOrElse(100)  // 100 (fallback used)
  println(result5)

  val result6 = for {
    x <- Try(10)
    y <- Try(0)
    z <- Try(x / y) // Fails if y = 0
  } yield z

  println(result6) // Success(5)






  //  --------------------------------------------------------------
}
