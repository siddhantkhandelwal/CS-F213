import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingEventDemo {
    JLabel jlab;
    SwingEventDemo() {
        JFrame jfrm = new JFrame("SwingEventDemo");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(220, 90);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnalpha = new JButton("Alpha");
        JButton jbtnbeta = new JButton("Beta");

        jbtnalpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Alpha was pressed");
            }
        });

        jbtnbeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Beta was pressed");
            }
        });

        jfrm.add(jbtnalpha);
        jfrm.add(jbtnbeta);

        jlab = new JLabel("Press a Button");
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingEventDemo();
            }
        });
    }
}