# ☕ Java Memory Management

> Quick revision notes covering Java Memory Management for interviews and backend development.

---

# What is Memory Management?

Memory Management is the process of allocating, using, and releasing memory efficiently during program execution.

In Java, memory management is handled automatically by the **JVM** using the **Garbage Collector (GC)**.

---

# Why Memory Management?

Without Memory Management

- Memory leaks
- Application crashes
- Poor performance
- Manual memory allocation

With Memory Management

- Automatic memory allocation
- Automatic memory cleanup
- Better performance
- Improved application stability

---

# JVM Memory Structure

```text
                 JVM Memory

        ┌──────────────────────┐
        │     Method Area      │
        └──────────────────────┘

        ┌──────────────────────┐
        │        Heap          │
        └──────────────────────┘

        ┌──────────────────────┐
        │       Stack          │
        └──────────────────────┘

        ┌──────────────────────┐
        │    PC Register       │
        └──────────────────────┘

        ┌──────────────────────┐
        │ Native Method Stack  │
        └──────────────────────┘
```

---

# Heap Memory

Stores

- Objects
- Arrays

Characteristics

- Shared among all threads
- Managed by Garbage Collector
- Largest memory area

Example

```java
Student s = new Student();
```

The object is stored in the Heap.

---

# Stack Memory

Stores

- Local Variables
- Method Calls
- References

Characteristics

- Thread-specific
- Automatically managed
- Faster than Heap

Example

```java
int age = 20;
```

Stored in Stack Memory.

---

# Heap vs Stack

| Heap | Stack |
|------|--------|
| Stores Objects | Stores Local Variables |
| Shared | Thread Specific |
| Managed by GC | Automatically cleared |
| Slower | Faster |
| Larger Memory | Smaller Memory |

---

# Method Area

Stores

- Class Metadata
- Static Variables
- Runtime Constant Pool
- Method Information

Shared among all threads.

---

# Program Counter (PC) Register

Stores the address of the current JVM instruction being executed.

Each thread has its own PC Register.

---

# Native Method Stack

Stores execution information for native methods written in languages like C and C++.

---

# Object Lifecycle

```text
Object Created
        │
Object Used
        │
No References Left
        │
Eligible for GC
        │
Garbage Collected
```

---

# Garbage Collection (GC)

Garbage Collection automatically removes objects that are no longer reachable.

Purpose

- Free memory
- Prevent memory leaks
- Improve application performance

---

# How Garbage Collection Works

```text
Create Object
      │
Reference Removed
      │
Object Becomes Unreachable
      │
Garbage Collector Detects
      │
Memory Reclaimed
```

---

# Types of Garbage Collectors

- Serial GC
- Parallel GC
- G1 GC
- ZGC
- Shenandoah GC

---

# Minor GC

Collects objects from the Young Generation.

Fast and frequent.

---

# Major GC

Collects objects from the Old Generation.

Slower than Minor GC.

---

# Full GC

Collects the entire Heap.

Can temporarily pause the application.

Should be minimized.

---

# Generational Heap

```text
Heap
│
├── Young Generation
│   ├── Eden Space
│   ├── Survivor S0
│   └── Survivor S1
│
└── Old Generation
```

Objects usually start in the **Young Generation**.

Long-lived objects are promoted to the **Old Generation**.

---

# Memory Leaks

Occurs when objects are no longer needed but are still referenced.

Example

```java
List<Object> list = new ArrayList<>();

while(true){

    list.add(new Object());

}
```

The list keeps references, preventing Garbage Collection.

---

# Common Causes of Memory Leaks

- Static Collections
- Unclosed Resources
- Listener Objects
- Long-lived References
- Caching without limits

---

# finalize()

```java
protected void finalize()
```

Called before an object is garbage collected.

⚠ Deprecated in modern Java.

Do not use in new applications.

---

# System.gc()

```java
System.gc();
```

Requests Garbage Collection.

The JVM may ignore the request.

---

# Java References

## Strong Reference

Default reference type.

```java
Student s = new Student();
```

Object cannot be garbage collected while strongly referenced.

---

## Weak Reference

Object can be garbage collected when memory is needed.

```java
WeakReference<Student>
```

Used in caches.

---

## Soft Reference

Collected only when JVM needs memory.

```java
SoftReference<Student>
```

Useful for memory-sensitive caches.

---

## Phantom Reference

Used for advanced memory management and cleanup.

Rarely used in normal applications.

---

# JVM Memory Options

Initial Heap Size

```text
-Xms
```

Maximum Heap Size

```text
-Xmx
```

Example

```text
-Xms512m
-Xmx2g
```

---

# Best Practices

- Avoid unnecessary object creation.
- Close resources properly.
- Use try-with-resources.
- Avoid memory leaks.
- Monitor Heap usage.
- Prefer immutable objects when possible.
- Choose appropriate data structures.

---

# Common Mistakes

- Assuming `System.gc()` guarantees GC
- Confusing Heap and Stack
- Forgetting to close resources
- Keeping unnecessary object references
- Creating excessive temporary objects
- Ignoring memory profiling

---

# Real World Use Cases

- Spring Boot Applications
- Banking Systems
- REST APIs
- High Traffic Web Applications
- Microservices
- Enterprise Software
- Large Scale Data Processing

---

# Common Interview Questions

- What is Java Memory Management?
- Heap vs Stack?
- What is Garbage Collection?
- Explain Minor GC, Major GC, and Full GC.
- What causes memory leaks?
- What are Strong, Weak, Soft, and Phantom References?
- What is finalize()?
- Does `System.gc()` force Garbage Collection?
- What is the Young Generation?
- What is the Old Generation?
- Why is Java considered memory safe?

---

# Revision Checklist

- JVM Memory Structure
- Heap Memory
- Stack Memory
- Method Area
- PC Register
- Native Method Stack
- Object Lifecycle
- Garbage Collection
- Minor GC
- Major GC
- Full GC
- Young Generation
- Old Generation
- Memory Leaks
- Strong Reference
- Weak Reference
- Soft Reference
- Phantom Reference
- JVM Memory Options

---

# Summary

Java Memory Management is handled automatically by the JVM through efficient memory allocation and Garbage Collection. Understanding Heap, Stack, object lifecycle, Garbage Collection, memory leaks, and reference types is essential for writing high-performance, scalable, and production-ready Java applications. These concepts are frequently tested in Java interviews and are fundamental for backend development with Spring Boot.