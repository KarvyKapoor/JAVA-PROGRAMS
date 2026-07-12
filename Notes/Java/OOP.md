# ☕ Object Oriented Programming (OOP)

> Quick revision notes covering Object Oriented Programming concepts in Java for interviews and backend development.

---

# What is OOP?

Object Oriented Programming (OOP) is a programming paradigm that organizes software using **objects**, which combine **data (fields)** and **behavior (methods)**.

The main goal of OOP is to make software more modular, reusable, maintainable, and scalable.

---

# Why OOP?

Without OOP

- Code duplication
- Difficult maintenance
- Poor scalability
- Low reusability

With OOP

- Code Reusability
- Better Maintainability
- High Scalability
- Easy Testing
- Real World Modeling

---

# Class

A class is a blueprint for creating objects.

```java
class Student{

    String name;
    int age;

}
```

---

# Object

An object is an instance of a class.

```java
Student s1 = new Student();
```

Each object has:

- State (Fields)
- Behavior (Methods)

---

# Constructor

A constructor initializes an object.

### Default Constructor

```java
Student(){

}
```

### Parameterized Constructor

```java
Student(String name,int age){

    this.name = name;
    this.age = age;

}
```

Properties

- Same name as class
- No return type
- Called automatically during object creation

---

# this Keyword

Refers to the current object.

```java
this.name = name;
```

Uses

- Access current object's variables
- Call another constructor
- Pass current object

---

# super Keyword

Refers to the parent class.

```java
super();
```

Uses

- Access parent constructor
- Access parent methods
- Access parent variables

---

# Pillars of OOP

## 1. Encapsulation

Wrapping data and methods together while restricting direct access.

Example

```java
private String name;

public String getName(){

    return name;

}
```

Advantages

- Data Hiding
- Better Security
- Better Maintainability

---

## 2. Inheritance

Allows one class to acquire properties of another class.

```java
class Animal{

}

class Dog extends Animal{

}
```

Advantages

- Code Reusability
- Extensibility

Types

- Single
- Multilevel
- Hierarchical

(Java does not support Multiple Inheritance through classes.)

---

## 3. Polymorphism

One interface, multiple implementations.

### Compile Time

Method Overloading

```java
add(int a,int b)

add(double a,double b)
```

---

### Runtime

Method Overriding

```java
class Animal{

    void sound(){}

}

class Dog extends Animal{

    @Override
    void sound(){

    }

}
```

Advantages

- Flexibility
- Dynamic Method Dispatch

---

## 4. Abstraction

Hides implementation details and exposes only essential functionality.

### Abstract Class

```java
abstract class Vehicle{

    abstract void start();

}
```

---

### Interface

```java
interface Payment{

    void pay();

}
```

Advantages

- Loose Coupling
- Better Design
- Easy Extension

---

# Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|----------|-----------|----------------|
| Constructor | ❌ | ✅ |
| Instance Variables | ❌ | ✅ |
| Multiple Inheritance | ✅ | ❌ |
| Methods | Abstract, Default, Static | Abstract + Concrete |
| Keyword | implements | extends |

---

# Association

Relationship between two independent objects.

Example

Student → Teacher

---

# Aggregation

"Weak Has-A" relationship.

Child object can exist independently.

Example

Department → Professor

---

# Composition

"Strong Has-A" relationship.

Child object cannot exist without parent.

Example

House → Room

---

# Object Class

Every Java class inherits from `Object`.

Common Methods

```java
toString()

equals()

hashCode()

clone()

getClass()

wait()

notify()

notifyAll()
```

---

# instanceof

Checks whether an object belongs to a class.

```java
obj instanceof Student
```

Returns

```java
true

false
```

---

# Dynamic Method Dispatch

Java decides which overridden method to execute at **runtime**.

```java
Animal a = new Dog();

a.sound();
```

Dog's implementation executes.

---

# Access Modifiers

| Modifier | Same Class | Package | Subclass | Outside |
|-----------|------------|----------|-----------|----------|
| public | ✅ | ✅ | ✅ | ✅ |
| protected | ✅ | ✅ | ✅ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| private | ✅ | ❌ | ❌ | ❌ |

---

# SOLID Principles

- S → Single Responsibility Principle
- O → Open Closed Principle
- L → Liskov Substitution Principle
- I → Interface Segregation Principle
- D → Dependency Inversion Principle

These principles help build scalable and maintainable applications.

---

# Common Interview Questions

- What is OOP?
- What are the four pillars of OOP?
- Class vs Object?
- Constructor vs Method?
- this vs super?
- Method Overloading vs Overriding?
- Abstraction vs Encapsulation?
- Interface vs Abstract Class?
- Aggregation vs Composition?
- Why doesn't Java support multiple inheritance with classes?
- What is Dynamic Method Dispatch?
- Why is OOP important in Spring Boot?

---

# Common Mistakes

- Using inheritance where composition is better
- Exposing fields instead of using encapsulation
- Confusing overloading with overriding
- Forgetting `@Override`
- Using interfaces without understanding abstraction
- Tight coupling between classes

---

# Best Practices

- Favor Composition over Inheritance.
- Keep classes focused on a single responsibility.
- Program to interfaces, not implementations.
- Follow SOLID principles.
- Encapsulate data using private fields.
- Avoid unnecessary inheritance hierarchies.

---

# Real World Use Cases

- Banking Systems
- E Commerce Applications
- Hospital Management Systems
- Spring Boot Applications
- Android Development
- Enterprise Software

---

# Revision Checklist

- Class
- Object
- Constructor
- this
- super
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interface
- Abstract Class
- Association
- Aggregation
- Composition
- Object Class
- instanceof
- Dynamic Method Dispatch
- SOLID Principles

---

# Summary

Object Oriented Programming is the foundation of Java and modern backend development. Mastering OOP enables developers to build modular, reusable, secure, and scalable applications. Frameworks like Spring Boot heavily rely on OOP concepts such as abstraction, dependency injection, interfaces, and polymorphism.