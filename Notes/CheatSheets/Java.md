# Java Cheat Sheet

A quick revision guide for Java Development and Interviews.

---

# 1. Java Fundamentals

## What is Java?

Java is a high-level, object-oriented, class-based programming language designed to be platform independent.

## Java Features

- Object Oriented
- Platform Independent
- Secure
- Robust
- Multithreaded
- Portable
- High Performance
- Automatic Garbage Collection


---

# 2. Java Execution Flow


Java Source Code

```
.java file
    |
    ↓
Java Compiler (javac)
    |
    ↓
Bytecode (.class file)
    |
    ↓
JVM
    |
    ↓
Machine Code
```


## Why Java is Platform Independent?

Java code is converted into bytecode.

Bytecode runs on JVM.

Every operating system has its own JVM implementation.


---

# 3. JDK vs JRE vs JVM


## JDK (Java Development Kit)

Used for developing Java applications.

Contains:

- JRE
- Compiler
- Debugger
- Development tools


## JRE (Java Runtime Environment)

Used to run Java applications.

Contains:

- JVM
- Java Libraries


## JVM (Java Virtual Machine)

Executes Java bytecode.

Responsibilities:

- Memory management
- Garbage collection
- Platform independence


Flow:

```
JDK
 |
 ↓
JRE
 |
 ↓
JVM
```


---

# 4. Java Basics


## Class

Blueprint used to create objects.

```java
class Student {

    String name;
    int age;

}
```


## Object

Instance of a class.

```java
Student s = new Student();
```


## Constructor

Used to initialize objects.

Types:

- Default Constructor
- Parameterized Constructor


Example:

```java
class Student {

    Student(){
        System.out.println("Constructor");
    }

}
```


---

# 5. Variables


## Local Variable

Declared inside methods.

Stored in stack memory.


## Instance Variable

Belongs to object.

Stored in heap memory.


## Static Variable

Belongs to class.

Shared among all objects.


Example:

```java
class Student {

    static String college;

    String name;

}
```


---

# 6. Access Modifiers


| Modifier | Access |
|----------|--------|
| private | Same class only |
| default | Same package |
| protected | Package + subclass |
| public | Everywhere |


---

# 7. Important Keywords


## this

Refers to current object.


```java
this.name = name;
```


## super

Refers to parent class object.


## static

Belongs to class instead of object.


## final

Prevents modification.


final variable:

Cannot change value.


final method:

Cannot override.


final class:

Cannot inherit.


---

# 8. OOP Concepts


## 1. Encapsulation

Binding data and methods together.

Achieved using:

- private variables
- getter/setter methods


Example:

```java
class Account {

    private int balance;

    public int getBalance(){
        return balance;
    }

}
```


---

## 2. Inheritance

Reusing existing class properties.

Keyword:

```
extends
```


Example:

```java
class Animal {

}

class Dog extends Animal {

}
```


Types:

- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance


---

## 3. Polymorphism


One name, multiple behaviors.


## Compile Time Polymorphism

Method Overloading.


Same method name with different parameters.


Example:

```java
void add(int a,int b)

void add(int a,int b,int c)
```


## Runtime Polymorphism

Method Overriding.


Child class changes parent method implementation.


---

## 4. Abstraction


Hiding implementation details.


Achieved using:

- Abstract class
- Interface


Example:

```java
interface Vehicle {

    void start();

}
```


---

# 9. String


## String

- Immutable
- Stored in String Pool
- Thread safe


Example:

```java
String name = "Java";
```


## StringBuilder

- Mutable
- Faster
- Not synchronized


## StringBuffer

- Mutable
- Thread safe
- Slower than StringBuilder


Comparison:


| String | StringBuilder |
|-|-|
| Immutable | Mutable |
| Slow modification | Fast modification |
| Thread safe | Not thread safe |


---

# 10. Arrays


Collection of similar data types.


Example:

```java
int arr[] = {1,2,3};
```


Limitations:

- Fixed size
- Same data type only


---

# 11. Collections Framework


Used to store and manipulate groups of objects.


Hierarchy:

```
Collection

 |
 |-- List
 |
 |-- Set
 |
 |-- Queue


Map (Separate)
```


---

# 12. List Interface


Allows duplicate values.

Maintains insertion order.


## ArrayList

- Dynamic array
- Fast searching
- Slow insertion/deletion


```java
ArrayList<Integer> list = new ArrayList<>();
```


## LinkedList

- Doubly linked list
- Fast insertion/deletion
- Slow searching


## Vector

- Thread safe
- Legacy class


---

# 13. Set Interface


Stores unique values.


## HashSet

- No duplicate values
- No ordering
- Allows one null value


## LinkedHashSet

- Maintains insertion order


## TreeSet

- Sorted order
- No null values


---

# 14. Map Interface


Stores key-value pairs.


## HashMap


Features:

- Key-value storage
- One null key
- Multiple null values
- Not synchronized


Example:

```java
HashMap<Integer,String> map = new HashMap<>();
```


## LinkedHashMap

- Maintains insertion order


## TreeMap

- Sorted keys


## ConcurrentHashMap

- Thread safe
- Better performance in multithreading


---

# 15. Generics


Used for:

- Type safety
- Code reusability
- Avoid type casting


Without Generics:

```java
List list = new ArrayList();
```


With Generics:

```java
List<String> names = new ArrayList<>();
```


Generic Class:

```java
class Box<T>{

    T value;

}
```


---

# 16. Exception Handling


Used to handle runtime errors.


Keywords:

- try
- catch
- finally
- throw
- throws


Example:

```java
try {

    int result = 10/0;

}

catch(Exception e){

    System.out.println(e);

}

finally{

    System.out.println("Completed");

}
```


---

# Exception Types


## Checked Exception

Checked at compile time.


Examples:

- IOException
- SQLException


## Unchecked Exception

Occurs during runtime.


Examples:

- NullPointerException
- ArithmeticException
- ArrayIndexOutOfBoundsException


---

# throw vs throws


## throw

Used to manually throw exception.


## throws

Declares exceptions in method signature.


---

# 17. File Handling


Important Classes:


## File

Represents file or directory.


## FileReader

Reads character data.


## FileWriter

Writes character data.


## BufferedReader

Reads efficiently.


## BufferedWriter

Writes efficiently.


Example:

```java
FileReader fr = new FileReader("file.txt");
```


---

# 18. Multithreading


Thread:

Smallest unit of execution.


Benefits:

- Better performance
- Parallel execution
- Resource sharing


---

# Creating Threads


## Extending Thread Class


```java
class MyThread extends Thread {

    public void run(){

    }

}
```


## Implementing Runnable


```java
class Task implements Runnable {

    public void run(){

    }

}
```


---

# Thread Life Cycle


```
New

 ↓

Runnable

 ↓

Running

 ↓

Blocked

 ↓

Terminated
```


---

# Synchronization


Used to prevent race conditions.


Keyword:

```
synchronized
```


Example:

```java
synchronized void update(){

}
```


---

# Thread Methods


sleep()

Pauses thread execution.


join()

Waits for thread completion.


start()

Starts thread.


run()

Contains thread logic.


---

# 19. Java 8 Features


## Lambda Expression


Anonymous function.


Example:

```java
(a,b)->a+b
```


---

# Functional Interface


Interface having only one abstract method.


Examples:

- Predicate
- Function
- Consumer
- Supplier


---

# Stream API


Used for processing collections.


Example:

```java
list.stream()
.filter(x -> x > 10)
.collect(Collectors.toList());
```


Common Methods:


filter()

map()

sorted()

reduce()

collect()


---

# Optional


Used to avoid NullPointerException.


Example:

```java
Optional<String> name;
```


---

# Default Methods


Allows method implementation inside interfaces.


---

# 20. JVM Architecture


JVM contains:


## Class Loader

Loads class files into memory.


## Runtime Memory


Contains:

- Heap
- Stack
- Method Area
- PC Register
- Native Method Stack


## Execution Engine


Contains:

- Interpreter
- JIT Compiler
- Garbage Collector


---

# 21. Memory Management


## Stack Memory


Stores:

- Local variables
- Method calls
- References


Fast memory.


---

## Heap Memory


Stores:

- Objects
- Instance variables


Managed by Garbage Collector.


---

# Garbage Collection


Automatically removes unused objects.


Advantages:

- Automatic memory management
- Prevents memory leaks


---

# 22. Serialization


Converting object into byte stream.


Used for:

- Saving objects
- Network transfer


Keyword:

```
Serializable
```


---

# 23. Important Comparisons


## == vs equals()


==

- Compares references


equals()

- Compares values


---

## ArrayList vs LinkedList


ArrayList:

- Fast access
- Slow insertion


LinkedList:

- Slow access
- Fast insertion


---

## HashMap vs ConcurrentHashMap


HashMap:

- Not thread safe


ConcurrentHashMap:

- Thread safe


---

## Heap vs Stack


Stack:

- Local variables
- Method calls


Heap:

- Objects
- Instance variables


---

## Interface vs Abstract Class


Interface:

- Defines contract
- Multiple inheritance supported


Abstract Class:

- Partial implementation
- Can have constructors


---

# 24. Common Interview Questions


## Why Java is platform independent?

Because Java executes bytecode using JVM.


## Why String is immutable?

Because of:

- Security
- String pool optimization
- Thread safety


## Difference between JDK and JRE?

JDK is for development.

JRE is for execution.


## Difference between process and thread?

Process:

Independent program.


Thread:

Small execution unit inside process.


## How Garbage Collector works?

It removes objects that are no longer reachable.


---

# Java Quick Revision Checklist


## Core Java

✓ Basics  
✓ OOP  
✓ String  
✓ Keywords  
✓ Exception Handling  


## Collections

✓ List  
✓ Set  
✓ Map  
✓ HashMap  
✓ ConcurrentHashMap  


## Advanced Java

✓ Generics  
✓ File Handling  
✓ Multithreading  
✓ JVM  
✓ Memory Management  


## Java 8

✓ Lambda  
✓ Stream API  
✓ Functional Interface  
✓ Optional  