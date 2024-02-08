import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorSample implements ActionListener {

    private JFrame fr;
    private JPanel p;
    private JTextField tf;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16;
    public int cost1, cost2, type, get_type;

    public CalculatorSample() {
        cost1 = 0;
        cost2 = 0;
        type = 0;
        get_type = 0;
        fr = new JFrame("CalculatorSample");
        p = new JPanel();
        tf = new JTextField();
        bt1 = new JButton("7");
        bt1.addActionListener(this);
        bt2 = new JButton("8");
        bt2.addActionListener(this);
        bt3 = new JButton("9");
        bt3.addActionListener(this);
        bt4 = new JButton("+");
        bt4.addActionListener(this);
        bt5 = new JButton("4");
        bt5.addActionListener(this);
        bt6 = new JButton("5");
        bt6.addActionListener(this);
        bt7 = new JButton("6");
        bt7.addActionListener(this);
        bt8 = new JButton("-");
        bt8.addActionListener(this);
        bt9 = new JButton("1");
        bt9.addActionListener(this);
        bt10 = new JButton("2");
        bt10.addActionListener(this);
        bt11 = new JButton("3");
        bt11.addActionListener(this);
        bt12 = new JButton("x");
        bt12.addActionListener(this);
        bt13 = new JButton("0");
        bt13.addActionListener(this);
        bt14 = new JButton("c");
        bt14.addActionListener(this);
        bt15 = new JButton("=");
        bt15.addActionListener(this);
        bt16 = new JButton("/");
        bt16.addActionListener(this);

        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);

        fr.setLayout(new BorderLayout());
        p.setLayout(new GridLayout(4, 4));

        p.add(bt1);
        p.add(bt2);
        p.add(bt3);
        p.add(bt4);
        p.add(bt5);
        p.add(bt6);
        p.add(bt7);
        p.add(bt8);
        p.add(bt9);
        p.add(bt10);
        p.add(bt11);
        p.add(bt12);
        p.add(bt13);
        p.add(bt14);
        p.add(bt15);
        p.add(bt16);
        fr.add(tf, BorderLayout.NORTH);
        fr.getContentPane().add(p, BorderLayout.CENTER);

        fr.setSize(300, 330);;
        fr.setVisible(true);
    }

    public void getNumber() {
        if (cost2 == 0) {
            cost2 = Integer.valueOf(tf.getText());
        }
    }

    public void reset() {
        cost1 = 0;
        cost2 = 0;
        tf.setText("");
        type = 0;
        get_type = 0;
    }

    public void setNumber() {
        cost1 = Integer.valueOf(tf.getText());
    }

    public void operation() {
        getNumber();
        if (type == 1) {
            cost1 = cost1 + cost2;
        }
        else if (type == 2) {
            cost1 = cost1 - cost2;
        }
        else if (type == 3) {
            cost1 = cost1 * cost2;
        }
        else if (type == 4) {
            cost1 = cost1 / cost2;
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt1)) {
            tf.setText(tf.getText() + "7");
        }
        else if (ae.getSource().equals(bt2)) {
            tf.setText(tf.getText() + "8");
        }
        else if (ae.getSource().equals(bt3)) {
            tf.setText(tf.getText() + "9");
        }
        else if (ae.getSource().equals(bt5)) {
            tf.setText(tf.getText() + "4");
        }
        else if (ae.getSource().equals(bt6)) {
            tf.setText(tf.getText() + "5");
        }
        else if (ae.getSource().equals(bt7)) {
            tf.setText(tf.getText() + "6");
        }
        else if (ae.getSource().equals(bt9)) {
            tf.setText(tf.getText() + "1");
        }
        else if (ae.getSource().equals(bt10)) {
            tf.setText(tf.getText() + "2");
        }
        else if (ae.getSource().equals(bt11)) {
            tf.setText(tf.getText() + "3");
        }
        else if (ae.getSource().equals(bt13)) {
            tf.setText(tf.getText() + "0");
        }
        else if (ae.getSource().equals(bt14)) {
            reset();
        }
        else if (ae.getSource().equals(bt4)) {
            type = 1;
            cost2 = 0;
            setNumber();
            tf.setText("");
        }
        else if (ae.getSource().equals(bt8)) {
            type = 2;
            cost2 = 0;
            setNumber();
            tf.setText("");
        }
        else if (ae.getSource().equals(bt12)) {
            type = 3;
            cost2 = 0;
            setNumber();
            tf.setText("");
        }
        else if (ae.getSource().equals(bt16)) {
            type = 4;
            cost2 = 0;
            setNumber();
            tf.setText("");
        }
        else if (ae.getSource().equals(bt15)) {
            operation();
            tf.setText(String.valueOf(cost1));
        }
    }

    public static void main(String[] args) {
        new CalculatorSample();
    }
}
