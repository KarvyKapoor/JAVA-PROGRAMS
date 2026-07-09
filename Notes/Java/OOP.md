# 🏛️ Object Oriented Programming (OOP)

## 🎯 Definition

Object Oriented Programming (OOP) is a programming paradigm that organizes software around objects rather than functions. It improves code reusability, scalability, and maintainability.

---

## ⭐ Four Pillars of OOP

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

## 📌 Class

- Blueprint of an object
- Defines properties and behaviors
- Does not occupy memory until an object is created

```java
class Student {
    int id;
    String name;
}
```

---

## 📌 Object

- Instance of a class
- Occupies memory
- Can access class members

```java
Student s = new Student();
```

---

## 📌 Constructor

- Special method
- Same name as class
- No return type
- Invoked automatically during object creation

### Types

- Default Constructor
- Parameterized Constructor

---

## 📌 this Keyword

Used to refer to the current object.

Uses

- Access instance variables
- Invoke current constructor
- Pass current object

---

## 📌 Encapsulation

### Definition

Binding data and methods into a single unit while restricting direct access using access modifiers.

### Advantages

- Data Hiding
- Better Security
- Easy Maintenance

---

## 📌 Inheritance

### Definition

Acquiring properties and behaviors from another class.

```java
class Child extends Parent
```

### Types

- Single
- Multilevel
- Hierarchical

---

## 📌 Polymorphism

### Definition

One interface, multiple implementations.

### Types

#### Compile Time

- Method Overloading

#### Runtime

- Method Overriding

---

## 📌 Method Overloading

- Same Method Name
- Different Parameters
- Compile Time Polymorphism

---

## 📌 Method Overriding

- Same Method Signature
- Different Implementation
- Runtime Polymorphism

---

## 📌 Abstraction

### Definition

Hiding implementation details while exposing only essential functionality.

Achieved Using

- Abstract Class
- Interface

---

## 📌 Abstract Class

- Declared using `abstract`
- Can have abstract and concrete methods
- Cannot be instantiated

---

## 📌 Interface

- Blueprint for behavior
- Supports multiple inheritance
- Variables are `public static final`
- Methods are `public abstract` (before Java 8)

---

## 📌 Access Modifiers

| Modifier | Same Class | Package | Subclass | Outside Package |
|-----------|:----------:|:-------:|:--------:|:---------------:|
| private | ✅ | ❌ | ❌ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | ✅ | ❌* |
| public | ✅ | ✅ | ✅ | ✅ |

---

## 📌 Association

Relationship between two independent classes.

### Types

- Aggregation
- Composition

---

## 📌 Aggregation

- Weak "Has-A" relationship
- Objects can exist independently

Example

```
Department → Teacher
```

---

## 📌 Composition

- Strong "Has-A" relationship
- Child cannot exist without Parent

Example

```
House → Room
```

---

## 🎤 Interview Questions

- What is OOP?
- Class vs Object?
- Constructor vs Method?
- this vs super?
- Overloading vs Overriding?
- Abstract Class vs Interface?
- Encapsulation vs Abstraction?
- Aggregation vs Composition?
- Why is Java called an Object Oriented Language?

---

## 🚀 Best Practices

✅ Follow SOLID Principles

✅ Prefer Composition over Inheritance

✅ Keep classes focused on one responsibility

✅ Use meaningful class names

✅ Encapsulate data using private fields
