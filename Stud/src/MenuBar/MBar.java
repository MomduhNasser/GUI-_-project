///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package MenuBar;
//
//import java.awt.MenuBar;
//import javax.swing.*;
//import java.awt.event.*;
//import windows.windw;
//
//public class MBar extends JFrame implements ActionListener{
//JFrame frame;
// JList list = new JList();
//  DefaultListModel listModel = new DefaultListModel();
//    public MBar() {  
//        super("Tile");
//    setVisible(true);
//        setSize(400,200);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   
//        menubar();     
//    }  
//    public static void main(String[] args) {
//        new MBar();   
//    }//end main 
//
//  private void menubar (){
// JMenuBar menu = new JMenuBar();
//        setJMenuBar(menu) ;
//        
//        JMenu file = new JMenu("File");
//        menu.add(file);
//        JMenuItem exit = new JMenuItem("Exit");
//        file.add(exit);
//        JMenuItem newwindows = new JMenuItem("New Windows");
//        file.add(newwindows);
//      //  exit.addActionListener(new ex);     
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        int value = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exiting Application", JOptionPane.OK_CANCEL_OPTION);
//                if (value == JOptionPane.OK_OPTION) {
//                    dispose();
//                } }    }//end class
//
package MenuBar;

import javax.swing.*;
import java.awt.event.*;
import windows.windw;
//import windows.windw;

public class MBar extends JFrame implements ActionListener{
//JFrame frame;
 JList list = new JList();
  DefaultListModel listModel = new DefaultListModel();
    public MBar() {  
        super("Tile");
        
    setVisible(true);
        setSize(400,200);
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        
        
        setJMenuBar(menubar());     
    }  
    public static void main(String[] args) {
        new MBar();   
    }//end main 

  private JMenuBar menubar (){
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
        new MBar();
        JFrame frame = new JFrame();
        frame.toFront();


// go to main constursr
//       int value = JOptionPane.showConfirmDialog(null, "Are you want new Frame ?","New Frame " , JOptionPane.OK_CANCEL_OPTION);
//       if (value == JOptionPane.OK_OPTION){
//     JFrame frame2 = new JFrame();
//     frame.setTitle("");
       }
     
 });
        exit.addActionListener(this); 
        
        
    return menu;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int value = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exiting Application", JOptionPane.OK_CANCEL_OPTION);
                if (value == JOptionPane.OK_OPTION) {
                    dispose();
                } }


}//end class

