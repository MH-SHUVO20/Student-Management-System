package loginframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherDashboard implements ActionListener {

    private JFrame frame;
    private JPanel mainPanel, studentPanel;
    private JButton manageStudentsButton, exitButton, logoutButton, reportStudentButton, backButtonStudent;
    private JTextField studentTextField;
    private JLabel welcomeLabel;
    private Student[] students;
    private JPanel panel1, panel2;

    public TeacherDashboard(Student[] students) {
        this.students = students;
    }
    public TeacherDashboard(){

        frame = new JFrame();
        frame.setTitle("Teacher Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100, 700);
        frame.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, 1100, 700);
        mainPanel.setBackground(new Color(1234));

        welcomeLabel = new JLabel("Welcome Teacher");
        welcomeLabel.setBounds(420, 100, 400, 50);
        welcomeLabel.setForeground(Color.BLACK);
        Font midFont = welcomeLabel.getFont().deriveFont(Font.PLAIN, 40f);
        welcomeLabel.setFont(midFont);

        manageStudentsButton = createButton("Manage Students", 20, 100);
        manageStudentsButton.addActionListener(this);

        reportStudentButton=createButton("Report ", 20, 220);
        reportStudentButton.addActionListener(this);

        exitButton = createButton("Exit", 20, 140);
        exitButton.addActionListener(this);

        logoutButton = createButton("Logout", 20, 180);
        logoutButton.addActionListener(this);

        mainPanel.add(welcomeLabel);
        mainPanel.add(manageStudentsButton);
        mainPanel.add(exitButton);
        mainPanel.add(logoutButton);
        mainPanel.add(reportStudentButton);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 150, 50);
        button.addActionListener(this);
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setBackground(Color.BLACK);
        button.setBorderPainted(true);
        button.setForeground(Color.WHITE);
        return button;
    }

    private void showManageStudentsPanel() {
        if (panel1 == null) {
            panel1 = new JPanel();
            panel1.setLayout(new BorderLayout());

            // Add components or create a separate class for ManageStudentsPanel

            backButtonStudent = createButton("Back", 20, 20);
            backButtonStudent.addActionListener(this);
            panel1.add(backButtonStudent, BorderLayout.NORTH);

            frame.getContentPane().removeAll();
            frame.getContentPane().add(panel1);
            frame.getContentPane().validate();
            frame.getContentPane().repaint();
        }
    }

    private void showMainPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(mainPanel);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
    }

    // Implement the rest of the actionPerformed method
    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == manageStudentsButton) {
        // Handle manage students action
        frame.dispose();
        // Create and show the ExtendedStudentManagementSystem frame
        ExtendedStudentManagementSystem frame1 = new ExtendedStudentManagementSystem();
        frame1.setVisible(true);
    }
    else if (e.getSource() == exitButton) {
        // Handle exit action
        System.exit(0);
    } else if (e.getSource() == logoutButton) {
        // Handle logout action
        frame.dispose();
        // Create and show the login demo frame
        logindemo frame = new logindemo();
        frame.setVisible(true);
    }
    else {
            frame.dispose();
            secondframe frame =new secondframe();
            frame.setVisible(true);

    }

    // You can add more else-if conditions for additional buttons if needed
}
    public static void main(String[] args) {
        new TeacherDashboard();
        // Example usage
        Student[] students = new Student[100];
        new TeacherDashboard(students);
    }
	// Student.java
public class Student {
    private String name;
    private int id;

    // Constructors, getters, and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
}