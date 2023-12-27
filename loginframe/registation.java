package loginframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class registation extends JFrame {

    private Container background;
    private ImageIcon image;
    private JLabel title, subtitle, Name, Nid, Blood, byear, Email, Mnumber, Username, password, password2, gender, department;
    private JTextField name, nid, blood, Byear, email, mnumber, username;

    private JPasswordField Pass, cpass;
    private Font f, f2, b, c, font;
    private JRadioButton male, female;
    private ButtonGroup group;
    private JComboBox subject;
    private String[] subjectlist = {"Computer science and engineering", "Electrical and electronics engineering", "Mechanical engineering", "Architectural engineering", "Economic", "Marketing and Management", "Accounting"};
    private JButton register;
    public File file1;
    private FileWriter bw;
    private String Password;

    public registation() {
//        image = new ImageIcon(getClass().getResource("atm.jpg"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Student Complain page");
//        this.setIconImage(image.getImage());
        Background();
    }

    public void Background() {
        font = new Font("Times New Roman", Font.PLAIN, 17); // used for JRediobutton
        f = new Font("Times New Roman", Font.BOLD, 20);  // JLabel used
        f2 = new Font("Times New Roman", Font.PLAIN, 22); // tpassword field used
        b = new Font("Times New Roman", Font.BOLD, 26); // title used
        c = new Font("Times New Roman", Font.PLAIN, 14); // subtitle used


        background = getContentPane();
        background.setBackground(new Color(12345));


        title = new JLabel();
        title.setText("Teacher Registration Form");
        title.setBounds(20, 10, 500, 30);
        title.setForeground(Color.white);
        title.setFont(b);

        subtitle = new JLabel();
        subtitle.setText("Full is this form to register ");
        subtitle.setBounds(20, 45, 400, 30);
        subtitle.setForeground(Color.white);
        subtitle.setFont(c);

        Name = new JLabel();
        Name.setText("Full-Name ");
        Name.setBounds(20, 80, 100, 30);
        Name.setForeground(Color.white);
        Name.setFont(f);

        Nid = new JLabel();
        Nid.setText("Nid number");
        Nid.setBounds(20, 120, 120, 30);
        Nid.setForeground(Color.white);
        Nid.setFont(f);

        Blood = new JLabel();
        Blood.setText("Blood");
        Blood.setBounds(20, 160, 120, 30);
        Blood.setForeground(Color.white);
        Blood.setFont(f);

        byear = new JLabel();
        byear.setText("Date of Birth");
        byear.setBounds(20, 200, 120, 30);
        byear.setForeground(Color.white);
        byear.setFont(f);

        Email = new JLabel();
        Email.setText("Email ");
        Email.setBounds(20, 240, 120, 30);
        Email.setForeground(Color.white);
        Email.setFont(f);

        Mnumber = new JLabel();
        Mnumber.setText("Phone");
        Mnumber.setBounds(20, 280, 120, 30);
        Mnumber.setForeground(Color.white);
        Mnumber.setFont(f);

        Username = new JLabel();
        Username.setText("Set Username");
        Username.setBounds(20, 320, 160, 30);
        Username.setForeground(Color.white);
        Username.setFont(f);

        password = new JLabel();
        password.setText("Set Password");
        password.setBounds(20, 360, 160, 30);
        password.setForeground(Color.white);
        password.setFont(f);

        password2 = new JLabel();
        password2.setText("confirm Password");
        password2.setBounds(20, 400, 160, 30);
        password2.setForeground(Color.white);
        password2.setFont(f);


        gender = new JLabel();
        gender.setText("Gender :");
        gender.setBounds(20, 440, 120, 30);
        gender.setForeground(Color.white);
        gender.setFont(f);

        department = new JLabel();
        department.setText("department :");
        department.setBounds(20, 480, 120, 30);
        department.setForeground(Color.white);
        department.setFont(f);


        // end of jlabel

        name = new JTextField();
        name.setBounds(142, 80, 250, 30);
        name.setBackground(Color.LIGHT_GRAY);

        nid = new JTextField();
        nid.setBounds(142, 120, 250, 30);
        nid.setBackground(Color.LIGHT_GRAY);

        blood = new JTextField();
        blood.setBounds(142, 160, 250, 30);
        blood.setBackground(Color.LIGHT_GRAY);

        Byear = new JTextField();
        Byear.setBounds(142, 200, 250, 30);
        Byear.setBackground(Color.LIGHT_GRAY);

        email = new JTextField();
        email.setBounds(142, 240, 250, 30);
        email.setBackground(Color.LIGHT_GRAY);

        mnumber = new JTextField();
        mnumber.setBounds(142, 280, 250, 30);
        mnumber.setBackground(Color.LIGHT_GRAY);

        username = new JTextField();
        username.setBounds(150, 320, 250, 30);
        username.setBackground(Color.LIGHT_GRAY);

        // end of Jtextfeild

        Pass = new JPasswordField();
        Pass.setBounds(150, 360, 250, 30);
        Pass.setBackground(Color.LIGHT_GRAY);
        Pass.setFont(f2);

        cpass = new JPasswordField();
        cpass.setBounds(180, 400, 225, 30);
        cpass.setBackground(Color.LIGHT_GRAY);
        cpass.setFont(f2);

        // end of JPassword

        male = new JRadioButton("Male");
        male.setBackground(new Color(12345));
        male.setForeground(Color.white);
        male.setFont(font);
        male.setFocusable(false);
        male.setBounds(110, 440, 80, 30);

        female = new JRadioButton("Female");
        female.setBackground(new Color(12345));
        female.setForeground(Color.white);
        female.setFont(font);
        female.setFocusable(false);
        female.setBounds(200, 440, 120, 30);

        group = new ButtonGroup();
        group.add(male);
        group.add(female);

        // end of JRedioButton


        subject = new JComboBox(subjectlist);
        subject.setBounds(20, 510, 250, 20);
        subject.addItemListener(new ItemListener() {
            String dep = subject.getSelectedItem().toString();

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == subject)
                    try {
                        bw.write(dep + "\n");
                        bw.flush();
                    } catch (Exception ie) {
                        JOptionPane.showMessageDialog(null, "error of subject");
                    }

            }
        });


//

        register = new JButton("register");
        register.setBounds(20, 580, 80, 30);
        register.setFocusable(false);
        register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


// add everything in frame
        background.add(title);
        background.add(subtitle);
        background.add(Name);
        background.add(Nid);
        background.add(Blood);
        background.add(byear);
        background.add(Mnumber);
        background.add(Email);
        background.add(Username);
        background.add(password);
        background.add(password2);
        background.add(gender);
        background.add(department);

        // add jlanel
        background.add(name);
        background.add(nid);
        background.add(blood);
        background.add(Byear);
        background.add(email);
        background.add(mnumber);
        background.add(username);

        //end of textfield
        background.add(Pass);
        background.add(cpass);

        //end of Jpass
        background.add(male);
        background.add(female);
        //end of JRediobutton
        background.add(register);
        // adding of jcombobox
        background.add(subject);

//        solve handler = new solve();
//        male.addActionListener(handler);
//        female.addActionListener(handler);


        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                File file = new File(" D://loginframe//textfile");
                file.mkdir();


                String Name = name.getText();
                String Faname = nid.getText();
                String Moname = blood.getText();
                String byear = Byear.getText();
                String Email = email.getText();
                String Mnumber = mnumber.getText();
                String Username = username.getText();
                String Password1 = Pass.getText();
                String CPassword = cpass.getText();

                if (Password1.equals(CPassword) && !Username.equals(CPassword)) {
                    Password = cpass.getText();

                    try {
                        file1 = new File(" D://loginframe//textfile//regsitration.txt");

                        file1.createNewFile();
                        bw = new FileWriter(file1, true);
                        bw.write("\n" + Name + ",\t" + Faname + ",\t" + Moname + ",\t" + byear + ",\t" + Email + ",\t" + Mnumber + "\n new entry\"");
                        bw.flush();
                        bw.close();
                        logindemo login = new logindemo();
                        login.setVisible(true);
                        dispose();

                        try {


                            File file2 = new File(" D://loginframe//textfile//login.txt");
                            file2.createNewFile();
                            FileWriter fr2 = new FileWriter(file2, true);
                            fr2.write(username.getText() + "\t" + cpass.getText() + "\n");
                            fr2.flush();
                            fr2.close();
                            JOptionPane.showMessageDialog(null, "success");
                        } catch (Exception ie) {
                            System.out.println("not found");

                        }

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "unsuccess" + e);
                    }
                } else {
                    name.setText("");
                    nid.setText("");
                    blood.setText("");
                    Byear.setText("");
                    email.setText("");
                    mnumber.setText("");

                    username.setText("");
                    Pass.setText("");
                    cpass.setText("");
                    JOptionPane.showMessageDialog(null, "Password not match try again");
                }

            }

        });
    }

}

//   public static void main (String []args)
//   {
//       registation f2=new registation();
//       f2.setVisible(true);
//   }
//
//}
//class solve implements ActionListener{
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if(e.getSource()=="male")
//        {   try{
//            registation f1=new registation();
//            FileWriter fe;
//
//                fe = new FileWriter(f1.file1);
//                fe.write(e.getSource()+"");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        }
//        else {try{
//            registation f1=new registation();
//            FileWriter fa = new FileWriter(f1.file1);
//            fa.write(e.getSource()+"");
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//
//        }
//    }
//}

