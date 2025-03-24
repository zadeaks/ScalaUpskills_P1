package com.practice.interview

object wordsToNumbers {

  val demoMap = Map("one"-> 1,"two"-> 2,"three"-> 3,"four"-> 4,"five"-> 5,
    "six"-> 6,"seven"-> 7,"eight"-> 8,"nine"-> 9,"zero"-> 0)

  def wordsToNum(input: String) = {
    input.split(" ").map(_.toLowerCase()).flatMap(w => demoMap.get(w)).mkString("")
  }

}

object mainMap {

  def main(args: Array[String]): Unit = {
    val input = "One two SiX"
    println(wordsToNumbers.wordsToNum(input))
  }

}
