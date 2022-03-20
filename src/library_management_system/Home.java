/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;


import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;


public class Home extends JFrame implements ActionListener{
private JPanel contentPane;
private JButton b1,b2,b3,b4,b5,b6;
public static void main(String[] args)
{
    new Home().setVisible(true);
}
public Home()
{
    super("Home");
    setBounds(400,15,1000,800);
    contentPane=new JPanel();
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JMenuBar menuBar=new JMenuBar();
//    menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED,new Color(0,128,0),new Color(128,128,128)));
    menuBar.setBackground(Color.CYAN);
    menuBar.setBounds(0,10,1000,35);
    contentPane.add(menuBar);
    
    JMenu mnexit=new JMenu("Exit");
    mnexit.setFont(new Font("Trebuchet MS",Font.BOLD,17));
    
    JMenuItem mnexititem1=new JMenuItem("Logout");
    mnexititem1.setBackground(new Color(211,211,211));
    mnexititem1.setForeground(new Color(105,105,105));
    mnexititem1.addActionListener(this);
    mnexit.add(mnexititem1);
    
    JMenuItem mnexititem2=new JMenuItem("Exit");
    mnexititem2.setBackground(new Color(211,211,211));
    mnexititem2.setForeground(new Color(105,105,105));
    mnexititem2.addActionListener(this);
    mnexit.add(mnexititem2);
    
     JMenu mnhelp=new JMenu("Help");
    mnhelp.setFont(new Font("Trebuchet MS",Font.BOLD,17));
    
      JMenuItem mnhelpitem1=new JMenuItem("Read Me");
    mnhelpitem1.setBackground(new Color(211,211,211));
    mnhelpitem1.setForeground(new Color(105,105,105));
    mnhelpitem1.addActionListener(this);
    mnhelp.add(mnhelpitem1);
    
    JMenuItem mnhelpitem2=new JMenuItem("About us");
    mnhelpitem2.setBackground(new Color(211,211,211));
    mnhelpitem2.setForeground(new Color(105,105,105));
    mnhelpitem2.addActionListener(this);
    mnhelp.add(mnhelpitem2);
    
     JMenu mnRecord=new JMenu("Record");
    mnRecord.setFont(new Font("Trebuchet MS",Font.BOLD,17));
    
     JMenuItem mnRecorditem1=new JMenuItem("Student Details");
    mnRecorditem1.setBackground(new Color(211,211,211));
    mnRecorditem1.setForeground(new Color(105,105,105));
    mnRecorditem1.addActionListener(this);
    mnRecord.add(mnRecorditem1);
    
    JMenuItem mnRecorditem2=new JMenuItem("Book Details");
    mnRecorditem2.setBackground(new Color(211,211,211));
    mnRecorditem2.setForeground(new Color(105,105,105));
    mnRecorditem2.addActionListener(this);
    mnRecord.add(mnRecorditem2);
    
    menuBar.add(mnRecord);
    menuBar.add(mnhelp);
    menuBar.add(mnexit);
    
    JLabel l1=new JLabel("Library Management System");
    l1.setBounds(268,30,701,80);
    l1.setForeground(new Color(204,51,102));
    l1.setFont(new Font("Segoe UI Semilight",Font.BOLD,30));
    contentPane.add(l1);
    
    JLabel l2=new JLabel("");
    l2.setVerticalAlignment(SwingConstants.TOP);
    ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("library_management_system/icons/addbook.png"));
    Image i2=icon1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    l2=new JLabel(i3);
    l2.setBounds(60,140,159,152);
    contentPane.add(l2);
    
      JLabel l3=new JLabel("");
    l3.setVerticalAlignment(SwingConstants.TOP);
    ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("library_management_system/icons/statistics.png"));
    Image i4=icon2.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
    ImageIcon i5=new ImageIcon(i4);
    l3=new JLabel(i5);
    l3.setBounds(300,160,134,128);
    contentPane.add(l3);
    
      JLabel l4=new JLabel("");
    l4.setVerticalAlignment(SwingConstants.TOP);
    ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("library_management_system/icons/add student.png"));
    Image i6=icon3.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
    ImageIcon i7=new ImageIcon(i6);
    l4=new JLabel(i7);
    l4.setBounds(530,140,225,152);
    contentPane.add(l4);
    
    b1=new JButton("Add Books");
    b1.addActionListener(this);
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setBounds(60,320,159,44);
    contentPane.add(b1);
    
    b2=new JButton("Statistics");
    b2.addActionListener(this);
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    b2.setBounds(313,320,139,44);
    contentPane.add(b2);
    
      b3=new JButton("Add Student");
    b3.addActionListener(this);
    b3.setBackground(Color.BLACK);
    b3.setForeground(Color.WHITE);
    b3.setBounds(562,320,167,44);
    contentPane.add(b3);
    
    JPanel panel=new JPanel();
    panel.setBorder(new TitledBorder(new LineBorder(new Color(250,128,114),2),"Operation",TitledBorder.LEADING,
    TitledBorder.TOP,null,new Color(220,20,60)));
    panel.setBounds(20,120,750,260);
    panel.setBackground(Color.WHITE);
    contentPane.add(panel);
    
    
    
     JLabel l5=new JLabel("");
    l5.setVerticalAlignment(SwingConstants.TOP);
    ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("library_management_system/icons/issuebook.png"));
    Image i8=icon4.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
    ImageIcon i9=new ImageIcon(i8);
    l5=new JLabel(i9);
    l5.setBounds(62,440,159,163);
    contentPane.add(l5);
    
       JLabel l6=new JLabel("");
    l6.setVerticalAlignment(SwingConstants.TOP);
    ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("library_management_system/icons/returnbook.png"));
    Image i10=icon5.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
    ImageIcon i11=new ImageIcon(i10);
    l6=new JLabel(i11);
    l6.setBounds(310,440,157,152);
    contentPane.add(l6);
    
      JLabel l7=new JLabel("");
    l7.setVerticalAlignment(SwingConstants.TOP);
    ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("library_management_system/icons/Rename.png"));
    Image i12=icon6.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
    ImageIcon i13=new ImageIcon(i12);
    l7=new JLabel(i13);
    l7.setBounds(562,440,157,152);
    contentPane.add(l7);
    
    
    b4=new JButton("Issue Book");
    b4.addActionListener(this);
    b4.setBackground(Color.BLACK);
    b4.setForeground(Color.WHITE);
    b4.setBounds(76,620,143,41);
    contentPane.add(b4);
    
    b5=new JButton("Return Book");
    b5.addActionListener(this);
    b5.setBackground(Color.BLACK);
    b5.setForeground(Color.WHITE);
    b5.setBounds(310,620,159,41);
    contentPane.add(b5);
    
     b6=new JButton("About us");
    b6.addActionListener(this);
    b6.setBackground(Color.BLACK);
    b6.setForeground(Color.WHITE);
    b6.setBounds(562,620,159,41);
    contentPane.add(b6);
    
    JPanel panel2=new JPanel();
    panel2.setBorder(new TitledBorder(new LineBorder(new Color(250,128,114),2),"Operation",TitledBorder.LEADING,
    TitledBorder.TOP,null,new Color(220,20,60)));
    panel2.setBounds(20,420,750,270);
    panel2.setBackground(Color.WHITE);
    contentPane.add(panel2);    
}

    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
String msg=e.getActionCommand();
{
    if(msg.equals("Logout"))
    {
        setVisible(false);
        new Login().setVisible(true);
    }
    else if(msg.equals("Exit"))
    {
        System.exit(0);
    }
    else if(msg.equals("Read Me"))
    {
        new Readme().setVisible(true);
    }
     else if(msg.equals("About us"))
    {
        new Aboutus().setVisible(true);
    }
     else if(msg.equals("Book Details"))
    {
        setVisible(false);
        new BookDetails().setVisible(true);
    }
     else if(msg.equals("Student Details"))
    {
        setVisible(false);
        new StudentDetails().setVisible(true);
    }
    if(e.getSource()==b1)
    {
        this.setVisible(false);
        new AddBook().setVisible(true);
    }
     if(e.getSource()==b2)
    {
        this.setVisible(false);
        new Statistics().setVisible(true);
    }
      if(e.getSource()==b3)
    {
        this.setVisible(false);
        new AddStudent().setVisible(true);
    }
       if(e.getSource()==b4)
    {
        this.setVisible(false);
        new IssueBook().setVisible(true);
    }
        if(e.getSource()==b5)
    {
        this.setVisible(false);
        new ReturnBook().setVisible(true);
    }
        
    
}
    }
    
    
}
