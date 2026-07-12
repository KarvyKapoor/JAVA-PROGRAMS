# 🐧 Linux

> Quick revision notes covering Linux for interviews and backend development.

---

# What is Linux?

Linux is an open source operating system widely used for servers, cloud computing, backend development, and DevOps.

Most production Java applications run on Linux servers.

---

# Why Linux?

Without Linux

- Limited server compatibility
- Less control
- Expensive licensing

With Linux

- Stable
- Secure
- Fast
- Free
- Highly customizable

---

# Linux Architecture

```text
Applications
      │
Shell (Bash)
      │
Kernel
      │
Hardware
```

---

# Components

- Kernel
- Shell
- File System
- User Space
- Hardware

---

# Kernel

The core of Linux.

Responsibilities

- Process Management
- Memory Management
- File Management
- Device Management

---

# Shell

Interface between user and kernel.

Popular Shells

- Bash
- Zsh
- Fish

---

# Linux File System

```text
/

├── bin
├── boot
├── dev
├── etc
├── home
├── lib
├── media
├── opt
├── proc
├── root
├── tmp
├── usr
└── var
```

---

# Important Directories

| Directory | Purpose |
|------------|----------|
| /home | User files |
| /etc | Configuration files |
| /var | Logs |
| /tmp | Temporary files |
| /usr | Installed programs |
| /bin | Essential commands |

---

# Navigation Commands

Current Directory

```bash
pwd
```

List Files

```bash
ls
```

Change Directory

```bash
cd
```

Create Folder

```bash
mkdir project
```

Remove Folder

```bash
rm -r folder
```

---

# File Commands

Create File

```bash
touch file.txt
```

Copy

```bash
cp source.txt destination.txt
```

Move

```bash
mv file.txt folder/
```

Delete

```bash
rm file.txt
```

View File

```bash
cat file.txt
```

---

# Search Commands

Find Files

```bash
find .
```

Search Text

```bash
grep "Spring" file.txt
```

---

# Permissions

View

```bash
ls -l
```

Change Permissions

```bash
chmod 755 file.sh
```

Change Owner

```bash
chown user file.txt
```

---

# Process Commands

Running Processes

```bash
ps
```

Real-time Processes

```bash
top
```

Kill Process

```bash
kill PID
```

---

# Disk Commands

Disk Usage

```bash
df -h
```

Folder Size

```bash
du -sh folder
```

---

# Networking Commands

IP Address

```bash
ip addr
```

Ping

```bash
ping google.com
```

Download File

```bash
curl URL
```

---

# Package Managers

Ubuntu

```bash
apt
```

Fedora

```bash
dnf
```

CentOS

```bash
yum
```

---

# Environment Variables

View

```bash
echo $PATH
```

Create

```bash
export JAVA_HOME=/path/to/java
```

---

# Redirection

Output

```bash
>
```

Append

```bash
>>
```

Input

```bash
<
```

Pipe

```bash
|
```

---

# SSH

Securely connect to remote servers.

```bash
ssh user@server-ip
```

---

# Linux in Backend Development

Used for

- Spring Boot Deployment
- Docker
- Kubernetes
- Nginx
- Apache
- Jenkins
- AWS Servers

---

# Best Practices

- Use meaningful file names.
- Avoid working as root.
- Keep software updated.
- Learn terminal shortcuts.
- Understand permissions.
- Backup important files.

---

# Common Mistakes

- Using `rm -rf` carelessly
- Incorrect file permissions
- Running everything as root
- Forgetting file ownership
- Ignoring logs

---

# Real World Use Cases

- Cloud Servers
- AWS EC2
- Docker Containers
- Kubernetes Clusters
- CI/CD Pipelines
- Backend API Hosting

---

# Common Interview Questions

- What is Linux?
- Kernel vs Shell?
- Explain Linux file system.
- chmod vs chown?
- Difference between grep and find?
- What is PATH?
- What is SSH?
- Why do backend developers use Linux?

---

# Revision Checklist

- Linux Architecture
- Kernel
- Shell
- File System
- Navigation Commands
- File Commands
- Search Commands
- Permissions
- Process Commands
- Disk Commands
- Networking Commands
- Package Managers
- Environment Variables
- SSH

---

# Summary

Linux is the most widely used operating system for backend development and cloud infrastructure. Every Java Backend Engineer should be comfortable with Linux commands, file management, permissions, networking, and server administration, as these skills are essential for deploying and maintaining production applications.