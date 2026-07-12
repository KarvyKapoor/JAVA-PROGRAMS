# ☕ Java Exception Handling

> Quick revision notes covering Java Exception Handling for interviews and backend development.

---

# What is Exception Handling?

Exception Handling is a mechanism to detect and handle runtime errors so that the normal flow of a program continues without crashing.

---

# Why Exception Handling?

Without Exception Handling

- Program terminates unexpectedly
- Poor user experience
- Difficult debugging
- Unreliable applications

With Exception Handling

- Graceful error handling
- Better reliability
- Improved debugging
- Cleaner code
- Robust applications

---

# Exception Hierarchy

```text
                    Object
                       │
                 Throwable
                ┌─────────────┐
                │             │
             Error        Exception
                               │
                    ┌──────────┴──────────┐
                    │                     │
          Checked Exception     Runtime Exception
```

---

# Error

Serious problems that applications generally should not handle.

Examples

- OutOfMemoryError
- StackOverflowError

---

# Exception

Problems that applications can handle.

Examples

- IOException
- SQLException
- NullPointerException

---

# Types of Exceptions

## Checked Exception

Checked at compile time.

Must be handled or declared.

Examples

```java
IOException

SQLException

FileNotFoundException
```

---

## Unchecked Exception

Occurs at runtime.

Not checked by the compiler.

Examples

```java
NullPointerException

ArithmeticException

ArrayIndexOutOfBoundsException

ClassCastException
```

---

# try Block

Contains code that may throw an exception.

```java
try{

    int result = 10 / 0;

}
```

---

# catch Block

Handles the exception.

```java
try{

    int result = 10 / 0;

}
catch(ArithmeticException e){

    System.out.println(e.getMessage());

}
```

---

# finally Block

Always executes whether an exception occurs or not.

Used for resource cleanup.

```java
finally{

    System.out.println("Cleanup");

}
```

---

# try-catch-finally Flow

```text
try
 │
 ├── No Exception
 │       │
 │    finally
 │
 └── Exception
         │
      catch
         │
      finally
```

---

# Multiple catch Blocks

```java
try{

}
catch(IOException e){

}
catch(SQLException e){

}
```

Always place specific exceptions before generic ones.

---

# Multi-Catch

Handle multiple exceptions together.

```java
catch(IOException | SQLException e){

}
```

---

# throw Keyword

Used to explicitly throw an exception.

```java
throw new IllegalArgumentException("Invalid Age");
```

---

# throws Keyword

Declares that a method may throw exceptions.

```java
public void readFile() throws IOException{

}
```

---

# throw vs throws

| throw | throws |
|--------|---------|
| Used inside method | Used in method declaration |
| Throws one exception | Declares possible exceptions |
| Creates exception object | Does not create object |

---

# Custom Exception

Create your own exception.

```java
class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){

        super(message);

    }

}
```

Usage

```java
throw new InvalidAgeException("Age must be 18 or above");
```

---

# Common Runtime Exceptions

| Exception | Cause |
|-----------|-------|
| NullPointerException | Accessing null object |
| ArithmeticException | Divide by zero |
| ArrayIndexOutOfBoundsException | Invalid array index |
| NumberFormatException | Invalid number conversion |
| ClassCastException | Invalid type casting |
| IllegalArgumentException | Invalid method argument |

---

# Exception Propagation

If an exception is not handled, it propagates to the calling method.

```text
Method C
    ↑
Method B
    ↑
Method A
```

---

# try-with-resources

Automatically closes resources.

```java
try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){

}
```

No need for explicit `finally` block.

---

# Important Methods

```java
getMessage()

printStackTrace()

toString()
```

---

# Best Practices

- Catch specific exceptions.
- Never ignore exceptions.
- Use custom exceptions for business logic.
- Use try-with-resources for files and streams.
- Log exceptions instead of printing them.
- Do not catch `Exception` unless necessary.
- Do not use exceptions for normal program flow.

---

# Common Mistakes

- Empty catch blocks
- Catching generic `Exception`
- Swallowing exceptions
- Not closing resources
- Using exceptions for validation
- Ignoring stack traces

---

# Exception Handling in Spring Boot

Common annotations

```java
@ExceptionHandler

@ControllerAdvice

@RestControllerAdvice
```

Common exceptions

- ResourceNotFoundException
- BadRequestException
- ValidationException

Spring converts exceptions into proper HTTP responses.

---

# Real World Use Cases

- Banking Systems
- Payment Gateways
- Authentication
- REST APIs
- Database Operations
- File Upload Services
- Online Shopping Applications

---

# Common Interview Questions

- What is Exception Handling?
- Error vs Exception?
- Checked vs Unchecked Exception?
- throw vs throws?
- Why use finally?
- Can finally block not execute?
- Can we have multiple catch blocks?
- What is exception propagation?
- What is try-with-resources?
- Why create custom exceptions?
- Difference between `final`, `finally`, and `finalize()`?
- How does Spring Boot handle exceptions globally?

---

# final vs finally vs finalize()

| final | finally | finalize() |
|--------|----------|-------------|
| Keyword | Block | Method |
| Prevent modification | Always executes | Called by Garbage Collector |
| Variables, Methods, Classes | Cleanup resources | Deprecated in modern Java |

---

# Revision Checklist

- Exception Hierarchy
- Error vs Exception
- Checked Exception
- Unchecked Exception
- try
- catch
- finally
- throw
- throws
- Custom Exception
- Exception Propagation
- try-with-resources
- Common Runtime Exceptions
- Best Practices
- Spring Boot Exception Handling

---

# Summary

Exception Handling is a fundamental Java feature that enables applications to recover gracefully from runtime errors. It improves application reliability, maintainability, and user experience. In enterprise applications and Spring Boot, proper exception handling combined with custom exceptions and global exception handlers is essential for building robust and production-ready backend systems.