package mainpackage;

import javax.swing.*;
import java.awt.event.*;

public class EHFirstProgram extends JFrame implements ActionListener {

    public EHFirstProgram() {
        super("Handle Event");

        // Create two buttons 
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");

        // Create a panel to hold buttons
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);

        add(panel); // Add panel to the frame

        jbtOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK button clicked");
            }
        });

        jbtCancel.addActionListener(this);

        setSize(200, 150);
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        EHFirstProgram frame = new EHFirstProgram();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel button clicked");
    }
}
