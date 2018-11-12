import java.awt.*;
import java.awt.event.*;

public class AWTGridBagDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;

    public AWTGridBagDemo() {
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);

        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android", false);
        solaris = new Checkbox("Solaris", false);
        mac = new Checkbox("Mac OS", false);

        gbc.weightx = 1.0;
        gbc.ipadx = 200;
        gbc.insets = new Insets(0, 6, 0, 0);

        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(windows, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(android, gbc);

        gbc.weighty = 1.0;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(solaris, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(mac, gbc);

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
        g.drawString(msg, 20, 100);
        msg = " Windows:    " + windows.getState();
        g.drawString(msg, 30, 120);
        msg = " Android:    " + android.getState();
        g.drawString(msg, 30, 140);
        msg = " Solaris:    " + solaris.getState();
        g.drawString(msg, 30, 160);
        msg = " Mac:    " + mac.getState();
        g.drawString(msg, 30, 180);
       }
    
    public static void main(String[] args) {
        AWTGridBagDemo appwin = new AWTGridBagDemo();

        appwin.setSize(new Dimension(250, 200));
        appwin.setTitle("AWTGridBagDemo");
        appwin.setVisible(true);
    }
}