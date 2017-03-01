package components;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstProgram extends JFrame{
    JLabel label;
    JTextField textField;
    JButton button;
    JTextArea textArea;
    JCheckBox checkBox1, checkBox2;
    JRadioButton radioButton1, radioButton2;
    ButtonGroup buttonGroup;
    public FirstProgram(){
        super("Components");
        
        setLayout(new FlowLayout());
        
        label = new JLabel("Label");
        textField = new JTextField(10);
        button = new JButton("Click");
        textArea = new JTextArea(10, 20);
        checkBox1 = new JCheckBox("checkbox1");
        checkBox2 = new JCheckBox("checkbox2");
        radioButton1 = new JRadioButton("radiobutton1");
        radioButton2 = new JRadioButton("radiobutton2");
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);buttonGroup.add(radioButton2);
        
        add(label);add(textField);
        add(button);add(textArea);
        add(checkBox1);add(checkBox2);
        
        add(radioButton1);add(radioButton2);
        
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
     new FirstProgram();
    }
}
