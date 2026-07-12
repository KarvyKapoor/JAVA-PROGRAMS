# 🌿 Git

> Quick revision notes covering Git for interviews and backend development.

---

# What is Git?

Git is a **distributed version control system (DVCS)** used to track changes in source code during software development.

It allows multiple developers to collaborate efficiently while maintaining the complete history of a project.

Created by **Linus Torvalds (2005).**

---

# Why Git?

Without Git

- No version history
- Difficult collaboration
- Code can be lost
- No rollback mechanism

With Git

- Version history
- Easy collaboration
- Branching and merging
- Backup of code
- Track every change

---

# Version Control System (VCS)

A Version Control System manages changes made to files over time.

Types

### Local VCS

Tracks versions on one computer.

### Centralized VCS

One central server.

Examples

- SVN
- CVS

### Distributed VCS

Every developer has a complete copy.

Example

- Git

---

# Git Architecture

```text
Working Directory
        │
      git add
        │
        ▼
 Staging Area (Index)
        │
     git commit
        │
        ▼
 Local Repository
        │
      git push
        │
        ▼
 Remote Repository
```

---

# Git Workflow

```text
Create File
      ↓
git add
      ↓
git commit
      ↓
git push
```

---

# Repository

A repository stores

- Source Code
- Commit History
- Branches
- Tags

Initialize

```bash
git init
```

---

# Clone Repository

Downloads an existing repository.

```bash
git clone <repository-url>
```

---

# Git Status

Shows current repository status.

```bash
git status
```

---

# Add Files

Add one file

```bash
git add file.java
```

Add all files

```bash
git add .
```

---

# Commit

Creates a snapshot.

```bash
git commit -m "Add login feature"
```

A good commit message should be short and meaningful.

---

# View History

```bash
git log
```

Compact

```bash
git log --oneline
```

---

# Branch

Create

```bash
git branch feature/login
```

View

```bash
git branch
```

Delete

```bash
git branch -d feature/login
```

---

# Switch Branch

```bash
git checkout feature/login
```

Modern command

```bash
git switch feature/login
```

---

# Create and Switch

```bash
git checkout -b feature/login
```

or

```bash
git switch -c feature/login
```

---

# Merge

Merge one branch into another.

```bash
git merge feature/login
```

---

# Merge Conflict

Occurs when Git cannot automatically merge changes.

Resolve by

- Editing conflicting files
- Removing conflict markers
- Commit again

---

# Remote Repository

Add remote

```bash
git remote add origin <url>
```

View

```bash
git remote -v
```

---

# Push

Upload commits.

```bash
git push origin main
```

---

# Pull

Download latest changes.

```bash
git pull origin main
```

---

# Fetch

Downloads changes without merging.

```bash
git fetch
```

---

# Difference

| Pull | Fetch |
|------|--------|
| Download + Merge | Download only |

---

# Restore Changes

Discard file changes

```bash
git restore file.java
```

Unstage

```bash
git restore --staged file.java
```

---

# Reset

Soft

```bash
git reset --soft HEAD~1
```

Mixed

```bash
git reset HEAD~1
```

Hard

```bash
git reset --hard HEAD~1
```

---

# Stash

Temporarily save changes.

```bash
git stash
```

Restore

```bash
git stash pop
```

---

# Tag

Create release.

```bash
git tag v1.0
```

---

# Ignore Files

`.gitignore`

Example

```text
target/
.idea/
*.class
*.log
.env
```

---

# HEAD

HEAD points to the latest commit.

---

# Git Best Practices

- Commit frequently
- Write meaningful commit messages
- Pull before pushing
- Use feature branches
- Never commit secrets
- Keep commits focused
- Review changes before commit

---

# Common Mistakes

- Committing generated files
- Force pushing unnecessarily
- Large commits
- Working directly on main
- Ignoring merge conflicts

---

# Git in Spring Boot

Used for

- Source code
- CI/CD
- Deployment
- Team collaboration
- Version management

---

# Real World Use Cases

- Software Development
- Open Source
- Enterprise Applications
- DevOps
- CI/CD Pipelines
- Microservices

---

# Common Interview Questions

- What is Git?
- Git vs GitHub?
- What is a commit?
- What is HEAD?
- git pull vs git fetch?
- git merge vs rebase?
- What is stash?
- What is cherry-pick?
- What is a detached HEAD?
- Explain Git workflow.

---

# Revision Checklist

- Git
- Repository
- Commit
- Branch
- Merge
- Merge Conflict
- Clone
- Push
- Pull
- Fetch
- Reset
- Restore
- Stash
- Tag
- HEAD
- .gitignore

---

# Summary

Git is the industry-standard distributed version control system used to manage source code, collaborate with teams, and maintain project history. It is an essential tool for every Java Backend Developer and is heavily used in enterprise software development.