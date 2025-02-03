package com.practice.functionalProgramming

import com.sun.javafx.geom.transform.Identity

object reduceObj {

  def main(args: Array[String]) = {}

/*Here are some practice questions that involve the `reduce` method in Scala. They vary in difficulty and cover common use cases for reducing collections.

---

### **Basics**

1. **Sum of Numbers**
   Given a list of integers, use the `reduce` method to calculate the sum of all elements.
   Example: `List(1, 2, 3, 4, 5) -> 15` */

  def sumFunc(list: List[Int]) = {
    list.reduce(_+_)
  }

  val listSum = List(1,2,3,4,5,6,7,8,9,10)
//  println(sumFunc(listSum))


  /*

2. **Product of Numbers**
   Given a list of integers, use the `reduce` method to calculate the product of all elements.
   Example: `List(1, 2, 3, 4) -> 24`*/

  def prodNumProd(list: List[Int]) = {
    list.reduce(_*_)
  }
  val listPrd = List(1,2,3,4)
//  println(prodNumProd(listPrd))

  /*


3. **Find Maximum**
   Use the `reduce` method to find the maximum value in a list of integers.
   Example: `List(3, 7, 2, 8, 5) -> 8`

   */

  def findMaxFunc(list: List[Int]) = {
    list.reduce{(a,b)=>if(a>b) a else b}
  }
  val likstMx = List(-1,4,-43,56,0,-2456)
//  println(findMaxFunc(likstMx))

  /*

4. **Find Minimum**
   Use the `reduce` method to find the minimum value in a list of integers.
   Example: `List(3, 7, 2, 8, 5) -> 2`

   */

  def findMinFunc(list: List[Int]) = {
    list.reduce{(a,b)=> if(a<b) a else b}
  }
//  println(findMinFunc(likstMx))


  /*

---

### **Intermediate**

5. **Concatenate Strings**
   Given a list of strings, concatenate them into a single string using the `reduce` method.
   Example: `List("Scala", "is", "fun") -> "Scala is fun"`

   */

  def concatenateList(list: List[String]): String = {
    list.reduce(_ +' '+ _)
  }
  val listWords = List("Scala", "is", "fun")
//  println(concatenateList(listWords))
  /*

6. **Difference of Numbers**
   Given a list of integers, use the `reduce` method to calculate the difference starting from the left.
   Example: `List(10, 3, 2) -> 10 - 3 - 2 = 5`

   */

  val listDiff = List(10, 3, 2)
  def diffCalcFunc(list: List[Int]) = {
    list.reduce(_-_)
  }
//  println(diffCalcFunc(listDiff))

  /*

7. **Count Words**
   Given a list of strings, count the total number of characters using `reduce`.
   Example: `List("Hello", "World") -> 10`

   */

  def countCharFunc(list: List[String]) = {
    list.flatMap(_.split("")).map(_=>1).reduce(_+_)
  }
  val listChar = List("Hello", "World")
//  println(countCharFunc(listChar))

  /*

---

### **Advanced**

8. **Custom Combination**
   Combine elements of a list into a custom format using `reduce`. For example, given a list of integers, generate a string that shows the combination:
   Example: `List(1, 2, 3) -> "(1 + 2 + 3)"`

   */
  def custCombFunc(list: List[Int]) = {
    list.map(_.toString).reduce{(a,b)=> s"${a} + ${b}"}
  }
  val listCustComb = List(1, 2, 3, 9, 5, 3)
//  println(custCombFunc(listCustComb))

  /*

9. **Group Similar Words**
   Given a list of words, group them into a single string where similar words are grouped together. Use a `reduce` operation.
   Example: `List("apple", "orange", "apple", "banana") -> "appleappleorangebanana"`

   */

  def grpSimWordsFunc(list: List[String]) = {
    list.sorted.reduce(_+_)
  }
  val listSimWords = List("apple", "orange", "apple", "banana")
//  println(grpSimWordsFunc(listSimWords))

  /*

10. **Custom Aggregation**
    Given a list of case class objects, use `reduce` to aggregate the data.
    For example, for `case class Product(price: Double, quantity: Int)`,
    calculate the total price for all products.
    Example:
    ```scala
    List(Product(10.0, 2), Product(15.0, 1)) -> Total price: 35.0
    ```
   */
  case class Product(price: Double, quantity: Int)
  val products = List(
    Product(10.0, 2),
    Product(15.0, 1)
  )

  val res = products.map(p => p.price * p.quantity).reduce(_+_)
  val resFoldLeft = products.map(p=>p.price*p.quantity).foldLeft(0.0){(acc, elem) =>acc+elem }
//  println(res)
//  println(resFoldLeft)

  /*

11. **Nested List Reduction**
    Given a nested list of integers (e.g., `List(List(1, 2), List(3, 4))`), use `reduce` to flatten and calculate the sum of all numbers.
    Example: `List(List(1, 2), List(3, 4)) -> 10`

   */

  def flattenReduceFunc(list: List[List[Int]]):Int = {
    list.flatten.reduce(_+_)
  }
  val listOfLists= List(List(1, 2), List(3, 4))
//  println(flattenReduceFunc(listOfLists))

  /*

---

### **Challenging**

12. **Find the Longest String**
    Use `reduce` to find the longest string in a list.
    Example: `List("Scala", "Functional", "Programming") -> "Programming"`

   */

  def findLongestString(list: List[String])= {
    val res = list.map(elem => (elem, elem.length)).reduce{(a,b)=> if(a._2>b._2) a else b}._1
    val res2 = list.reduce{(word1, word2)=> if(word1.length > word2.length) word1 else word2}
    res2
  }
  val listrOfDiffWirds = List("Scala", "Functional", "Programming")
//  println(findLongestString(listrOfDiffWirds))

  /*

13. **Reduce with Default Value (Using reduceLeftOption)**
    Safely calculate the sum of an empty list using `reduceLeftOption` to handle the edge case.
    Example: `List.empty[Int] -> 0`

   */
  def reduceLeftOptFunc(list: List[Int]) = {
    list.reduceLeftOption(_+_).getOrElse(0)
  }
  val listEmpty = List.empty[Int]
//  println(reduceLeftOptFunc(listEmpty))

  /*

14. **Word Frequency**
    Given a list of strings, use `reduce` to generate a Map that tracks the frequency of each word.
    Example: `List("apple", "banana", "apple", "orange", "banana", "apple") -> Map("apple" -> 3, "banana" -> 2, "orange" -> 1)`

   */

//  def wordFrewFunc(list: List[String]) = {
//    val res = list.reduce()
//  }
  val listOFWordsFreq = List("apple", "banana", "apple", "orange", "banana", "apple")


  /*

15. **Running Total**
    Calculate a running total of a list using `reduce`.
    Example: `List(1, 2, 3, 4) -> List(1, 3, 6, 10)`

   */

  def runningtTotalFunc(list: List[Int]) = {
    val res = list.foldLeft(List.empty[Int]){
      (acc, elem)=> acc:+ {if(acc.isEmpty) elem else acc.last+elem}
    }
      res
  }
  val listRunTOtals = List(1, 2, 3, 5, 4)
  println(runningtTotalFunc(listRunTOtals))
  /*

---

Would you like explanations or solutions for any of these questions? 😊*/

}
