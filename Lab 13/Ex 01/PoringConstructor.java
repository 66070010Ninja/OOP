
// Import
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

// PoringConstructor
public class PoringConstructor implements ActionListener {

    // Varlabel
    private JFrame fr;
    private JPanel p;
    private JButton bt;
    private int number = 1;
    private Random random_x, random_y;
    private Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();

    // Init
    public PoringConstructor() {
        fr = new JFrame();
        p = new JPanel();
        random_x = new Random();
        random_y = new Random();
        bt = new JButton("Add");
        bt.addActionListener(this);
        p.add(bt);
        fr.add(p);
        fr.setLocation((int)screen_size.getWidth()/2, (int)screen_size.getHeight()/2);;
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    // Override
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt)) {
            int postion_x = random_x.nextInt((int)screen_size.getWidth()-100);
            int postion_y = random_y.nextInt((int)screen_size.getHeight()-100);
            Poring p =new Poring(number, postion_x, postion_y);
            p.start();
            number += 1;
        }
    }

    public static void main(String[] args) {
        new PoringConstructor();
    }
}
