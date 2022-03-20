/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    private JTextField t1;
    private JPasswordField t2;

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

    public Login() {
        super("Login");
        setBackground(new Color(169,169,169));
        setBounds(300, 200, 800, 600);
        contentPane = new JPanel();
         contentPane.setBackground(new Color(204, 204, 255));
        setContentPane(contentPane);
        contentPane.setLayout(null);
      
       

        l1 = new JLabel("Username:");
        l1.setBounds(125,100,100,30);
        contentPane.add(l1);
        
        
        l2 = new JLabel("Password:");
        l2.setBounds(125,140, 100,40);
        contentPane.add(l2);
        
        t1=new JTextField();
        t1.setBounds(230,105,157,20);
        contentPane.add(t1);
        
        t2=new JPasswordField();
        t2.setBounds(230,152,157,20);
        contentPane.add(t2);
        
        b1=new JButton("Login");
        b1.addActionListener(this);
        b1.setForeground(new Color(0,204,0));
        b1.setBackground(new Color(255,229,204));
        b1.setBounds(200,200,85,30);
        contentPane.add(b1);
        
        b2=new JButton("Signup");
        b2.addActionListener(this);
        b2.setForeground(new Color(255,102,178));
        b2.setBackground(new Color(255,229,204));
        b2.setBounds(320,200,85,30);
        contentPane.add(b2);
        
          b3=new JButton("Forgot Password");
        b3.addActionListener(this);
        b3.setForeground(new Color(255,51,51));
        b3.setBackground(new Color(229,255,204));
        b3.setBounds(230,250,150,30);
        contentPane.add(b3);
        
        
        


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1)
       {
           Boolean status =false;
           try
       {
           connectdb con=new connectdb();
           String sql="select * from account where username=? and password=?";
           PreparedStatement st=con.c.prepareStatement(sql);
           st.setString(1,t1.getText());
           st.setString(2,t2.getText());
           ResultSet rs=st.executeQuery();
                   if(rs.next())
                   {
                       this.setVisible(false);
                       new Home().setVisible(true);
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                    }
       }
       catch(HeadlessException | SQLException ae)
       {
       }
       }
       if(e.getSource()==b2)
       {
           setVisible(false);
           new Signup().setVisible(true);
       }
       if(e.getSource()==b3)
       {
           setVisible(false);
           new Forgot().setVisible(true);
       }
       
    }

}
