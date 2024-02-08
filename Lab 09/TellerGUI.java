import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener {

    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel l1, l2, l3;
    private JButton bt1, bt2, bt3;
    private JTextField tf;

    public TellerGUI() {
        fr = new JFrame("TellerGUI");
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        l1 = new JLabel(" Balance");
        l2 = new JLabel(" Amount");
        l3 = new JLabel("6000");
        tf = new JTextField();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        bt3 = new JButton("Exit");

        p1.setLayout(new GridLayout(1, 2));
        p2.setLayout(new GridLayout(1, 2));
        p3.setLayout(new FlowLayout());
        fr.setLayout(new GridLayout(4, 1));

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);

        p1.add(l1);
        p1.add(l3);
        p2.add(l2);
        p2.add(tf);
        p3.add(bt1);
        p3.add(bt2);
        p3.add(bt3);
        fr.getContentPane().add(p1);
        fr.getContentPane().add(p2);
        fr.getContentPane().add(p3);

        fr.setSize(255, 200);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt1)) {
            l3.setText(String.valueOf(Integer.valueOf(l3.getText()) + Integer.valueOf(tf.getText())));
        }
        else if (ae.getSource().equals(bt2) && (Integer.valueOf(l3.getText()) >= Integer.valueOf(tf.getText()))) {
            l3.setText(String.valueOf(Integer.valueOf(l3.getText()) - Integer.valueOf(tf.getText())));
        }
        else if (ae.getSource().equals(bt3)) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TellerGUI();
    }
}
