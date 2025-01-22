package com.practice.lecture.a.basics

import scala.io.StdIn.readLine
import scala.math.pow

object Recursion {

  def main(args: Array[String]): Unit = {

  }


  def f(x: Int) = {

  }


  def power(x: Int, n: Int): Int = {
    if (n == 0) 1
    else x * power(x, (n - 1))
  }

//  print(s"Base : ")
//  val x = readLine().toInt
//  print(s"Power to base : ")
//  val n = readLine().toInt
//  val pw = power(x, n)
//  print(s"power of $x ^ $n is : $pw")


  import scala.math.sqrt
/*
  1.Write a recursive function to calculate the factorial of a given number.
*/

  def factorialFind(f:Int):Int = {
    if(f==0) 1
    else f*factorialFind(f-1)
  }
//  println(factorialFind(5))

  /*

  2. Implement a recursive function to find the nth Fibonacci number.

  */

  def fibonacciTerm(n:Int):Int = {
    if(n<=2) 1
    else fibonacciTerm(n-1)+fibonacciTerm(n-2)
  }
  print(fibonacciTerm(7))
//  1,1,2,3,5,8,13,21,34


  /*

  3. Create a recursive function to determine
  if a given string is a palindrome
  .

  */


  /*

  4. Write a recursive function to compute the sum of all elements in an array.

  */


  /*

  5. Implement a recursive function to reverse a linked list
  .

  */


  /*

  6. Create a recursive function to find the greatest common divisor(GCD) of two numbers
  .

  */


  /*

  7. Write a recursive function to compute the power of a number (a ^ b).

  */


  /*

  8. Implement a recursive function to flatten a nested list
  .

  */


  /*

  9. Create a recursive function to check
  if a given binary tree is a binary search tree(BST).

  */


  /*

  10. Write a recursive function to generate all permutations of a given string.

  */


  /*

  */
}
