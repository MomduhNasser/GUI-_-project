package layoutmanager;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FifthProgram extends JFrame {

    JButton btn1, btn2, btn3, btn4, btn5;

    public FifthProgram() {
        super("Main Frame");
        
        setLayout(new GridLayout(2,3));
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        setSize(500, 400);
        //pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FifthProgram();

    }
}
