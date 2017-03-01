/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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

/**
 *
 * @author al nasser
 */


public class windw extends JFrame implements ActionListener {

    static windw listandComboBox;
    int counter;
    JComboBox comboBox = new JComboBox();
    DefaultComboBoxModel boxModel = new DefaultComboBoxModel();
    JButton button = new JButton("Add");
    JList list = new JList();
    DefaultListModel listModel = new DefaultListModel();

    public windw() {
        super("List & ComboBox");
        setLayout(new FlowLayout());

        boxModel.addElement("Red");
        boxModel.addElement("Green");
        boxModel.addElement("Blue");

        comboBox.setModel(boxModel);

        list.setModel(listModel);
        list.setPreferredSize(new Dimension(80, 100));

        list.setBorder(new LineBorder(Color.LIGHT_GRAY));

        button.addActionListener(this);

        setJMenuBar(createJMenu());
        add(comboBox);
        add(button);
        add(list);

        setSize(250, 180);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        listandComboBox = new windw();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        if (counter >= 6) {
            JOptionPane.showMessageDialog(null, "List is full");
        } else {
            String color = (String) comboBox.getSelectedItem();

            listModel.addElement(color);
        }
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

        clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.clear();
                counter = 0;
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

        newList.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new windw();
            }
        });

        return menuBar;
    }
}
