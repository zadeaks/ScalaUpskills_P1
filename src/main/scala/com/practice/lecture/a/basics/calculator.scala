package com.practice.lecture.a.basics

import scala.io.StdIn.readLine

object calculator {

  def main(args: Array[String]): Unit = {

  }

  def calculator = {

    def sum(a:Int,b:Int) = {
      a + b
    }

    def multiply(a: Int, b: Int) = {
      a*b
    }

    def division(a: Int, b: Int) = {
      a/b.toDouble
    }

    def subtraction(a: Int, b: Int) = {
      a-b
    }


    println("first num: ")
    val a = readLine().toInt
    println("second num: ")
    val b = readLine().toInt
    val s = sum(a,b)
    val m = multiply(a, b)
    val d = division(a, b)
    val sub = subtraction(a, b)

    val sol = println(s"sum: $s \n multiplication: $m \n division: $d, \n subtraction: $sub")
    sol
  }

  calculator

}
