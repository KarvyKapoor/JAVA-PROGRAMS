# 🌐 HTTP (HyperText Transfer Protocol)

> Quick revision notes covering HTTP for interviews and backend development.

---

# What is HTTP?

HTTP (HyperText Transfer Protocol) is an application layer protocol used for communication between a client and a server over the Internet.

It follows a **request-response** model.

Example

```text
Browser
   │
HTTP Request
   │
Spring Boot Server
   │
HTTP Response
   │
Browser
```

---

# Why HTTP?

Without HTTP

- No websites
- No REST APIs
- No browser-server communication
- No web applications

With HTTP

- Standard communication protocol
- Platform independent
- Fast client-server communication
- Foundation of REST APIs

---

# HTTP Architecture

```text
Client (Browser/Postman)

        │

HTTP Request

        │

Web Server

        │

Application (Spring Boot)

        │

Database

        │

HTTP Response

        │

Client
```

---

# Characteristics of HTTP

- Stateless
- Client-Server Architecture
- Request-Response Protocol
- Application Layer Protocol
- Text-Based Protocol
- Extensible using Headers

---

# Stateless Protocol

HTTP does **not** remember previous requests.

Each request is independent.

State can be maintained using

- Cookies
- Sessions
- JWT Tokens

---

# HTTP Request Structure

```text
Request Line

Headers

Blank Line

Body
```

Example

```http
POST /api/users HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
   "name":"John"
}
```

---

# HTTP Response Structure

```text
Status Line

Headers

Blank Line

Response Body
```

Example

```http
HTTP/1.1 200 OK

Content-Type: application/json

{
   "message":"Success"
}
```

---

# HTTP Methods

## GET

Retrieve data.

Example

```http
GET /users
```

Properties

- Safe
- Idempotent

---

## POST

Create new resource.

Example

```http
POST /users
```

Properties

- Not Idempotent

---

## PUT

Update the entire resource.

Example

```http
PUT /users/1
```

Properties

- Idempotent

---

## PATCH

Partially update a resource.

Example

```http
PATCH /users/1
```

---

## DELETE

Delete a resource.

Example

```http
DELETE /users/1
```

Properties

- Idempotent

---

## HEAD

Returns only response headers.

---

## OPTIONS

Returns supported HTTP methods.

---

# Safe Methods

Methods that do not modify server data.

Examples

- GET
- HEAD
- OPTIONS

---

# Idempotent Methods

Calling multiple times gives the same result.

Examples

- GET
- PUT
- DELETE
- HEAD

---

# HTTP Status Codes

## 1xx Informational

```text
100 Continue
```

---

## 2xx Success

```text
200 OK

201 Created

202 Accepted

204 No Content
```

---

## 3xx Redirection

```text
301 Moved Permanently

302 Found

304 Not Modified
```

---

## 4xx Client Errors

```text
400 Bad Request

401 Unauthorized

403 Forbidden

404 Not Found

405 Method Not Allowed

409 Conflict
```

---

## 5xx Server Errors

```text
500 Internal Server Error

502 Bad Gateway

503 Service Unavailable

504 Gateway Timeout
```

---

# HTTP Headers

Headers provide metadata about requests and responses.

Common Request Headers

```text
Host

Authorization

Content-Type

Accept

User-Agent

Origin
```

Common Response Headers

```text
Content-Type

Cache-Control

Location

Set-Cookie
```

---

# Content Types (MIME Types)

```text
application/json

application/xml

text/plain

text/html

multipart/form-data

application/pdf
```

---

# Request Body

Used mainly with

- POST
- PUT
- PATCH

Usually contains JSON.

Example

```json
{
  "name": "Alice",
  "email": "alice@example.com"
}
```

---

# Response Body

Contains the requested resource or server response.

Usually JSON.

---

# Cookies

Small pieces of data stored in the browser.

Uses

- Login Sessions
- User Preferences
- Tracking

---

# Sessions

Stores user data on the server.

Each session has a unique Session ID.

---

# HTTP and REST APIs

| HTTP Method | CRUD Operation |
|--------------|---------------|
| GET | Read |
| POST | Create |
| PUT | Update |
| PATCH | Partial Update |
| DELETE | Delete |

---

# HTTP Versions

## HTTP/1.1

Persistent Connections.

---

## HTTP/2

- Multiplexing
- Header Compression
- Faster

---

## HTTP/3

Uses QUIC over UDP.

Improves performance and reduces latency.

---

# Common Ports

| Protocol | Port |
|-----------|------|
| HTTP | 80 |
| HTTPS | 443 |

---

# HTTP in Spring Boot

Common Annotations

```java
@GetMapping

@PostMapping

@PutMapping

@PatchMapping

@DeleteMapping

@RequestBody

@PathVariable

@RequestParam

@ResponseStatus
```

---

# Best Practices

- Use correct HTTP methods.
- Return meaningful status codes.
- Use JSON for APIs.
- Validate requests.
- Keep APIs stateless.
- Use HTTPS in production.

---

# Common Mistakes

- Using GET to modify data.
- Returning incorrect status codes.
- Sending sensitive data in URLs.
- Ignoring validation.
- Not handling errors properly.

---

# Real World Use Cases

- REST APIs
- Spring Boot Applications
- Mobile Applications
- E-commerce Platforms
- Banking Systems
- Microservices

---

# Common Interview Questions

- What is HTTP?
- Why is HTTP stateless?
- Explain the request-response cycle.
- GET vs POST?
- PUT vs PATCH?
- Safe vs Idempotent methods?
- Common HTTP status codes?
- What are HTTP headers?
- Cookies vs Sessions?
- HTTP/1.1 vs HTTP/2 vs HTTP/3?

---

# Revision Checklist

- HTTP
- Stateless
- Request Structure
- Response Structure
- HTTP Methods
- Safe Methods
- Idempotent Methods
- Status Codes
- Headers
- Cookies
- Sessions
- Content Types
- REST Mapping
- HTTP Versions

---

# Summary

HTTP is the foundation of web communication and the protocol used by browsers, mobile apps, and REST APIs to communicate with servers. Every Spring Boot backend application relies on HTTP methods, headers, status codes, and the request-response model to exchange data efficiently and consistently.