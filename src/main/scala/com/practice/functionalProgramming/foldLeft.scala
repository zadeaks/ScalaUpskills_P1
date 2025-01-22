package com.practice.functionalProgramming

import scala.::
import scala.math

object foldLeft {

  def main(args: Array[String]): Unit = {

  }
  //---------------------------------------------------------------------------------------------------
  //Sum of a List Write a function using foldLeft to calculate the sum of a list of integers.

  val lstSum = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  def sum(lst: List[Int]): Int = {
    lst.foldLeft(0)((x, n) => x + n)
  }
  //  println(sum(lstSum))

  //---------------------------------------------------------------------------------------------------

  //  Product of a List Write a function to calculate the product of a list of integers using foldLeft.
  val lstPrd = List(1, 2, 3)

  def prdcts(lst: List[Int]) = {
    lst.foldLeft(1)((x, n) => x * n)
  }
  //  print(prdcts(lstPrd))

  //---------------------------------------------------------------------------------------------------

  //Reverse a List Use foldLeft to reverse a list.
  val revLst = List(1, 2, 3, 4, 5)

  def revLstFunc(lst: List[Int]) = {
    lst.foldLeft(List[Int]())((x, n) => n :: x)
  }

  //  println(revLstFunc(revLst))


  //---------------------------------------------------------------------------------------------------
  //Count Elements Use foldLeft to count the number of elements in a list.

  def cntNumFunc(lst: List[Int]) = {
    lst.foldLeft(0) { (x, n) => x + 1 }
  }
  //  println(cntNumFunc(lstSum))

  //---------------------------------------------------------------------------------------------------
  //Concatenate Strings Use foldLeft to concatenate a list of strings into a single string.
  val lstStr = List("Akshay", "Bajirao", "Zade")

  def concStrFunc(lst: List[String]) = {
    lst.foldLeft("") { (str, elem) => str + "" + elem }
  }

  //  println(concStrFunc(lstStr))
  //---------------------------------------------------------------------------------------------------
  //Find Maximum Write a function to find the maximum element in a list of integers using foldLeft.
  val maxLst = List(-11, -2, -3, -4, -5, -6)

  def maxElemFunc(lst: List[Int]) = {
    lst.foldLeft(maxLst(0)) { (x, n) => if (n > x) n else x }
  }
  //  println(maxElemFunc(maxLst))

  //---------------------------------------------------------------------------------------------------
  //  Filter Even Numbers Use foldLeft to filter out only even numbers from a list.

  def evnNumFunc(lst: List[Int]) = {
    lst.foldLeft(List[Int]()) { (x, n) => if (n % 2 == 0) x.appended(n) else x }
  }
  //  println(evnNumFunc(lstSum))

  //---------------------------------------------------------------------------------------------------

  //Group by Even and Odd Use foldLeft to group numbers in a
  // list into two lists: one containing even numbers and the other odd numbers.

  //  println(evnOddSplitFunc(lstSum))

  def spltEvnOddBttrFunc(lst: List[Int]) = {
    lst.foldLeft(List.empty[Int], List.empty[Int]) {
      (acc, elem) =>
        if (elem % 2 == 0) (acc._1.appended(elem), acc._2)
        else (acc._1, acc._2.appended(elem))
    }
  }
  //  println(spltEvnOddBttrFunc(lstSum))

  //---------------------------------------------------------------------------------------------------

  //  Count Word Frequencies Given a list of strings, use foldLeft to count the frequency of each word.
  def wordCountFunc(lst: List[String]) = {
    lst.foldLeft(Map.empty[String, Int]) {
      (acc, elem) =>
        if (lst.contains(elem)) acc.updated(elem, acc.getOrElse(elem, 0) + 1)
        else acc
    }
  }
  //  println(wordCountFunc(lstStr))

  //---------------------------------------------------------------------------------------------------
//  Custom Map Function Implement a custom map function using foldLeft.

  def customMap[A,B](list: List[A], func : A=>B) = {
    list.foldLeft(List.empty[B]){
      (acc, elem) => acc.appended(func(elem))
    }
  }
  println(customMap(lstSum, (x:Int) => x*x))


  //--------------------EOP------------------------------------------
}

