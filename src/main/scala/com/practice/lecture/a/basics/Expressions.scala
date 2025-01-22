package com.practice.lecture.a.basics

object Expressions extends App {

  val x = 1+2 /*Expressions*/
  println(x)
  println(2+3*4)
//  + - * / & | ^ << >> >>> right shift with zro extension
  println(1==x)

//! && ||
  println(!(1==x))

  var x1 = 2
  x1+=3 // works with -, *, /
  println(x1)

//  Instructions(Doing Something) vs Expressions(has Value or type) means evaluate something
//In Scala, Every single code will compute value

  println(
    if(5==3) "jack"
    else "noJack"
  )

//  Expressions returning unit are side effects, e.g.println("XYZ") here side effect is printing string XYZ.
//  unit type is like void, only value it can have is ()
//  Never use loops, they are for imperative programming style, not functional
//  WHY->
  /* Functional programming encourages immutability and avoids side effects
   Functional programming constructs, such as << map, filter, and foreach >>, can lead to more concise and readable code compared to explicit loops
   Declarative Style=> You describe what you want to achieve rather than specifying how to achieve it step by step. This can lead to more expressive and maintainable code
   Functional constructs can be more easily parallelized. Many operations on immutable collections can be parallelized without introducing concurrency issues, improving performance
   */

//  Code Blocks are EXPRESSIONS
  val x2 = {
    /*Inside code block*/
    val p = 1
    val q = p+2
    if(p>2) "hello" else "bye" //last line of code block is output
  }


}
