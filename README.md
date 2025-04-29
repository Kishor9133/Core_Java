# Core_Java
Learning Java Concepts
Sure! Here's your Git workflow and command guide in a clean **README.md** format — perfect for saving in your repository or for personal reference:

---

```markdown
# 🚀 Git Workflow Guide for Core_Java

This guide explains how to use Git for managing the `Core_Java` project, especially useful when working on multiple systems.

---

## 🔧 Git Configuration (One-time Setup per System)

Run these commands to set your name and email for Git commits:

```bash
git config --global user.name "Kishor"
git config --global user.email "kishor.k3113@gmail.com"
```

---

## 📦 Cloning the Repository (First-Time Only)

To clone the repository from GitHub:

```bash
git clone https://github.com/Kishor9133/Core_Java.git
```

This creates a `Core_Java` folder with all the project files.

---

## 🔁 Working with the Repository

If the project folder already exists on your system:

```bash
cd Core_Java
git pull  # Get the latest changes from GitHub
```

---

## 💼 Making and Committing Changes

### 1. Check the current status:
```bash
git status
```

### 2. Stage changes:
```bash
git add .           # Stage all changes
# OR
git add <file>      # Stage a specific file
```

### 3. Commit changes:
```bash
git commit -m "Your commit message"
```

### 4. Push to GitHub:
```bash
git push
```

---

## 🛠️ Common Git Commands

| Command                           | Description |
|----------------------------------|-------------|
| `git status`                     | Show modified files |
| `git add .`                      | Stage all files |
| `git commit -m "msg"`            | Commit with message |
| `git push`                       | Push changes to remote |
| `git pull`                       | Pull latest changes |
| `git log`                        | View commit history |
| `git diff`                       | Show file differences |
| `git branch`                     | List branches |
| `git checkout <branch>`         | Switch branch |
| `git checkout -b <new-branch>`  | Create and switch to a new branch |
| `git stash`                      | Save changes temporarily |
| `git stash pop`                  | Apply stashed changes |
| `git reset <file>`              | Unstage a file |
| `git reset --hard`              | Reset all local changes (⚠️ use carefully) |

---

## 💡 Tips

- Always run `git pull` before making changes.
- Write clear and descriptive commit messages.
- Use branches for new features or experiments.
- Add a `.gitignore` file to ignore unnecessary files (e.g., `.class`, `.log`, etc.).

---

## ✅ Example Workflow

```bash
cd Core_Java
git pull
git status
git add .
git commit -m "Added new feature"
git push
```

---

Happy Coding! 🚀
```

---

Let me know if you'd like this saved as an actual file (`README.md`) or if you want to customize it further (like adding `.gitignore` examples for Java).
