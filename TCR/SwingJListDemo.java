import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingJListDemo {

    String[] Cities = {"City 1", "City 2", "City 3",
                       "City 4", "City 5", "City 6", 
                       "City 7", "City 8", "City 9",
                       "City 10", "City 11", "City 12",};

    public SwingJListDemo() {
        JFrame jfrm = new JFrame("SwingJListDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200, 200);

        JList<String> jlist = new JList<String>(Cities);

        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane jscrlp = new JScrollPane(jlist);
        jscrlp.setPreferredSize(new Dimension(120, 90));

        JLabel jlab = new JLabel("Choose a City");

        jlist.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent le) {
                int idx = jlist.getSelectedIndex();

                if(idx!=-1)
                    jlab.setText("Current Selection: " + Cities[idx]);
                else
                    jlab.setText("Choose a City");
            }
        });

        jfrm.add(jscrlp);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingJListDemo();
            }
        });
    }
}