/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */
//package StudnsRec;
//import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javax.swing.DefaultListModel;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JList;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//
//
//
//
//public class StudensRec extends JFrame implements ActionListener {
////JButton btn1 = new JButton("Name");
//static DefaultListModel listModel = new DefaultListModel();
//    JLabel Name, ID, Email,Phone,Blood;
//
//    JTextField tfName, tfID, tfEmail,tfPhone,tfBlood,tfDisplay;
//    JButton add, Display;
//    JPanel panel;
//     
//    static JList list = new JList();
//    
//   // JButton button = new JButton("submit");
//
//
//    public StudensRec() {
//        
//        super("Studnts");
// JTextField tfName = new JTextField(12);
//        setLayout(new BorderLayout());
//
//        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        // panel2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
//list.setModel(listModel);
//        panel.setPreferredSize(new Dimension(50,50));
//        Name = new JLabel("Enter your name");
//        Name.setBounds(50, 50, 100, 50);
//        panel.add(Name);
//       // add(Name);
//
//        tfName = new JTextField(15);
//        tfName.setBounds(160, 50, 50, 20);
//        panel.add(tfName);
//      //  add(tfName);
//
//        ID = new JLabel("Enter your ID");
//        ID.setBounds(50, 50, 100, 50);
//        panel.add(ID);
//       // add(ID);
//
//        tfID = new JTextField(15);
//        tfID.setBounds(160, 50, 50, 20);
//        panel.add(tfID);
//     //   add(tfID);
//
//        Email = new JLabel("Enter your Email");
//        Email.setBounds(50, 50, 100, 50);
//        panel.add(Email);
//      //  add(Email);
//
//        tfEmail = new JTextField(15);
//        tfEmail.setBounds(160, 50, 50, 20);
//        panel.add(tfEmail);
//        //add(tfEmail);
//        
//         Phone = new JLabel("Enter your Phone");
//        Phone.setBounds(50, 50, 100, 50);
//        panel.add(Phone);
// tfPhone = new JTextField(15);
//        tfPhone.setBounds(160, 50, 50, 20);
//        panel.add(tfPhone);
//        
//         Blood = new JLabel("Enter your Blood");
//        Blood.setBounds(50, 50, 100, 50);
//        panel.add(Blood);
// tfBlood = new JTextField(15);
//        tfBlood.setBounds(160, 50, 50, 20);
//        panel.add(tfBlood);
//        
//        
//        
//        Display = new JButton("Diaplay");
//        Display.setBounds(110, 110, 50, 50);
//        panel.add(Display);
//      //  add(Display);
//      
//  //tfDisplay = new JTextField(12);
//    //Display = new JButton("Diaplay");
// 
//        add = new JButton("Add");
//        add.setBounds(50, 110, 50, 50);
//        panel.add(add);
//        add.addActionListener(this);
//        //  add(add);
//        
//        add(panel, BorderLayout.CENTER);
//
//        pack();
//        //setMinimumSize(new Dimension(400, 400));
//        setSize(250, 400);
//        setResizable(false);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);//in cnter
//        // setLocationRelativeTo(null);// get large of small
//        
//    } 
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//if(e.getSource()==add){
//        ResultSet rs;
//        try {
//             Connection c = DriverManager.getConnection("jdbc:ucanaccess://DB.accdb");
//                Statement st = c.createStatement();
//                // st.executeUpdate("insert into student (ID) values('" + tfName.getText() + "')");
//  st.executeUpdate("insert into StudenTable (Name) values('" + tfName.getText() + "')"+"insert into student (ID) values('"+tfID.getText()+"')"+"insert into student (Email) values('"+tfEmail.getText()+"')"+"insert into student (Phone) values('"+tfPhone.getText()+"')"+"insert into student (Blood) values('"+tfBlood.getText()+"')");
//  //st.executeUpadate("insert into student (ID) values('"+tfID.getText()+"')");
//                tfName.setText("");
//                rs = st.executeQuery("select * from Student");
//            while (rs.next()) {
//               
//                    listModel.addElement(rs.getString("Name") + "         " + rs.getString("ID") + "         " + rs.getString("Email")+"       "+rs.getString("Phone")+"        "+rs.getString("blood"));
//                    
//               
//            }
//
//        } catch (Exception exception) {
//            System.out.println(exception);
//        }
//    }
//else{
// ResultSet rs;
//            try {
//                Connection c = DriverManager.getConnection("jdbc:ucanaccess://DB.accdb");
//                Statement st = c.createStatement();
//                rs = st.executeQuery("select * from student");
//                listModel.clear();
//                while (rs.next()) {
//                    listModel.addElement(rs.getString("Name"));
//                }
//            } catch (Exception e1) {
//                System.out.println("exception 2 occured");
//            }
//
//        
//
//}
//    }
//
//    public static void main(String[] args) {
//        new StudensRec();
//        
//    }
//
//}
//

package StudnsRec;

import MenuBar.MBar;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudensRec extends JFrame implements ActionListener {
//JButton btn1 = new JButton("Name");

    static DefaultListModel listModel = new DefaultListModel();
    JLabel Name, ID, Email, Phone, Blood;

     JTextField tfName, tfID, tfEmail, tfPhone, tfBlood, tfDisplay;
    JButton add, Display;
    JPanel panel;

    static JList list = new JList();
 static JFrame frame = new JFrame();
  
    // JButton button = new JButton("submit");
    public StudensRec() {

        super("Studnts");
        //JTextField tfName = new JTextField(12);
        setLayout(new BorderLayout());
 setJMenuBar(menubar());
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        // panel2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        list.setModel(listModel);
        panel.setPreferredSize(new Dimension(50, 50));
        Name = new JLabel("Enter your name");
        Name.setBounds(50, 50, 100, 50);
        panel.add(Name);
        // add(Name);

        tfName = new JTextField(15);
        tfName.setBounds(160, 50, 50, 20);
        panel.add(tfName);
        //  add(tfName);

        ID = new JLabel("Enter your ID");
        ID.setBounds(50, 50, 100, 50);
        panel.add(ID);
        // add(ID);

        tfID = new JTextField(15);
        tfID.setBounds(160, 50, 50, 20);
        panel.add(tfID);
        //   add(tfID);

        Email = new JLabel("Enter your Email");
        Email.setBounds(50, 50, 100, 50);
        panel.add(Email);
        //  add(Email);

        tfEmail = new JTextField(15);
        tfEmail.setBounds(160, 50, 50, 20);
        panel.add(tfEmail);
        //add(tfEmail);

        Phone = new JLabel("Enter your Phone");
        Phone.setBounds(50, 50, 100, 50);
        panel.add(Phone);
        tfPhone = new JTextField(15);
        tfPhone.setBounds(160, 50, 50, 20);
        panel.add(tfPhone);

        Blood = new JLabel("Enter your Blood");
        Blood.setBounds(50, 50, 100, 50);
        panel.add(Blood);
        tfBlood = new JTextField(15);
        tfBlood.setBounds(160, 50, 50, 20);
        panel.add(tfBlood);
//
//        Display = new JButton("Diaplay");
//        Display.setBounds(110, 110, 50, 50);
//        panel.add(Display);
//      //  add(Display);

        //tfDisplay = new JTextField(12);
        //Display = new JButton("Diaplay");
        add = new JButton("Add");
        add.setBounds(50, 110, 50, 50);
        panel.add(add);
        
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "Done !");
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //int value = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exiting Application", JOptionPane.OK_CANCEL_OPTION);
               
            dispose();
            }
        }
        );
        //  add(add);

        add(panel, BorderLayout.CENTER);

        pack();
        //setMinimumSize(new Dimension(400, 400));
        setSize(250, 400);
        setResizable(false);
        setLocationRelativeTo(null);
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);//in cnter
        // setLocationRelativeTo(null);// get large of small

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            ResultSet rs;
            try {
                Connection c = DriverManager.getConnection("jdbc:ucanaccess://DB.accdb");
                Statement st = c.createStatement();
                //st.executeUpdate("insert into student (ID) values('" + tfName.getText() + "')");
                                
                
                st.executeUpdate("insert into StudenTable (Name, ID, Email, Phone, Blood) values('" + tfName.getText() + "' , '" + tfID.getText() + "','" + tfEmail.getText() + "','" + tfPhone.getText() + "','" + tfBlood.getText() + "')");
                

            } catch (Exception exception) {
                System.out.println(exception);
                
            }
        } else {
            ResultSet rs;
            try {
                Connection c = DriverManager.getConnection("jdbc:ucanaccess://DB.accdb");
                Statement st = c.createStatement();
                rs = st.executeQuery("select * from student");
                listModel.clear();
                while (rs.next()) {
                    listModel.addElement(rs.getString("Name"));
                }
            } catch (Exception e1) {
                System.out.println("exception 2 occured");
            }

        }
    }

    public static void main(String[] args) {
        new StudensRec();

    }

    private JMenuBar menubar() {

        JMenuBar menu = new JMenuBar();
        setJMenuBar(menu) ;//to set mnu in frame 
        
        JMenu file = new JMenu("File");//on bar write
        menu.add(file);
        JMenu file2 = new JMenu("Edit");
        menu.add(file2);
//        JMenu file3 = new JMenu("Help!");
//        menu.add(file3);
        JMenuItem ToMainFrame = new JMenuItem("Main Frame");
        file.add(ToMainFrame);
        JMenuItem exit = new JMenuItem("Exit");//in side somthing 
        file2.add(exit);
        JMenuItem newwindows = new JMenuItem("New Windows");
        file.add(newwindows);// file  i want add somting in you is (  ...   ) 
//        


//        JMenuItem help = new JMenuItem("Help");
//        file3.add(help);
//        
        
        //sTart action pertomed 
        //------------------------------------------------------
        
     
    ToMainFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
new MainFrame.MainFramec();
            }
        });
        
        newwindows.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {   //if you put something in this 
        new StudensRec();// go to main constursr
//       int value = JOptionPane.showConfirmDialog(null, "Are you want new Frame ?","New Frame " , JOptionPane.OK_CANCEL_OPTION);
//       if (value == JOptionPane.OK_OPTION){
//     JFrame frame2 = new JFrame();
//     frame.setTitle("");
       }
     
 });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          int value = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exiting Application", JOptionPane.OK_CANCEL_OPTION);
                if (value == JOptionPane.OK_OPTION) {
                    dispose();
                }
            }
        });
        
        
        
    return menu;
    }

}

