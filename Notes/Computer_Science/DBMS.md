# 🗄️ Database Management System (DBMS)

> Quick revision notes covering DBMS for interviews and backend development.

---

# What is DBMS?

A Database Management System (DBMS) is software used to create, store, retrieve, update, and manage data efficiently.

Examples

- MySQL
- PostgreSQL
- Oracle Database
- SQL Server
- SQLite

---

# Why DBMS?

Without DBMS

- Data redundancy
- Data inconsistency
- Difficult data retrieval
- Poor security
- No concurrency control

With DBMS

- Organized storage
- Efficient querying
- Security
- Backup & Recovery
- Concurrent access
- Data Integrity

---

# Database Architecture

```text
Application
      │
      ▼
      DBMS
      │
      ▼
Database Files
```

---

# Types of Databases

- Relational Database (RDBMS)
- NoSQL Database
- Object-Oriented Database
- Distributed Database
- Cloud Database

---

# RDBMS

Stores data in tables consisting of rows and columns.

Examples

- MySQL
- PostgreSQL
- Oracle

---

# Table

A collection of related data.

Example

```text
Student

ID | Name | Age
```

---

# Row (Record)

Represents one data entry.

---

# Column (Attribute)

Represents one property of data.

---

# Primary Key

Uniquely identifies each record.

Properties

- Unique
- Not Null

Example

```text
StudentID
```

---

# Foreign Key

Creates relationships between tables.

Example

```text
Student

DepartmentID
```

---

# Candidate Key

A column that can uniquely identify a row.

One candidate key becomes the Primary Key.

---

# Composite Key

Combination of two or more columns forming a unique key.

---

# Super Key

A set of attributes that uniquely identifies a row.

---

# Constraints

- Primary Key
- Foreign Key
- Unique
- Not Null
- Check
- Default

---

# SQL Categories

## DDL

Database structure.

Commands

```sql
CREATE

ALTER

DROP

TRUNCATE
```

---

## DML

Manipulates data.

Commands

```sql
INSERT

UPDATE

DELETE
```

---

## DQL

Retrieves data.

```sql
SELECT
```

---

## DCL

Access control.

Commands

```sql
GRANT

REVOKE
```

---

## TCL

Transaction control.

Commands

```sql
COMMIT

ROLLBACK

SAVEPOINT
```

---

# Normalization

Organizing data to reduce redundancy.

Advantages

- Less duplication
- Better consistency
- Easier maintenance

---

# Normal Forms

## 1NF

- Atomic values
- No repeating groups

---

## 2NF

- 1NF
- No partial dependency

---

## 3NF

- 2NF
- No transitive dependency

---

## BCNF

Stronger version of 3NF.

---

# Denormalization

Combines tables to improve read performance.

Trade-off

- Faster reads
- More redundancy

---

# Relationships

## One to One

Person → Passport

---

## One to Many

Department → Employees

---

## Many to Many

Students ↔ Courses

Implemented using a junction table.

---

# ER Diagram

Entity Relationship Diagram represents

- Entities
- Attributes
- Relationships

---

# Index

Improves query performance.

Types

- Clustered
- Non-Clustered

Trade-off

- Faster reads
- Slower writes

---

# Transactions

A sequence of operations executed as one unit.

---

# ACID Properties

## Atomicity

All or nothing.

---

## Consistency

Database remains valid.

---

## Isolation

Transactions don't interfere.

---

## Durability

Committed data is permanent.

---

# Concurrency

Allows multiple users to access data simultaneously.

---

# Locks

## Shared Lock

Read only.

---

## Exclusive Lock

Read + Write.

---

# Deadlock

Two transactions wait forever for each other.

Solution

- Timeout
- Deadlock Detection
- Resource Ordering

---

# Isolation Levels

- Read Uncommitted
- Read Committed
- Repeatable Read
- Serializable

---

# Joins

## INNER JOIN

Matching records.

---

## LEFT JOIN

All left table rows.

---

## RIGHT JOIN

All right table rows.

---

## FULL JOIN

All records.

---

# Aggregate Functions

```sql
COUNT()

SUM()

AVG()

MIN()

MAX()
```

---

# GROUP BY

Groups rows.

---

# HAVING

Filters grouped data.

---

# ORDER BY

Sorts results.

---

# Views

Virtual tables created using SQL queries.

Advantages

- Security
- Simplicity

---

# Stored Procedure

Precompiled SQL program stored in database.

---

# Trigger

Automatically executes on

- INSERT
- UPDATE
- DELETE

---

# Database Backup

Protects against

- Hardware Failure
- Data Corruption
- Human Error

---

# DBMS in Spring Boot

Spring Boot communicates using

- JDBC
- JPA
- Hibernate

Common Databases

- MySQL
- PostgreSQL

---

# Best Practices

- Normalize tables.
- Index frequently searched columns.
- Use transactions.
- Avoid SELECT *.
- Use prepared statements.
- Backup regularly.

---

# Common Mistakes

- Missing indexes
- Redundant data
- Poor schema design
- Ignoring normalization
- SQL Injection
- Long-running transactions

---

# Real World Use Cases

- Banking Systems
- E-commerce
- Hospital Management
- Social Media
- Inventory Systems
- Payment Applications

---

# Common Interview Questions

- What is DBMS?
- DBMS vs RDBMS?
- Primary Key vs Foreign Key?
- Candidate Key vs Super Key?
- Explain Normalization.
- What is Denormalization?
- What are ACID properties?
- Explain Transactions.
- Types of Joins?
- What is an Index?
- Clustered vs Non-Clustered Index?
- Explain Isolation Levels.
- What is a Trigger?
- What is a View?

---

# Revision Checklist

- DBMS
- RDBMS
- Keys
- Constraints
- SQL Categories
- Normalization
- Denormalization
- Relationships
- ER Diagram
- Index
- Transactions
- ACID
- Locks
- Isolation Levels
- Joins
- Aggregate Functions
- Views
- Stored Procedures
- Triggers

---

# Summary

A Database Management System (DBMS) efficiently stores, retrieves, and manages data while ensuring security, consistency, and reliability. Concepts like normalization, indexing, transactions, ACID properties, and SQL are fundamental for Java backend development with Spring Boot and are among the most frequently asked interview topics.