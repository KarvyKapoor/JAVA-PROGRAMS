# 🔒 HTTPS (HyperText Transfer Protocol Secure)

> Quick revision notes covering HTTPS for interviews and backend development.

---

# What is HTTPS?

HTTPS (HyperText Transfer Protocol Secure) is the secure version of HTTP.

It encrypts communication between the client and server using **SSL/TLS** to protect data from unauthorized access.

Example

```text
Browser
    │
Encrypted HTTPS Request
    │
Spring Boot Server
    │
Encrypted HTTPS Response
    │
Browser
```

---

# Why HTTPS?

Without HTTPS

- Password theft
- Data interception
- Identity theft
- Man-in-the-Middle (MITM) attacks
- No secure online transactions

With HTTPS

- Secure communication
- Data encryption
- Authentication
- Data integrity
- User trust

---

# HTTP vs HTTPS

| HTTP | HTTPS |
|------|-------|
| HyperText Transfer Protocol | HyperText Transfer Protocol Secure |
| Not Encrypted | Encrypted |
| Port 80 | Port 443 |
| Less Secure | Highly Secure |
| Vulnerable to attacks | Protected using SSL/TLS |

---

# HTTPS Architecture

```text
Client (Browser)

        │

TLS Handshake

        │

Secure Connection Established

        │

Encrypted HTTP Request

        │

Web Server

        │

Encrypted HTTP Response

        │

Client
```

---

# SSL and TLS

## SSL (Secure Sockets Layer)

Older encryption protocol.

Deprecated.

---

## TLS (Transport Layer Security)

Modern encryption protocol.

More secure and faster than SSL.

Modern HTTPS uses TLS.

---

# HTTPS Workflow

```text
Client Requests Website

↓

TLS Handshake Starts

↓

Server Sends Certificate

↓

Certificate Verified

↓

Session Key Generated

↓

Encrypted Communication Begins
```

---

# TLS Handshake

The TLS Handshake establishes a secure connection before data is exchanged.

Steps

```text
Client Hello

↓

Server Hello

↓

Server Certificate

↓

Certificate Verification

↓

Key Exchange

↓

Secure Session Established
```

---

# Digital Certificate

A digital certificate proves the identity of a website.

Contains

- Domain Name
- Public Key
- Certificate Authority
- Expiry Date
- Digital Signature

---

# Certificate Authority (CA)

A trusted organization that issues digital certificates.

Examples

- Let's Encrypt
- DigiCert
- GlobalSign
- Sectigo

---

# Public Key Encryption

Uses two keys.

### Public Key

Shared publicly.

Used for encryption.

---

### Private Key

Known only to the server.

Used for decryption.

---

# Symmetric Encryption

Uses the same key for encryption and decryption.

Advantages

- Fast
- Efficient

Used after the TLS Handshake.

---

# Asymmetric Encryption

Uses

- Public Key
- Private Key

Advantages

- Secure key exchange

Used during the TLS Handshake.

---

# Why Both Encryption Methods?

```text
Asymmetric Encryption

↓

Securely Exchange Session Key

↓

Symmetric Encryption

↓

Fast Secure Communication
```

---

# HTTPS Port

Default Port

```text
443
```

HTTP uses

```text
80
```

---

# Data Integrity

HTTPS ensures that data is not modified while traveling between the client and server.

Achieved using

- Message Authentication Codes (MAC)
- Hash Functions

---

# Authentication

HTTPS verifies that users are communicating with the correct server.

Done using Digital Certificates.

---

# Common HTTPS Status Codes

HTTPS uses the same HTTP status codes.

Examples

```text
200 OK

201 Created

400 Bad Request

401 Unauthorized

403 Forbidden

404 Not Found

500 Internal Server Error
```

---

# HTTPS in Spring Boot

Spring Boot supports HTTPS using an SSL certificate.

Common Uses

- Login APIs
- Banking Applications
- Payment Gateways
- JWT Authentication
- OAuth2 Authentication
- REST APIs

---

# Benefits of HTTPS

- Encrypts sensitive data
- Prevents data theft
- Builds user trust
- Improves SEO rankings
- Required for modern browsers
- Secure online payments

---

# Common HTTPS Attacks Prevented

- Man-in-the-Middle (MITM)
- Packet Sniffing
- Session Hijacking
- Credential Theft
- Data Tampering

---

# Best Practices

- Always use HTTPS in production.
- Use trusted SSL/TLS certificates.
- Disable outdated SSL versions.
- Keep certificates updated.
- Redirect HTTP traffic to HTTPS.
- Use strong TLS versions.

---

# Common Mistakes

- Using HTTP for login pages.
- Expired SSL certificates.
- Weak encryption algorithms.
- Ignoring certificate warnings.
- Hardcoding sensitive information.

---

# Real World Use Cases

- Banking Applications
- E-commerce Websites
- Payment Gateways
- Government Portals
- Healthcare Systems
- Social Media Platforms
- Cloud Services
- REST APIs

---

# Common Interview Questions

- What is HTTPS?
- HTTP vs HTTPS?
- SSL vs TLS?
- Explain the TLS Handshake.
- What is a Digital Certificate?
- What is a Certificate Authority?
- Public Key vs Private Key?
- Symmetric vs Asymmetric Encryption?
- Why does HTTPS use Port 443?
- How does HTTPS prevent MITM attacks?

---

# Revision Checklist

- HTTPS
- SSL
- TLS
- TLS Handshake
- Digital Certificate
- Certificate Authority
- Public Key
- Private Key
- Symmetric Encryption
- Asymmetric Encryption
- Authentication
- Data Integrity
- Port 443
- HTTPS Benefits

---

# Summary

HTTPS is the secure version of HTTP that protects communication between clients and servers using TLS encryption. It ensures confidentiality, authentication, and data integrity, making it essential for modern web applications, Spring Boot REST APIs, banking systems, e-commerce platforms, and any application that handles sensitive user data.