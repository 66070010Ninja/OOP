
package EX_02;

import java.awt.*;
import javax.swing.*;

public class BookView extends JFrame {

    private final JLabel label01, label02, label03;
    private final JPanel bt01, bt02, bt03, bt04, bt05;
    private final JPanel panel01, panel02, panel03, panel04, panel05;
    private final JTextField textField01, textField02, textField03;
    private final JComboBox comboBox;
    private final JButton button01, button02, button03, button04, button05;
    private final String[] list_Book = {"General", "Computer", "Math&Sci", "Photo"};

    public BookView() {
        setResizable(false);
        bt01 = new JPanel();
        bt02 = new JPanel();
        bt03 = new JPanel();
        bt04 = new JPanel();
        bt05 = new JPanel();
        button01 = new JButton("<<<");
        button02 = new JButton(">>>");
        button03 = new JButton("Add");
        button04 = new JButton("Update");
        button05 = new JButton("Delete");
        label01 = new JLabel("  Name");
        label02 = new JLabel("  Price");
        label03 = new JLabel("  Type");
        panel01 = new JPanel();
        panel02 = new JPanel();
        panel03 = new JPanel();
        panel04 = new JPanel();
        panel05 = new JPanel();
        textField01 = new JTextField();
        textField02 = new JTextField();
        textField03 = new JTextField("0", 4);
        comboBox = new JComboBox(list_Book);
        comboBox.setSelectedIndex(0);

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

        bt01.add(button01);
        bt02.add(button02);
        panel04.add(bt01);
        panel04.add(textField03);
        panel04.add(bt02);
        panel04.setLayout(new FlowLayout());
        add(panel04);

        bt03.add(button03);
        bt04.add(button04);
        bt05.add(button05);
        panel05.add(bt03);
        panel05.add(bt04);
        panel05.add(bt05);
        panel05.setLayout(new GridLayout(1, 3));
        add(panel05);

        setLayout(new GridLayout(5, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setData(String name, double price, String type) {
        textField01.setText(name);
        textField02.setText(String.valueOf(price));
        if (type.equals("General")) {
            comboBox.setSelectedIndex(0);
        }
        else if (type.equals("Computer")) {
            comboBox.setSelectedIndex(1);
        }
        else if (type.equals("Math&Sci")) {
            comboBox.setSelectedIndex(2);
        }
        else if (type.equals("Photo")) {
            comboBox.setSelectedIndex(3);
        }
    }

    public JButton getButton01() {
        return button01;
    }
    public JButton getButton02() {
        return button02;
    }
    public JButton getButton03() {
        return button03;
    }
    public JButton getButton04() {
        return button04;
    }
    public JButton getButton05() {
        return button05;
    }

    public void setIndex(int index) {
        textField03.setText(String.valueOf(index));
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
}
