# ☕ Java Generics
## 🎯 Definition

Generics allow classes, interfaces, and methods to work with different data types while providing compile time type safety.

---
## ⭐ Key Points
- Introduced in Java 5
- Compile time type checking
- Eliminates explicit casting
- Improves code reusability
- Prevents `ClassCastException`
- Works only with Reference Types
---
## 📌 Primitive vs Reference Types
### Primitive Types
- byte
- short
- int
- long
- float
- double
- char
- boolean
  
✔ Stores actual values
❌ Cannot be used with Generics

### Reference Types
- String
- Integer
- ArrayList
- Scanner
- Custom Objects
  
✔ Stores object references
✔ Can be used with Generics

---
## 📌 Wrapper Classes
| Primitive | Wrapper |
|-----------|----------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

💡 Generics require Wrapper Classes because they work only with objects.

---
## 📌 Generic Type vs Raw Type
### ✅ Generic Type
```java
ArrayList<String> list = new ArrayList<>();
```
✔ Compile time checking
✔ Type safe
✔ No explicit casting
### ❌ Raw Type
```java
ArrayList list = new ArrayList();
```

❌ No type safety
❌ Runtime errors
❌ Explicit casting required

---
## 📌 Compiler vs JVM
### 🛠 Compiler
- Type Checking
- Type Inference
- Type Erasure
- Inserts Type Casts
### ⚙ JVM
- Executes Bytecode
- Class Loading
- Memory Management
- Garbage Collection
---
## 📌 Type Erasure
### Definition
Removes Generic type information during compilation.
```java
ArrayList<String>
```
↓
```java
ArrayList
```

💡 Reason: Backward Compatibility

---
## 📌 Object vs Generics
### Using Object
```java
ArrayList<Object> list = new ArrayList<>();
```
❌ Runtime Error
```java
String s = (String) list.get(1);
```
### Using Generics
```java
ArrayList<String> list = new ArrayList<>();
```
❌ Compile Time Error

💡 Generics move errors from **Runtime → Compile Time**

---
## 🎤 Interview Questions
- What are Generics?
- Why were Generics introduced?
- Why can't Generics use primitive types?
- What is Type Erasure?
- Raw Type vs Generic Type?
- Why is `Object` not a replacement for Generics?
- Compiler vs JVM responsibilities?
---
## 🚀 Best Practices

- Prefer Generic Types
- Avoid Raw Types
- Use Wrapper Classes
- Catch errors at Compile Time

---
## 📚 Files
- PrimitiveVsReference.java
- WrapperClasses.java
- GenericTypeVsRawType.java
- CompilerVsJVM.java
- TypeErasure.java
- ObjectVsGenerics.java
