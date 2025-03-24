package com.practice.interview

object putZeroToLast {

  def main(args: Array[String]): Unit = {

    val arr = Array(1,2,3,0,4,5,67,9)

    def moveZeroTOLast(arr:Array[Int]) = {
      val (a,b) = arr.partition(_ !=0)
      a ++ b
    }

    println(moveZeroTOLast(arr).toList)

  }

}
