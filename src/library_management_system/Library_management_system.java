/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_management_system;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Library_management_system extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1;

    public Library_management_system() {
        super("Library Management System");
        setSize(1050, 480);
        setLayout(null);
        setLocation(300, 300);
        l1 = new JLabel("");
        b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library_management_system/icons/first.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1050, 390, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        b1.setBounds(800,300, 100, 30);
        l1.setBounds(0, 0, 1050, 390);
        l1.add(b1);
        
         JLabel l2 =new JLabel("Library Management System");
        l2.setBounds(20,150,800,60);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("SansSerif",Font.BOLD,40));
        l1.add(l2);
        add(l1);
       
        
        
        b1.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        new Login().setVisible(true);
        this.setVisible(false);

    }

    public static void main(String[] args) {
        new Library_management_system().setVisible(true);

    }
}
