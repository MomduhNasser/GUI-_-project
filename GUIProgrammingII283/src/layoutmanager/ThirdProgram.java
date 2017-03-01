package layoutmanager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ThirdProgram extends JFrame {

    JButton btn1, btn2;

    public ThirdProgram() {
        super("Main Frame");

        setLayout(null);
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");

        btn1.setBounds(10, 10, 100, 40);
        btn2.setBounds(120, 10, 100, 40);

        add(btn1);
        add(btn2);

        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ThirdProgram();

    }
}
