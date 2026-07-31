# Computer Science Cheat Sheet

Quick revision guide for Computer Science fundamentals and interviews.

---

# 1. Computer Fundamentals


## Computer Architecture


Basic Flow:

```
Input
  |
  ↓
Processing
  |
  ↓
Output
```


Main Components:

- CPU
- Memory
- Storage
- Input Devices
- Output Devices


---

# 2. CPU Architecture


## CPU Components


### ALU (Arithmetic Logic Unit)

Performs:

- Arithmetic operations
- Logical operations


### Control Unit

Controls execution of instructions.


### Registers

Small, fast memory inside CPU.


Examples:

- Program Counter
- Instruction Register
- Accumulator


---

# 3. Memory Hierarchy


Fastest to Slowest:


```
Registers

↓

Cache

↓

RAM

↓

SSD/HDD
```


## Cache Memory

- High speed memory
- Stores frequently used data


Levels:

- L1 Cache
- L2 Cache
- L3 Cache


---

# 4. Operating System


## What is OS?


Operating System manages hardware and software resources.


Examples:

- Windows
- Linux
- macOS


---

# OS Responsibilities


- Process Management
- Memory Management
- File Management
- Device Management
- Security


---

# 5. Process Management


## Program vs Process


Program:

Inactive set of instructions.


Process:

Program currently executing.


---

# Process States


```
New

↓

Ready

↓

Running

↓

Waiting

↓

Terminated
```


---

# Process Control Block (PCB)


Stores process information:


- Process ID
- Process State
- Program Counter
- CPU Registers
- Memory Information


---

# 6. Threads


Thread:

Smallest unit of execution inside a process.


Benefits:

- Faster execution
- Resource sharing
- Better responsiveness


---

# Process vs Thread


| Process | Thread |
|-|-|
| Independent execution | Inside process |
| More memory | Less memory |
| Slow communication | Fast communication |


---

# 7. CPU Scheduling


Used to decide which process gets CPU.


## Scheduling Algorithms


## FCFS

First Come First Serve.

- Simple
- Non-preemptive


## SJF

Shortest Job First.

- Minimum waiting time


## Round Robin

- Time slice based
- Used in multitasking


## Priority Scheduling

Higher priority process executes first.


---

# 8. Deadlock


Deadlock:

Situation where processes wait forever for resources.


## Four Conditions


1. Mutual Exclusion

Only one process uses resource.


2. Hold and Wait

Process holds one resource while waiting for another.


3. No Preemption

Resource cannot be forcibly removed.


4. Circular Wait

Processes wait in circular order.


---

# Deadlock Prevention


Methods:

- Resource ordering
- Avoid unnecessary locks
- Deadlock detection


---

# 9. Memory Management


## RAM


Temporary storage used during execution.


## Virtual Memory


Uses disk space as extension of RAM.


Benefits:

- Runs larger programs
- Better multitasking


---

# Paging


Memory divided into fixed-size blocks.


Physical memory:

Frames


Logical memory:

Pages


---

# Segmentation


Memory divided based on logical sections.


Examples:

- Code
- Stack
- Data


---

# 10. Database Management System (DBMS)


DBMS:

Software used to store and manage data.


Examples:

- MySQL
- PostgreSQL
- Oracle


---

# DBMS Advantages


- Data security
- Data consistency
- Reduced redundancy
- Backup and recovery


---

# 11. Database Concepts


## Table

Collection of rows and columns.


## Row

Single record.


## Column

Attribute of data.


---

# Keys


## Primary Key

- Unique identifier
- Cannot contain NULL


## Foreign Key

- References another table


## Candidate Key

Possible primary key.


## Composite Key

Combination of multiple columns.


---

# 12. Normalization


Process of organizing database.


Goals:

- Remove redundancy
- Improve consistency


Normal Forms:


## 1NF

Atomic values.


## 2NF

Remove partial dependency.


## 3NF

Remove transitive dependency.


---

# 13. SQL Basics


## DDL


Defines database structure.


Commands:

```
CREATE
ALTER
DROP
```


## DML


Manipulates data.


Commands:

```
INSERT
UPDATE
DELETE
```


## DQL


Retrieves data.


```
SELECT
```


## TCL


Transaction control.


```
COMMIT
ROLLBACK
```


---

# 14. Transactions


Transaction:

Collection of database operations.


## ACID Properties


## Atomicity

All operations complete or none.


## Consistency

Database remains valid.


## Isolation

Transactions execute independently.


## Durability

Committed data remains saved.


---

# 15. Indexing


Index:

Data structure used for faster searching.


Advantages:

- Faster queries


Disadvantages:

- Extra storage
- Slower inserts


---

# 16. Operating System File System


File System manages:

- Files
- Directories
- Storage allocation


Examples:

- NTFS
- FAT32
- EXT4


---

# 17. Computer Networks


Network:

Connection between devices to exchange data.


---

# Network Types


LAN

Local Area Network


MAN

Metropolitan Area Network


WAN

Wide Area Network


---

# 18. OSI Model


7 Layers:


```
7 Application

6 Presentation

5 Session

4 Transport

3 Network

2 Data Link

1 Physical
```


---

# Layer Functions


## Application

User applications.


Protocols:

HTTP
FTP
SMTP


## Presentation

Data formatting and encryption.


## Session

Manages sessions.


## Transport

Reliable communication.


Protocols:

TCP
UDP


## Network

Routing.


Protocol:

IP


## Data Link

MAC addressing.


## Physical

Transmission of bits.


---

# 19. TCP vs UDP


| TCP | UDP |
|-|-|
| Connection oriented | Connectionless |
| Reliable | Faster |
| Slower | Faster |
| Error checking | Less checking |


Examples:


TCP:

- HTTP
- HTTPS
- FTP


UDP:

- Gaming
- Streaming
- DNS


---

# 20. HTTP and HTTPS


HTTP:

Protocol for communication between browser and server.


HTTPS:

Secure HTTP using encryption.


---

# HTTP Methods


GET

Retrieve data.


POST

Create data.


PUT

Update data.


DELETE

Remove data.


---

# 21. IP Address


Identifier of device on network.


Types:


IPv4

32-bit address.


IPv6

128-bit address.


---

# 22. DNS


Domain Name System.


Converts:

```
google.com

↓

IP Address
```


---

# 23. Compiler


Compiler:

Converts high-level code into machine code.


Stages:


```
Source Code

↓

Lexical Analysis

↓

Syntax Analysis

↓

Semantic Analysis

↓

Optimization

↓

Code Generation
```


---


# 24. Algorithms Basics


## Time Complexity


Measures algorithm efficiency.


Common:


```
O(1)

O(log n)

O(n)

O(n log n)

O(n²)
```


---

# Searching Algorithms


## Linear Search

Checks each element.


Time:

O(n)


## Binary Search

Works on sorted data.


Time:

O(log n)


---

# Sorting Algorithms


## Bubble Sort

O(n²)


## Selection Sort

O(n²)


## Insertion Sort

O(n²)


## Merge Sort

O(n log n)


## Quick Sort

Average:

O(n log n)


---

# 25. Object Oriented Design Basics


Important Concepts:


## SOLID Principles


S

Single Responsibility


O

Open Closed


L

Liskov Substitution


I

Interface Segregation


D

Dependency Inversion


---

# 26. Software Engineering


## SDLC


Software Development Life Cycle:


```
Requirement

↓

Design

↓

Development

↓

Testing

↓

Deployment

↓

Maintenance
```


---

# Software Testing


Types:


Unit Testing

Tests individual components.


Integration Testing

Tests combined modules.


System Testing

Tests complete system.


---

# 27. Security Basics


## Authentication

Verifying identity.


Example:

Username + Password


## Authorization

Checking permissions.


---

# Encryption


Converts readable data into unreadable format.


Types:


Symmetric Encryption:

Same key for encryption and decryption.


Asymmetric Encryption:

Public key + Private key.


---

# Hashing


One-way conversion of data.


Used for:

- Password storage
- Data integrity


---

# 28. System Design Basics


## Client Server Architecture


```
Client

↓

Server

↓

Database
```


---

# Load Balancer


Distributes traffic among servers.


Benefits:

- High availability
- Better performance


---

# Cache


Stores frequently accessed data.


Examples:

- Redis
- Memcached


---

# Database Scaling


## Vertical Scaling

Increase server power.


## Horizontal Scaling

Add more servers.


---

# 29. Important Interview Questions


## Difference between Process and Thread?

Process is an independent program execution.

Thread is a lightweight execution unit inside process.


## Difference between TCP and UDP?

TCP is reliable but slower.

UDP is faster but unreliable.


## Difference between Primary Key and Foreign Key?

Primary key uniquely identifies record.

Foreign key connects tables.


## What is Deadlock?

Situation where processes wait forever for resources.


## Difference between Compiler and Interpreter?

Compiler translates complete program.

Interpreter translates line by line.


## What is Normalization?

Organizing database to reduce redundancy.


## What is Virtual Memory?

Using disk space as additional memory.


---

# Computer Science Quick Revision Checklist


## Operating System

✓ Process  
✓ Thread  
✓ Scheduling  
✓ Deadlock  
✓ Memory Management  


## DBMS

✓ Keys  
✓ Normalization  
✓ Transactions  
✓ Indexing  
✓ SQL  


## Networks

✓ OSI Model  
✓ TCP/UDP  
✓ HTTP  
✓ DNS  
✓ IP  


## Software Engineering

✓ SDLC  
✓ Testing  
✓ SOLID Principles  


## Security

✓ Authentication  
✓ Authorization  
✓ Encryption  
✓ Hashing