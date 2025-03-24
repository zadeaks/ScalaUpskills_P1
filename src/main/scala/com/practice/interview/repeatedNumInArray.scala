package com.practice.interview

object repeatedNumInArray {

  def main(args: Array[String]): Unit = {

  }

  val arr = Array(1,4,3,9,5,6,78,9)

  def printFreqFromArr(arr: Array[Int]) = {
    arr.groupBy(identity).map(grp => (grp._1, grp._2.length))
      .foreach(res => println(s"${res._1} - ${res._2} times"))
  }
  printFreqFromArr(arr)
}
