package mainpackage;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class EHThirdProgram extends JFrame {

    private JTextArea ta1 = new JTextArea(5, 30);

    private JPanel p1 = new JPanel(new FlowLayout());

    public EHThirdProgram() throws HeadlessException {
        super("Third Program");
        ta1.setBorder(new LineBorder(Color.DARK_GRAY, 1));
        ta1.setFont(new Font("Serif", Font.BOLD, 25));

        p1.add(ta1);

        this.add(p1);
        this.pack();

        ta1.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                Color c = new Color((int) (255 * Math.random()),
                        (int) (255 * Math.random()),
                        (int) (255 * Math.random()));

                ta1.setForeground(c);
            }
        });

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        EHThirdProgram f = new EHThirdProgram();

    }

}
