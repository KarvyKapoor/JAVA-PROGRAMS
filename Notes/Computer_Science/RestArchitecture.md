# 🌐 REST Architecture

> Quick revision notes covering REST Architecture for interviews and backend development.

---

# What is REST?

REST (Representational State Transfer) is an architectural style for designing scalable and maintainable web services.

It was introduced by **Roy Fielding** in his PhD dissertation in 2000.

REST APIs use HTTP to communicate between clients and servers.

---

# Why REST?

Without REST

- No standard API design
- Difficult integration
- Tight coupling
- Poor scalability

With REST

- Standardized APIs
- Loose coupling
- Scalable applications
- Easy integration
- Platform independent

---

# REST Architecture

```text
Client

↓

HTTP Request

↓

REST API

↓

Business Logic

↓

Database

↓

HTTP Response

↓

Client
```

---

# REST Principles

## Client Server

Client and server are independent.

Example

- React Frontend
- Spring Boot Backend

---

## Stateless

Each request contains all information required.

Server does not remember previous requests.

Authentication

- JWT
- OAuth

---

## Cacheable

Responses can be cached.

Benefits

- Faster APIs
- Reduced Server Load

---

## Uniform Interface

Standard resource-based URLs.

Example

```text
/users

/products

/orders
```

---

## Layered System

Client does not know whether it connects directly to the server or through

- Load Balancer
- API Gateway
- Reverse Proxy

---

## Code on Demand (Optional)

Server may send executable code.

Rarely used.

---

# Resource

Everything in REST is treated as a Resource.

Examples

```text
/users

/orders

/products

/payments
```

---

# URI

Unique identifier for resources.

Example

```text
/api/users/10
```

---

# REST Endpoint

A URL representing a resource.

Examples

```text
GET /users

POST /users

PUT /users/1

DELETE /users/1
```

---

# CRUD Operations

| Operation | HTTP Method |
|------------|-------------|
| Create | POST |
| Read | GET |
| Update | PUT/PATCH |
| Delete | DELETE |

---

# HTTP Methods

## GET

Retrieve data.

---

## POST

Create data.

---

## PUT

Replace entire resource.

---

## PATCH

Update partial resource.

---

## DELETE

Delete resource.

---

# REST Request

Contains

- URL
- HTTP Method
- Headers
- Request Body

---

# REST Response

Contains

- Status Code
- Headers
- Response Body

---

# HTTP Status Codes

## Success

```text
200 OK

201 Created

204 No Content
```

---

## Client Errors

```text
400 Bad Request

401 Unauthorized

403 Forbidden

404 Not Found
```

---

## Server Errors

```text
500 Internal Server Error

503 Service Unavailable
```

---

# Request Body

Usually JSON.

Example

```json
{
  "name":"John",
  "email":"john@gmail.com"
}
```

---

# Response Body

Example

```json
{
  "id":1,
  "name":"John"
}
```

---

# Path Variable

Example

```text
GET /users/5
```

Spring Boot

```java
@GetMapping("/users/{id}")
```

---

# Query Parameter

Example

```text
GET /users?page=1&size=10
```

Used for

- Filtering
- Sorting
- Pagination

---

# Headers

Common Headers

```text
Authorization

Content-Type

Accept

Cache-Control
```

---

# Content Types

```text
application/json

application/xml

multipart/form-data
```

---

# REST Constraints

- Client Server
- Stateless
- Cacheable
- Uniform Interface
- Layered System
- Code on Demand (Optional)

---

# REST Best Practices

- Use nouns in URLs.

Good

```text
/users
```

Bad

```text
/getUsers
```

---

Use proper HTTP methods.

---

Return meaningful status codes.

---

Keep APIs stateless.

---

Use versioning.

Example

```text
/api/v1/users
```

---

Validate user input.

---

Handle exceptions globally.

---

Return consistent JSON responses.

---

# REST in Spring Boot

Common Annotations

```java
@RestController

@RequestMapping

@GetMapping

@PostMapping

@PutMapping

@PatchMapping

@DeleteMapping

@RequestBody

@PathVariable

@RequestParam
```

---

# REST vs SOAP

| REST | SOAP |
|------|------|
| Lightweight | Heavy |
| JSON/XML | XML Only |
| Faster | Slower |
| Easy | Complex |
| HTTP | Multiple Protocols |

---

# Advantages

- Scalable
- Platform Independent
- Fast
- Lightweight
- Easy Integration

---

# Disadvantages

- Stateless
- No built-in Security
- No Standard Contract
- Versioning Challenges

---

# Real World Use Cases

- Banking APIs
- E-commerce
- Food Delivery
- Social Media
- Payment Gateways
- Microservices
- Mobile Applications

---

# Common Interview Questions

- What is REST?
- REST vs SOAP?
- What are REST constraints?
- Why is REST stateless?
- PUT vs PATCH?
- URI vs URL?
- Path Variable vs Query Parameter?
- Why use JSON?
- What makes a good REST API?

---

# Revision Checklist

- REST
- Resources
- URI
- Endpoint
- HTTP Methods
- CRUD
- Status Codes
- Path Variable
- Query Parameter
- Headers
- REST Constraints
- REST Best Practices
- REST vs SOAP

---

# Summary

REST is the most widely used architectural style for building web APIs. Spring Boot applications expose REST APIs using HTTP methods, JSON, and resource-based URLs. A strong understanding of REST principles is essential for designing scalable, maintainable, and industry-standard backend systems.