package layoutmanager;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FourthProgram extends JFrame {

    JButton btn1, btn2;

    public FourthProgram() {
        super("Main Frame");

        setLayout(new FlowLayout());
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");


        add(btn1);
        add(btn2);

        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FourthProgram();

    }
}
