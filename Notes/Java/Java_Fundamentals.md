# ☕ Java Fundamentals

> Quick revision notes covering the core concepts of Java required for interviews and backend development.

---

# What is Java?

Java is a high level, object oriented, platform independent programming language developed by Sun Microsystems (now Oracle).

### Features

- Platform Independent (Write Once, Run Anywhere)
- Object Oriented
- Robust
- Secure
- Multithreaded
- High Performance (JIT Compiler)
- Automatic Garbage Collection
- Rich Standard Library

---

# JDK vs JRE vs JVM

| Component | Purpose |
|-----------|----------|
| JDK | Development Kit (Compiler + JRE + Tools) |
| JRE | Runtime Environment |
| JVM | Executes Java Bytecode |

Flow:

```
.java
   ↓
javac
   ↓
.class (Bytecode)
   ↓
JVM
   ↓
Machine Code
```

---

# Java Program Structure

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
```

Execution starts from

```java
public static void main(String[] args)
```

---

# Variables

A variable stores data.

```java
int age = 20;
String name = "Karvy";
```

Rules

- Must be declared before use
- Case sensitive
- Cannot use reserved keywords

---

# Data Types

## Primitive

| Type | Size |
|------|------|
| byte | 1 byte |
| short | 2 bytes |
| int | 4 bytes |
| long | 8 bytes |
| float | 4 bytes |
| double | 8 bytes |
| char | 2 bytes |
| boolean | JVM dependent |

---

## Non Primitive

- String
- Arrays
- Classes
- Interfaces
- Objects
- Collections

---

# Type Casting

## Implicit

```java
int a = 10;

double b = a;
```

Safe conversion.

---

## Explicit

```java
double x = 15.8;

int y = (int)x;
```

May lose data.

---

# Operators

- Arithmetic
- Assignment
- Relational
- Logical
- Unary
- Ternary
- Bitwise

---

# Control Statements

## if

```java
if(condition){

}
```

## if else

## else if

## switch

---

# Loops

## for

```java
for(int i=0;i<5;i++){

}
```

## while

```java
while(condition){

}
```

## do while

```java
do{

}while(condition);
```

---

# Break vs Continue

Break

Stops the loop.

Continue

Skips current iteration.

---

# Methods

Syntax

```java
returnType methodName(parameters){

}
```

Example

```java
int add(int a,int b){

    return a+b;

}
```

---

# Method Overloading

Same method name

Different parameters

Compile Time Polymorphism

---

# Arrays

Stores same type of elements.

```java
int[] arr = {1,2,3};
```

Index starts from **0**

Fixed size.

---

# Strings

Immutable.

```java
String name = "Java";
```

Mutable alternatives

- StringBuilder
- StringBuffer

---

# Wrapper Classes

Primitive → Object

| Primitive | Wrapper |
|------------|----------|
| int | Integer |
| char | Character |
| boolean | Boolean |
| double | Double |

Autoboxing

```java
Integer a = 10;
```

Unboxing

```java
int b = a;
```

---

# Packages

Used to organize Java classes.

Example

```java
java.util

java.io

java.lang
```

---

# Access Modifiers

| Modifier | Same Class | Package | Subclass | Outside |
|-----------|------------|----------|-----------|----------|
| public | ✅ | ✅ | ✅ | ✅ |
| protected | ✅ | ✅ | ✅ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| private | ✅ | ❌ | ❌ | ❌ |

---

# Memory Allocation

Stack

- Local Variables
- Method Calls

Heap

- Objects
- Arrays

---

# Common Interview Questions

- Why is Java platform independent?
- Difference between JDK, JRE, and JVM?
- Why is String immutable?
- Stack vs Heap?
- Primitive vs Non Primitive Data Types?
- Method Overloading vs Overriding?
- Why main() is static?
- What is Autoboxing?
- Why arrays are fixed size?
- Why Java is called Object Oriented?

---

# Common Mistakes

- Comparing Strings using `==`
- Forgetting array index starts from 0
- Confusing `=` with `==`
- Using `float` without `f`
- Ignoring integer overflow
- Not understanding pass by value

---

# Best Practices

- Follow Java naming conventions.
- Keep methods short and focused.
- Prefer meaningful variable names.
- Use constants for fixed values.
- Minimize global state.
- Write readable code.

---

# Revision Checklist

- JDK, JRE, JVM
- Variables
- Data Types
- Type Casting
- Operators
- Control Statements
- Loops
- Methods
- Arrays
- Strings
- Wrapper Classes
- Packages
- Access Modifiers
- Stack vs Heap

---

# Summary

Java Fundamentals form the foundation of all advanced Java concepts, including OOP, Collections, Multithreading, JVM, and Spring Boot. A strong understanding of these topics is essential for backend development and technical interviews.