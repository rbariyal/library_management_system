/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;


import java.awt.*;
import javax.swing.*;

public class Aboutus extends JFrame {
    private JPanel contentPane;
    public static void main(String[] args)
    {
        new Aboutus().setVisible(true);
    }
    public Aboutus()
    {
        super("About us");
         setBounds(500,250,700,500);
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel l1=new JLabel("Library");
        l1.setForeground(new Color(0,255,128));
        l1.setBounds(160,40,150,55);
        l1.setFont(new Font("Trebuchet MS",Font.ITALIC,34));
       contentPane.add(l1);
    
       JLabel l2=new JLabel("Management System");
        l2.setForeground(new Color(0,102,204));
        l2.setBounds(70,90,405,40);
        l2.setFont(new Font("Trebuchet MS",Font.ITALIC,34));
       contentPane.add(l2);
       
        JLabel l3=new JLabel("v1.5");
        l3.setForeground(new Color(255,153,255));
        l3.setBounds(185,140,100,21);
        l3.setFont(new Font("Trebuchet MS",Font.ITALIC,34));
       contentPane.add(l3);
       
        JLabel l4=new JLabel("Developed By:Rahul");
        l4.setForeground(new Color(0,51,102));
        l4.setBounds(160,198,400,35);
        l4.setFont(new Font("Trebuchet MS",Font.BOLD,34));
       contentPane.add(l4);
     
       
        JLabel l5=new JLabel("Contact us:rbariyal84@gmail.com");
        l5.setForeground(new Color(0,51,102));
        l5.setBounds(70,260,550,35);
        l5.setFont(new Font("Trebuchet MS",Font.BOLD,34));
       contentPane.add(l5);
       
       contentPane.setBackground(Color.WHITE);
    }
    
    
}
