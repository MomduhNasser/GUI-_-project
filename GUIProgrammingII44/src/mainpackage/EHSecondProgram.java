package mainpackage;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EHSecondProgram extends JFrame {

    private JButton b1 = new JButton("Button1");
    private JPanel p1 = new JPanel(new FlowLayout());

    public EHSecondProgram() throws HeadlessException {
        p1.add(b1);

        this.add(p1);
        this.pack();

        b1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                b1.setToolTipText("Mouse entered b1");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse exited b1");
            }
        });

        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        EHSecondProgram f = new EHSecondProgram();

    }
}
