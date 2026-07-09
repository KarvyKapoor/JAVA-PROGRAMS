# Java Generics

> Last Updated: 09 July 2026

---

# Overview
Generics allow classes, interfaces, and methods to work with different data types while providing compile time type safety.
Introduced in: Java 5

---

# Why do we need Generics?

- Prevent ClassCastException
- Provide compile time type checking
- Eliminate explicit type casting
- Improve code readability
- Increase code reusability

---

# Topics Covered

## ✅ Primitive vs Reference Types

### Primitive Types
- byte
- short
- int
- long
- float
- double
- char
- boolean

Characteristics:
- Store actual values
- Faster
- Cannot be used with Generics

---

### Reference Types

Examples:
- String
- Integer
- ArrayList
- Scanner
- Custom Objects

Characteristics:
- Store object references
- Can be used with Generics

---

## ✅ Wrapper Classes

| Primitive | Wrapper |
|-----------|----------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

Why?

Generics work only with objects.

Example:

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

---

## ✅ Generic Class vs Raw Type

### Raw Type

```java
ArrayList list = new ArrayList();
```

Problems
- No type safety
- Requires explicit casting
- Runtime errors possible

---

### Generic Type

```java
ArrayList<String> list = new ArrayList<>();
```

Advantages
- Compile time checking
- No explicit casting
- Type safety
- Better readability

---

## ✅ Compiler vs JVM Responsibilities

### Compiler
Responsible for
- Generic type checking
- Type inference
- Type Erasure
- Inserting type casts

Occurs during Compile Time.

---

### JVM
Responsible for
- Executing bytecode
- Class Loading
- Memory Management
- Garbage Collection

Occurs during Runtime.

---

## ✅ Type Erasure
Definition: Type Erasure is the process of removing generic type information during compilation.

Example

Before Compilation

```java
ArrayList<String> list = new ArrayList<>();
```

After Type Erasure

```java
ArrayList list = new ArrayList();
```

Reason: Backward compatibility with older Java versions.

---

## ✅ Why Object is NOT a Replacement for Generics

Using Object

```java
ArrayList<Object> list = new ArrayList<>();

list.add("Java");
list.add(10);

String s = (String) list.get(1);
```

Result: Runtime Exception

```
ClassCastException
```

Using Generics

```java
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add(10);
```

Result: Compile Time Error

---

# Key Takeaways
- Generics provide compile time type safety.
- Wrapper classes allow primitive values to be used with Generics.
- Generic information is removed during compilation.
- The Compiler handles Generics, not the JVM.
- Raw Types should be avoided.
- Generics move errors from Runtime to Compile Time.

---

# Code Files
- PrimitiveVsReference.java
- WrapperClasses.java
- GenericClassVsRawType.java
- CompilerVsJVM.java
- TypeErasure.java
- ObjectVsGenerics.java

---

# Interview Questions
- What are Generics?
- Why were Generics introduced?
- Why can't Generics use primitive types?
- What are Wrapper Classes?
- What is Type Erasure?
- Why is Object not a replacement for Generics?
- Difference between Generic Type and Raw Type?
- Who handles Generics: Compiler or JVM?

---

# Upcoming Topics
- Generic Classes
- Generic Methods
- Multiple Type Parameters
- Bounded Generics
- Wildcards
- PECS
- Generic Interfaces