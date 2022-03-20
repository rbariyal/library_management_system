/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.sql.*;




public class ReturnBook extends JFrame implements ActionListener
{
    private JPanel contentPane;
    private JButton b1,b2,b3;
    private JTextField textfield,textfield1,textfield2,textfield3,textfield4,textfield5,textfield6;
    private JDateChooser dateChooser;
    public static void main(String[] args)
    {
        new ReturnBook().setVisible(true);
    }
    public void delete()
    {
        try{
            connectdb con=new connectdb();
            String sql="delete from issuebook where book_id=?";
            PreparedStatement st=con.c.prepareStatement(sql);
            st.setString(1,textfield.getText());
            int i=st.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(null,"Book Returned");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error in deleting");
                
            }
        }
        catch(HeadlessException | SQLException e)
        {
        
        }
    }
    public ReturnBook()
    {
        super("ReturnBook");
        setBounds(450,300,620,363);
        contentPane=new JPanel();
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel l1=new JLabel("Book_id");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setBounds(52,52,87,24);
        contentPane.add(l1);
        
        JLabel l2=new JLabel("Student_id");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setBounds(243,52,87,24);
        contentPane.add(l2);
        
        JLabel l3=new JLabel("Book");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setBounds(52,98,71,24);
        contentPane.add(l3);
        
        JLabel l4=new JLabel("Name");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setBounds(300,98,71,24);
        contentPane.add(l4);
        
         JLabel l5=new JLabel("Course");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setBounds(52,143,87,24);
        contentPane.add(l5);
        
         JLabel l6=new JLabel("Branch");
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Tahoma",Font.BOLD,14));
        l6.setBounds(303,144,68,24);
        contentPane.add(l6);
        
        JLabel l7=new JLabel("Date Of Isuue");
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Tahoma",Font.BOLD,14));
        l7.setBounds(52,188,105,29);
        contentPane.add(l7);
        
          JLabel l8=new JLabel("Date Of Return");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Tahoma",Font.BOLD,14));
        l8.setBounds(52,234,188,29);
        contentPane.add(l8);
        
         textfield=new JTextField();
       textfield.setForeground(new Color(105,105,105));
        textfield.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        textfield.setBounds(128,56,105,20);
        contentPane.add(textfield);
        
        textfield1=new JTextField();
        textfield1.setForeground(new Color(105,105,105));
        textfield1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        textfield1.setBounds(340,56,93,20);
        contentPane.add(textfield1);
      
        b1=new JButton("Search");
        b1.addActionListener(this);
        b1.setBounds(433,52,105,29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

 textfield2=new JTextField();
        textfield2.setForeground(new Color(105,105,105));
        textfield2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        textfield2.setBounds(128,102,162,20);
        contentPane.add(textfield2);        
        
         textfield3=new JTextField();
        textfield3.setForeground(new Color(105,105,105));
        textfield3.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        textfield3.setBounds(369,102,179,20);
        contentPane.add(textfield3);
        
         textfield4=new JTextField();
        textfield4.setForeground(new Color(105,105,105));
        textfield4.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        textfield4.setBounds(128,147,162,20);
        contentPane.add(textfield4);
        
         textfield5=new JTextField();
        textfield5.setForeground(new Color(105,105,105));
        textfield5.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        textfield5.setBounds(369,147,179,20);
        contentPane.add(textfield5);
        
       textfield6=new JTextField();
        textfield6.setForeground(new Color(105,105,105));
        textfield6.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        textfield6.setBounds(167,194,162,20);
        contentPane.add(textfield6);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(167,234,172,29);
        contentPane.add(dateChooser);
        
         b2=new JButton("Return");
        b2.addActionListener(this);
        b2.setBounds(369,179,149,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);
        
         b3=new JButton("Back");
        b3.addActionListener(this);
        b3.setBounds(369,231,149,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);
        
          JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 69, 0), 2), "Return-Panel", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(220, 20, 60)));
        panel.setBounds(10,24,569,269);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
        
        
        
       
        
    
        
     
       
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            connectdb con=new connectdb();
            if(e.getSource()==b1)
            {
                String sql="select * from issuebook where book_id=? and student_id=?";
                ResultSet rs;
                try (PreparedStatement st = con.c.prepareStatement(sql)) {
                    st.setString(1,textfield.getText());
                    st.setString(2,textfield1.getText());
                    rs = st.executeQuery();
                    while(rs.next())
                    {
                        textfield2.setText(rs.getString("bname"));
                        textfield3.setText(rs.getString("sname"));
                        textfield4.setText(rs.getString("course"));
                        textfield5.setText(rs.getString("branch"));
                        textfield6.setText(rs.getString("datofIssue"));
                    }
                
                st.close();
                rs.close();
                }
                
            }
            if(e.getSource()==b2)
            {
                String sql="insert into returnbook (book_id,student_id,bname,sname,course,branch,datofIssue,dateofReturn)values(?,?,?,?,?,?,?,?)";
                PreparedStatement st=con.c.prepareStatement(sql);
                st.setString(1,textfield.getText());
                st.setString(2,textfield1.getText());
                st.setString(3,textfield2.getText());
                st.setString(4,textfield3.getText());
                st.setString(5,textfield4.getText());
                st.setString(6,textfield5.getText());
                st.setString(7,textfield6.getText());
                
                st.setString(8,((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());
                int i=st.executeUpdate();
                if(i>0)
                        {
                            delete();
//                           JOptionPane.showMessageDialog(null,"Book returned succesfully"); 
                        }
                else
                {
                     JOptionPane.showMessageDialog(null,"Error"); 
                }
                
            }
            if(e.getSource()==b3)
            {
                this.setVisible(false);
                new Home().setVisible(true);
            }
            
        }
        catch(HeadlessException | SQLException ae){
            
        }
       
    }
    
    
    
}
