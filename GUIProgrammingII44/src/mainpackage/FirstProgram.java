package mainpackage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstProgram extends JFrame {

    JPanel panel1, panel2, panel3, panel3_1, panel3_2;
    JLabel label;
    JTextField textField;
    JButton button;
    JTextArea textArea;
    JCheckBox checkBox1, checkBox2;
    JRadioButton radioButton1, radioButton2;
    ButtonGroup buttonGroup;

    public FirstProgram() {
        super("Components");

        setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel3_1 = new JPanel();
        panel3_2 = new JPanel();

        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());
        panel3_1.setLayout(new BoxLayout(panel3_1, BoxLayout.Y_AXIS));
        panel3_2.setLayout(new BoxLayout(panel3_2, BoxLayout.Y_AXIS));

        label = new JLabel("Label");
        textField = new JTextField(10);
        button = new JButton("Click");
        textArea = new JTextArea(10, 20);
        checkBox1 = new JCheckBox("checkbox1");
        checkBox2 = new JCheckBox("checkbox2");
        radioButton1 = new JRadioButton("radiobutton1");
        radioButton2 = new JRadioButton("radiobutton2");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        panel1.add(label);
        panel1.add(textField);
        panel1.add(button);
        panel2.add(textArea);
        panel3_1.add(checkBox1);
        panel3_1.add(checkBox2);

        panel3_2.add(radioButton1);
        panel3_2.add(radioButton2);

        panel3.add(panel3_1);
        panel3.add(panel3_2);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);

        setMinimumSize(new Dimension(300, 300));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FirstProgram();
    }
}
