package layoutmanager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SixthProgram extends JFrame {

    JButton btn1, btn2, btn3, btn4, btn5;

    public SixthProgram() {
        super("Main Frame");

        setLayout(new BorderLayout());
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.WEST);
        add(btn3, BorderLayout.CENTER);
        add(btn4, BorderLayout.EAST);
        add(btn5, BorderLayout.SOUTH);

        setSize(500, 400);

        setMinimumSize(new Dimension(350, 150));

        //pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SixthProgram();

    }
}
