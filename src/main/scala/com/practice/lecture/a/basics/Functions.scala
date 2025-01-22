package com.practice.lecture.a.basics

import scala.io.StdIn.readLine

object Functions {

  def main(args: Array[String]): Unit = {

  }

  def big(n:Int) = {
    def small(a:Int, b:Int) = {
      a+b
    }
    small(n,n-1)
  }
//  println(big(5))

  def nameAge(name:String, age:Int) = {
    "Hi, \n My name is "+name+" and my age is "+age
  }
//  println(nameAge("akshay", 28))

  /*Prime Number Validation*/
  //TODO: Use recursion for prime number -
  def primeNumValidation(n:Int) = {


    def getFactors(num: Int): List[Int] = {
      (1 to num).filter(num % _ == 0).toList
    }

    if(n<=1) n+" -> number less than 2 is not prime"
    else if(n==2) n + " is a prime number"
    else {
      val x  = math.sqrt(n).toInt
      if(!(2 to x).exists(i => n % i == 0)) n + " is a prime number\nFactors: " + getFactors(n).mkString(", ")
      else n + " is not a prime number\nFactors: " + getFactors(n).mkString(", ")
    }
  }

  print(s"Enter number to check prime or not : ")
  val n = readLine().toInt

  println(primeNumValidation(n))

//  println(primeNumValidation(17))


/*
Here are 10 questions related to recursion in Scala:
*/
  /*
    Factorial Calculation:
    Write a recursive Scala function to calculate the factorial of a given non-negative integer.
  */
  def factoialCalculation(i: Int):Int ={
    if(i<=0) i
    else i*factoialCalculation(i-1)
  }

//  println(factoialCalculation(5))


  /*
      Fibonacci Sequence:
      Implement a recursive Scala function to generate the nth Fibonacci number in the sequence.
*/
  def fibonacciSeries(n:Int):Int = {
    if(n<=2) 1
    else fibonacciSeries(n-1)+fibonacciSeries(n-2)
  }
//1,1,2,3,5,8
//  println(fibonacciSeries(6))

  /*
    Power Function:
    Write a recursive Scala function to calculate the result of raising a number to a given power.
*/
  /*
    Sum of Digits:
    Create a recursive Scala function to find the sum of digits of a given positive integer.
*/
  /*
    Palindrome Check:
    Implement a recursive Scala function to check if a given string is a palindrome.
*/
  /*
    Binary Search:
    Write a recursive Scala function to perform a binary search on a sorted array.
*/
  /*
    Greatest Common Divisor (GCD):
    Implement a recursive Scala function to find the greatest common divisor of two numbers using Euclid's algorithm.
*/
  /*
    Tower of Hanoi:
    Solve the Tower of Hanoi problem using a recursive Scala function.
    */
  /*
    List Reversal:
    Write a recursive Scala function to reverse a list.
    */
  /*
    Maze Solver:
    Implement a recursive Scala function to solve a maze represented as a 2D array.
*/

}
