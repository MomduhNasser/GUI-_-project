/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class windownew extends JFrame implements ActionListener{
 DefaultListModel listModel = new DefaultListModel();
 // int counter;
    public windownew() throws HeadlessException {
      setJMenuBar(createJMenu());
       
        setSize(250, 180);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    
        
    
    
    public static void main(String[] args) {
        new windownew();
    }
     

    private JMenuBar createJMenu() {
       JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem newList = new JMenuItem("New Window");

        JMenuItem clear = new JMenuItem("Clear");
        JMenuItem exit = new JMenuItem("Exit");

       file.add(newList);

        edit.add(clear);
        edit.add(exit);

        menuBar.add(file);
        menuBar.add(edit);

        //clear.addActionListener(new ActionListener() {

           // @Override
           // public void actionPerformed(ActionEvent e) {
               // listModel.clear();
                //counter = 0;
           // }
       // });

        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int value = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exiting Application", JOptionPane.OK_CANCEL_OPTION);
                if (value == JOptionPane.OK_OPTION) {
                    dispose();
                }
            }
        });

        newList.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new windw();
            }
        });

        return menuBar;
    }
}
