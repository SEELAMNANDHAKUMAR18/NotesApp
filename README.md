# 📒 Java Notes App (File I/O)

## 📌 Project Title

**Java File I/O – Notes App**

---

## 🎯 Objective

This project is developed as part of the Java Developer Internship Task 4.
The objective of this project is to build a simple text-based Notes Manager using Java File I/O.
This application allows users to store and retrieve notes from a file, ensuring data persistence.

---

## 🛠️ Tools & Technologies Used

* Java (Core Java)
* VS Code / IntelliJ IDEA
* Terminal / Command Prompt

---

## 📚 Key Concepts Covered

* File I/O (FileReader, FileWriter)
* BufferedReader
* Exception Handling (try-catch)
* Try-with-resources
* Data persistence

---

## 🚀 Features

* ➕ Add new notes
* 📖 View saved notes
* 💾 Persistent storage using file system
* ⚠️ Proper exception handling
* 🔁 Uses append mode to avoid overwriting data

---

## 📂 Project Structure

```
NotesApp/
│
├── NotesApp.java     # Main Java program
├── notes.txt         # File storing notes (auto-created)
└── README.md         # Project documentation
```

---

## ▶️ How to Run the Project

### Step 1: Compile the Java File

```
javac NotesApp.java
```

### Step 2: Run the Program

```
java NotesApp
```

---

## 🖥️ Sample Output

```
===== Notes App =====
1. Add Note
2. View Notes
3. Exit
Enter choice: 1

Enter your note: Complete Java File I/O task
Note saved successfully!

===== Notes App =====
1. Add Note
2. View Notes
3. Exit
Enter choice: 2

--- Your Notes ---
- Complete Java File I/O task
```

---

## ⚙️ How It Works

1. User selects an option from the menu.
2. If "Add Note" is selected:

   * Input is taken from the user.
   * Stored in `notes.txt` using FileWriter (append mode).
3. If "View Notes" is selected:

   * FileReader + BufferedReader reads data line by line.
   * Notes are displayed on the console.
4. Exceptions are handled using try-catch blocks.

---


## 📌 Outcome

This project helped in understanding how to:

* Store data permanently using files
* Handle file operations in Java
* Manage exceptions effectively

---
