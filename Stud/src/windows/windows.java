/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author al nasser
 */



public class windows extends JFrame{   
    JTextField tfFirstNumber = new JTextField(8);
    JLabel l1 = new JLabel("+");
    JTextField tfSecondNumber = new JTextField(8);
    JButton bAddition = new JButton("Add");
    JTextField tfResult = new JTextField(10);
    
    JCheckBox chbBold = new JCheckBox("Bold");
    JCheckBox chbItalic = new JCheckBox("Italic");
    
    JRadioButton rbDefault = new JRadioButton("Default");
    JRadioButton rbRed = new JRadioButton("Red");
    JRadioButton rbBlue = new JRadioButton("Blue");
    ButtonGroup bg = new ButtonGroup();
    
    JPanel p1 = new JPanel(new FlowLayout());
    Box p2 = Box.createVerticalBox();
    
    JPanel p3 = new JPanel(new FlowLayout());
    JPanel p4 = new JPanel(new GridLayout(3, 1));
    Box p5 = Box.createVerticalBox();
    
    JPanel mainPanel = new JPanel();
    
    Color defaultColor = new Color(220, 20, 200);
    public windows() throws HeadlessException {
        p1.add(tfFirstNumber);p1.add(l1);p1.add(tfSecondNumber);


        p2.add(p1);
        p2.add(Box.createVerticalStrut(10));
        bAddition.setAlignmentX(Component.CENTER_ALIGNMENT);
        p2.add(bAddition);

        p2.add(Box.createVerticalStrut(10));
        tfResult.setHorizontalAlignment(JTextField.CENTER);
        tfResult.setMaximumSize(tfResult.getPreferredSize());
        p2.add(tfResult);

        p3.add(chbBold);p3.add(chbItalic);


        bg.add(rbDefault);bg.add(rbRed);bg.add(rbBlue);
        p4.setBackground(Color.red);
        p4.add(rbDefault);p4.add(rbRed);p4.add(rbBlue);
        p4.setMaximumSize(p4.getPreferredSize());          

        p5.add(p3);p5.add(p4);
        mainPanel.add(p2);mainPanel.add(p5);



        add(mainPanel);
        setResizable(false);    
        setTitle("GUI | EventHandling");
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
            
        bAddition.addActionListener(new AdditionListener());
        chbBold.addItemListener(new chBListener());
        chbItalic.addItemListener(new chBListener());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("MyFrame is opened");
                rbDefault.setSelected(true);
                tfResult.setForeground(defaultColor);
                
            }});
        
        rbDefault.addActionListener(new rbListener());
        rbRed.addActionListener(new rbListener());
        rbBlue.addActionListener(new rbListener());
    }

    public static void main(String[] args) {
        windows frame = new windows();       
    }
    class AdditionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try{
            tfResult.setText(Integer.toString(Integer.parseInt(tfFirstNumber.getText()) +
                    Integer.parseInt(tfSecondNumber.getText())));
            }
            catch(NumberFormatException exception){
                
            }
        }
    }
    class chBListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            int fontStyle = Font.PLAIN;
            fontStyle += (chbBold.isSelected()? Font.BOLD : Font.PLAIN);
            fontStyle += (chbItalic.isSelected()? Font.ITALIC : Font.PLAIN);
            tfResult.setFont(new Font("Tahoma", fontStyle, 12));
        }   
    }
    class rbListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(rbDefault.isSelected())
                tfResult.setForeground(defaultColor);
            if(rbRed.isSelected())
                tfResult.setForeground(Color.RED);
            if(rbBlue.isSelected())
                tfResult.setForeground(Color.BLUE);
        } 
    }
}
