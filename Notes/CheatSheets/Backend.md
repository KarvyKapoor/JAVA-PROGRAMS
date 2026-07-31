# Backend Cheat Sheet

Quick revision guide for Backend Development and Java Backend Interviews.

---

# 1. Backend Fundamentals


## What is Backend?

Backend is the server-side part of an application responsible for:

- Business logic
- Database operations
- Authentication
- APIs
- Server communication


Backend Components:

```
Client

↓

API / Server

↓

Business Logic

↓

Database
```


---

# 2. Client Server Architecture


## Client

Responsible for:

- User interface
- Sending requests
- Receiving responses


Examples:

- Web browser
- Mobile application


## Server

Responsible for:

- Processing requests
- Executing business logic
- Returning responses


---

# 3. Request Response Cycle


Flow:


```
Client

↓

HTTP Request

↓

Controller

↓

Service

↓

Repository

↓

Database

↓

Response

↓

Client
```


---

# 4. HTTP Basics


HTTP:

Protocol used for communication between client and server.


## HTTP Methods


## GET

Used to fetch data.


Example:

```
GET /users
```


## POST

Creates new resource.


Example:

```
POST /users
```


## PUT

Updates complete resource.


## PATCH

Updates partial resource.


## DELETE

Deletes resource.


---

# 5. HTTP Status Codes


## 2xx Success


200 OK

Request successful.


201 Created

Resource created.


204 No Content

Success without response body.


---

## 4xx Client Errors


400 Bad Request

Invalid request.


401 Unauthorized

Authentication required.


403 Forbidden

Access denied.


404 Not Found

Resource not found.


---

## 5xx Server Errors


500 Internal Server Error

Server failure.


503 Service Unavailable

Server temporarily unavailable.


---

# 6. REST API


REST:

Representational State Transfer.


REST API allows communication between applications using HTTP.


## REST Principles


- Stateless communication
- Client server separation
- Resource based URLs
- Standard HTTP methods


---

# REST API Example


Resource:

```
/users
```


Operations:


GET

```
/users
```

Fetch users.


POST

```
/users
```

Create user.


GET

```
/users/1
```

Fetch specific user.


DELETE

```
/users/1
```

Delete user.


---

# 7. API Design Best Practices


Use meaningful URLs:


Good:

```
GET /api/users
```


Bad:

```
GET /api/getUsers
```


Use proper status codes.


Validate input.


Handle exceptions.


Secure APIs.


---

# 8. SQL Basics


SQL:

Structured Query Language used to communicate with databases.


---

# Database Commands


## DDL

Defines structure.


Commands:

```sql
CREATE
ALTER
DROP
TRUNCATE
```


---

## DML

Manipulates data.


Commands:

```sql
INSERT
UPDATE
DELETE
```


---

## DQL


Retrieve data.


```sql
SELECT
```


---

## TCL


Transaction control.


```sql
COMMIT
ROLLBACK
```


---

# 9. SQL Joins


## INNER JOIN


Returns matching records from both tables.


Example:

```sql
SELECT *
FROM users
INNER JOIN orders
ON users.id = orders.user_id;
```


---

## LEFT JOIN


Returns all records from left table and matching records from right table.


---

## RIGHT JOIN


Returns all records from right table and matching records from left table.


---

## FULL JOIN


Returns all matching and non-matching records.


---

# 10. Database Indexing


Index:

Data structure that improves query speed.


Advantages:

- Faster searching
- Better query performance


Disadvantages:

- Extra storage
- Slower insert/update


---

# 11. Transactions


Transaction:

Group of database operations executed together.


## ACID Properties


## Atomicity

All operations succeed or none succeed.


## Consistency

Database remains valid.


## Isolation

Transactions do not interfere.


## Durability

Committed data is permanent.


---

# 12. JDBC


Java Database Connectivity.


Used to connect Java applications with databases.


---

# JDBC Flow


```
Load Driver

↓

Create Connection

↓

Create Statement

↓

Execute Query

↓

Process ResultSet

↓

Close Connection
```


---

# JDBC Components


## Driver

Connects Java application with database.


## Connection

Represents database connection.


## Statement

Executes SQL queries.


## PreparedStatement

Precompiled SQL statement.


Advantages:

- Faster
- Prevents SQL Injection


## ResultSet

Stores query results.


---

# 13. ORM


Object Relational Mapping.


Maps:

```
Java Objects

↓

Database Tables
```


Benefits:

- Less SQL code
- Faster development
- Object-oriented approach


Examples:

- Hibernate
- JPA


---

# 14. Hibernate


Hibernate:

ORM framework for Java.


Features:

- Automatic table mapping
- Query optimization
- Caching
- Transaction management


---

# Hibernate Architecture


```
Application

↓

Hibernate

↓

JDBC

↓

Database
```


---

# Important Hibernate Annotations


@Entity

Maps class to table.


@Table

Defines table name.


@Id

Primary key.


@Column

Maps field to column.


@GeneratedValue

Auto generates ID.


@OneToMany

One to many relationship.


@ManyToOne

Many to one relationship.


---

# 15. JPA


Java Persistence API.


JPA is a specification.

Hibernate is an implementation.


JPA provides:

- Entity management
- Query language
- ORM standard


---

# 16. Spring Framework


Spring:

Java framework used for enterprise applications.


Main features:

- Dependency Injection
- MVC Architecture
- Transaction Management
- Security


---

# 17. Dependency Injection


Dependency Injection:

Providing object dependencies from outside instead of creating them manually.


Without DI:

```java
Service service = new Service();
```


With DI:

```java
@Autowired
Service service;
```


Benefits:

- Loose coupling
- Easy testing
- Better maintainability


---

# 18. Spring Core Annotations


@Component

Generic Spring bean.


@Service

Business logic layer.


@Repository

Database layer.


@Controller

MVC controller.


@Autowired

Injects dependency.


@Configuration

Configuration class.


@Bean

Creates Spring managed object.


---

# 19. Spring MVC Architecture


```
Client

↓

DispatcherServlet

↓

Controller

↓

Service

↓

Repository

↓

Database
```


---

# 20. Spring Boot


Spring Boot simplifies Spring application development.


Features:

- Auto configuration
- Embedded server
- Production ready setup
- Starter dependencies


---

# Spring Boot Application Flow


```
Request

↓

Controller

↓

Service

↓

Repository

↓

Database

↓

Response
```


---

# 21. Spring Boot Annotations


@SpringBootApplication


Combination of:

- @Configuration
- @EnableAutoConfiguration
- @ComponentScan


@RestController


Creates REST APIs.


@RequestMapping


Maps URL paths.


@GetMapping


Handles GET requests.


@PostMapping


Handles POST requests.


@PutMapping


Handles PUT requests.


@DeleteMapping


Handles DELETE requests.


@PathVariable


Reads values from URL.


@RequestParam


Reads query parameters.


@RequestBody


Reads JSON request body.


---

# 22. Layered Architecture


Common Backend Structure:


```
Controller

↓

Service

↓

Repository

↓

Database
```


## Controller Layer

Handles HTTP requests.


## Service Layer

Contains business logic.


## Repository Layer

Handles database operations.


---

# 23. Exception Handling in Spring Boot


Global exception handling:


Annotation:

```
@ControllerAdvice
```


Example:

```
Exception

↓

Handler

↓

Custom Response
```


---

# 24. Spring Security


Used for:

- Authentication
- Authorization
- Protection


---

# Authentication vs Authorization


Authentication:

Who are you?


Example:

Login


Authorization:

What can you access?


Example:

Admin permissions


---

# 25. JWT Authentication


JWT:

JSON Web Token.


Used for stateless authentication.


Flow:


```
User Login

↓

Server validates credentials

↓

JWT Token Generated

↓

Client Stores Token

↓

Token Sent With Requests

↓

Server Validates Token
```


JWT Parts:


Header

Payload

Signature


---

# 26. Microservices


Architecture where application is divided into small independent services.


Example:


```
User Service

Order Service

Payment Service

Notification Service
```


---

# Monolith vs Microservices


| Monolith | Microservices |
|-|-|
| Single application | Multiple services |
| Simple deployment | Independent deployment |
| Hard to scale | Easy scaling |
| Tight coupling | Loose coupling |


---

# 27. Microservices Components


## API Gateway


Single entry point for clients.


Responsibilities:

- Routing
- Authentication
- Rate limiting


---

## Service Discovery


Automatically finds service locations.


Example:

Eureka


---

## Load Balancer


Distributes requests among servers.


---

## Circuit Breaker


Prevents cascading failures.


Example:

Resilience4j


---

## Distributed Tracing


Tracks requests across services.


Example:

Zipkin


---

# 28. Caching


Cache:

Temporary storage for frequently accessed data.


Benefits:

- Faster response
- Reduced database load


Examples:

- Redis
- Memcached


---

# 29. Message Queues


Used for asynchronous communication.


Examples:

- Kafka
- RabbitMQ


Benefits:

- Decoupling
- Scalability
- Reliability


---

# 30. Docker Basics


Docker:

Platform for packaging applications into containers.


Container contains:

- Application
- Dependencies
- Runtime


Benefits:

- Consistent environment
- Easy deployment


---

# 31. CI/CD Basics


Continuous Integration:

Automatically build and test code.


Continuous Deployment:

Automatically deploy applications.


Tools:

- Jenkins
- GitHub Actions
- GitLab CI


---

# 32. Cloud Basics


Common Cloud Providers:


- AWS
- Azure
- Google Cloud


---

# Important Backend Concepts


## Scalability

Ability to handle increasing users.


## Availability

System remains operational.


## Reliability

System performs correctly.


## Latency

Time taken to respond.


## Throughput

Number of requests handled per second.


---

# 33. Backend Design Principles


## SOLID Principles


Single Responsibility

One class should have one responsibility.


Open Closed

Open for extension, closed for modification.


Liskov Substitution

Child classes should replace parent classes.


Interface Segregation

Prefer small interfaces.


Dependency Inversion

Depend on abstractions.


---

# 34. Backend Interview Questions


## Difference between JDBC and Hibernate?


JDBC:

- Direct database interaction
- More SQL code


Hibernate:

- ORM framework
- Less SQL code


---

## Difference between JPA and Hibernate?


JPA:

Specification.


Hibernate:

Implementation of JPA.


---

## What is Dependency Injection?


Technique where dependencies are provided externally.


---

## What is REST?


Architecture style for building APIs using HTTP.


---

## Difference between PUT and PATCH?


PUT:

Complete update.


PATCH:

Partial update.


---

## What is JWT?


Token based authentication mechanism.


---

## Why use Microservices?


Benefits:

- Independent deployment
- Easy scaling
- Better maintainability


---

# Backend Quick Revision Checklist


## Database

✓ SQL  
✓ Joins  
✓ Indexing  
✓ Transactions  
✓ ACID  


## Java Database

✓ JDBC  
✓ Hibernate  
✓ JPA  


## Spring

✓ IoC  
✓ Dependency Injection  
✓ MVC  
✓ Annotations  


## Spring Boot

✓ REST API  
✓ Controllers  
✓ Exception Handling  
✓ Security  


## Microservices

✓ API Gateway  
✓ Service Discovery  
✓ Load Balancing  
✓ Circuit Breaker  


## Deployment

✓ Docker  
✓ CI/CD  
✓ Cloud Basics