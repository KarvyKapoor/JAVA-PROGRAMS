# 📚 Java Collections Framework

## 🎯 Definition

The Java Collections Framework (JCF) is a set of classes and interfaces used to store, manage, and manipulate groups of objects efficiently.

---

## ⭐ Why Collections?

- Dynamic Size
- Built-in Data Structures
- Better Performance
- Reusable Code
- Rich API

---

## 📌 Collection Hierarchy

```text
Iterable
    │
Collection
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
    └── ArrayDeque

Map
├── HashMap
├── LinkedHashMap
├── TreeMap
└── Hashtable
```

---

## 📌 ArrayList

### Features

- Dynamic Array
- Ordered
- Allows Duplicates
- Allows Multiple Null Values
- Fast Random Access

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add (End) | O(1)* |
| Get | O(1) |
| Search | O(n) |
| Insert Middle | O(n) |
| Delete Middle | O(n) |

💡 *Amortized O(1)

---

## 📌 LinkedList

### Features

- Doubly Linked List
- Ordered
- Allows Duplicates
- Efficient Insert/Delete
- Sequential Access

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add First | O(1) |
| Add Last | O(1) |
| Get | O(n) |
| Search | O(n) |
| Insert | O(1)* |
| Delete | O(1)* |

💡 *After reaching the required node.

---

## 📌 ArrayList vs LinkedList

| ArrayList | LinkedList |
|------------|------------|
| Dynamic Array | Doubly Linked List |
| Fast Random Access | Slow Random Access |
| Slow Insert/Delete | Fast Insert/Delete |
| Less Memory | More Memory |

---

## 📌 HashMap

### Features

- Stores Key Value Pairs
- Unique Keys
- Duplicate Values Allowed
- Allows One Null Key
- Unordered

---

## 📌 hashCode()

- Generates hash value
- Determines bucket location
- Same object should always return same hashCode()

---

## 📌 equals()

- Compares actual object equality
- Used after hashCode() to find correct key inside a bucket

---

## 📌 Collision

Occurs when two keys produce the same hash value.

Example

```text
Key A → Bucket 5
Key B → Bucket 5
```

HashMap stores both keys inside the same bucket.

---

## 📌 Load Factor

### Default Value

```java
0.75
```

### Purpose

Balances

- Performance
- Memory Usage

When threshold exceeds

```text
Capacity × Load Factor
```

HashMap resizes itself.

---

## 📌 Rehashing

Occurs when the threshold is exceeded.

Steps

1. Create Bigger Array
2. Recalculate Bucket Index
3. Move Existing Entries

---

## 📌 Why Capacity is Power of 2?

Bucket Index

```java
(capacity - 1) & hash
```

Advantages

- Faster than Modulo (%)
- Better Distribution
- Efficient Bitwise Calculation

---

## 📌 Amortized Analysis

ArrayList resizing is expensive.

Most insertions

```text
O(1)
```

Occasional resizing

```text
O(n)
```

Average

```text
Amortized O(1)
```

---

## 🎤 Interview Questions

- What is Java Collections Framework?
- ArrayList vs LinkedList?
- Why is ArrayList Add O(1)?
- What is Amortized Analysis?
- How does HashMap work?
- hashCode() vs equals()?
- What is Collision?
- What is Load Factor?
- Why 0.75?
- Why is HashMap capacity a power of 2?
- What is Rehashing?

---

## 🚀 Best Practices

✅ Override both `hashCode()` and `equals()` together.

✅ Use ArrayList for frequent reads.

✅ Use LinkedList for frequent insertions/deletions.

✅ Choose the right collection for the problem.

✅ Avoid unnecessary resizing of collections.
