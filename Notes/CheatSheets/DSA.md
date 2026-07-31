# DSA Cheat Sheet

Quick revision guide for Data Structures and Algorithms.

---

# 1. What is DSA?

DSA stands for:

- Data Structures
- Algorithms


## Data Structure

A way to organize and store data efficiently.


Examples:

- Array
- Linked List
- Stack
- Queue
- Tree
- Graph
- Hash Table


## Algorithm

A step-by-step procedure to solve a problem.


---

# 2. Complexity Analysis


## Time Complexity

Measures how execution time grows with input size.


## Space Complexity

Measures extra memory used by algorithm.


---

# Big O Notation


Common Complexities:


```
O(1)

Constant Time


O(log n)

Logarithmic Time


O(n)

Linear Time


O(n log n)

Linearithmic Time


O(n²)

Quadratic Time


O(2ⁿ)

Exponential Time
```


---

# Complexity Ranking


Fastest to Slowest:


```
O(1)

↓

O(log n)

↓

O(n)

↓

O(n log n)

↓

O(n²)

↓

O(2ⁿ)
```


---

# 3. Arrays


Array:

Collection of elements stored in continuous memory.


Example:


```java
int arr[] = {10,20,30};
```


## Advantages

- Fast access
- Simple structure


## Disadvantages

- Fixed size
- Costly insertion/deletion


---

# Array Operations


| Operation | Time Complexity |
|---|---|
| Access | O(1) |
| Search | O(n) |
| Insert | O(n) |
| Delete | O(n) |


---

# Two Pointer Technique


Used for:

- Sorted arrays
- Pair problems
- Removing duplicates


Example:


```
Left pointer →


        ← Right pointer
```


---

# Sliding Window


Used for:

- Subarrays
- Substrings
- Continuous ranges


Types:

- Fixed window
- Variable window


---

# Prefix Sum


Stores cumulative sum.


Example:


Array:

```
[1,2,3,4]
```


Prefix:

```
[1,3,6,10]
```


Used for:

- Range sum queries


---

# 4. Strings


String:

Sequence of characters.


Common Problems:


- Reverse string
- Palindrome
- Anagram
- Substring search


---

# String Techniques


## Character Frequency


Use:

- HashMap
- Array


Example:


```
a → 3

b → 2
```


---

# Palindrome


String remains same after reverse.


Example:


```
madam
```


---

# 5. Linked List


Linked List:

Collection of nodes connected using pointers.


Node contains:


```
Data

↓

Next Pointer
```


---

# Types


## Singly Linked List


Each node points to next node.


## Doubly Linked List


Node contains:

- Previous pointer
- Next pointer


## Circular Linked List


Last node points back to first node.


---

# Linked List Operations


| Operation | Complexity |
|-|-|
| Access | O(n) |
| Search | O(n) |
| Insert Beginning | O(1) |
| Delete Beginning | O(1) |


---

# Common Linked List Problems


Reverse Linked List


Find Middle Node


Detect Cycle


Merge Two Sorted Lists


Remove Nth Node


---

# Floyd Cycle Detection Algorithm


Used to detect cycle.


Uses:

- Slow pointer
- Fast pointer


Slow:

Moves one step.


Fast:

Moves two steps.


---

# 6. Stack


Stack follows:


```
LIFO

Last In First Out
```


Operations:


push()

Add element


pop()

Remove element


peek()

View top element


---

# Stack Applications


- Function calls
- Undo operation
- Expression evaluation
- Parentheses matching


---

# 7. Queue


Queue follows:


```
FIFO

First In First Out
```


Operations:


enqueue()

Insert element


dequeue()

Remove element


---

# Types of Queue


- Simple Queue
- Circular Queue
- Priority Queue
- Deque


---

# Queue Applications


- CPU scheduling
- BFS traversal
- Task scheduling


---

# 8. Hashing


Hashing stores data using key-value pairs.


Example:


```
Key → Value

Name → John
```


---

# Hash Table


Average Complexity:


Search:

O(1)


Insert:

O(1)


Delete:

O(1)


---

# HashMap Applications


- Frequency counting
- Duplicate detection
- Caching
- Lookup optimization


---

# 9. Recursion


Function calling itself.


Example:


```java
void fun(){

    fun();

}
```


---

# Recursion Components


## Base Condition

Stops recursion.


## Recursive Call

Calls function again.


---

# Recursion Problems


- Factorial
- Fibonacci
- Tree traversal
- Backtracking


---

# 10. Backtracking


Try all possible choices and undo.


Pattern:


```
Choose

↓

Explore

↓

Unchoose
```


Applications:


- N Queens
- Sudoku
- Permutations
- Combinations


---

# 11. Trees


Tree:

Hierarchical data structure.


Contains:

- Nodes
- Edges
- Root


---

# Binary Tree


Each node has maximum two children:


- Left child
- Right child


---

# Tree Terminology


Root:

Top node


Leaf:

Node without children


Height:

Longest path from node to leaf


Depth:

Distance from root


---

# Binary Search Tree (BST)


Properties:


Left subtree:

Smaller values


Right subtree:

Greater values


Search complexity:


Average:

O(log n)


Worst:

O(n)


---

# Tree Traversals


## DFS Traversals


### Inorder


```
Left

Root

Right
```


### Preorder


```
Root

Left

Right
```


### Postorder


```
Left

Right

Root
```


---

# BFS Traversal


Level order traversal.


Uses:

Queue


---

# 12. Heap


Heap:

Complete binary tree.


Types:


## Min Heap


Parent is smaller than children.


## Max Heap


Parent is larger than children.


---

# Heap Applications


- Priority Queue
- Heap Sort
- Top K problems


---

# 13. Graphs


Graph consists of:


- Vertices
- Edges


Example:


Social network connections.


---

# Graph Types


Directed Graph


Edges have direction.


Undirected Graph


Edges have no direction.


Weighted Graph


Edges have values.


---

# Graph Representation


## Adjacency Matrix


2D array representation.


Space:

O(V²)


---

## Adjacency List


List of neighbors.


Space:

O(V+E)


---

# Graph Traversal


## BFS


Breadth First Search.


Uses:

Queue


Applications:

- Shortest path
- Level traversal


---

## DFS


Depth First Search.


Uses:

Stack / Recursion


Applications:

- Cycle detection
- Components


---

# 14. Sorting Algorithms


# Bubble Sort


Repeatedly swaps adjacent elements.


Time:

O(n²)


Space:

O(1)


---

# Selection Sort


Select minimum element and place it.


Time:

O(n²)


---

# Insertion Sort


Builds sorted portion one element at a time.


Time:

O(n²)


Best:

O(n)


---

# Merge Sort


Divide and conquer algorithm.


Steps:


Divide

↓

Sort

↓

Merge


Time:

O(n log n)


Space:

O(n)


---

# Quick Sort


Uses pivot element.


Average:

O(n log n)


Worst:

O(n²)


---

# 15. Searching Algorithms


# Linear Search


Checks every element.


Time:

O(n)


---

# Binary Search


Works on sorted arrays.


Steps:


Find middle element.


Compare target.


Move left or right.


Time:

O(log n)


---

# 16. Greedy Algorithm


Makes locally optimal choice at every step.


Examples:


- Activity Selection
- Huffman Coding
- Fractional Knapsack


---

# 17. Dynamic Programming


Solves overlapping subproblems.


Uses:


- Memoization
- Tabulation


---

# Dynamic Programming Steps


1. Identify subproblem

2. Create state

3. Find recurrence

4. Store results


---

# Common DP Problems


- Fibonacci
- 0/1 Knapsack
- Longest Common Subsequence
- Coin Change


---

# 18. Bit Manipulation


Works with binary representation.


Operators:


AND:

```
&
```


OR:

```
|
```


XOR:

```
^
```


NOT:

```
~
```


Left Shift:

```
<<
```


Right Shift:

```
>>
```


---

# Common Bit Tricks


Check Odd/Even:


```java
n & 1
```


Swap Numbers:


```java
a = a ^ b;
b = a ^ b;
a = a ^ b;
```


---

# 19. Important Algorithm Patterns


## Two Pointer


Used in:

- Sorted arrays
- Pair problems


---

## Sliding Window


Used in:

- Subarrays
- Substrings


---

## Fast and Slow Pointer


Used in:

- Linked list cycle
- Middle node


---

## Divide and Conquer


Break problem into smaller parts.


Examples:

- Merge Sort
- Quick Sort


---

## Backtracking


Try choices and undo.


Examples:

- N Queens
- Sudoku


---

# 20. Important Interview Questions


## Array vs Linked List?


Array:

- Fixed memory
- Fast access


Linked List:

- Dynamic memory
- Fast insertion


---

## Stack vs Queue?


Stack:

LIFO


Queue:

FIFO


---

## BFS vs DFS?


BFS:

- Uses Queue
- Level based


DFS:

- Uses Stack/Recursion
- Depth based


---

## HashMap vs TreeMap?


HashMap:

Average O(1)


TreeMap:

O(log n)

Sorted keys.


---

## Recursion vs Iteration?


Recursion:

Uses function calls.


Iteration:

Uses loops.


---

## Merge Sort vs Quick Sort?


Merge Sort:

- O(n log n)
- Extra space


Quick Sort:

- Faster practically
- Less space


---

# DSA Problem Solving Checklist


## Arrays

✓ Two Pointer  
✓ Sliding Window  
✓ Prefix Sum  
✓ Binary Search  


## Linked List

✓ Reverse List  
✓ Cycle Detection  
✓ Fast Slow Pointer  


## Stack

✓ Parentheses  
✓ Monotonic Stack  


## Queue

✓ BFS  
✓ Scheduling  


## Trees

✓ Traversal  
✓ BST  
✓ Height  
✓ Lowest Common Ancestor  


## Graphs

✓ BFS  
✓ DFS  
✓ Shortest Path  
✓ Cycle Detection  


## Algorithms

✓ Sorting  
✓ Searching  
✓ Greedy  
✓ Dynamic Programming  
✓ Backtracking