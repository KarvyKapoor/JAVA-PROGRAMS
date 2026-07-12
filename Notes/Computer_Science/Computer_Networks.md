# 🌐 Computer Networks

> Quick revision notes covering Computer Networks for interviews and backend development.

---

# What is a Computer Network?

A Computer Network is a collection of interconnected devices that communicate and share resources using communication protocols.

Examples

- Internet
- Office Network
- Mobile Network
- Cloud Infrastructure

---

# Why Computer Networks?

Without Networks

- No communication
- No Internet
- No file sharing
- No cloud computing

With Networks

- Data communication
- Resource sharing
- Remote access
- Cloud services
- Distributed systems

---

# Types of Networks

- PAN (Personal Area Network)
- LAN (Local Area Network)
- MAN (Metropolitan Area Network)
- WAN (Wide Area Network)

---

# Network Architecture

## Client Server

One server serves multiple clients.

Example

Browser → Spring Boot API

---

## Peer to Peer (P2P)

All devices are equal.

Example

Torrent

---

# Network Devices

- Router
- Switch
- Hub
- Bridge
- Repeater
- Modem
- Gateway
- Firewall

---

# Router

Connects multiple networks.

Works on

Layer 3

---

# Switch

Connects devices within a LAN.

Works on

Layer 2

Uses MAC Address.

---

# Hub

Broadcasts data to every connected device.

Less efficient than Switch.

---

# Modem

Converts digital signals to analog and vice versa.

Used for Internet connectivity.

---

# Firewall

Protects the network by filtering incoming and outgoing traffic.

---

# Network Topologies

- Bus
- Star
- Ring
- Mesh
- Tree

Most modern LANs use **Star Topology**.

---

# OSI Model

```text
7. Application
6. Presentation
5. Session
4. Transport
3. Network
2. Data Link
1. Physical
```

---

# OSI Layers

## Layer 7

Application

Examples

- HTTP
- HTTPS
- FTP
- SMTP

---

## Layer 6

Presentation

Responsibilities

- Encryption
- Compression
- Translation

---

## Layer 5

Session

Manages communication sessions.

---

## Layer 4

Transport

Protocols

- TCP
- UDP

Responsibilities

- Reliable Delivery
- Error Detection
- Flow Control

---

## Layer 3

Network

Protocol

IP

Responsible for routing.

---

## Layer 2

Data Link

Uses

MAC Address

---

## Layer 1

Physical

Transfers raw bits.

---

# TCP/IP Model

```text
Application

Transport

Internet

Network Access
```

---

# TCP

Transmission Control Protocol

Characteristics

- Reliable
- Connection Oriented
- Ordered Delivery
- Error Checking

Used in

- HTTP
- HTTPS
- Email
- Banking

---

# UDP

User Datagram Protocol

Characteristics

- Fast
- Connectionless
- No guaranteed delivery

Used in

- Video Calls
- Gaming
- Live Streaming
- DNS

---

# TCP vs UDP

| TCP | UDP |
|------|------|
| Reliable | Faster |
| Connection Oriented | Connectionless |
| Ordered | Unordered |
| Error Recovery | No Recovery |

---

# IP Address

Unique identifier of a device.

Types

- IPv4
- IPv6

Example

```text
192.168.1.10
```

---

# MAC Address

Unique physical address of a network device.

Assigned by manufacturer.

---

# Port Number

Identifies a specific service.

Common Ports

| Port | Service |
|------|----------|
| 20/21 | FTP |
| 22 | SSH |
| 25 | SMTP |
| 53 | DNS |
| 80 | HTTP |
| 110 | POP3 |
| 143 | IMAP |
| 443 | HTTPS |
| 3306 | MySQL |
| 5432 | PostgreSQL |
| 8080 | Spring Boot |

---

# Socket

Combination of

```text
IP Address

+

Port Number
```

Used for communication.

---

# DNS

Converts domain names into IP addresses.

Example

```text
google.com

↓

142.250.x.x
```

---

# HTTP

Application layer protocol used for web communication.

---

# HTTPS

Secure version of HTTP using SSL/TLS.

---

# URL

Example

```text
https://example.com/api/users
```

Components

- Protocol
- Domain
- Path
- Query Parameters

---

# Packet

Small unit of transmitted data.

---

# Bandwidth

Maximum amount of data transferred per second.

Higher bandwidth means more data can be transmitted.

---

# Latency

Time taken for data to travel.

Lower latency is better.

---

# Throughput

Actual amount of successfully transferred data.

---

# Network Protocols

- HTTP
- HTTPS
- FTP
- SSH
- SMTP
- DNS
- DHCP
- TCP
- UDP

---

# Three Way Handshake (TCP)

```text
Client

SYN
↓

Server

SYN + ACK
↓

Client

ACK
```

Connection Established.

---

# Four Way Handshake

Used to terminate a TCP connection.

---

# Common Commands

Check IP

```bash
ip addr
```

Ping

```bash
ping google.com
```

Trace Route

```bash
traceroute google.com
```

DNS Lookup

```bash
nslookup google.com
```

---

# Computer Networks in Spring Boot

Every REST API depends on networking.

Used for

- Client Server Communication
- HTTP Requests
- Database Connections
- Microservices
- API Gateway
- Load Balancers

---

# Best Practices

- Use HTTPS.
- Validate network requests.
- Configure firewalls.
- Use connection pooling.
- Monitor latency.
- Secure APIs.

---

# Common Mistakes

- Confusing IP and MAC Address
- TCP vs UDP confusion
- Ignoring network security
- Hardcoding IP addresses
- Not using HTTPS

---

# Real World Use Cases

- REST APIs
- Cloud Computing
- Banking Systems
- Video Streaming
- Online Gaming
- Social Media
- Microservices
- Kubernetes Networking

---

# Common Interview Questions

- What is a Computer Network?
- Explain the OSI Model.
- Explain the TCP/IP Model.
- TCP vs UDP?
- What is an IP Address?
- What is a MAC Address?
- What is a Port Number?
- What is a Socket?
- What is DNS?
- What is HTTP?
- What is HTTPS?
- Explain the TCP Three Way Handshake.
- What is Latency?
- What is Bandwidth?
- What is Throughput?

---

# Revision Checklist

- Computer Networks
- Network Types
- Network Devices
- Network Topologies
- OSI Model
- TCP/IP Model
- TCP
- UDP
- IP Address
- MAC Address
- Port Number
- Socket
- DNS
- HTTP
- HTTPS
- URL
- Packet
- Bandwidth
- Latency
- Throughput
- Three Way Handshake

---

# Summary

Computer Networks enable communication between devices over wired and wireless connections. Understanding networking concepts such as the OSI model, TCP/IP, IP addressing, ports, sockets, DNS, HTTP, and HTTPS is essential for Java Backend Engineers because every Spring Boot application, REST API, and microservice relies on these fundamentals. These topics are frequently tested in software engineering interviews and are critical for building scalable distributed systems.