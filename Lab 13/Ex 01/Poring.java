
// Import
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

// Poring
public class Poring extends Thread implements MouseListener {

    // Varlabel
    private JFrame fr;
    private JPanel p;
    private JLabel l;
    private Random ramdom_x, ramdom_y;

    // Init
    public Poring(int number, int postion_x, int postion_y) {
        fr = new JFrame();
        l = new JLabel(String.valueOf(number));
        p = new JPanel();
        ramdom_x = new Random();
        ramdom_y = new Random();
        l.setIcon(new ImageIcon("Poring.png"));
        fr.addMouseListener(this);
        p.add(l);
        fr.add(p);
        fr.setLocation(postion_x, postion_y);
        fr.pack();
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setVisible(true);
    }

    // Run
    @Override
    public void run() {
        while (true) {
            int x = ramdom_x.nextInt(3);
            int y = ramdom_y.nextInt(3);
            if (x == 1) {
                fr.setLocation(fr.getX()+2, fr.getY());
            }
            else if (x == 2) {
                fr.setLocation(fr.getX()-2, fr.getY());
            }
            if (y == 1) {
                fr.setLocation(fr.getX(), fr.getY()+2);
            }
            else if (y == 2) {
                fr.setLocation(fr.getX(), fr.getY()-2);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    // Override
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(fr)) {
            fr.dispose();
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
}
