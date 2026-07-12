# ☕ Java Generics

> Quick revision notes covering Java Generics for interviews and backend development.

---

# What are Generics?

Generics allow classes, interfaces, and methods to work with **different data types while maintaining type safety**.

Generics help write reusable, flexible, and compile-time type-safe code.

---

# Why Generics?

Without Generics

- Manual type casting
- Runtime errors
- Less readable code
- Poor code reusability

With Generics

- Compile-time type checking
- No explicit type casting
- Better readability
- Code reusability
- Improved maintainability

---

# Generic Class

```java
class Box<T>{

    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

}
```

Usage

```java
Box<Integer> box = new Box<>();

box.setValue(10);
```

---

# Generic Interface

```java
interface Repository<T>{

    void save(T obj);

}
```

---

# Generic Method

```java
public <T> void print(T value){

    System.out.println(value);

}
```

---

# Multiple Type Parameters

```java
class Pair<K,V>{

    private K key;
    private V value;

}
```

Example

```java
Pair<Integer,String>
```

---

# Type Parameter Naming Convention

| Symbol | Meaning |
|---------|----------|
| T | Type |
| E | Element |
| K | Key |
| V | Value |
| N | Number |

---

# Bounded Generics

Restrict the allowed type.

Example

```java
class Box<T extends Number>{

}
```

Valid

```java
Integer

Double

Float
```

Invalid

```java
String
```

---

# Multiple Bounds

```java
<T extends Number & Comparable<T>>
```

Used when a type must inherit one class and implement interfaces.

---

# Wildcards

Represent an unknown type.

```java
?
```

---

## Unbounded Wildcard

```java
List<?>
```

Accepts any type.

---

## Upper Bounded Wildcard

```java
List<? extends Number>
```

Accepts

- Integer
- Double
- Float
- Long

Used when **reading** data.

---

## Lower Bounded Wildcard

```java
List<? super Integer>
```

Accepts

- Integer
- Number
- Object

Used when **writing** data.

---

# PECS Principle

Producer

```text
? extends
```

Consumer

```text
? super
```

PECS

```text
Producer Extends

Consumer Super
```

---

# Type Erasure

Java removes generic type information during compilation.

Example

```java
List<String>

↓

List
```

Reason

Maintain backward compatibility.

---

# Restrictions of Generics

Cannot

```java
new T()
```

Cannot create

```java
T[]
```

Cannot use

```java
instanceof List<String>
```

Cannot use primitive types

```java
List<int> ❌

List<Integer> ✅
```

---

# Generic Collections

Examples

```java
List<String>

List<Integer>

Set<Employee>

Map<Integer,String>
```

---

# Benefits

- Type Safety
- Reusable Code
- Cleaner APIs
- Compile-time Error Checking
- Reduced Runtime Errors

---

# Drawbacks

- Type Erasure
- Cannot use primitive types
- Some runtime limitations
- Slightly complex syntax

---

# Generics in Collections

```java
List<String>

Map<Integer,String>

Set<Employee>

Queue<Order>
```

Generics ensure only the specified type can be stored.

---

# Generics in Spring Boot

Common examples

```java
ResponseEntity<T>

JpaRepository<T,ID>

CrudRepository<T,ID>

Optional<T>

Page<T>
```

Generics make Spring Boot reusable and flexible.

---

# Common Interview Questions

- What are Generics?
- Why are Generics needed?
- Advantages of Generics?
- What is Type Erasure?
- What are Wildcards?
- Difference between `extends` and `super`?
- Explain PECS.
- Why can't Generics use primitive types?
- Why can't we create `new T()`?
- Generic Class vs Generic Method?
- What are bounded Generics?
- How does Spring Boot use Generics?

---

# Common Mistakes

- Using raw types instead of generic types
- Confusing `extends` with `super`
- Using Generics with primitive types
- Ignoring compiler warnings
- Using `Object` instead of Generics

---

# Best Practices

- Prefer Generics over `Object`.
- Avoid raw types.
- Use meaningful type parameter names.
- Use bounded Generics when appropriate.
- Follow the PECS principle.
- Prefer interfaces like `List<T>` over concrete implementations.

---

# Real World Use Cases

- Java Collections Framework
- Spring Data JPA
- REST API Responses
- Repository Pattern
- Generic Services
- Utility Classes
- Data Transfer Objects (DTOs)

---

# Revision Checklist

- Generic Class
- Generic Interface
- Generic Method
- Type Parameters
- Bounded Generics
- Wildcards
- PECS Principle
- Type Erasure
- Generic Collections
- Restrictions
- Spring Boot Usage
- Best Practices

---

# Summary

Generics enable type-safe, reusable, and maintainable code by allowing classes, interfaces, and methods to work with different data types. They eliminate unnecessary casting, reduce runtime errors, and are widely used in the Java Collections Framework, Spring Boot, JPA, and enterprise applications.