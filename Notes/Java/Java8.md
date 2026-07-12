# ☕ Java 8 Features

> Quick revision notes covering Java 8 features for interviews and backend development.

---

# What is Java 8?

Java 8 was one of the biggest releases of Java, introducing modern programming features like functional programming, Stream API, Lambda Expressions, and the new Date & Time API.

Released in **March 2014**.

---

# Why Java 8?

Before Java 8

- More boilerplate code
- Manual collection processing
- Anonymous inner classes
- Difficult parallel processing

With Java 8

- Cleaner code
- Functional Programming
- Parallel Processing
- Better Collection Handling
- Improved Date & Time API

---

# Major Features

- Lambda Expressions
- Functional Interfaces
- Method References
- Stream API
- Optional Class
- Default Methods
- Static Methods
- Date & Time API
- CompletableFuture

---

# Lambda Expressions

Provides a concise way to implement functional interfaces.

Syntax

```java
(parameters) -> expression
```

Example

```java
(a, b) -> a + b
```

Advantages

- Less code
- Better readability
- Functional programming support

---

# Functional Interface

An interface with only **one abstract method**.

Annotation

```java
@FunctionalInterface
```

Examples

```java
Runnable

Comparator

Callable
```

Common Functional Interfaces

| Interface | Method |
|------------|---------|
| Predicate<T> | test() |
| Function<T,R> | apply() |
| Consumer<T> | accept() |
| Supplier<T> | get() |

---

# Method Reference

Refers to an existing method using `::`.

Syntax

```java
ClassName::methodName
```

Example

```java
System.out::println
```

Types

- Static Method Reference
- Instance Method Reference
- Constructor Reference

---

# Stream API

Processes collections efficiently.

Example

```java
list.stream()
```

Advantages

- Cleaner code
- Functional style
- Parallel processing
- Less boilerplate

---

# Stream Operations

## Intermediate Operations

- filter()
- map()
- sorted()
- distinct()
- limit()
- skip()

Returns another Stream.

---

## Terminal Operations

- collect()
- forEach()
- count()
- reduce()
- findFirst()
- anyMatch()

Produces the final result.

---

# Stream Pipeline

```text
Collection
      ↓
Stream
      ↓
Intermediate Operations
      ↓
Terminal Operation
```

---

# map() vs filter()

| map() | filter() |
|--------|-----------|
| Transforms data | Removes unwanted data |

---

# Sequential vs Parallel Stream

Sequential

```java
stream()
```

Parallel

```java
parallelStream()
```

Parallel streams utilize multiple CPU cores for improved performance.

---

# Optional Class

Container object that may or may not contain a value.

Purpose

Avoid

```java
NullPointerException
```

Example

```java
Optional<String> name =
Optional.of("Karvy");
```

Useful Methods

```java
isPresent()

get()

orElse()

orElseGet()

orElseThrow()

ifPresent()
```

---

# Default Methods

Allows interfaces to have method implementations.

Example

```java
default void show(){

}
```

Purpose

- Backward compatibility
- Extend interfaces without breaking implementations

---

# Static Methods

Interfaces can contain static methods.

Example

```java
static void print(){

}
```

Called using

```java
InterfaceName.print();
```

---

# Date & Time API

Package

```java
java.time
```

Classes

- LocalDate
- LocalTime
- LocalDateTime
- Period
- Duration
- Instant

Advantages

- Immutable
- Thread Safe
- Easy to use

---

# CompletableFuture

Supports asynchronous programming.

Example

```java
CompletableFuture.supplyAsync(() -> {

});
```

Advantages

- Non-blocking
- Better performance
- Parallel execution

---

# forEach()

Iterates through collections.

```java
list.forEach(System.out::println);
```

---

# Collectors

Common Methods

```java
toList()

toSet()

joining()

groupingBy()

counting()

mapping()
```

---

# Stream vs Collection

| Collection | Stream |
|------------|---------|
| Stores data | Processes data |
| Can modify data | Read-only processing |
| Reusable | Cannot be reused |

---

# Common Functional Interfaces

| Interface | Purpose |
|------------|----------|
| Predicate | Condition Checking |
| Function | Transformation |
| Consumer | Consumes Data |
| Supplier | Produces Data |

---

# Java 8 in Spring Boot

Common Uses

- Stream API
- Optional
- Lambda Expressions
- Method References
- CompletableFuture
- Functional Interfaces

Widely used in

- Service Layer
- Repository Layer
- Data Processing
- REST APIs

---

# Best Practices

- Prefer Stream API for collection processing.
- Avoid modifying collections inside streams.
- Use Optional to avoid null checks.
- Use method references where possible.
- Keep lambda expressions simple.
- Use parallel streams only when beneficial.

---

# Common Mistakes

- Overusing Streams
- Calling get() on Optional without checking
- Using parallelStream() unnecessarily
- Writing long lambda expressions
- Reusing consumed streams
- Ignoring stream laziness

---

# Real World Use Cases

- Spring Boot Services
- Data Filtering
- Report Generation
- REST API Responses
- Database Query Results
- Log Processing
- Batch Processing
- Analytics

---

# Common Interview Questions

- What are Java 8 features?
- What is Lambda Expression?
- What is a Functional Interface?
- Why use Stream API?
- map() vs filter()?
- Stream vs Collection?
- Intermediate vs Terminal Operations?
- Optional vs null?
- Default Method vs Static Method?
- What is Method Reference?
- Sequential Stream vs Parallel Stream?
- What is CompletableFuture?

---

# Revision Checklist

- Lambda Expressions
- Functional Interface
- Predicate
- Function
- Consumer
- Supplier
- Method Reference
- Stream API
- Stream Operations
- map()
- filter()
- collect()
- Optional
- Default Methods
- Static Methods
- Date & Time API
- CompletableFuture

---

# Summary

Java 8 introduced functional programming features that significantly improved Java development. Features such as Lambda Expressions, Stream API, Optional, Method References, and the Date & Time API enable developers to write cleaner, more concise, and efficient code. These features are extensively used in Spring Boot, enterprise applications, and modern Java backend development.