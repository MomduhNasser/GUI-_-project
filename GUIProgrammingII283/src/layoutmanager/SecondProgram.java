package layoutmanager;

import javax.swing.JFrame;

public class SecondProgram extends JFrame {

    public SecondProgram() {
        super("Main Frame");

        
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SecondProgram();

    }
}
