package loginframe;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ExtendedStudentManagementSystem extends JFrame implements ActionListener {
    private Container c;
    private JTable table;
    private DefaultTableModel model;
    private JLabel titleLabel, nameLabel, idLabel, cgpaLabel, addressLabel, dobLabel, enrollmentDateLabel;
    private JTextField nameTf, idTf, cgpaTf, addressTf, dobTf, enrollmentDateTf;
    private JButton addButton, updateButton, deleteButton, clearButton, searchButton,backButton;
    private JComboBox<String> filterComboBox;
    private JTextField searchField;

    private String[] columns = {"ID", "Name", "CGPA", "Address", "Date of Birth", "Enrollment Date"};
    private Object[] rows;
    private List<Student> students;

    public ExtendedStudentManagementSystem() {
        students = new ArrayList<>();
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Extended Student Management System");

        c = getContentPane();
        c.setLayout(null);
        Font font = new Font("Arial", Font.BOLD, 16);

        titleLabel = new JLabel("Student Management System");
        titleLabel.setBounds(250, 20, 300, 30);
        titleLabel.setFont(font);
        c.add(titleLabel);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 80, 100, 30);
        nameLabel.setFont(font);
        c.add(nameLabel);

        nameTf = new JTextField();
        nameTf.setBounds(120, 80, 150, 30);
        nameTf.setFont(font);
        c.add(nameTf);

        idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 130, 100, 30);
        idLabel.setFont(font);
        c.add(idLabel);

        idTf = new JTextField();
        idTf.setBounds(120, 130, 150, 30);
        idTf.setFont(font);
        c.add(idTf);

        cgpaLabel = new JLabel("CGPA:");
        cgpaLabel.setBounds(20, 180, 100, 30);
        cgpaLabel.setFont(font);
        c.add(cgpaLabel);

        cgpaTf = new JTextField();
        cgpaTf.setBounds(120, 180, 150, 30);
        cgpaTf.setFont(font);
        c.add(cgpaTf);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(300, 80, 100, 30);
        addressLabel.setFont(font);
        c.add(addressLabel);

        addressTf = new JTextField();
        addressTf.setBounds(400, 80, 150, 30);
        addressTf.setFont(font);
        c.add(addressTf);

        dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(300, 130, 150, 30);
        dobLabel.setFont(font);
        c.add(dobLabel);

        dobTf = new JTextField();
        dobTf.setBounds(400, 130, 150, 30);
        dobTf.setFont(font);
        c.add(dobTf);

        enrollmentDateLabel = new JLabel("Enrollment Date:");
        enrollmentDateLabel.setBounds(300, 180, 150, 30);
        enrollmentDateLabel.setFont(font);
        c.add(enrollmentDateLabel);

        enrollmentDateTf = new JTextField();
        enrollmentDateTf.setBounds(430, 180, 150, 30);
        enrollmentDateTf.setFont(font);
        c.add(enrollmentDateTf);

        addButton = new JButton("Add");
        addButton.setBounds(20, 230, 100, 30);
        addButton.setFont(font);
        c.add(addButton);

        backButton = new JButton("Back");
        backButton.setBounds(550, 230, 100, 30);
        backButton.setFont(font);
        c.add(backButton);
        backButton.addActionListener(this);

        updateButton = new JButton("Update");
        updateButton.setBounds(140, 230, 100, 30);
        updateButton.setFont(font);
        c.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(260, 230, 100, 30);
        deleteButton.setFont(font);
        c.add(deleteButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(380, 230, 100, 30);
        clearButton.setFont(font);
        c.add(clearButton);

        filterComboBox = new JComboBox<>(columns);
        filterComboBox.setBounds(20, 280, 150, 30);
        c.add(filterComboBox);

        searchField = new JTextField();
        searchField.setBounds(180, 280, 200, 30);
        c.add(searchField);

        searchButton = new JButton("Search");
        searchButton.setBounds(400, 280, 100, 30);
        searchButton.setFont(font);
        c.add(searchButton);

        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);

        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(20, 330, 700, 150);
        c.add(scroll);

        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);
        searchButton.addActionListener(this);

        table.getSelectionModel().addListSelectionListener(e -> showDetails());
        refreshTable();
    }

    private void showDetails() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            idTf.setText((String) table.getValueAt(selectedRow, 0));
            nameTf.setText((String) table.getValueAt(selectedRow, 1));
            cgpaTf.setText((String) table.getValueAt(selectedRow, 2));
            addressTf.setText((String) table.getValueAt(selectedRow, 3));
            dobTf.setText((String) table.getValueAt(selectedRow, 4));
            enrollmentDateTf.setText((String) table.getValueAt(selectedRow, 5));
        }
    }

    private void refreshTable() {
        model.setRowCount(0); // Clear the existing data in the table model
        for (Student student : students) {
            Object[] rowData = {
                    student.getId(),
                    student.getName(),
                    student.getCgpa(),
                    student.getAddress(),
                    student.getDob(),
                    student.getEnrollmentDate()
            };
            model.addRow(rowData);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            Student student = new Student(
                    idTf.getText(),
                    nameTf.getText(),
                    cgpaTf.getText(),
                    addressTf.getText(),
                    dobTf.getText(),
                    enrollmentDateTf.getText()
            );
            students.add(student);
            refreshTable();
            clearFields();
        } else if (e.getSource()==backButton)
        {   dispose();
           new TeacherDashboard();



        } else if (e.getSource() == updateButton) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                Student student = students.get(selectedRow);
                student.setId(idTf.getText());
                student.setName(nameTf.getText());
                student.setCgpa(cgpaTf.getText());
                student.setAddress(addressTf.getText());
                student.setDob(dobTf.getText());
                student.setEnrollmentDate(enrollmentDateTf.getText());

                refreshTable();
                clearFields();
            }
        } else if (e.getSource() == deleteButton) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                students.remove(selectedRow);
                refreshTable();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Select a row to delete");
            }
        } else if (e.getSource() == clearButton) {
            clearFields();
        } else if (e.getSource() == searchButton) {
            String filter = filterComboBox.getSelectedItem().toString();
            String searchText = searchField.getText().toLowerCase();

            List<Student> filteredStudents = new ArrayList<>();
            for (Student student : students) {
                switch (filter) {
                    case "ID":
                        if (student.getId().toLowerCase().contains(searchText)) {
                            filteredStudents.add(student);
                        }
                        break;
                    case "Name":
                        if (student.getName().toLowerCase().contains(searchText)) {
                            filteredStudents.add(student);
                        }
                        break;
                    case "CGPA":
                        if (student.getCgpa().toLowerCase().contains(searchText)) {
                            filteredStudents.add(student);
                        }
                        break;
                    case "Address":
                        if (student.getAddress().toLowerCase().contains(searchText)) {
                            filteredStudents.add(student);
                        }
                        break;
                    case "Date of Birth":
                        if (student.getDob().toLowerCase().contains(searchText)) {
                            filteredStudents.add(student);
                        }
                        break;
                    case "Enrollment Date":
                        if (student.getEnrollmentDate().toLowerCase().contains(searchText)) {
                            filteredStudents.add(student);
                        }
                        break;
                }
            }
            displaySearchResults(filteredStudents);
        }
    }

    private void displaySearchResults(List<Student> filteredStudents) {
        model.setRowCount(0); // Clear the existing data in the table model
        for (Student student : filteredStudents) {
            Object[] rowData = {
                    student.getId(),
                    student.getName(),
                    student.getCgpa(),
                    student.getAddress(),
                    student.getDob(),
                    student.getEnrollmentDate()
            };
            model.addRow(rowData);
        }
    }

    private void clearFields() {
        idTf.setText("");
        nameTf.setText("");
        cgpaTf.setText("");
        addressTf.setText("");
        dobTf.setText("");
        enrollmentDateTf.setText("");
        table.clearSelection();
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new ExtendedStudentManagementSystem().setVisible(true);
//        });
//
//    }
//class
    private  class Student {
        private String id;
        private String name;
        private String cgpa;
        private String address;
        private String dob;
        private String enrollmentDate;

        public Student(String id, String name, String cgpa, String address, String dob, String enrollmentDate) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
            this.address = address;
            this.dob = dob;
            this.enrollmentDate = enrollmentDate;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCgpa() {
            return cgpa;
        }

        public void setCgpa(String cgpa) {
            this.cgpa = cgpa;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getEnrollmentDate() {
            return enrollmentDate;
        }

        public void setEnrollmentDate(String enrollmentDate) {
            this.enrollmentDate = enrollmentDate;
        }
    }
}
