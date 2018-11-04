import java.awt.*;
import java.awt.event.*;

public class AWTButtonDemo extends Frame implements ActionListener {
    String msg = "";
    Button yes, no, maybe;

    public AWTButtonDemo() {
        setLayout(new FlowLayout());

        yes = new Button("yes");
        no = new Button("no");
        maybe = new Button("maybe");

        add(yes);
        add(no);
        add(maybe);

        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("yes")) {
            msg = "You Pressed yes";
        }

        else if(str.equals("no")) {
            msg = "You Pressed no";
        }

        else if(str.equals("maybe")) {
            msg = "You Pressed maybe";
        }

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }

    public static void main(String[] args) {
        AWTButtonDemo appwin = new AWTButtonDemo();

        appwin.setSize(new Dimension(250, 150));
        appwin.setTitle("AWTButtonDemo");
        appwin.setVisible(true);
    }
}