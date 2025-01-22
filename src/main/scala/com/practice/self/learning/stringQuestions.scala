package com.practice.self.learning

object stringQuestions {

  def main(args: Array[String]): Unit = {
    println(s"here we go!!")
  }



/*
Reverse a String:
Write a Scala function that takes a string as input and returns its reverse.
*/

  def reverseString(str: String) ={
    str.split("").reverse.mkString("")
  }
//  println(reverseString("Akshay"))

/*
Check Palindrome:
Implement a Scala function to check if a given string is a palindrome.
*/
  def palindromVerify(str: String) = {
    val pv = reverseString(str)
    if(str==pv) println(s"$str is a palindrome")
    else println(s"$str is not a palindrome")
  }
  palindromVerify("Nitin")

  /*
  Count Vowels and Consonants:
  Write a Scala program to count the number of vowels and consonants in a given string.
*/
  def vowelsConsonants(str:String) = {
    val vowels = "aeiouAEIOU"
    var vowelsCount = 0
    var consonantsCount = 0
    for(i <- str.replaceAll(" ","") ) {
      if(vowels.contains(i)) vowelsCount+=1
      else consonantsCount+=1
    }
    println(s"vowelsCount: $vowelsCount \n consonantsCount:  $consonantsCount")
  }
  vowelsConsonants("Akshay Bajirao Zade")

  //TODO: Do this using fold functionality of scala, we should never use loops in scala, Check Lecture > Basic > Expression

  /*
  Remove Duplicates:
  Create a Scala function that removes duplicate characters from a string.
*/

  /*
  Anagram Check:
  Implement a Scala function to check if two strings are anagrams of each other.
*/

  /*
  Word Count:
  Write a Scala program to count the number of words in a given sentence.
*/

  /*
  String Compression:
  Implement a Scala function to perform basic string compression using the counts of repeated characters. (e.g., "aaabbb" => "a3b3")
*/

  /*
  Substring Occurrence:
  Write a Scala function to find all occurrences of a substring in a given string.
*/

  /*
  Capitalize Words:
  Create a Scala function that capitalizes the first letter of each word in a sentence.
 */

  /*
  String Rotation:
  Implement a Scala function to check if one string is a rotation of another. (e.g., "abcd" is a rotation of "cdab")
 */

}
