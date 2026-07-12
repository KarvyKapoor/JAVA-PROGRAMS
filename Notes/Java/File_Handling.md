# ☕ Java File Handling

> Quick revision notes covering Java File Handling for interviews and backend development.

---

# What is File Handling?

File Handling is the process of creating, reading, writing, updating, and deleting files stored on the system.

Java provides the **java.io** and **java.nio** packages for file operations.

---

# Why File Handling?

Without File Handling

- Data is lost after program execution.
- No persistent storage.
- Cannot work with external files.

With File Handling

- Persistent data storage
- Read and write files
- Process large datasets
- Import and export data
- Log application events

---

# Java File Handling Packages

## java.io

Traditional file handling package.

Examples

- File
- FileReader
- FileWriter
- BufferedReader
- BufferedWriter

---

## java.nio

Modern file handling package (Java 7+).

Examples

- Path
- Paths
- Files

Better performance and more features.

---

# File Class

Represents a file or directory.

```java
File file = new File("sample.txt");
```

Common Methods

```java
exists()

createNewFile()

delete()

mkdir()

mkdirs()

length()

renameTo()

listFiles()
```

---

# Reading Files

## FileReader

Reads character data.

```java
FileReader reader = new FileReader("sample.txt");
```

Suitable for small text files.

---

## BufferedReader

Reads data efficiently using buffering.

```java
BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
```

Methods

```java
read()

readLine()

close()
```

Preferred for reading text files.

---

# Writing Files

## FileWriter

Writes character data.

```java
FileWriter writer = new FileWriter("sample.txt");
```

Append Mode

```java
FileWriter writer = new FileWriter("sample.txt", true);
```

---

## BufferedWriter

Efficient writing using buffering.

```java
BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"));
```

Methods

```java
write()

newLine()

flush()

close()
```

---

# Byte Streams

Used for binary files.

Classes

- FileInputStream
- FileOutputStream

Examples

- Images
- Videos
- PDF files

---

# Character Streams

Used for text files.

Classes

- FileReader
- FileWriter
- BufferedReader
- BufferedWriter

---

# Serialization

Converts an object into a byte stream.

Purpose

- Save object state
- Network communication

```java
implements Serializable
```

---

# Deserialization

Converts byte stream back into an object.

Classes

```java
ObjectInputStream

ObjectOutputStream
```

---

# transient Keyword

Prevents a field from being serialized.

```java
transient String password;
```

Useful for sensitive information.

---

# NIO (New I/O)

Introduced in Java 7.

Advantages

- Faster
- Better API
- Improved scalability

Common Classes

```java
Path

Paths

Files
```

Example

```java
Path path = Paths.get("sample.txt");
```

---

# Files Utility Class

Useful Methods

```java
readAllLines()

readString()

write()

copy()

move()

delete()

exists()
```

---

# try-with-resources

Automatically closes resources.

```java
try(BufferedReader br =
        new BufferedReader(new FileReader("sample.txt"))){

}
```

Recommended over manually closing streams.

---

# File vs Directory

| File | Directory |
|------|-----------|
| Stores data | Stores files/folders |
| Has extension | Usually no extension |
| Cannot contain files | Can contain files |

---

# Common Exceptions

- IOException
- FileNotFoundException
- EOFException
- SecurityException

---

# File Handling in Spring Boot

Common Use Cases

- File Upload
- File Download
- CSV Processing
- PDF Generation
- Image Storage
- Log Management

Useful Classes

```java
MultipartFile

Resource

Files
```

---

# Best Practices

- Always close files.
- Prefer try-with-resources.
- Use BufferedReader and BufferedWriter for text files.
- Use NIO for modern applications.
- Validate file paths before reading.
- Handle exceptions properly.
- Avoid hardcoded file paths.

---

# Common Mistakes

- Forgetting to close streams
- Using FileReader for binary files
- Ignoring IOException
- Hardcoding file paths
- Reading large files entirely into memory
- Not using buffering

---

# Real World Use Cases

- Log Files
- Report Generation
- CSV Import/Export
- Image Upload
- Resume Upload
- Configuration Files
- Database Backup
- Document Management Systems

---

# Common Interview Questions

- What is File Handling?
- FileReader vs FileInputStream?
- BufferedReader vs FileReader?
- Byte Stream vs Character Stream?
- Serialization vs Deserialization?
- Why use Serializable?
- What is transient?
- What is NIO?
- File vs Path?
- Why use try-with-resources?
- How does Spring Boot upload files?

---

# Revision Checklist

- File Class
- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- Byte Streams
- Character Streams
- Serialization
- Deserialization
- transient
- NIO
- Files Class
- try-with-resources
- Common Exceptions
- Best Practices

---

# Summary

Java File Handling enables applications to create, read, write, update, and delete files efficiently. The **java.io** package provides traditional file operations, while **java.nio** offers a modern and high-performance API. Proper resource management using **try-with-resources**, buffering, and NIO is essential for building reliable and production-ready Java applications.