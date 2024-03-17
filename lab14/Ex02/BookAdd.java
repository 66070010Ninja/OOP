
package EX_02;

import java.awt.*;
import javax.swing.*;

public class BookAdd extends JFrame{

    private final JLabel label01, label02, label03;
    private final JTextField textField01, textField02;
    private final JComboBox comboBox;
    private final JPanel panel01, panel02, panel03, panel04;
    private final JButton button01;

    public BookAdd() {
        setResizable(false);
        button01 = new JButton("Insert");
        label01 = new JLabel("  Name");
        label02 = new JLabel("  Price");
        label03 = new JLabel("  Type");
        textField01 = new JTextField();
        textField02 = new JTextField();
        comboBox = new JComboBox();
        comboBox.addItem("General");
        comboBox.addItem("Computer");
        comboBox.addItem("Math&Sci");
        comboBox.addItem("Photo");
        panel01 = new JPanel();
        panel02 = new JPanel();
        panel03 = new JPanel();
        panel04 = new JPanel();

        panel01.add(label01);
        panel01.add(textField01);
        panel01.setLayout(new GridLayout(1, 2));
        add(panel01);

        panel02.add(label02);
        panel02.add(textField02);
        panel02.setLayout(new GridLayout(1, 2));
        add(panel02);

        panel03.add(label03);
        panel03.add(comboBox);
        panel03.setLayout(new GridLayout(1, 2));
        add(panel03);

        panel04.add(button01);
        add(panel04);

        setLayout(new GridLayout(4, 1));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public JButton getButton() {
        return button01;
    }
    
    public String getTextName() {
        return textField01.getText();
    }
    public double getTextPrice() {
        return Double.parseDouble(textField02.getText());
    }
    public String getTextType() {
        return comboBox.getSelectedItem().toString();
    }
    public Book getBook() {
        Book book = new Book();
        book.setName(getTextName());
        book.setPrice(getTextPrice());
        book.setType(getTextType());
        return book;
    }
}
