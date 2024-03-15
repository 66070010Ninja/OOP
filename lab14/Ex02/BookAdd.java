
package Ex02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookAdd extends JFrame {
    private JPanel p1, p2, p3, p4;
    private JLabel name, price, type;
    private JTextField text_name , text_price, text_index;
    private JComboBox text_type;
    private JButton bt1;
    
    public BookAdd() {
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        name = new JLabel("  Name");
        type = new JLabel("  Type");
        price = new JLabel("  Price");
        bt1 = new JButton("Insert");
        text_name = new JTextField();
        text_price = new JTextField();
        text_type = new JComboBox();
        text_type.addItem("General");
        text_type.addItem("Computer");
        text_type.addItem("Math&Sci");
        text_type.addItem("Photo");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        p1.add(name);
        p1.add(text_name);
        p1.setLayout(new GridLayout(1, 2));

        p2.add(price);
        p2.add(text_price);
        p2.setLayout(new GridLayout(1, 2));

        p3.add(type);
        p3.add(text_type);
        p3.setLayout(new GridLayout(1, 2));
        
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        setLayout(new GridLayout(5, 1));
        
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }
}
