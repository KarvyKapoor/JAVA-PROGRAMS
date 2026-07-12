# ☕ Java Design Patterns

> Quick revision notes covering Java Design Patterns for interviews and backend development.

---

# What are Design Patterns?

Design Patterns are proven, reusable solutions to commonly occurring software design problems.

They are not complete code but templates that help build maintainable, scalable, and reusable applications.

---

# Why Design Patterns?

Without Design Patterns

- Tight coupling
- Code duplication
- Difficult maintenance
- Poor scalability

With Design Patterns

- Reusable solutions
- Better maintainability
- Loose coupling
- Improved scalability
- Easier testing

---

# Categories of Design Patterns

```text
Design Patterns
│
├── Creational
│   ├── Singleton
│   ├── Factory Method
│   ├── Abstract Factory
│   ├── Builder
│   └── Prototype
│
├── Structural
│   ├── Adapter
│   ├── Bridge
│   ├── Composite
│   ├── Decorator
│   ├── Facade
│   ├── Flyweight
│   └── Proxy
│
└── Behavioral
    ├── Strategy
    ├── Observer
    ├── Command
    ├── Iterator
    ├── State
    ├── Template Method
    ├── Chain of Responsibility
    ├── Mediator
    └── Visitor
```

---

# SOLID Principles

Design Patterns work best when combined with SOLID principles.

- S → Single Responsibility Principle
- O → Open Closed Principle
- L → Liskov Substitution Principle
- I → Interface Segregation Principle
- D → Dependency Inversion Principle

---

# Creational Patterns

Used for object creation.

---

## Singleton

Only one object exists throughout the application.

Example

```java
Runtime runtime = Runtime.getRuntime();
```

Use Cases

- Logger
- Configuration
- Cache
- Database Connection Manager

Advantages

- Controlled object creation
- Saves memory

---

## Factory Method

Creates objects without exposing creation logic.

```java
Shape shape = ShapeFactory.getShape("Circle");
```

Use Cases

- Payment Gateway
- Notification Service
- Database Drivers

Advantages

- Loose coupling
- Easy extension

---

## Abstract Factory

Creates families of related objects.

Example

```text
Windows UI Factory

Mac UI Factory
```

Use Cases

- Cross-platform applications
- UI frameworks

---

## Builder

Constructs complex objects step by step.

Example

```java
User user = User.builder()
                .name("Karvy")
                .age(20)
                .build();
```

Use Cases

- DTOs
- Immutable Objects
- Spring Boot Configuration

Advantages

- Readable code
- Avoids constructor overload

---

## Prototype

Creates new objects by cloning existing ones.

Method

```java
clone()
```

Use Cases

- Expensive object creation
- Game development

---

# Structural Patterns

Used to organize classes and objects.

---

## Adapter

Allows incompatible interfaces to work together.

Use Cases

- Third-party APIs
- Legacy systems

---

## Decorator

Adds functionality without modifying existing code.

Use Cases

- Java I/O Streams
- Logging
- Compression

Advantages

- Flexible
- Open for extension

---

## Facade

Provides a simplified interface to a complex subsystem.

Example

```java
BankService.transferMoney();
```

Advantages

- Simplifies usage
- Reduces complexity

---

## Proxy

Acts as a placeholder for another object.

Types

- Virtual Proxy
- Remote Proxy
- Security Proxy

Use Cases

- Lazy Loading
- Security
- Caching

---

## Composite

Treats individual and group objects uniformly.

Use Cases

- File Systems
- Organization Hierarchies

---

## Bridge

Separates abstraction from implementation.

Use Cases

- Payment Systems
- Messaging Systems

---

## Flyweight

Shares objects to reduce memory usage.

Use Cases

- Text Editors
- Game Engines

---

# Behavioral Patterns

Define communication between objects.

---

## Strategy

Encapsulates interchangeable algorithms.

Example

```text
Payment Strategy

UPI

Credit Card

PayPal
```

Advantages

- Easy to replace algorithms

---

## Observer

One-to-many dependency.

When one object changes, all observers are notified.

Examples

- Event Listeners
- Stock Market
- Notification Systems

---

## Command

Encapsulates a request as an object.

Examples

- Undo
- Redo
- Remote Controls

---

## Iterator

Sequentially accesses collection elements.

Methods

```java
hasNext()

next()
```

---

## State

Object behavior changes according to its state.

Examples

- Traffic Light
- ATM Machine

---

## Template Method

Defines algorithm skeleton while allowing subclasses to customize steps.

Examples

- Spring Framework
- JUnit

---

## Chain of Responsibility

Passes request through multiple handlers.

Examples

- Authentication Filters
- Logging Pipelines

---

## Mediator

Centralizes communication between objects.

Examples

- Chat Applications
- Air Traffic Control

---

## Visitor

Adds operations without modifying object structure.

Examples

- Report Generation
- Compiler Design

---

# Common Design Patterns in Spring Boot

| Pattern | Example |
|----------|----------|
| Singleton | Spring Beans |
| Factory | BeanFactory |
| Proxy | Spring AOP |
| Builder | Lombok Builder |
| Strategy | Authentication Providers |
| Observer | Event Listeners |
| Template Method | JdbcTemplate |
| Decorator | InputStream Classes |

---

# Best Practices

- Prefer Composition over Inheritance.
- Follow SOLID principles.
- Use patterns only when needed.
- Avoid unnecessary complexity.
- Program to interfaces, not implementations.
- Keep designs simple and maintainable.

---

# Common Mistakes

- Using design patterns everywhere
- Choosing the wrong pattern
- Overengineering small projects
- Ignoring SOLID principles
- Tight coupling despite using patterns

---

# Real World Use Cases

- Spring Framework
- Spring Boot
- Hibernate
- Java Collections Framework
- Banking Applications
- E-commerce Systems
- Payment Gateways
- Enterprise Applications

---

# Common Interview Questions

- What are Design Patterns?
- Why are Design Patterns important?
- Types of Design Patterns?
- Singleton vs Factory?
- Factory vs Abstract Factory?
- Builder Pattern advantages?
- Strategy vs State?
- Adapter vs Decorator?
- Proxy vs Decorator?
- Observer Pattern example?
- Which Design Patterns does Spring Boot use?
- Why prefer Composition over Inheritance?

---

# Revision Checklist

- Design Pattern Categories
- SOLID Principles
- Singleton
- Factory Method
- Abstract Factory
- Builder
- Prototype
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy
- Strategy
- Observer
- Command
- Iterator
- State
- Template Method
- Chain of Responsibility
- Mediator
- Visitor
- Spring Boot Design Patterns

---

# Summary

Design Patterns are proven software design solutions that improve code quality, maintainability, and scalability. They help developers solve recurring design problems efficiently and are widely used in Java, Spring Boot, Hibernate, and enterprise applications. Understanding when and why to apply a pattern is more important than memorizing its implementation.