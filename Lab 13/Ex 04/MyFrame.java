
// Import
import javax.swing.*;
import java.awt.event.*;

// MyFrame
public class MyFrame implements MouseListener {

    // Varlabel
    private JFrame fr;
    private JPanel panel;
    private MyClock clock;
    private Thread t;

    // Init
    public MyFrame() {
        panel = new JPanel();
        fr = new JFrame();
        clock = new MyClock();
        t = new Thread(clock);
        t.start();
        panel.add(clock);
        fr.add(panel);
        fr.addMouseListener(this);
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Override
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(fr)) {
            clock.set_Count_Time();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    // Test And Run Code
    public static void main(String[] args) {
        new MyFrame();
    }
}
