# 🎓 Student Management System

> A Java Swing-based desktop application for managing student records with teacher authentication

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Swing](https://img.shields.io/badge/GUI-Swing-orange?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![OOP](https://img.shields.io/badge/Course-OOP1-blue?style=for-the-badge)](https://github.com/MH-SHUVO20/Student-Management-System)

## 📝 About This Project

This is my **first Java desktop application** as a Computer Science student, developed as part of our **Object-Oriented Programming 1 (Java)** course project. It demonstrates fundamental concepts of Java programming and OOP principles through a practical student management system.

**Key Concepts Demonstrated:**
- Object-Oriented Programming (OOP) concepts
- GUI development with Java Swing
- File I/O operations
- Event handling
- User authentication

> **Academic Note:** This is a course project completed as part of OOP1 (Java) curriculum. As a learning project, it focuses on demonstrating core OOP principles and Java programming concepts.

---

## ✨ Features

### 🔐 Authentication System
- **Teacher Registration**: New teachers can register with complete profile information
- **Teacher Login**: Secure login system with credentials stored in text files
- **Session Management**: Logout functionality to end current session

### 👨‍🎓 Student Management
- **Add Students**: Register new students with comprehensive details
- **Update Students**: Modify existing student information
- **Delete Students**: Remove student records from the system
- **Search Students**: Filter students by ID, Name, CGPA, Address, Date of Birth, or Enrollment Date
- **View All Students**: Display all student records in an interactive table format

### 📊 Dashboard Features
- **Teacher Dashboard**: Central hub for accessing all features
- **Report System**: Teachers can submit reports about sections

---

## 🏗️ Project Structure

```
Student-Management-System/
│
└── 📁 loginframe/
    │
    ├── 🚀 start.java                              # Main entry point
    ├── 🔐 logindemo.java                          # Login screen
    ├── 📝 registation.java                        # Teacher registration
    ├── 🏠 TeacherDashboard.java                   # Teacher dashboard
    ├── 📊 ExtendedStudentManagementSystem.java    # Student CRUD operations
    ├── 👤 Student.java                            # Student model class
    ├── 📄 secondframe.java                        # Report submission
    │
    ├── 📁 textfile/                               # Data storage directory
    │   ├── login.txt                              # Login credentials
    │   └── regsitration.txt                       # Registration data
    │
    └── 🖼️ Assets/                                 # Image resources
        ├── Background.png
        ├── dashboard.png
        ├── deshboard.jpg
        └── atm.jpg
```

---

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or text editor with Java support

### Installation & Running

1. **Clone the repository**
   ```bash
   git clone https://github.com/MH-SHUVO20/Student-Management-System.git
   ```

2. **Navigate to the project directory**
   ```bash
   cd Student-Management-System/loginframe
   ```

3. **Create required directories**
   ```bash
   # On Windows
   mkdir D:\loginframe\textfile
   ```

4. **Compile the Java files**
   ```bash
   javac loginframe/*.java
   ```

5. **Run the application**
   ```bash
   java loginframe.start
   ```

### ⚠️ Important Configuration

The application stores data in text files at: `D://loginframe//textfile/`

**You need to:**
- **Option 1:** Create this directory structure: `D:\loginframe\textfile\`
- **Option 2:** Modify the file paths in the code to match your system:
  - `logindemo.java` (line 135, 142)
  - `registation.java` (line 274, 292, 306)

---

## 💻 How to Use

### 🎬 First Time Setup

1. **Launch the application** by running `start.java`
2. **Click "register"** button to create a new teacher account
3. **Fill in the registration form** with your details
4. **Login** with your new credentials

### 📚 Managing Students

1. **Login** to access the Teacher Dashboard
2. **Click "Manage Students"** to open the Student Management System
3. **Add/Update/Delete/Search** students as needed
4. **Click on table rows** to auto-populate form fields for editing

---

## 🛠️ Technologies Used

| Technology | Purpose |
|-----------|---------|
| **Java** | Core programming language (JDK 8+) |
| **Swing** | GUI framework for desktop application |
| **AWT** | Additional GUI components and event handling |
| **File I/O** | Data persistence using text files |

---

## 📚 OOP Concepts Demonstrated

This project implements core **Object-Oriented Programming 1 (Java)** principles:

- **Classes and Objects**: Student model class and object creation
- **Encapsulation**: Private fields with public getters/setters
- **Inheritance**: Extending JFrame and other Swing components
- **Polymorphism**: Method overriding and interface implementation
- **Abstraction**: Implementing ActionListener interface
- **Data Structures**: ArrayList for storing student objects
- **Event Handling**: ActionListener and event-driven programming

---

## 🔍 Known Limitations

As an **OOP1 (Java)** course project, this application focuses on demonstrating OOP concepts:

- **Data Persistence:** Uses text files instead of databases
- **Security:** Passwords stored in plain text
- **Input Validation:** Basic validation only
- **Layout Management:** Uses absolute positioning for simplicity

---

## 🤝 Contributing

This is a course project, but feedback and suggestions are welcome!

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/Suggestion`)
3. Commit your changes (`git commit -m 'Add some suggestion'`)
4. Push to the branch (`git push origin feature/Suggestion`)
5. Open a Pull Request

---

## 👨‍💻 Developer

**MD. MEHEDI HASAN SHUVO** - [@MH-SHUVO20](https://github.com/MH-SHUVO20)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 🙏 Acknowledgments

- 🎓 Thanks to our **OOP1 (Java)** course instructors
- 📚 Oracle Java documentation and tutorials
- 🌟 Java Swing community for helpful resources

---

<div align="center">

### ⭐ If you found this project helpful, please give it a star!

**Made with ❤️ for OOP1 (Java) Course**

---

**🎓 Academic Integrity Notice**

If you're a student working on a similar project, please use this as a reference for understanding concepts, not for direct submission. Learning happens when you write the code yourself! 💪

</div>