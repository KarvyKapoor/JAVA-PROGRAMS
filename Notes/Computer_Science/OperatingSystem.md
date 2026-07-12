# 🖥️ Operating System (OS)

> Quick revision notes covering Operating Systems for interviews and backend development.

---

# What is an Operating System?

An Operating System (OS) is system software that acts as an interface between the user, applications, and computer hardware.

It manages hardware resources and provides services required for application execution.

---

# Why Operating System?

Without an OS

- No user interface
- No process management
- No memory management
- No file management
- Programs cannot efficiently use hardware

With an OS

- Resource management
- Multitasking
- Security
- File management
- Device management
- Process scheduling

---

# Operating System Architecture

```text
+----------------------+
|      User            |
+----------------------+
          │
+----------------------+
|   Application Layer  |
+----------------------+
          │
+----------------------+
|   Operating System   |
+----------------------+
          │
+----------------------+
|      Hardware        |
+----------------------+
```

---

# Functions of Operating System

- Process Management
- Memory Management
- File Management
- Device Management
- CPU Scheduling
- Security
- Networking
- Resource Allocation

---

# Types of Operating Systems

- Batch OS
- Time Sharing OS
- Distributed OS
- Network OS
- Real Time OS
- Embedded OS
- Mobile OS

---

# Kernel

The Kernel is the core component of an Operating System.

Responsibilities

- Process Management
- Memory Management
- Device Management
- File System Management
- System Calls

---

# User Mode vs Kernel Mode

| User Mode | Kernel Mode |
|------------|-------------|
| Limited access | Full hardware access |
| Runs applications | Runs OS code |
| Safe | Privileged |

---

# Process

A process is a program in execution.

Contains

- Program Code
- Program Counter
- Registers
- Stack
- Heap
- Open Files

Example

Running Chrome

Running IntelliJ IDEA

Running Spring Boot Application

---

# Process States

```text
New
 │
 ▼
Ready
 │
 ▼
Running
 │
 ├───────────┐
 ▼           │
Waiting      │
 │           │
 ▼           │
Ready ◄──────┘
 │
 ▼
Terminated
```

---

# Thread

A thread is the smallest unit of execution inside a process.

A process may contain multiple threads.

Example

Spring Boot

- Request Thread
- Database Thread
- Logging Thread

---

# Process vs Thread

| Process | Thread |
|----------|---------|
| Independent | Part of Process |
| Separate Memory | Shared Memory |
| Heavyweight | Lightweight |
| Slower | Faster |

---

# CPU Scheduling

CPU Scheduling decides which process gets CPU time.

Goals

- Maximum CPU Utilization
- Minimum Waiting Time
- Fairness
- High Throughput

---

# Scheduling Algorithms

## FCFS

First Come First Serve

Advantages

- Simple

Disadvantages

- Convoy Effect
- Long Waiting Time

---

## SJF

Shortest Job First

Advantages

- Minimum Average Waiting Time

Disadvantages

- Starvation

---

## Round Robin

Each process gets a fixed time slice.

Advantages

- Fair Scheduling
- Responsive

Used in modern operating systems.

---

## Priority Scheduling

Higher priority executes first.

Problem

Starvation

Solution

Aging

---

# Context Switching

Switching CPU from one process/thread to another.

Steps

- Save current state
- Load new process state
- Resume execution

Frequent context switching reduces performance.

---

# Memory Management

Responsible for allocating and deallocating memory.

Goals

- Efficient Memory Usage
- Isolation
- Protection

---

# Virtual Memory

Allows execution of programs larger than physical RAM.

Uses

- Paging
- Swapping

Advantages

- Better memory utilization
- Large program support

---

# Paging

Divides

Process → Pages

Memory → Frames

Advantages

- Eliminates external fragmentation

---

# Segmentation

Memory divided according to logical units.

Examples

- Code
- Data
- Stack

---

# Paging vs Segmentation

| Paging | Segmentation |
|----------|-------------|
| Fixed Size | Variable Size |
| Physical View | Logical View |
| Faster Allocation | Easier Program Organization |

---

# Fragmentation

## Internal Fragmentation

Unused space inside allocated memory.

---

## External Fragmentation

Free memory exists but is scattered.

---

# Deadlock

Occurs when processes wait indefinitely for resources.

Conditions

- Mutual Exclusion
- Hold and Wait
- No Preemption
- Circular Wait

---

# Deadlock Prevention

- Resource Ordering
- Resource Allocation
- Timeout
- Avoid Circular Wait

---

# Starvation

A process never gets CPU because others continuously receive priority.

Solution

Aging

---

# Synchronization

Ensures multiple processes or threads safely access shared resources.

Mechanisms

- Mutex
- Semaphore
- Monitor

---

# Semaphore

Synchronization mechanism.

Types

- Binary Semaphore
- Counting Semaphore

---

# Mutex

Allows only one thread to access a resource.

---

# Critical Section

Part of code accessing shared resources.

Only one thread should execute it at a time.

---

# Inter Process Communication (IPC)

Processes communicate using

- Pipes
- Shared Memory
- Message Queues
- Sockets

---

# File System

Organizes files on storage devices.

Operations

- Create
- Read
- Write
- Delete
- Rename

---

# System Call

A request from a user program to the Operating System.

Examples

- open()
- read()
- write()
- fork()
- exec()

---

# Booting Process

```text
Power On

↓

BIOS / UEFI

↓

Boot Loader

↓

Kernel Loaded

↓

Operating System Starts

↓

Applications Launch
```

---

# Cache Memory

Stores frequently accessed data.

Levels

- L1
- L2
- L3

Faster than RAM.

---

# Interrupt

Signal sent to CPU requesting immediate attention.

Types

- Hardware Interrupt
- Software Interrupt

---

# Common OS Used by Developers

- Linux
- Windows
- macOS

Backend servers mostly run Linux.

---

# Operating System in Spring Boot

OS manages

- Threads
- Memory
- File System
- Networking
- CPU Scheduling
- Socket Connections

Every Spring Boot application ultimately relies on the operating system.

---

# Best Practices

- Minimize unnecessary processes.
- Avoid deadlocks.
- Reduce context switching.
- Use multithreading wisely.
- Monitor memory usage.
- Close resources properly.

---

# Common Mistakes

- Confusing Process with Thread
- Heap vs Stack confusion
- Deadlock vs Starvation
- Paging vs Segmentation
- Internal vs External Fragmentation

---

# Real World Use Cases

- Web Servers
- Cloud Computing
- Banking Systems
- Database Servers
- Docker Containers
- Kubernetes Nodes
- Android
- Linux Servers

---

# Common Interview Questions

- What is an Operating System?
- Process vs Thread?
- What is Context Switching?
- What is Virtual Memory?
- What is Paging?
- What is Segmentation?
- What is Deadlock?
- Deadlock Conditions?
- Semaphore vs Mutex?
- What is Starvation?
- FCFS vs Round Robin?
- User Mode vs Kernel Mode?
- What are System Calls?
- Explain Process Lifecycle.

---

# Revision Checklist

- Operating System
- Kernel
- Process
- Thread
- Process States
- CPU Scheduling
- FCFS
- SJF
- Round Robin
- Priority Scheduling
- Context Switching
- Memory Management
- Virtual Memory
- Paging
- Segmentation
- Fragmentation
- Deadlock
- Starvation
- Synchronization
- Semaphore
- Mutex
- IPC
- File System
- System Calls
- Booting
- Cache Memory
- Interrupts

---

# Summary

An Operating System is the backbone of every computer system, responsible for managing hardware resources and providing services to applications. Understanding processes, threads, memory management, scheduling, synchronization, and deadlocks is essential for Java backend engineers, as these concepts directly impact application performance, scalability, and reliability. Operating System concepts are among the most frequently asked topics in software engineering interviews.