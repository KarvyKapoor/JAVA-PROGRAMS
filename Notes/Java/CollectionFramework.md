# ☕ Java Collections Framework

> Quick revision notes covering the Java Collections Framework for interviews and backend development.

---

# What is the Collection Framework?

The Java Collections Framework (JCF) is a set of interfaces and classes used to store, manipulate, and process groups of objects efficiently.

It provides reusable data structures and algorithms.

---

# Why Collection Framework?

Without Collections

- Fixed-size arrays
- Manual resizing
- Difficult searching and sorting
- More boilerplate code

With Collections

- Dynamic size
- Efficient searching
- Built-in sorting
- Better performance
- Rich utility methods

---

# Collection Hierarchy

```text
Iterable
    │
Collection
│
├── List
│   ├── ArrayList
│   ├── LinkedList
│   └── Vector
│
├── Set
│   ├── HashSet
│   ├── LinkedHashSet
│   └── TreeSet
│
└── Queue
    ├── PriorityQueue
    ├── ArrayDeque
    └── LinkedList

Map
│
├── HashMap
├── LinkedHashMap
├── TreeMap
├── Hashtable
└── ConcurrentHashMap
```

---

# Core Interfaces

## List

- Ordered
- Allows duplicates
- Index based

Examples

- ArrayList
- LinkedList
- Vector

---

## Set

- Unique elements
- No duplicates

Examples

- HashSet
- LinkedHashSet
- TreeSet

---

## Queue

- FIFO (First In First Out)

Examples

- LinkedList
- PriorityQueue
- ArrayDeque

---

## Map

- Stores Key-Value pairs
- Keys are unique
- Values can be duplicated

Examples

- HashMap
- LinkedHashMap
- TreeMap

---

# ArrayList

Underlying Data Structure

- Dynamic Array

Advantages

- Fast random access O(1)
- Fast iteration
- Memory efficient

Disadvantages

- Middle insertion O(n)
- Middle deletion O(n)

Best Use Case

- Frequent reading
- Rare insertions/deletions

---

# LinkedList

Underlying Data Structure

- Doubly Linked List

Advantages

- Fast insertion
- Fast deletion

Disadvantages

- Slow random access O(n)
- Higher memory usage

Best Use Case

- Frequent insertions/deletions

---

# Vector

- Synchronized
- Thread Safe
- Slower than ArrayList

---

# Stack

- LIFO

Methods

```java
push()

pop()

peek()
```

---

# HashSet

Underlying Structure

- HashMap

Properties

- No duplicates
- Unordered
- One null value allowed

Time Complexity

- Add → O(1)
- Remove → O(1)
- Search → O(1)

---

# LinkedHashSet

- Maintains insertion order
- Slightly slower than HashSet

---

# TreeSet

Underlying Structure

- Red Black Tree

Properties

- Sorted
- No duplicates

Complexity

- O(log n)

---

# PriorityQueue

Stores elements according to priority.

Default

- Min Heap

Complexity

- Insert → O(log n)
- Delete → O(log n)
- Peek → O(1)

---

# HashMap

Underlying Structure

- Array + Hashing
- Buckets
- Linked List / Red Black Tree (after threshold)

Properties

- Key Value Pair
- Unique Keys
- One null key
- Multiple null values

Complexity

| Operation | Average |
|-----------|----------|
| Put | O(1) |
| Get | O(1) |
| Remove | O(1) |

---

# HashMap Internal Working

1. Calculate hashCode()
2. Apply hash function
3. Find bucket index
4. Compare using equals()
5. Store or update value
6. Handle collision using Linked List / Tree

---

# Load Factor

Default

```text
0.75
```

Meaning

Resize occurs when

```
Size > Capacity × Load Factor
```

---

# Rehashing

When threshold exceeds,

- New array created
- Capacity doubled
- All entries reinserted

---

# LinkedHashMap

- Maintains insertion order
- Uses doubly linked list internally

---

# TreeMap

Underlying Structure

- Red Black Tree

Properties

- Sorted Keys
- No null keys

Complexity

- O(log n)

---

# Hashtable

- Thread Safe
- Synchronized
- No null key
- No null value

Mostly replaced by ConcurrentHashMap.

---

# ConcurrentHashMap

Designed for multithreading.

Advantages

- Better concurrency
- Higher performance
- Thread Safe

---

# Comparable

Used for natural sorting.

```java
class Student implements Comparable<Student>
```

Method

```java
compareTo()
```

---

# Comparator

Used for custom sorting.

```java
Comparator<Student>
```

Method

```java
compare()
```

---

# Comparable vs Comparator

| Comparable | Comparator |
|------------|------------|
| Natural Sorting | Custom Sorting |
| compareTo() | compare() |
| Inside Class | Outside Class |

---

# Collections Utility Class

Useful Methods

```java
sort()

reverse()

shuffle()

binarySearch()

max()

min()

frequency()
```

---

# Iterator

Used to traverse collections.

Methods

```java
hasNext()

next()

remove()
```

---

# ListIterator

Supports

- Forward traversal
- Backward traversal
- Modification while iterating

---

# Time Complexity

| Collection | Access | Search | Insert | Delete |
|------------|-------:|-------:|-------:|-------:|
| ArrayList | O(1) | O(n) | O(n) | O(n) |
| LinkedList | O(n) | O(n) | O(1)* | O(1)* |
| HashSet | - | O(1) | O(1) | O(1) |
| TreeSet | - | O(log n) | O(log n) | O(log n) |
| HashMap | - | O(1) | O(1) | O(1) |
| TreeMap | - | O(log n) | O(log n) | O(log n) |

*At a known node.

---

# Common Interview Questions

- Why Collection Framework?
- Collection vs Collections?
- List vs Set?
- ArrayList vs LinkedList?
- HashMap vs Hashtable?
- HashMap vs TreeMap?
- HashSet vs TreeSet?
- How does HashMap work internally?
- What is hashCode()?
- Why equals() with hashCode()?
- What is Load Factor?
- What is Rehashing?
- Comparable vs Comparator?
- Why is ArrayList insertion O(n)?
- Why is LinkedList searching O(n)?
- Why is TreeMap sorted?
- Why is HashSet unique?

---

# Common Mistakes

- Forgetting to override both `equals()` and `hashCode()`
- Using `==` instead of `equals()`
- Choosing LinkedList when ArrayList is better
- Using HashMap when sorted data is required
- Ignoring load factor
- Modifying collections during iteration without an Iterator

---

# Best Practices

- Use interfaces (`List`, `Set`, `Map`) instead of implementation classes.
- Prefer ArrayList unless frequent insertions/deletions are required.
- Use HashMap for fast lookups.
- Use TreeMap only when sorted keys are needed.
- Override `equals()` and `hashCode()` together.
- Choose the collection based on access patterns, not familiarity.

---

# Real World Use Cases

- User Session Management
- Product Catalogs
- Caching
- Order Processing
- Leaderboards
- Search Systems
- Banking Applications
- Spring Boot Services

---

# Revision Checklist

- Collection Hierarchy
- List
- Set
- Queue
- Map
- ArrayList
- LinkedList
- Vector
- Stack
- HashSet
- LinkedHashSet
- TreeSet
- PriorityQueue
- HashMap
- LinkedHashMap
- TreeMap
- Hashtable
- ConcurrentHashMap
- Comparable
- Comparator
- Collections Class
- Iterator
- Load Factor
- Rehashing
- Time Complexities

---

# Summary

The Java Collections Framework provides efficient data structures for storing and manipulating data. Choosing the right collection based on access patterns, ordering, uniqueness, thread safety, and performance is a key skill for Java backend developers. Collections are heavily used in Spring Boot, Hibernate, caching, APIs, and enterprise applications.