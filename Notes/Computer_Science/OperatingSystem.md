# 💻 Operating System

## 🎯 Definition

An Operating System (OS) is system software that acts as an interface between the user and computer hardware while managing system resources efficiently.

---

## ⭐ Responsibilities

- CPU Management
- Process Management
- Memory Management
- File Management
- Device Management
- I/O Management
- Security
- Resource Allocation

---

## 📌 Program vs Process

### 📄 Program

- Collection of instructions
- Stored in Secondary Memory (Disk)
- Passive entity
- Not executing

### ⚙️ Process

- Program in execution
- Stored in Main Memory (RAM)
- Active entity
- Has its own execution state

---

## 📌 Process vs Thread

### ⚙️ Process

- Independent execution unit
- Own memory space
- Heavyweight
- Expensive context switching

### 🧵 Thread

- Smallest unit of execution
- Shares process resources
- Lightweight
- Faster execution

---

## 📌 Why are Threads Lightweight?

Threads share:

- Heap Memory
- Code Segment
- Open Files

Each thread has its own:

- Stack
- Program Counter
- Registers

---

## 📌 Process Control Block (PCB)

PCB stores information about every process.

Contains:

- Process ID (PID)
- Process State
- Program Counter
- CPU Registers
- CPU Scheduling Information
- Memory Information
- I/O Information

---

## 📌 Context Switching

### Definition

Saving the state of one process and restoring another.

### Why is it expensive?

- Saving Registers
- Saving Program Counter
- Loading Next Process
- CPU performs no useful work during switching

---

## 📌 Process States

🆕 New

⬇️

🟢 Ready

⬇️

🏃 Running

↙️     ↘️

⏳ Waiting     ✅ Terminated

### 🟢 Ready

- Waiting for CPU allocation

### ⏳ Waiting

- Waiting for I/O or external event

---

## 📌 CPU Scheduling

CPU Scheduling decides which process gets CPU time.

---

## 📌 FCFS (First Come First Serve)

### Features

- Non Preemptive
- Based on Arrival Time

### Advantages

- Simple
- Easy to Implement

### Disadvantages

- Convoy Effect
- High Waiting Time

---

## 📌 SJF (Shortest Job First)

### Features

- Non Preemptive
- Executes Shortest Burst Time First

### Advantages

- Minimum Average Waiting Time

### Disadvantages

- Starvation
- Burst Time difficult to predict

---

## 📌 Round Robin

### Features

- Preemptive
- Uses Time Quantum

### Advantages

- Fair Scheduling
- Better Response Time

### Disadvantages

- Large Time Quantum → FCFS
- Small Time Quantum → More Context Switching

---

## 📌 Preemptive vs Non Preemptive

### 🟢 Preemptive

- CPU can be taken back
- Better responsiveness

Examples:

- Round Robin
- Priority Scheduling

### 🔵 Non Preemptive

- Process keeps CPU until completion or blocking

Examples:

- FCFS
- SJF

---

## 🎤 Interview Questions

- What is an Operating System?
- Program vs Process?
- Process vs Thread?
- Why are Threads Lightweight?
- What is PCB?
- What is Context Switching?
- Why is Context Switching expensive?
- Explain Process States.
- FCFS vs SJF.
- Why is SJF difficult?
- Explain Round Robin.
- What happens if Time Quantum is too large or too small?
- Preemptive vs Non Preemptive?

---

## 🚀 Best Practices

✅ Understand process life cycle.

✅ Learn scheduling algorithms with examples.

✅ Focus on interview scenarios instead of definitions.

✅ Practice numerical scheduling problems.
