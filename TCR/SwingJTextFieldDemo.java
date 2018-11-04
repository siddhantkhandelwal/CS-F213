import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingJTextFieldDemo {
    public SwingJTextFieldDemo() {
        JFrame jfrm = new JFrame("SwingJTextFieldDemo");

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(260, 120);

        JTextField jtf = new JTextField(15);
        jfrm.add(jtf);

        JLabel jlab = new JLabel();
        jfrm.add(jlab);

        jtf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText(jtf.getText());
            }
        });
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingJTextFieldDemo();
            }
        });
    }
}