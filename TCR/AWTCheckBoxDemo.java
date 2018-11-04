import java.awt.*;
import java.awt.event.*;

public class AWTCheckBoxDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;

    public AWTCheckBoxDemo() {
        setLayout(new FlowLayout());

        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac");

        add(windows);
        add(android);
        add(solaris);
        add(mac);

        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Current State: ";
        g.drawString(msg, 20, 120);
        msg = " Windows: " + windows.getState();
        g.drawString(msg, 20, 140);
        msg = " Android: " + android.getState();
        g.drawString(msg, 20, 160);
        msg = " Solaris: " + solaris.getState();
        g.drawString(msg, 20, 180);
        msg = " Mac: " + mac.getState();
        g.drawString(msg, 20, 200);
    }

    public static void main(String[] args) {
        AWTCheckBoxDemo appwin = new AWTCheckBoxDemo();

        appwin.setSize(new Dimension(240, 220));
        appwin.setTitle("AWTCheckboxDemo");
        appwin.setVisible(true);
    }
}