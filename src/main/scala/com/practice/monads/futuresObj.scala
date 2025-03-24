package com.practice.monads

object futuresObj {

  def main(args: Array[String]): Unit = {

  }

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  val futureResult: Future[Int] = Future {
    Thread.sleep(1000) // Simulating long computation
    10 * 2
  }

  println("Future started!") // Executes immediately, non-blocking


  val safeFuture = futureResult.recover {
    case _: ArithmeticException => 0
  }

  println(safeFuture)


}
