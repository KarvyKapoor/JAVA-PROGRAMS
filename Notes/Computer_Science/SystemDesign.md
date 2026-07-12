# 🏗️ System Design Basics

> Quick revision notes covering System Design fundamentals for interviews and backend development.

---

# What is System Design?

System Design is the process of designing the architecture, components, databases, APIs, and infrastructure of a software system to meet business and technical requirements.

It focuses on building systems that are

- Scalable
- Reliable
- Secure
- Maintainable
- High Performance

---

# Why System Design?

Without System Design

- Poor scalability
- Frequent failures
- Difficult maintenance
- High latency
- Single points of failure

With System Design

- Scalable applications
- Better performance
- High availability
- Easier maintenance
- Fault tolerance

---

# System Design Goals

- Scalability
- Reliability
- Availability
- Maintainability
- Security
- Performance
- Fault Tolerance

---

# High Level Design (HLD)

Focuses on overall architecture.

Includes

- Architecture Diagram
- Services
- Database
- APIs
- Load Balancer
- Cache
- Message Queue

Example

```text
Client

↓

Load Balancer

↓

Spring Boot API

↓

Redis

↓

MySQL
```

---

# Low Level Design (LLD)

Focuses on implementation details.

Includes

- Classes
- Interfaces
- Methods
- Design Patterns
- Relationships

---

# Functional Requirements

Describe what the system should do.

Examples

- User Login
- Book Tickets
- Place Orders

---

# Non Functional Requirements

Describe system qualities.

Examples

- Performance
- Scalability
- Availability
- Security
- Reliability

---

# Scalability

Ability of a system to handle increasing users or requests.

---

# Vertical Scaling

Increase resources of one machine.

Example

```text
8 GB RAM

↓

32 GB RAM
```

Advantages

- Simple

Disadvantages

- Hardware limits

---

# Horizontal Scaling

Add more servers.

Example

```text
Server 1

Server 2

Server 3
```

Advantages

- Better scalability
- Fault tolerance

---

# Availability

Percentage of time the system remains operational.

Example

```text
99.99%
```

---

# Reliability

Ability of a system to perform correctly over time.

---

# Fault Tolerance

Ability to continue operating even if components fail.

Examples

- Multiple servers
- Replication
- Failover

---

# Load Balancer

Distributes incoming requests across multiple servers.

Benefits

- Better performance
- High availability
- Prevents server overload

Examples

- Nginx
- HAProxy
- AWS ELB

---

# Database Scaling

## Read Replicas

Handle read requests.

---

## Database Sharding

Split database into smaller databases.

Used when data becomes very large.

---

# Caching

Stores frequently accessed data.

Benefits

- Faster responses
- Reduced database load

Examples

- Redis
- Memcached

---

# CDN (Content Delivery Network)

Stores static content closer to users.

Examples

- Images
- CSS
- JavaScript
- Videos

Examples

- Cloudflare
- AWS CloudFront

---

# Message Queue

Allows asynchronous communication between services.

Examples

- Apache Kafka
- RabbitMQ

Benefits

- Loose coupling
- Better scalability
- Faster response time

---

# API Gateway

Acts as a single entry point for multiple services.

Responsibilities

- Authentication
- Routing
- Rate Limiting
- Logging

---

# Monolithic Architecture

Entire application deployed as one unit.

Advantages

- Easy to develop
- Easy to test

Disadvantages

- Difficult to scale
- Large codebase

---

# Microservices Architecture

Application divided into multiple independent services.

Advantages

- Independent deployment
- Better scalability
- Fault isolation

Disadvantages

- Complex
- Network communication
- Distributed transactions

---

# CAP Theorem

Distributed systems can guarantee only two of the following three:

- Consistency
- Availability
- Partition Tolerance

---

# Consistency

All users see the same data.

---

# Availability

Every request receives a response.

---

# Partition Tolerance

System continues operating despite network failures.

---

# Database Choices

## SQL

Examples

- MySQL
- PostgreSQL

Best for

- Banking
- Transactions

---

## NoSQL

Examples

- MongoDB
- Cassandra

Best for

- Large scale applications
- Flexible schema

---

# Rate Limiting

Restricts number of requests from a client.

Benefits

- Prevent abuse
- Protect servers

---

# Logging

Stores application events.

Examples

- Logback
- ELK Stack

---

# Monitoring

Tracks application health.

Examples

- Prometheus
- Grafana

---

# Load Testing

Measures application performance under heavy traffic.

Tools

- JMeter
- Gatling

---

# Security

Common techniques

- HTTPS
- JWT
- OAuth2
- Input Validation
- Encryption

---

# Design Patterns Used

- Singleton
- Factory
- Builder
- Strategy
- Observer

---

# System Design in Spring Boot

Typical Production Architecture

```text
Client

↓

Load Balancer

↓

API Gateway

↓

Spring Boot Microservices

↓

Redis Cache

↓

Kafka

↓

MySQL

↓

Monitoring
```

---

# Best Practices

- Design for scalability.
- Avoid single points of failure.
- Use caching wisely.
- Keep services loosely coupled.
- Monitor system health.
- Secure APIs.
- Document architecture.

---

# Common Mistakes

- Ignoring scalability
- No caching
- Tight coupling
- Poor database design
- No monitoring
- No logging
- Overengineering

---

# Real World Use Cases

- Amazon
- Netflix
- Uber
- Flipkart
- Swiggy
- PhonePe
- Razorpay
- YouTube

---

# Common Interview Questions

- What is System Design?
- HLD vs LLD?
- Vertical vs Horizontal Scaling?
- What is a Load Balancer?
- What is Caching?
- SQL vs NoSQL?
- What is Sharding?
- What is Replication?
- Explain CAP Theorem.
- Monolith vs Microservices?
- What is an API Gateway?
- Why use Kafka?
- How do you design a scalable backend?

---

# Revision Checklist

- System Design
- HLD
- LLD
- Functional Requirements
- Non Functional Requirements
- Scalability
- Vertical Scaling
- Horizontal Scaling
- Availability
- Reliability
- Fault Tolerance
- Load Balancer
- Caching
- CDN
- API Gateway
- Message Queue
- Monolith
- Microservices
- CAP Theorem
- SQL vs NoSQL
- Logging
- Monitoring
- Security

---

# Summary

System Design is the foundation of building scalable and reliable software systems. Every production-ready Java Spring Boot application relies on concepts such as load balancing, caching, databases, messaging, monitoring, and microservices. Understanding these fundamentals is essential for designing systems that can serve millions of users and is a core requirement for backend engineering interviews at product-based companies.