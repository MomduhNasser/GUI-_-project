
package MainFrame;

import MenuBar.MBar;
import Search.SearchStudent;
import SearchTeacher.SearchTeacher;
import StudnsRec.StudensRec;
import Teacher.RecordTeacher;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
//import javax.swing.JTextField;
import java.awt.event.*;

//-------------------
import javax.swing.*;
//import java.awt.event.*;
//import javax.swing.border.LineBorder;
//import windows.windw;



public class MainFramec extends JFrame implements ActionListener{
     
    JList list = new JList();
  DefaultListModel listModel = new DefaultListModel();
    
    public static void main(String[] args) {
         new MainFramec();
    }
    
    public MainFramec(){
        super("StudentsRecord");
         setJMenuBar(menubar()); 
        setLayout(new FlowLayout());
        setLayout(new BorderLayout());
        
        JPanel MainPanel = new JPanel(new BorderLayout());
        JPanel TitlePanel = new JPanel(new BorderLayout());
        JPanel CopyRightPanel = new JPanel(new BorderLayout());

       JPanel P = new JPanel(new GridLayout(5, 1));
        JPanel Line = new JPanel(new FlowLayout());
        JPanel PS1 = new JPanel(new FlowLayout());
        JPanel PS2 = new JPanel(new FlowLayout());
        JPanel PT1 = new JPanel(new FlowLayout());
        JPanel PT2 = new JPanel(new FlowLayout());
        JPanel End = new JPanel(new GridLayout(2, 1));

        
       // JLabel LS1 = new JLabel("Student ID:");
        JLabel LS2 = new JLabel("Add New Student");
        JLabel L = new JLabel("__________________________________________");
       // JLabel LT1 = new JLabel("Teachar ID:");
        JLabel LT2 = new JLabel("Add New Teachar");
        JLabel LE = new JLabel(" ");
        JLabel LEnd = new JLabel("            All Rights Reserved For Islamic University 2016");

        //JTextField TF1 = new JTextField(10);
       // JTextField TF2 = new JTextField(10);
        
        JButton B1_Search = new JButton("Display");
        JButton B1_Insert = new JButton("         Insert New ..         ");
        JButton B2_Search = new JButton("Display");
        JButton B2_Insert = new JButton("         Insert New ..         ");
                
        ImageIcon icon = new ImageIcon("StudentsRecord.png");
        JMenuItem png = new JMenuItem(icon);
        //---------------------to action 
        
        
       
        B1_Search.addActionListener(new ActionListener() {
            
            JFrame StuInfo = new JFrame();
            @Override
            public void actionPerformed(ActionEvent ae) {
                new SearchStudent();
            }
                  //  StuInfo.toFront();

            

            
        });
        
      
        
        B2_Search.addActionListener(new ActionListener() {
            JFrame StuInfo = new JFrame();
            @Override
            public void actionPerformed(ActionEvent ae) {
              new SearchTeacher();//comlpie will read this go to class 
            }
            private void createNewFrame() {

            }
        });
       
        
        //---------------
        B1_Insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                
new StudensRec();
            }
        });
        //------------------------
        //------ if you bu B2 will go to this class
        B2_Insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
new RecordTeacher();
            }
        });
    //----------------------------------------------------------------------
      
        TitlePanel.add(png);
        add(TitlePanel,BorderLayout.NORTH);
        
       // PS1.add(LS1);
       //PS1.add(TF1);
       PS1.add(B1_Search);
        PS2.add(LS2);PS2.add(B1_Insert);
        P.add(PS1);P.add(PS2);
        
        Line.add(L);
        P.add(Line);
        
        //PT1.add(LT1);
        //PT1.add(TF2);
        PT1.add(B2_Search);
        PT2.add(LT2);PT2.add(B2_Insert);
        P.add(PT1);P.add(PT2);
        
        MainPanel.add(P);
        add(MainPanel,BorderLayout.CENTER);
        
        PS1.setOpaque(true);
        PS1.setBackground(new Color(230, 230, 230));
        PS2.setOpaque(true);
        PS2.setBackground(new Color(230, 230, 230));
        
        PT1.setOpaque(true);
        PT1.setBackground(new Color(230, 230, 230));
        PT2.setOpaque(true);
        PT2.setBackground(new Color(230, 230, 230));
        
        End.setOpaque(true);
        End.setBackground(new Color(200, 200, 200));
                
        End.add(LE);End.add(LEnd);
        CopyRightPanel.add(End);
        add(CopyRightPanel,BorderLayout.SOUTH);
        
    //----------------------------------------------------------------------
    
        setResizable(false);
        setSize(350, 370);
       setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
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
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
 int value = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exiting Application", JOptionPane.OK_CANCEL_OPTION);
                if (value == JOptionPane.OK_OPTION) {
                    dispose();
                }
            }
        });
     
    
        
        newwindows.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
         JFrame  frame = new JFrame();
         
         
         //if you put something in this 
        
        new MainFramec();// go to main constursr
 frame.toFront();
       }
     
 });
        
        
        
    return menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    
    
    
	
    
}
