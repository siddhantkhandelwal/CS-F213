import java.awt.*;
import java.awt.event.*;

public class AWTCheckBoxGroupDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;
    CheckboxGroup cbg;

    public AWTCheckBoxGroupDemo() {
        setLayout(new FlowLayout());

        cbg = new CheckboxGroup();

        windows = new Checkbox("Windows", cbg, true);
        android = new Checkbox("Android", cbg, false);
        solaris = new Checkbox("Solaris", cbg, false);
        mac = new Checkbox("Mac", cbg, false);

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
        msg = "Current Selection: ";
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 20, 120);
    }

    public static void main(String[] args) {
        AWTCheckBoxGroupDemo appwin = new AWTCheckBoxGroupDemo();

        appwin.setSize(new Dimension(240, 180));
        appwin.setTitle("AWTCheckboxGroupDemo");
        appwin.setVisible(true);
    }
}