package loginframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class logindemo extends JFrame{
    private File file;
      private  ImageIcon image;

      private JLabel imagelogin;
      private  Container background;
       private JLabel Uname,password;
       private JTextField Username;
      private  JPasswordField pass;
      private JButton Login,register,Clear;
      private Font font,font2;
      private JPanel p;
    public logindemo() {



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Teacher login");
        Background();
    }
    public void Background()
    {
        font =new Font("Times New Roman",Font.BOLD,16);
        font2 =new Font("Times New Roman",Font.PLAIN,25);
        background=getContentPane();
        background.setBackground(new Color(12345));


        Uname =new JLabel();
        Uname.setText("Enter Your USERNAME");
        Uname.setBounds(50,20,250,80);
        Uname.setFont(font);
        Uname.setForeground(Color.white);

        Username =new JTextField();
        Username.setBounds(50,80,250,40);
        Username.setBackground(Color.LIGHT_GRAY);
        Username.setHorizontalAlignment(JTextField.CENTER);

        password =new JLabel();
        password.setText("Enter Your Password");
        password.setBounds(50,100,250,70);
        password.setFont(font);
        password.setForeground(Color.white);

        pass= new JPasswordField();
        pass.setBounds(50,150,250,40);
        pass.setBackground(Color.LIGHT_GRAY);
        pass.setHorizontalAlignment(JPasswordField.CENTER);
        pass.setEchoChar('*');
        pass.setFont(font2);

        Login =new JButton();
        Login.setBounds(50,200,70,40);
        Login.setText("Login");
        Login.setFocusable(false);

        register =new JButton();
        register.setBounds(50,250,90,40);
        register.setText("register");
        register.setFocusable(false);

        Clear =new JButton();
        Clear.setBounds(200,200,70,40);
        Clear.setText("Clear");
        Clear.setFocusable(false);



     background.add(Uname);

     background.add(Username);

     background.add(password);

     background.add(pass);

     background.add(Login);

     background.add(register);

     background.add(Clear);
     Clear.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             Username.setText("");
             pass.setText("");

         }
     });

     register.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             String f= Username.getText();
             String a=pass.getText();
             if(f.isEmpty() && a.isEmpty())
             {      dispose();
                registation f1= new registation();
                f1.setVisible(rootPaneCheckingEnabled);
                 
             } else{
                 Username.setText("");
                 pass.setText("");
                 JOptionPane.showMessageDialog(null,"Please again enter register Button!!");
             }
         }
     });

     Login.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String check = Username.getText();
            if (check.isEmpty()) {
                Username.setText("");
                pass.setText("");
            } else {
                boolean matched = false;
                String uname = Username.getText().toString();
                String Pass = pass.getText().toString(); // Corrected this line
                file = new File ("D://loginframe//textfile//login.txt");
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    try {
                        FileReader fr = new FileReader("D://loginframe//textfile//login.txt");
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.equals(uname + "\t" + Pass)) {
                                matched = true;
                                break;
                            }
                        }
                        br.close();
                        if (matched) {
                            
                            
                                    new TeacherDashboard();
                                 
                                
                            
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid username or password");
                        }
                    } catch (Exception ie) {
                        JOptionPane.showConfirmDialog(null,""+ie);
                    }
                } catch (Exception ie) {
                    JOptionPane.showMessageDialog(null, "Exception for file created");
                }
            }
        }
    });
}



//      Login.addActionListener(new ActionListener() 
        
//       {
//          @Override
//          public void actionPerformed(ActionEvent e) {
//              String check = Username.getText();
//              if (check.isEmpty()) {
//                  Username.setText("");
//                  pass.setText("");

//              } else {
//                  boolean matched = false;
//                  String uname = Username.getText().toString();
//                  String Pass = pass.getText().toString();
// //                 JOptionPane.showMessageDialog(null,"Welcome to new frame");
//                  file = new File("C://Users//Alam Pranto//IdeaProjects//opp//src//swing//loginframe//textfile//regsitration.txt");
//                  try {
//                      if (!file.exists()) {
//                          file.createNewFile();
//                      } else {

//                      }

//                      try {
//                          FileReader fr = new FileReader("C://Users//Alam Pranto//IdeaProjects//opp//src//swing//loginframe//textfile//login.txt");
//                             BufferedReader br=new BufferedReader(fr);
//                             String line;
//                          while((line= br.readLine())!=null){
//                              if (line.equals(uname+"\t"+Pass))
//                              {
//                                  matched=true;
//                                  break;
//                              }

//                          }br.close();
//                          if(matched)
//                          {
//                              dispose();
//                            TeacherDashboard frame1= new TeacherDashboard();
//                            frame1.setVisible(true);

//                          }

//                      } catch (Exception ie) {
//                          System.out.println(ie);


//                      }


//                  } catch (Exception ie) {
//                      JOptionPane.showMessageDialog(null, "Exception for file created");
//                  }


//              }

//          }
//      });

    }


