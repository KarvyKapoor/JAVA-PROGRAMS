# ☕ Java Virtual Machine (JVM)

> Quick revision notes covering JVM internals for interviews and backend development.

---

# What is JVM?

The Java Virtual Machine (JVM) is an abstract machine that executes Java Bytecode and converts it into machine code.

It enables Java programs to run on any platform without recompilation.

---

# Why JVM?

Without JVM

- Platform dependent applications
- No automatic memory management
- No bytecode execution

With JVM

- Platform independence
- Automatic Garbage Collection
- Memory Management
- Security
- Performance Optimization (JIT Compiler)

---

# Java Execution Flow

```text
Java Source Code (.java)
           │
           ▼
      Java Compiler (javac)
           │
           ▼
      Bytecode (.class)
           │
           ▼
            JVM
           │
           ▼
      Machine Code
           │
           ▼
      Operating System
```

---

# JDK vs JRE vs JVM

| Component | Purpose |
|------------|----------|
| JDK | Development Kit (Compiler + JRE + Tools) |
| JRE | Runtime Environment |
| JVM | Executes Bytecode |

Relationship

```text
JDK
│
└── JRE
      │
      └── JVM
```

---

# JVM Architecture

```text
                 JVM
                  │
 ┌────────────────────────────────────┐
 │          Class Loader              │
 ├────────────────────────────────────┤
 │ Runtime Data Areas                 │
 │  • Method Area                     │
 │  • Heap                            │
 │  • Java Stack                      │
 │  • PC Register                     │
 │  • Native Method Stack             │
 ├────────────────────────────────────┤
 │ Execution Engine                   │
 │  • Interpreter                     │
 │  • JIT Compiler                    │
 │  • Garbage Collector               │
 ├────────────────────────────────────┤
 │ JNI (Java Native Interface)        │
 ├────────────────────────────────────┤
 │ Native Libraries                   │
 └────────────────────────────────────┘
```

---

# Class Loader

Loads `.class` files into memory.

Responsibilities

- Load Classes
- Link Classes
- Initialize Classes

---

# Class Loading Process

```text
Loading
     ↓
Linking
     ↓
Initialization
```

---

## Linking

Contains

- Verification
- Preparation
- Resolution

---

# Runtime Data Areas

## Method Area

Stores

- Class Metadata
- Static Variables
- Runtime Constant Pool
- Method Information

Shared among all threads.

---

## Heap Memory

Stores

- Objects
- Arrays

Features

- Largest memory area
- Shared among threads
- Managed by Garbage Collector

---

## Java Stack

Stores

- Local Variables
- Method Calls
- References

Each thread has its own stack.

---

## Program Counter (PC) Register

Stores the address of the currently executing instruction.

Each thread has its own PC Register.

---

## Native Method Stack

Stores native (C/C++) method execution.

Used with JNI.

---

# Execution Engine

Responsible for executing bytecode.

Components

- Interpreter
- JIT Compiler
- Garbage Collector

---

# Interpreter

Executes bytecode line by line.

Advantages

- Starts quickly

Disadvantages

- Slower execution

---

# JIT Compiler

Just-In-Time Compiler converts frequently executed bytecode into native machine code.

Advantages

- Faster execution
- Better performance

---

# Interpreter vs JIT Compiler

| Interpreter | JIT Compiler |
|--------------|--------------|
| Executes line by line | Compiles bytecode into machine code |
| Slower | Faster |
| Lower startup cost | Better long-term performance |

---

# Garbage Collector (GC)

Automatically removes unused objects from heap memory.

Purpose

- Free memory
- Prevent memory leaks
- Improve application stability

---

# Types of Garbage Collectors

- Serial GC
- Parallel GC
- G1 GC
- ZGC
- Shenandoah GC

---

# Garbage Collection Process

```text
Create Object
      │
Object Becomes Unreachable
      │
Garbage Collector Detects
      │
Memory Reclaimed
```

---

# JVM Memory Areas

| Memory Area | Stores |
|--------------|--------|
| Heap | Objects & Arrays |
| Stack | Local Variables & Method Calls |
| Method Area | Class Information |
| PC Register | Current Instruction |
| Native Stack | Native Methods |

---

# JVM Languages

JVM supports multiple languages.

Examples

- Java
- Kotlin
- Scala
- Groovy
- Clojure

---

# Java Native Interface (JNI)

Allows Java code to communicate with native languages like C and C++.

Use Cases

- Hardware Access
- OS Features
- Native Libraries

---

# Native Libraries

Platform-specific libraries used through JNI.

Examples

- DLL (Windows)
- SO (Linux)

---

# Common JVM Options

```text
-Xms

-Xmx

-XX:+UseG1GC
```

---

# Best Practices

- Keep objects lightweight.
- Avoid unnecessary object creation.
- Choose appropriate JVM memory settings.
- Monitor Garbage Collection.
- Prefer modern Garbage Collectors for large applications.

---

# Common Mistakes

- Confusing JDK, JRE, and JVM
- Mixing Heap and Stack memory
- Ignoring memory leaks
- Assuming Garbage Collection runs immediately
- Creating unnecessary objects

---

# Real World Use Cases

- Spring Boot Applications
- Banking Systems
- Enterprise Applications
- Android Development
- Big Data Processing
- Cloud Services

---

# Common Interview Questions

- What is JVM?
- JVM vs JRE vs JDK?
- Explain JVM Architecture.
- What is Class Loader?
- What is the Class Loading Process?
- Heap vs Stack?
- What is Method Area?
- What is JIT Compiler?
- Interpreter vs JIT Compiler?
- What is Garbage Collection?
- What is JNI?
- Why is Java platform independent?

---

# Revision Checklist

- JVM
- JDK vs JRE vs JVM
- JVM Architecture
- Class Loader
- Class Loading Process
- Runtime Data Areas
- Heap
- Stack
- Method Area
- PC Register
- Native Method Stack
- Execution Engine
- Interpreter
- JIT Compiler
- Garbage Collection
- JNI
- Native Libraries
- JVM Options

---

# Summary

The Java Virtual Machine (JVM) is the core component responsible for executing Java Bytecode. It provides platform independence, automatic memory management, security, and performance optimization through the Class Loader, Runtime Data Areas, Execution Engine, JIT Compiler, and Garbage Collector. A strong understanding of JVM internals is essential for Java backend development, Spring Boot, and technical interviews.