package com.practice.functionalProgramming

object patternMatchObj {

  def main(args: Array[String]): Unit = {}

  val str = "abc1234fdef54faadef45saaaaa4f5s4fs5faaaa4s5f4s5f4s5aaf4sf4s5fwefrwaaaef5sd4f5s4fs4aaaaaf5s4f"
  val words = "abc1234fd ef54fdef45s4f5s4fs 5f4s5f4s5f4s5f4sf4 s5fwefrwef5s d4f5s4fs4f5s4f"

  def findNumFunc(string: String): List[String] = {
    val pattern = "\\d+".r
    pattern.findAllIn(string).toList
  }

  println(s"findNumFunc: ${findNumFunc(str)}")

  def findWordsFunc(string: String): List[String] = {
    val pattern = "\\w+".r
    pattern.findAllIn(string).toList
  }

  println(s"findWordsFunc: ${findWordsFunc(words)}")

  def genericPatternMatchingFunc(pattern:String, string: String) = {
    pattern.r.findAllIn(string).toList
  }

  println(s"genericPatternMatchingFunc: ${genericPatternMatchingFunc("a+", str)}")
  println(s"genericPatternMatchingFunc: ${genericPatternMatchingFunc("a+", str)}")


}

