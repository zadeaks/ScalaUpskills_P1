package com.practice.functionalProgramming

object leetCodeObj {

  def main(args: Array[String]) = {}

  def findTargetSumFunc(targetSumVal:Int, list: List[Int]): Option[(Int, Int)] = {
    val pastNums = scala.collection.mutable.Set[Int]()
    for(num <- list) {
      val complement = targetSumVal - num
      if(pastNums.contains(complement)) {
        return Some((num, complement))
      }
      pastNums.add(num)
    }
    None
  }


}
