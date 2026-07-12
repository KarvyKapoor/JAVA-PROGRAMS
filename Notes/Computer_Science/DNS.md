# 🌍 DNS (Domain Name System)

> Quick revision notes covering DNS for interviews and backend development.

---

# What is DNS?

DNS (Domain Name System) is the Internet's phonebook.

It translates human readable domain names into IP addresses so computers can communicate with each other.

Example

```text
www.google.com

↓

142.250.183.14
```

Without DNS, users would have to remember IP addresses instead of website names.

---

# Why DNS?

Without DNS

- Users must remember IP addresses.
- Websites become difficult to access.
- Internet navigation becomes impractical.

With DNS

- Easy to access websites
- Faster communication
- Domain name management
- Load balancing support
- Scalable Internet infrastructure

---

# DNS Architecture

```text
User

↓

Browser

↓

Local DNS Resolver

↓

Root DNS Server

↓

TLD Server

↓

Authoritative Name Server

↓

IP Address

↓

Web Server
```

---

# How DNS Works?

Step 1

User enters

```text
www.github.com
```

↓

Step 2

Browser checks local DNS cache.

↓

Step 3

Operating System checks DNS cache.

↓

Step 4

Request goes to Local DNS Resolver.

↓

Step 5

Resolver asks Root Server.

↓

Step 6

Root Server directs request to TLD Server.

↓

Step 7

TLD Server directs request to Authoritative DNS Server.

↓

Step 8

Authoritative Server returns IP Address.

↓

Step 9

Browser connects to the server using the IP address.

---

# DNS Components

## DNS Resolver

Receives DNS requests from clients.

Examples

- ISP DNS
- Google DNS
- Cloudflare DNS

---

## Root Server

Top level DNS server.

Knows where TLD servers are located.

---

## TLD Server

Top Level Domain Server.

Examples

```text
.com

.org

.net

.edu

.in
```

---

## Authoritative Name Server

Stores actual DNS records.

Returns the final IP address.

---

# DNS Records

## A Record

Maps a domain name to an IPv4 address.

Example

```text
google.com

↓

142.250.183.14
```

---

## AAAA Record

Maps a domain name to an IPv6 address.

---

## CNAME Record

Alias of another domain.

Example

```text
blog.example.com

↓

example.com
```

---

## MX Record

Specifies mail servers.

Used for email delivery.

---

## NS Record

Specifies authoritative name servers.

---

## TXT Record

Stores text information.

Used for

- Domain Verification
- Email Authentication
- Security Policies

---

## PTR Record

Used for Reverse DNS Lookup.

Maps

```text
IP Address

↓

Domain Name
```

---

# DNS Cache

DNS responses are stored temporarily.

Caching Locations

- Browser
- Operating System
- ISP
- DNS Resolver

Advantages

- Faster lookup
- Reduced network traffic
- Better performance

---

# TTL (Time To Live)

Defines how long DNS information remains in cache.

Example

```text
TTL = 3600 seconds
```

After expiration, DNS performs a fresh lookup.

---

# Forward Lookup

Converts

```text
Domain Name

↓

IP Address
```

---

# Reverse Lookup

Converts

```text
IP Address

↓

Domain Name
```

---

# Recursive Query

DNS Resolver performs the complete lookup on behalf of the client.

---

# Iterative Query

Each DNS server returns the next server to contact until the final answer is found.

---

# Public DNS Providers

Google DNS

```text
8.8.8.8

8.8.4.4
```

Cloudflare

```text
1.1.1.1

1.0.0.1
```

OpenDNS

```text
208.67.222.222
```

---

# DNS Port

Default Port

```text
53
```

Protocols Used

- UDP
- TCP

UDP is used for most DNS queries because it is faster.

TCP is used for

- Zone Transfers
- Large DNS Responses

---

# DNS Propagation

When DNS records are updated, the changes take time to reach DNS servers around the world.

This delay is called DNS Propagation.

---

# DNS Security

Common Threats

- DNS Spoofing
- Cache Poisoning
- DNS Hijacking
- DDoS Attacks

Solutions

- DNSSEC
- HTTPS
- Secure DNS Providers
- Monitoring

---

# DNS in Spring Boot

Whenever a Spring Boot application connects to

- MySQL Database
- PostgreSQL
- Redis
- Kafka
- RabbitMQ
- External REST APIs
- AWS Services
- Microservices

DNS resolves the hostname into an IP address before communication begins.

Example

```text
inventory-service.company.com

↓

DNS

↓

10.20.30.5
```

---

# Real World Use Cases

- Website Hosting
- Cloud Computing
- Email Delivery
- API Communication
- Kubernetes
- Docker Networking
- Microservices
- CDN Services

---

# Best Practices

- Use reliable DNS providers.
- Configure backup DNS servers.
- Enable DNS caching.
- Monitor DNS records.
- Use DNSSEC for additional security.
- Keep TTL values appropriate.

---

# Common Mistakes

- Incorrect DNS records
- Expired domain names
- Forgetting DNS propagation delay
- Using very low TTL values unnecessarily
- Confusing DNS with HTTP

---

# Common Interview Questions

- What is DNS?
- Why is DNS required?
- Explain DNS Lookup Process.
- What is DNS Cache?
- What is TTL?
- A Record vs CNAME?
- What is MX Record?
- What is NS Record?
- What is PTR Record?
- DNS uses TCP or UDP?
- Why does DNS usually use UDP?
- What is DNS Propagation?
- What is DNSSEC?

---

# Revision Checklist

- DNS
- DNS Lookup
- Resolver
- Root Server
- TLD Server
- Authoritative Server
- DNS Records
- A Record
- AAAA Record
- CNAME
- MX Record
- NS Record
- TXT Record
- PTR Record
- DNS Cache
- TTL
- Recursive Query
- Iterative Query
- Port 53
- DNS Security
- DNSSEC

---

# Summary

DNS (Domain Name System) is responsible for translating human readable domain names into IP addresses, enabling users and applications to communicate over the Internet. Every backend application, including Spring Boot microservices, databases, cloud services, and external APIs, relies on DNS resolution before establishing network communication. Understanding DNS is essential for backend development, distributed systems, and software engineering interviews.