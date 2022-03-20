/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;


import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1, b2, b3;

    public static void main(String[] args) {
        new StudentDetails().setVisible(true);
    }

    public void Book() {
        try {
            connectdb con = new connectdb();
            String sql = "Select * from student";
            try (PreparedStatement st = con.c.prepareStatement(sql); ResultSet rs = st.executeQuery()) {
                
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            con.c.close();

        } catch (SQLException e) {

        }
    }

    public StudentDetails() {
        setBounds(350, 200, 890, 475);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 771, 282);
        contentPane.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 1).toString());
            }
        });

        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table);

        b1 = new JButton("Search");
        b1.addActionListener(this);
        /*      b1.setBorder(new LineBorder(new Color(255,20,147),2,true));*/
        b1.setForeground(new Color(199, 21, 133));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(564, 89, 138, 33);
        contentPane.add(b1);

        b2 = new JButton("Delete");
        b2.addActionListener(this);

        b2.setForeground(new Color(199, 21, 133));
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b2.setBounds(712, 89, 138, 33);
        contentPane.add(b2);

        JLabel l1 = new JLabel("Student Details");
        l1.setForeground(new Color(107, 142, 35));
        l1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);

        search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

        JLabel l2 = new JLabel("Back");
        l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                Home home = new Home();
                home.setVisible(true);
            }
        });
        l2.setBackground(Color.GRAY);
        l2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l2.setBounds(97, 89, 72, 33);
        contentPane.add(l2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3), "Student Details", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(67, 54, 793, 368);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
        Book();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            connectdb con = new connectdb();
            if (e.getSource() == b2) {
                String sql = "delete from student where name='" + search.getText() + "'";
                PreparedStatement st = con.c.prepareStatement(sql);
                int rs = st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Deleted");
                st.close();

            }
            con.c.close();
        } catch (HeadlessException | SQLException ae) {

        }
    }

}