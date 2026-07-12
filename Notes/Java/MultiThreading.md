# ☕ Java Multithreading

> Quick revision notes covering Java Multithreading for interviews and backend development.

---

# What is Multithreading?

Multithreading is the ability of a program to execute multiple threads concurrently within a single process.

It helps improve application performance and responsiveness.

---

# Why Multithreading?

Without Multithreading

- Slow execution
- Poor CPU utilization
- Blocking operations
- Unresponsive applications

With Multithreading

- Faster execution
- Better CPU utilization
- Concurrent task execution
- Improved responsiveness
- Better scalability

---

# Process vs Thread

| Process | Thread |
|----------|---------|
| Independent program | Smallest execution unit |
| Own memory | Shares process memory |
| Heavyweight | Lightweight |
| Higher creation cost | Lower creation cost |

---

# Thread Lifecycle

```text
New
 │
 ▼
Runnable
 │
 ▼
Running
 │
 ├─────────────┐
 ▼             │
Blocked        │
 │             │
 ▼             │
Runnable ◄─────┘
 │
 ▼
Terminated
```

---

# Creating a Thread

## Extending Thread Class

```java
class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Running");

    }

}
```

---

## Implementing Runnable

```java
class Task implements Runnable {

    @Override
    public void run() {

        System.out.println("Running");

    }

}
```

Preferred because Java supports only single inheritance.

---

# Starting a Thread

```java
Thread t = new Thread(new Task());

t.start();
```

---

# start() vs run()

| start() | run() |
|----------|--------|
| Creates a new thread | Executes in current thread |
| Calls JVM scheduler | Normal method call |
| Concurrent execution | Sequential execution |

---

# Thread Methods

```java
start()

run()

sleep()

join()

yield()

interrupt()

isAlive()
```

---

# sleep()

Pauses the current thread.

```java
Thread.sleep(1000);
```

---

# join()

Waits for another thread to finish.

```java
t.join();
```

---

# yield()

Suggests the scheduler give other threads a chance to execute.

```java
Thread.yield();
```

---

# interrupt()

Interrupts a thread.

```java
t.interrupt();
```

---

# Synchronization

Ensures only one thread accesses a shared resource at a time.

```java
public synchronized void withdraw() {

}
```

Purpose

- Prevent race conditions
- Maintain data consistency

---

# Race Condition

Occurs when multiple threads modify shared data simultaneously.

Example

Two ATM withdrawals updating the same account balance.

---

# synchronized Keyword

Can be applied to

- Methods
- Blocks

Example

```java
synchronized(this){

}
```

---

# Locks

More flexible than synchronized.

Common Class

```java
ReentrantLock
```

Advantages

- Try Lock
- Fair Locking
- Explicit Lock Control

---

# Deadlock

Occurs when two or more threads wait indefinitely for each other.

Example

```text
Thread A → Lock 1 → Waiting for Lock 2

Thread B → Lock 2 → Waiting for Lock 1
```

Avoid by acquiring locks in a consistent order.

---

# Thread Communication

Methods

```java
wait()

notify()

notifyAll()
```

Used for communication between threads.

---

# Producer Consumer Problem

Classic multithreading problem.

```text
Producer

↓

Shared Buffer

↓

Consumer
```

Solved using

- wait()
- notify()
- BlockingQueue

---

# Executor Framework

Preferred way to manage threads.

```java
ExecutorService executor =
Executors.newFixedThreadPool(5);
```

Advantages

- Thread Pooling
- Better Performance
- Easier Management

---

# Thread Pool

A collection of reusable worker threads.

Benefits

- Reduced thread creation cost
- Better resource utilization
- Improved scalability

---

# Callable

Returns a value and can throw exceptions.

```java
Callable<Integer>
```

Executed using

```java
ExecutorService
```

---

# Future

Represents the result of an asynchronous computation.

```java
Future<Integer> future;
```

Methods

```java
get()

isDone()

cancel()
```

---

# CompletableFuture

Supports asynchronous programming.

Example

```java
CompletableFuture.supplyAsync(() -> {

    return "Hello";

});
```

Advantages

- Non-blocking
- Async execution
- Better scalability

---

# volatile Keyword

Ensures visibility of variable updates across threads.

```java
volatile boolean running;
```

Does **not** provide synchronization.

---

# Atomic Classes

Thread-safe operations without explicit locking.

Examples

```java
AtomicInteger

AtomicLong

AtomicBoolean
```

---

# Concurrent Collections

Designed for multithreaded applications.

Examples

```java
ConcurrentHashMap

CopyOnWriteArrayList

BlockingQueue
```

---

# synchronized vs Lock

| synchronized | Lock |
|--------------|------|
| Keyword | Interface |
| Automatic lock release | Manual lock release |
| Less flexible | More flexible |
| Simpler | Advanced features |

---

# Thread States

- NEW
- RUNNABLE
- BLOCKED
- WAITING
- TIMED_WAITING
- TERMINATED

---

# Best Practices

- Prefer ExecutorService over creating threads manually.
- Keep synchronized blocks small.
- Avoid shared mutable state.
- Use concurrent collections.
- Use Atomic classes for counters.
- Shut down ExecutorService properly.

---

# Common Mistakes

- Calling `run()` instead of `start()`
- Synchronizing unnecessary code
- Ignoring thread safety
- Forgetting to release locks
- Creating too many threads
- Sharing mutable data without synchronization

---

# Multithreading in Spring Boot

Common Uses

- Async APIs
- Background Jobs
- Email Notifications
- File Processing
- Batch Processing
- Scheduled Tasks

Useful Annotations

```java
@Async

@Scheduled
```

---

# Real World Use Cases

- Payment Processing
- Banking Systems
- Chat Applications
- Video Streaming
- E-commerce Platforms
- Notification Services
- File Upload Services
- Microservices

---

# Common Interview Questions

- What is Multithreading?
- Process vs Thread?
- Thread vs Runnable?
- start() vs run()?
- What is Synchronization?
- What is a Race Condition?
- What is Deadlock?
- synchronized vs Lock?
- What is volatile?
- What are Atomic classes?
- What is ExecutorService?
- What is Thread Pool?
- Callable vs Runnable?
- Future vs CompletableFuture?
- Why is ConcurrentHashMap thread-safe?

---

# Revision Checklist

- Process vs Thread
- Thread Lifecycle
- Thread Creation
- Runnable
- Thread Class
- start() vs run()
- sleep()
- join()
- yield()
- interrupt()
- Synchronization
- Race Condition
- Deadlock
- wait()
- notify()
- ExecutorService
- Thread Pool
- Callable
- Future
- CompletableFuture
- volatile
- Atomic Classes
- Concurrent Collections

---

# Summary

Java Multithreading enables multiple tasks to execute concurrently, improving performance, responsiveness, and scalability. Modern Java applications rely on the **Executor Framework**, **Thread Pools**, **CompletableFuture**, **Concurrent Collections**, and **Atomic Classes** instead of manually managing threads. A solid understanding of multithreading is essential for building high-performance Spring Boot applications and is a frequently tested topic in Java backend interviews.