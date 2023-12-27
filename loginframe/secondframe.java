package loginframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class secondframe extends JFrame
{
    ImageIcon image;
    Container background;
    JTextArea text;
    JLabel t1;
    Font f;
    JButton submit,clear;
    JScrollPane scroll;
    public secondframe()
    {

        // image = new ImageIcon(getClass().getResource("atm.jpg"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(250,50,500,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Student Complain page");
        // this.setIconImage(image.getImage());
        Background();
    }
    public void Background()
    {
        f =new Font("calleo",Font.ITALIC,16);
        background=getContentPane();
        background.setBackground(new Color(12345));


        t1= new JLabel();
        t1.setText("Report for a section");
        t1.setBounds(50,20,180,50);
        t1.setFont(f);
        t1.setForeground(Color.white);


        text=new JTextArea();
        text.setLineWrap(true);
        text.setWrapStyleWord(true);

        scroll =new JScrollPane(text);
        scroll.setBounds(50,70,300,100);



        submit =new JButton();
        submit.setText("Submit");
        submit.setBounds(50,180,80,25);
        submit.setFocusable(false);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        clear =new JButton();
        clear.setText("clear");
        clear.setBounds(200,180,80,25);
        clear.setFocusable(false);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });
        


        background.add(t1);
        background.add(scroll);
        background.add(submit);
        background.add(clear);
    }

    public static void main(String[] args) {

        secondframe frame=new secondframe();
        frame.setVisible(true);


    }
}
