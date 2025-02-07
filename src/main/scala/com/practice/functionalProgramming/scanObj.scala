package com.practice.functionalProgramming

object scanObj {

  def main(args: Array[String]) = {}

  /*  ### **Usage**
  ```scala
  val numbers = List(1, 2, 3, 4)
  val result = numbers.scan(0)(_ + _) // Running sum
  println(result) // Output: List(0, 1, 3, 6, 10)
  */

//  1. **Compute running product of a list of numbers using `scanLeft`
  val lst = List(1,2,3,4,5)
  def runProdListFunc(list: List[Int]) = {
    list.scan(1){_*_}
      }

  println(runProdListFunc(lst))

//  2. **Find cumulative XOR of a list of integers using `scanRight`.

  def xorFunc(list: List[Int]) = {
    list.scanRight(0)(_^_ )
  }

  println(xorFunc(lst))

//  3. **Generate the Fibonacci sequence using `scanLeft`.**

  val lstZero = List(0,1,2,3,4,5,6,7,8)
  def fibFunc(numOfELem: Int)={
    (0 to numOfELem-2).scanLeft(0,1){case((a,b),_)=> (b, b+a)}.map(_._1)
  }
  println(fibFunc(10))
//  0,1,(1,1),(1,2),(2,3),(3,5),(5,8)

//  4. **Keep track of the longest word seen so far in a list of words using `scanLeft`.**

  def findLongestWordFunc(list: List[String]) = {
    list.scanLeft(("")){(acc, elem)=> if(acc.length>elem.length) acc else elem}
  }
  val Sentence = "My name is akshay bajirao zade and i am evolving".split(" ").toList
  println(s"Longest Word: ${findLongestWordFunc(Sentence)}")

//    5. **Compute the cumulative minimum of a list using `scanLeft`.**

  def cumulativeMinListFunc(list: List[Int]) = {
    list.scanLeft(Int.MaxValue){(acc, elem)=> if(elem<acc) elem else acc}
  }
  val lstNumRandom = List(11,5,3,66,7,2,8,-3,-56,0,-3,91)
  println(cumulativeMinListFunc(lstNumRandom).last)

//  6. **Track the cumulative difference starting from a value using `scanRight`.**

  def cumDiffFunc(list: List[Int]) = {
    list.scanLeft(list.head){_-_}
  }
  println(s"cumDiffFunc: ${lst.head}")
  println(lst)
  println(cumDiffFunc(lst))

  //  7. **Calculate a moving sum where each element is the sum of all previous elements using `scanLeft`.**

  def movingSumFunc(list: List[Int]) = list.scanLeft(0)(_ + _)
  println(movingSumFunc(lst))

//  8. **Simulate a simple banking system where each deposit/withdrawal updates a running balance using `scanLeft`.**

  def bankDepositWithdrawalFunc(list: List[Int]) = list.scanLeft(0){_+_}
  println(bankDepositWithdrawalFunc(lstNumRandom))

//  9. **Generate Pascal's Triangle row using `scanLeft`.**

  def pascalTriangle(n: Int) = {
    (1 to n).scanLeft(1){(acc, elem)=> acc*(n-elem+1)/elem}.toList
  }
  println(pascalTriangle(5))


  /*
  ---
  ### **10 Practice Questions**


  9. **Generate Pascal's Triangle row using `scanLeft`.**
  10. **Implement a character frequency counter where cumulative counts are updated using `scanLeft`.**

  Try solving them and let me know if you need hints! 🚀*/

}
