/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;


import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;


public class Signup extends JFrame implements ActionListener
{
    private JPanel contentpane;
    private JTextField textfield1;
     private JTextField textfield2;
      private JTextField textfield3;
       private JTextField textfield4;
       private JComboBox comboBox;
       private JButton b1 ,b2;
       public static void main(String[] args)
       {
           new Signup().setVisible(true);
       }
    
    public Signup()
    {
        super("Signup");
        setBounds(600,250,606,406);
        contentpane=new JPanel();
        setContentPane(contentpane);
        contentpane.setBackground(Color.white);
        contentpane.setLayout(null);
        
        JLabel SUsername=new JLabel("Username");
        SUsername.setForeground(Color.DARK_GRAY);
        SUsername.setFont(new Font("Tahoma",Font.BOLD,14));
        SUsername.setBounds(99,86,92,26);
        contentpane.add(SUsername);
        
         JLabel SName=new JLabel("Name");
        SName.setForeground(Color.DARK_GRAY);
        SName.setFont(new Font("Tahoma",Font.BOLD,14));
        SName.setBounds(99,123,92,26);
        contentpane.add(SName);
        
         JLabel SPassword=new JLabel("Password");
        SPassword.setForeground(Color.DARK_GRAY);
        SPassword.setFont(new Font("Tahoma",Font.BOLD,14));
        SPassword.setBounds(99,160,92,26);
        contentpane.add(SPassword);
        
         JLabel Securityquestion=new JLabel("Security question");
        Securityquestion.setForeground(Color.DARK_GRAY);
         Securityquestion.setFont(new Font("Tahoma",Font.BOLD,14));
         Securityquestion.setBounds(99,197,140,26);
        contentpane.add( Securityquestion);
        
         JLabel SAnswer=new JLabel();
        SAnswer.setForeground(Color.DARK_GRAY);
        SAnswer.setFont(new Font("Tahoma",Font.BOLD,14));
        SAnswer.setBounds(99,234,92,26);
        contentpane.add(SAnswer);
        
        comboBox=new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{" Your nickname?","Your Birth Place","Your favourite superhero","Your favourite movie",}));
        comboBox.setBounds(265,202,148,20);
        contentpane.add(comboBox);
        
        textfield1=new JTextField();
        textfield1.setColumns(10);
        textfield1.setBounds(265,91,148,20);
         contentpane.add(textfield1);
        
        textfield2=new JTextField();
        textfield2.setColumns(10);
        textfield2.setBounds(265,128,148,20);
         contentpane.add(textfield2);
        
        textfield3=new JTextField();
        textfield3.setColumns(10);
        textfield3.setBounds(265,165,148,20);
         contentpane.add(textfield3);
        
        textfield4=new JTextField();
        textfield4.setColumns(10);
        textfield4.setBounds(265,239,148,20);
       contentpane.add(textfield4);
        
       b1=new JButton("Create");
       b1.addActionListener(this);
      b1.setFont(new Font("Tahoma",Font.BOLD,13));
      b1.setBounds(140,289,100,30);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      contentpane.add(b1);
      
      b2=new JButton("Back");
       b2.addActionListener(this);
      b2.setFont(new Font("Tahoma",Font.BOLD,13));
      b2.setBounds(300,289,100,30);
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      contentpane.add(b2);
      
      JPanel panel=new JPanel();
      panel.setForeground(new Color(34,139,34));
      panel.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),2),"Create Account",
      TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
      panel.setBounds(31,46,476,296);
      panel.setBackground(Color.WHITE);
      contentpane.add(panel);
      
      
      
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        try{
            
            connectdb con=new connectdb();
            if(ae.getSource()==b1)
            {
                String sql="insert into account(username,name,password,sec_q,sec_ans) values(?,?,?,?,?)";
               PreparedStatement st=con.c.prepareStatement(sql);
               
               st.setString(1,textfield1.getText());
                st.setString(2,textfield2.getText());
                 st.setString(3,textfield3.getText());
                  st.setString(4,(String) comboBox.getSelectedItem());
                  st.setString(5,textfield4.getText());
                  
                  int i=st.executeUpdate();
                  
                  if(i>0)
                  {
                      
                      JOptionPane.showMessageDialog(null,"successfully created");
                      
                  }
                  textfield1.setText("");
                   textfield2.setText("");
                    textfield3.setText("");
                     textfield4.setText("");
                  
            }
            
               if(ae.getSource()==b2)
               {
                   this.setVisible(false);
                   new Login().setVisible(true);
               }
               
        
            }
        
catch(  HeadlessException | SQLException e)
        {
        }
    }
}


