import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame {
    String msg = "";
    
    public AdapterDemo() {
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }

    public static void main(String args[]) {
        AdapterDemo appwin = new AdapterDemo();

        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("Adapter Demo");
        appwin.setVisible(true);
    }
}

class MyMouseAdapter extends MouseAdapter {
    AdapterDemo adapterDemo;

    public MyMouseAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    public void mouseClicked(MouseEvent me) {
        adapterDemo.msg = "Mouse Clicked";
        adapterDemo.repaint();
    }

    public void mouseDragged(MouseEvent me) {
        adapterDemo.msg = "Mouse dragged";
        adapterDemo.repaint();
    }
}

class MyWindowAdapter extends WindowAdapter {
    public void WindowClosing(WindowEvent we) {
        System.exit(0);
    }
}