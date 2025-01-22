def reverseString(str: String) = {
  str.split("").reverse.mkString("")
}

println(reverseString("Akshay"))

val x = "Akshay Zade"
x.replace('a','y')