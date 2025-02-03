package com.practice

import com.practice.functionalProgramming.reduceObj.Product

import java.io.File

object interviewQuestions {
  //-----------------------------------------------------------------

  def main(args: Array[String]) = {}

  /* Word Frequency
  Given a list of strings, use `reduce` to generate a Map that tracks the frequency of each word.
  Example:
      input  : List("apple", "banana", "apple", "orange", "banana", "apple")
      output :  Map("apple" -> 3, "banana" -> 2, "orange" -> 1)`
  */

  def wordFreqFunc(list: List[String]) = {
    list
      .map(elem => Map(elem -> 1))
      .reduce { (acc, map) => acc ++ map.map { case (k, v) => k -> (acc.getOrElse(k, 0) + v) } }
  }
  val inputWordFreqFunc  = List("apple", "banana", "apple", "orange", "banana", "apple")
    println(wordFreqFunc(inputWordFreqFunc))

  def wordFreqFoldLeftFunc(list: List[String]) = {
    val res  = list.foldLeft(Map.empty[String, Int]){
      (acc, elem)=> acc + (elem -> (acc.getOrElse(elem, 0)+1))
    }
    res.toSeq.sortBy(_._2).toMap
  }
  println(wordFreqFoldLeftFunc(inputWordFreqFunc))

  //-----------------------------------------------------------------
  /*
  10. ** Custom Aggregation **
  Given a list of case class objects
  use `reduce` to aggregate the data

  For example
  for case class Product(price: Double, quantity: Int)
  calculate the total price for all products

  Example:
  List(Product(10.0, 2), Product(15.0, 1))
  output : Total price: 35.0
  */

  case class Product(price: Double, quantity: Int)

  val products = List(
    Product(10.0, 2),
    Product(15.0, 1)
  )

  val res = products.map(p => p.price * p.quantity).reduce(_ + _)
  val resFoldLeft = products.map(p => p.price * p.quantity).foldLeft(0.0) { (acc, elem) => acc + elem }
//    println(res)
//    println(resFoldLeft)

  //-----------------------------------------------------------------
/*list all files from current and its sub directories*/
  def listFilesFunc(inputPath: File): List[File] = {

    val listFilesAndDir = inputPath.listFiles.toList
    val files = listFilesAndDir.filter(_.isFile)
    val dir = listFilesAndDir.filter(_.isDirectory)

    files ++ dir.flatMap(path => listFilesFunc(path))
  }

  val currentDir = new File(".")
  val listAllFiles = listFilesFunc(currentDir)

//  listAllFiles.map(_.getAbsolutePath).foreach(println)

  //-----------------------------------------------------------------
  /*target sum & list of int given
  * find two numbers from the list whose sum matches to target sum
  * */

  def identifySumPairFunc(list: List[Int], targetSum: Int) = {
    val nums = scala.collection.immutable.Set.empty[Int]
    for(num <- list) {
      val complement = targetSum - num
      if(nums.contains(complement) && num!=complement)
        (num, complement)
      else nums.toList.appended(num)
    }
    (0,0)
  }
  val listSumPair = List(1,2,3,4,5,6)
//  println(identifySumPairFunc(listSumPair, 7))

}
