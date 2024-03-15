
package Ex02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookView extends JFrame implements ActionListener {
    private JLabel name, type, price;
    private JTextField text_name , text_price, text_index;
    private JComboBox text_type;
    private JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
    private JButton bt1, bt2, bt3, bt4, bt5;

    public BookView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text_name = new JTextField();
        text_price = new JTextField();
        text_type = new JComboBox();
        text_type.addItem("General");
        text_type.addItem("Computer");
        text_type.addItem("Math&Sci");
        text_type.addItem("Photo");
        text_index = new JTextField("0");
        name = new JLabel("  Name");
        type = new JLabel("  Type");
        price = new JLabel("  Price");
        bt1 = new JButton("<<<");
        bt2 = new JButton(">>>");
        bt3 = new JButton("Add");
        bt4 = new JButton("Updata");
        bt5 = new JButton("Delete");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        p8 = new JPanel();
        p9 = new JPanel();
        p10 = new JPanel();
        p11 = new JPanel();

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);

        p6.add(bt1);
        p7.setLayout(new BorderLayout());
        p7.add(text_index, BorderLayout.CENTER);
        p8.add(bt2);
        p9.add(bt3);
        p10.add(bt4);
        p11.add(bt5);

        p1.add(name);
        p1.add(text_name);
        p1.setLayout(new GridLayout(1, 2));

        p2.add(price);
        p2.add(text_price);
        p2.setLayout(new GridLayout(1, 2));

        p3.add(type);
        p3.add(text_type);
        p3.setLayout(new GridLayout(1, 2));

        p4.add(p6);
        p4.add(p7);
        p4.add(p8);
        p4.setLayout(new GridLayout(1, 3));

        p5.add(p9);
        p5.add(p10);
        p5.add(p11);
        p5.setLayout(new GridLayout(1, 3));

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        setLayout(new GridLayout(5, 1));

        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt3)) {
            new BookAdd();
        }
    }

    public static void main(String[] args) {
        new BookView();
    }
}
