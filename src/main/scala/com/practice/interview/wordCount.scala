package com.practice.interview

object wordCount {

  def main(args: Array[String]): Unit = {

  }

  val inout = "my name ios aKSHAY zADE AND . my AM bAD bOY "

  def wordCountFromInput(input: String) = {
    input.trim.split(" ").toList.map(_.trim).filter(_ !=".")
      .map(x => (x,1))
      .groupBy(_._1)
      .map{case (key, value) => (key, value.map(_._2).sum) }
  }

  println(wordCountFromInput(inout))

}
