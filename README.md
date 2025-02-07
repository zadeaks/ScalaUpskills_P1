# ScalaUpskills_P1

Here’s your content formatted as a `README.md` file:

```markdown
# ScalaUpskills_P1

## FoldLeft Learning
---
### **General Syntax**
```scala
collection.foldLeft(initialValueOfTypeAccThatIsExpectedOutputType) { (acc, elemFromListOnWhichOperationGettingPerformed) => () }
```

### **Simpler Example: Sum of Evens from a List**
```scala
lst.foldLeft(0) { (acc, elem) => if (elem % 2 == 0) acc + elem else acc }
```

---

## How to Update a Map?
```scala
myMap.updated("myKey", myMap.getOrElse("myKey", 0) + 1)
```

---

## How to Use Case Match?
```scala
num % 2 match {
  case 0 => println("EvenNum")
  case _ => println("OddNum")
}
```

---

## Define an Empty List or Map
```scala
List.empty[Int]
Map.empty[String, Int]
```

---

## Generic Programming
### **Defining a Custom Map**
```scala
def customMap[A, B](lst: List[A], func: A => B): List[B] = {
  lst.foldLeft(List.empty[B]) { (acc, elem) => acc :+ func(elem) }
}
```

### **Usage of Generic Function**
```scala
val usageOfGenericFunction = customMap(myList, (x: Int) => x * x)
```

**Important Note:**
- `[A, B]` are called **Type Parameters**. These are general types that we define in the next lines.

---

## How to Add Two Lists?
```scala
list1 ++ list2
```

---

## How to Append or Prepend to a List?
### **Append**
```scala
list :+ 11
```

### **Prepend**
```scala
11 :: list
```
```scala
list.prepended(11)
```

---
## How to flatten or extend a List?
### **flatten**
```scala
list.flatten
```
### **extend**
```scala
listA.extend(listB)
e.g. list A: List(1,2,3) & List B: List(4,5,6)
outputList : List(1,2,3,4,5,6)
```

### **Usage**
- Save the above content as `README.md`.
- It follows Markdown syntax and will render nicely on GitHub or any Markdown viewer.

### **Types of Function in Scala**
| Function Type | Description |
|--------------|-------------|
| **Function Literals** | Anonymous functions (`(x: Int) => x * 2`) |
| **Named Functions** | Standard `def` functions |
| **Higher-Order Functions** | Accept or return other functions |
| **Curried Functions** | Multiple parameter lists (`def f(a)(b)`) |
| **Recursive Functions** | Functions that call themselves |
| **Tail-Recursive Functions** | Optimized recursion (`@tailrec`) |
| **Call-By-Name** | Arguments evaluated lazily (`=> Type`) |
| **Closures** | Functions capturing free variables |
| **Partially Applied** | Fix some parameters (`f(x, _: Int)`) |
| **Partial Functions** | Functions that handle only certain inputs |
| **Generic Functions** | Functions with type parameters (`def f[T](x: T)`) |
| **Inline Functions (Scala 3)** | Compile-time optimizations (`inline def`) |
| **Context Functions (Scala 3)** | Implicit dependency injection (`using`) |


### **Curried Function**
**How It Works:**
1. The function now takes **one argument at a time**.
2. The first parameter list `(x: Int)` returns another function that takes `(y: Int)`.
3. When both arguments are provided, it returns `x + y`.
```
val sum = (x: Int, y: Int) => x + y
val curriedSum = sum.curried
println(curriedSum(3)(4))  // Output: 7
```