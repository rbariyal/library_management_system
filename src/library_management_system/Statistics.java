/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;
import javax.swing.border.*;


public class Statistics extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTable table;
    private JTable table1;
    private JButton button;

    public static void main(String[] args) {
        new Statistics().setVisible(true);
    }

    public void issueBook() {
            try {
            connectdb con = new connectdb();
            String sql = "Select * from issuebook";
            PreparedStatement st = con.c.prepareStatement(sql);
              ResultSet rs = st.executeQuery() ;
                
                table.setModel(DbUtils.resultSetToTableModel(rs));
 con.c.close();
        } catch (SQLException e) {

        }
    }

    public void returnbook() {
         try {
            connectdb con = new connectdb();
            String sql = "Select * from returnbook";
            PreparedStatement st = con.c.prepareStatement(sql);
               ResultSet rs = st.executeQuery();
                
                table1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {

        }
    }
    public Statistics()
    {
        setBounds(400,200,810,594);
        contentPane=new JPanel();
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JScrollPane scrollpane=new JScrollPane();
        scrollpane.setBounds(40,51,708,217);
        contentPane.add(scrollpane);
        
        table=new JTable();
        table.setBackground(new Color(224,255,255));
        table.setForeground(new Color(128,128,0));
        table.setFont(new Font("Trebuchet MS",Font.BOLD,15));
        scrollpane.setViewportView(table);
        
        JPanel panel=new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(47,79,79),2),"Issue-Book-Details",
        TitledBorder.LEADING,TitledBorder.TOP,null,new Color(0,128,128)));
        panel.setForeground(new Color(0,128,128));
        panel.setBounds(26,36,737,240);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
        
         button= new JButton("Back");
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setBounds(680,15,80,30);
        contentPane.add(button);
        
         JScrollPane scrollpane1=new JScrollPane();
        scrollpane1.setBounds(40,316,717,217);
        contentPane.add(scrollpane1);
        
        table1=new JTable();
        table1.setBackground(new Color(224,255,255));
        table1.setForeground(new Color(153,51,0));
        table1.setFont(new Font("Trebuchet MS",Font.BOLD,15));
        scrollpane1.setViewportView(table1);
        
        JPanel panel1=new JPanel();
        panel1.setBorder(new TitledBorder(new LineBorder(new Color(47,79,79),2),"Return-Book-Details",
        TitledBorder.LEADING,TitledBorder.TOP,null,new Color(0,128,128)));
        panel1.setForeground(new Color(0,128,128));
        panel1.setBounds(22,299,741,240);
        panel1.setBackground(Color.WHITE);
        contentPane.add(panel1);
        returnbook();
        issueBook();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button)
       {
           this.setVisible(false);
           new Home().setVisible(true);
       }
    }

}
