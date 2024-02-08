import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI extends JFrame {
    private JTextField tf = new JTextField();
    private JPanel p = new JPanel();
    private JButton bt1 = new JButton("7");
    private JButton bt2 = new JButton("8");
    private JButton bt3 = new JButton("9");
    private JButton bt4 = new JButton("+");
    private JButton bt5 = new JButton("4");
    private JButton bt6 = new JButton("5");
    private JButton bt7 = new JButton("6");
    private JButton bt8 = new JButton("-");
    private JButton bt9 = new JButton("1");
    private JButton bt10 = new JButton("2");
    private JButton bt11 = new JButton("3");
    private JButton bt12 = new JButton("*");
    private JButton bt13 = new JButton("0");
    private JButton bt14 = new JButton("c");
    private JButton bt15 = new JButton("=");
    private JButton bt16 = new JButton("/");

    public CalculatorTwoGUI() {
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
        this.setLayout(new BorderLayout());
        this.add(tf, BorderLayout.NORTH);
        this.add(p, BorderLayout.CENTER);
        this.setTitle("My Calculator");
        this.setSize(460, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
