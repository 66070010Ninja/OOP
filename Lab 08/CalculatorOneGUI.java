import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI extends JFrame {
    private JTextField tf1 = new JTextField("0");
    private JTextField tf2 = new JTextField("0");
    private JTextField tf3 = new JTextField("0");
    private JButton bt1 = new JButton("Add");
    private JButton bt2 = new JButton("Subtract");
    private JButton bt3 = new JButton("Multiply");
    private JButton bt4 = new JButton("Divide");
    private JPanel p = new JPanel();

    public CalculatorOneGUI() {
        this.setLayout(new GridLayout(4, 1));
        p.setLayout(new FlowLayout());
        p.add(bt1);
        p.add(bt2);
        p.add(bt3);
        p.add(bt4);
        this.add(tf1);
        this.add(tf2);
        this.add(p);
        this.add(tf3);
        this.setTitle("My Calculator");
        this.setSize(480, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
