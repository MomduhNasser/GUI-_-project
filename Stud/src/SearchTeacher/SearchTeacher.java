/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchTeacher;
import MainFrame.MainFramec;
import MenuBar.MBar;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author al nasser
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author al nasser
 */
public class SearchTeacher extends JFrame implements ActionListener{
    static DefaultListModel listModel = new DefaultListModel();
 
  
   
   static JList list = new JList();
  JButton B1_Search = new JButton("Display All Teacher");

    public SearchTeacher() {
        super("All Teachers ");
        
               setLayout(new FlowLayout(FlowLayout.CENTER));
      add(B1_Search);
       add(list);
       
       list.setModel(listModel);

       B1_Search.addActionListener(this);//if button is click to this (action performed) 
                  
                 
       setSize(500, 500);
       setLocationRelativeTo(null);
       setVisible(true);
        setJMenuBar(menubar()); 
        
   }

    


    public static void main(String[] args) {
        new SearchTeacher();}

    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        
if(e.getSource()==B1_Search){
                ResultSet rs;
       try {
           Connection c = DriverManager.getConnection("jdbc:ucanaccess://DB.accdb");
           Statement st = c.createStatement();

           rs = st.executeQuery("select * from TeacherTable");

           //String text = tfName.getText();
           while (rs.next()) {
               //if (text.equals(rs.getString("ID"))) {
                   listModel.addElement("Name:"+rs.getString("Name") + "-" + "ID:"+rs.getString("ID") + "-" +"Phone: "+ rs.getString("Phone")+"-" +"Email: "+rs.getString("Email")+"-" +"Studying in Acadmic"+rs.getString("Studying_in_Academic")+"-" +"Acamic Grade:"+rs.getString("Academic_grade"));
                   
               //}
           }
//            while(rs.next()){
//                 System.out.println(rs.getString("Name"));
//              }
       } catch (Exception exception) {
           System.out.println(exception);
       }
    }}

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
        
     
    
        
        newwindows.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {   //if you put something in this 
        new MainFramec();
        JFrame frame = new JFrame();
        frame.toFront();


// go to main constursr
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

   

       



    

