package com.practice.functionalProgramming

object foldRightObj {

  def main(args: Array[String]) = {

  }

  //  -----------------------------------------------------------------------------------------
  val lstNum = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val lstStr = List("orange", "black", "neon", "yellow")
  val lstChar = lstStr.flatMap(x => x.split("")).distinct.sorted

  //-----------------------------------------------------------------------------------------
  //  Sum of List Elements Implement a function to compute the sum of a list of integers using foldRight.
  def sumOfList(lst: List[Int]) = {
    lst.foldRight(0) { (elem, acc) => acc + elem }
  }

  //  println(sumOfList(numList))
  //  -----------------------------------------------------------------------------------------

  //  List Length Use foldRight to calculate the length of a list./

  def lengFunc(lst: List[String]) = {
    lst.foldRight(0) { (_, acc) => acc + 1 }
  }

  //  println(lengFunc(lstChar))
//  -----------------------------------------------------------------------------------------
  //Reverse a List Use foldRight to reverse a list.
  def revListFunc[A](list: List[A]) = {
    list.foldRight(List.empty[A]) {(elem, acc) => acc.appended(elem)}
  }
//  println(revListFunc(lstNum))
//  println(revListFunc(lstStr))

//  -----------------------------------------------------------------------------------------
//  Concatenate Lists Write a function to concatenate two lists using foldRight.

  def concatTwoListFunc[A](listA: List[A], listB: List[A]) = {
    listA.foldRight(listB){(elem, acc) => acc.prepended(elem)}
  }
//println(lstStr)
//println(lstChar)
//println(concatTwoListFunc(lstStr,lstChar))
//  -----------------------------------------------------------------------------------------
//  Flatten a List of Lists Use foldRight to flatten a list of lists into a single list.

  val lstOfList = List(List("abc", "abc2"), List("abc3", "abc4", "abc5"), List("abc6"))
  def flatListOfListsFunc[A](list: List[List[A]]) = {
    list.foldRight(List.empty[A]){
      (elem, acc) => elem ++ acc
    }
  }
//  println(flatListOfListsFunc(lstOfList))

//  -----------------------------------------------------------------------------------------
//  Map with FoldRight Implement the map function using foldRight.

//  -----------------------------------------------------------------------------------------
/*EOF*/
}

//-----------------------------------------------------------------------------------------

