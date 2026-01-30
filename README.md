# 🎓 Student Management System

> A Java Swing-based desktop application for managing student records with teacher authentication

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Swing](https://img.shields.io/badge/GUI-Swing-orange?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![OOP](https://img.shields.io/badge/Course-OOP1-blue?style=for-the-badge)](https://github.com/MH-SHUVO20/Student-Management-System)

## 📝 About This Project

This is a **Java desktop application** developed as part of our **Object-Oriented Programming 1 (Java)** course project. It demonstrates fundamental concepts of Java programming and OOP principles including:
- Object-Oriented Programming (OOP) concepts
- GUI development with Java Swing
- File I/O operations
- Event handling
- User authentication

> **Academic Note:** This is a course project completed as part of OOP1 (Java) curriculum. As a learning project, it focuses on demonstrating core OOP principles and Java programming concepts. 🎓

---

## ✨ Features

### 🔐 Authentication System
- **Teacher Registration**: New teachers can register with complete profile information
  - Name, NID, Blood Group, Date of Birth
  - Email, Phone Number
  - Username and Password with confirmation
  - Department selection from dropdown
- **Teacher Login**: Secure login system with credentials stored in text files
- **Session Management**: Logout functionality to end current session

### 👨‍🎓 Student Management
- **Add Students**: Register new students with comprehensive details
  - Student ID, Name, CGPA
  - Address, Date of Birth, Enrollment Date
- **Update Students**: Modify existing student information
- **Delete Students**: Remove student records from the system
- **Search Students**: Filter students by multiple criteria
  - Search by: ID, Name, CGPA, Address, Date of Birth, Enrollment Date
  - Real-time filtering and display
- **View All Students**: Display all student records in an interactive table format
- **Select and Edit**: Click on table rows to auto-populate form fields

### 📊 Dashboard Features
- **Teacher Dashboard**: Central hub for accessing all features
  - Manage Students button
  - Report Section access
  - Logout Option
  - Exit Application
- **Report System**: Teachers can submit reports about sections
  - Text area for detailed reports
  - Submit and Clear functionality

---

## 🏗️ Project Structure

```
Student-Management-System/
│
└── 📁 loginframe/
    │
    ├── 🚀 start.java                              # Main entry point
    ├── 🔐 logindemo.java                          # Login screen (235 lines)
    ├── 📝 registation.java                        # Teacher registration (378 lines)
    ├── 🏠 TeacherDashboard.java                   # Teacher dashboard (157 lines)
    ├── 📊 ExtendedStudentManagementSystem.java    # Student CRUD operations (380 lines)
    ├── 👤 Student.java                            # Student model class (68 lines)
    ├── 📄 secondframe.java                        # Report submission (91 lines)
    │
    ├── 📁 textfile/                               # Data storage directory
    │   ├── login.txt                              # Login credentials
    │   └── regsitration.txt                       # Registration data
    │
    ├── 📁 loginframe/                             # Package structure
    │
    └── 🖼️ Assets/
        ├── Background.png
        ├── dashboard.png
        ├── deshboard.jpg
        └── atm.jpg
```

**Total Lines of Code:** ~1,309 lines

---

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or text editor with Java support
- Basic understanding of Java and OOP concepts

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
   
   # On Linux/Mac - you'll need to modify file paths in the code
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
- **Option 2:** Modify the file paths in the following files to match your system:
  - `logindemo.java` (line 135, 142)
  - `registation.java` (line 274, 292, 306)

**File paths to modify:**
```java
// Change this path to your preferred location
file = new File("D://loginframe//textfile//login.txt");
```

---

## 💻 How to Use

### 🎬 First Time Setup

1. **Launch the application** by running `start.java`
2. You'll see the **Login Screen**
3. **Click "register"** button (since you don't have an account yet)
4. **Fill in the registration form** with your teacher details:
   - Full Name
   - NID Number
   - Blood Group (e.g., A+, B+, O+)
   - Date of Birth (format: DD/MM/YYYY)
   - Email Address
   - Phone Number
   - Set Username (this will be your login ID)
   - Set Password
   - Confirm Password (must match)
   - Select Gender (Male/Female)
   - Choose Department from dropdown
5. **Click "register"** button to create your account
6. You'll be redirected to the **Login Screen**
7. **Login** with your new credentials

### 📚 Managing Students

1. **Login** to access the Teacher Dashboard
2. **Click "Manage Students"** button to open the Student Management System
3. **To Add a New Student:**
   - Fill in all fields (Name, ID, CGPA, Address, DOB, Enrollment Date)
   - Click **"Add"** button
   - Student will appear in the table below
4. **To Update a Student:**
   - Click on any row in the table (fields will auto-populate)
   - Modify the information as needed
   - Click **"Update"** button
5. **To Delete a Student:**
   - Click on the student's row in the table
   - Click **"Delete"** button
   - Confirm the deletion
6. **To Search for Students:**
   - Select search criterion from dropdown (ID, Name, CGPA, etc.)
   - Enter search text in the search field
   - Click **"Search"** button
   - Matching results will be displayed
7. **To Clear the Form:**
   - Click **"Clear"** button to reset all input fields
8. **To Go Back:**
   - Click **"Back"** button to return to Teacher Dashboard

### 📝 Submitting Reports

1. From the Teacher Dashboard, click **"Report"** button
2. A new window opens with a text area
3. Write your report about the section or any observations
4. Click **"Submit"** to close (report can be enhanced to save to file)
5. Click **"Clear"** to reset the text area

### 🚪 Logout & Exit

- **Logout:** Returns you to the login screen (preserves data)
- **Exit:** Closes the application completely

---

## 🛠️ Technologies Used

| Technology | Purpose | Version |
|-----------|---------|---------|
| **Java** | Core programming language | JDK 8+ |
| **Swing** | GUI framework for desktop application | Built-in |
| **AWT** | Additional GUI components and event handling | Built-in |
| **File I/O** | Data persistence using text files | java.io |

---

## 📚 OOP Concepts Demonstrated

This project implements core **Object-Oriented Programming 1 (Java)** principles:

### 1️⃣ **Classes and Objects**
```java
// Student class represents a real-world entity
public class Student {
    private String id;
    private String name;
    private String cgpa;
    // ... constructor, getters, setters
}

// Creating objects
Student student = new Student(id, name, cgpa, address, dob, enrollmentDate);
students.add(student);
```

### 2️⃣ **Encapsulation**
```java
public class Student {
    // Private fields - data hiding
    private String id;
    private String name;
    
    // Public methods - controlled access
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
```

### 3️⃣ **Inheritance**
```java
// Inheriting from JFrame class
public class logindemo extends JFrame {
    // Inherits all JFrame properties and methods
}

public class ExtendedStudentManagementSystem extends JFrame implements ActionListener {
    // Multiple inheritance through interface
}
```

### 4️⃣ **Polymorphism**
```java
// Method overriding
@Override
public void actionPerformed(ActionEvent e) {
    // Different behavior for different buttons
    if (e.getSource() == addButton) { /* Add logic */ }
    else if (e.getSource() == updateButton) { /* Update logic */ }
}
```

### 5️⃣ **Abstraction**
```java
// Implementing ActionListener interface
public class ExtendedStudentManagementSystem extends JFrame implements ActionListener {
    // Must implement abstract method
    @Override
    public void actionPerformed(ActionEvent e) {
        // Implementation details
    }
}
```

### 6️⃣ **Data Structures**
```java
// Using ArrayList to store objects
private List<Student> students;
students = new ArrayList<>();

// Using arrays
private String[] columns = {"ID", "Name", "CGPA", "Address", "DOB", "Enrollment Date"};
```

### 7️⃣ **Event Handling**
```java
// Implementing event listeners
addButton.addActionListener(this);
table.getSelectionModel().addListSelectionListener(e -> showDetails());

// Anonymous inner classes
Login.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle login
    }
});
```

---

## 🎯 Learning Outcomes

Through this OOP1 (Java) course project, we learned and applied:

✅ **Core OOP Principles**
- Class design and object creation
- Encapsulation through access modifiers
- Inheritance and interface implementation
- Polymorphism through method overriding

✅ **Java Programming Skills**
- Java Swing GUI development
- Event-driven programming
- File I/O operations
- Exception handling with try-catch blocks

✅ **Software Design**
- Multi-class application architecture
- Separation of concerns (Model-View pattern)
- User interface design
- Data validation

✅ **Problem Solving**
- CRUD operations implementation
- Search and filter functionality
- User authentication logic
- Data persistence strategies

---

## 🔍 Known Limitations (Course Project Context)

As an **Object-Oriented Programming 1 (Java)** course project, this application focuses on demonstrating OOP concepts. Some limitations exist as they were beyond the scope of OOP1:

1. **Data Persistence:** Uses text files instead of databases (database concepts typically covered in advanced courses)
2. **Security:** Passwords stored in plain text (encryption/hashing covered in security courses)
3. **Input Validation:** Basic validation (comprehensive validation requires additional libraries)
4. **Layout Management:** Uses absolute positioning for simplicity (advanced layouts in GUI courses)
5. **Design Patterns:** Basic architecture (design patterns covered in Software Engineering courses)
6. **Exception Handling:** Basic try-catch blocks (advanced error handling in later courses)
7. **Testing:** Manual testing only (unit testing frameworks introduced in advanced courses)

These limitations are acknowledged as part of the learning journey in OOP1 (Java). 📚

---

## 🔧 Troubleshooting

### Common Issues and Solutions

**Issue 1: File Not Found Exception**
```
Solution: Create the directory D:\loginframe\textfile\ or modify file paths in the code
```

**Issue 2: Login credentials not working**
```
Solution: 
- Ensure you registered successfully first
- Check that login.txt file exists in D:\loginframe\textfile\
- Verify username and password match exactly (case-sensitive)
```

**Issue 3: Application window not displaying properly**
```
Solution: Check your screen resolution. The app is sized for standard displays.
```

**Issue 4: Unable to compile**
```
Solution: 
- Ensure JDK is installed: java -version
- Check JAVA_HOME environment variable is set
- Compile from the correct directory
```

**Issue 5: Data not persisting**
```
Solution: 
- Check write permissions for D:\loginframe\textfile\ directory
- Run IDE/terminal as administrator if needed
```

---

## 🤝 Contributing

This is a course project, but feedback and suggestions are welcome!

If you're a fellow student or developer who wants to suggest improvements:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/Suggestion`)
3. Commit your changes (`git commit -m 'Add some suggestion'`)
4. Push to the branch (`git push origin feature/Suggestion`)
5. Open a Pull Request with detailed explanation

---

## 📖 Learning Resources

Resources that helped us complete this OOP1 (Java) project:

### Java Fundamentals
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/) - Official Java documentation
- [Java OOP Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/) - Core OOP principles

### GUI Development
- [Java Swing Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/) - Complete Swing guide
- [Swing Components](https://docs.oracle.com/javase/tutorial/uiswing/components/) - All GUI components

### File Operations
- [Java File I/O](https://docs.oracle.com/javase/tutorial/essential/io/) - Reading and writing files
- [Java NIO](https://docs.oracle.com/javase/tutorial/essential/io/fileio.html) - Modern file operations

### Additional Resources
- [W3Schools Java](https://www.w3schools.com/java/) - Quick reference
- [GeeksforGeeks Java](https://www.geeksforgeeks.org/java/) - Concept explanations
- [Stack Overflow](https://stackoverflow.com/questions/tagged/java) - Problem solving

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 🙏 Acknowledgments

- 🎓 Thanks to our **OOP1 (Java)** course instructors for their guidance and support
- 👥 Special thanks to all group members for their collaboration and teamwork
- 📚 Oracle Java documentation and tutorials
- 💡 Inspiration from various student management systems
- 🌟 Java Swing community for helpful resources

---

## 📞 Support

If you have any questions or need help with the project:
- 🐛 Open an issue for bugs
- 💬 Start a discussion for questions
- 📧 Contact through GitHub

---

## 📊 Project Statistics

- **Language:** Java
- **Framework:** Swing/AWT
- **Total Files:** 7 Java files
- **Lines of Code:** ~1,309
- **Course:** Object-Oriented Programming 1 (Java)
- **Type:** Desktop Application
- **Pattern:** MVC-inspired architecture

---

<div align="center">

### ⭐ If you found this project helpful, please give it a star!

**Made with ❤️ for OOP1 (Java) Course**

*Learning • Growing • Building*

---

**🎓 Academic Integrity Notice**

If you're a student working on a similar project, please use this as a reference for understanding concepts, not for direct submission. Learning happens when you write the code yourself! 💪

</div>
