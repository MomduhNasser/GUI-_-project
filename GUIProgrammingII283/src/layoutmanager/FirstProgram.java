package layoutmanager;

import javax.swing.JFrame;

public class FirstProgram {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Main Frame");
        
        
        mainFrame.setSize(500, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        
    }
}
