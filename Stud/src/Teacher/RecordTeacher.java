/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teacher;

import StudnsRec.StudensRec;
import javax.swing.*;

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
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author al nasser
 */
public class RecordTeacher extends JFrame implements ActionListener{
 static DefaultListModel listModel = new DefaultListModel();
    JLabel Name, ID,  Phone,Email ,StudyingInAcademic,AcademicGrade;
    
    JTextField tfName, tfID, tfPhone,tfEmail, tfStudyingInAcademic, tfAcademicGrade;
    JButton add;
    JPanel panel;
     static JList list = new JList();

    public RecordTeacher() {
        super("Record  Teacher");
          setLayout(new BorderLayout());
setJMenuBar(menubar()); // neww calsss to menu 
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        // panel2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        list.setModel(listModel);
        panel.setPreferredSize(new Dimension(50, 50));
        Name = new JLabel("Enter your Name");
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

        Phone = new JLabel("Enter your Phone");
        Phone.setBounds(50, 50, 100, 50);
        panel.add(Phone);
      
        tfPhone = new JTextField(15);
        tfPhone.setBounds(160, 50, 50, 20);
        panel.add(tfPhone);
      

        Email = new JLabel("Enter your Email");
        Email.setBounds(50, 50, 100, 50);
        panel.add(Email);
        tfEmail = new JTextField(15);
        tfEmail.setBounds(160, 50, 50, 20);
        panel.add(tfEmail);

        StudyingInAcademic = new JLabel("What your Studying in Academic?");
        StudyingInAcademic.setBounds(50, 50, 100, 50);
        panel.add(StudyingInAcademic);
        tfStudyingInAcademic = new JTextField(15);
        tfStudyingInAcademic.setBounds(160, 50, 50, 20);
        panel.add(tfStudyingInAcademic);
        
        
        AcademicGrade = new JLabel("What your Academic grade(Level) ?");
        AcademicGrade.setBounds(50, 50, 100, 50);
        panel.add(AcademicGrade);
        tfAcademicGrade = new JTextField(15);
        tfAcademicGrade.setBounds(160, 50, 50, 20);
        panel.add(tfAcademicGrade);
        
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
        add.addActionListener(this);
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
                                
                
                st.executeUpdate("insert into TeacherTable (Name,ID,Phone,Email,Studying_in_Academic,Academic_grade) values('"
                        + tfName.getText() +
                        "' , '"
                        + tfID.getText() + 
                        "','"
                        + tfEmail.getText() +
                        "','"
                        + tfPhone.getText() +
                        "','" 
                        + tfStudyingInAcademic.getText() +
                        "','"
                        + tfAcademicGrade.getText()+
                        "')");
                
JOptionPane.showMessageDialog(null, "Done !");
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //int value = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exiting Application", JOptionPane.OK_CANCEL_OPTION);
               
            dispose();
            } catch (Exception exception) {
                System.out.println(exception);
                
            }
//        } else {
//            ResultSet rs;
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
//        }
       
           
           
       }
    
    

 
    }

    public static void main(String[] args) {
        new RecordTeacher();
                
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
        new RecordTeacher();// go to main constursr
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
