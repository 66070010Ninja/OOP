
package lab14;

import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    private JMenuBar menubar;
    private JMenu menu;
    private JMenuItem menu_item01, menu_item02, menu_item03, menu_item04;
    private JTextArea text;
    private JFileChooser fc;
    private File f;

    public MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fc = new JFileChooser();
        menubar = new JMenuBar();
        menu = new JMenu("File");
        menu_item01 = new JMenuItem("New");
        menu_item02 = new JMenuItem("Open");
        menu_item03 = new JMenuItem("Save");
        menu_item04 = new JMenuItem("Close");
        text = new JTextArea(20, 45);

        menu_item01.addActionListener(this);
        menu_item02.addActionListener(this);
        menu_item03.addActionListener(this);
        menu_item04.addActionListener(this);

        setTitle("Mt Text Editor");
        menubar.add(menu);
        menu.add(menu_item01);
        menu.add(menu_item02);
        menu.add(menu_item03);
        menu.addSeparator();
        menu.add(menu_item04);
        add(text);
        setJMenuBar(menubar);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(menu_item01)) {
            text.setText("");
        }
        else if (ae.getSource().equals(menu_item02)) {
            fc.showOpenDialog(this);
            f = fc.getSelectedFile();
            text.setText(Read_File(f));
        }
        else if (ae.getSource().equals(menu_item03)) {
            fc.showSaveDialog(this);
            f = fc.getSelectedFile();
            Write_File(text.getText(), f);
        }
        else if (ae.getSource().equals(menu_item04)) {
            System.exit(0);
        }
    }

    public String Read_File(File f) {
        String str = "";
        try (FileInputStream File_In = new FileInputStream(f);) {
            int i = File_In.read();
            while (i != -1) {
                str += (char)i;
                i = File_In.read();
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return str;
    }

    public void Write_File(String str, File f) {
        try (FileWriter File_Writer = new FileWriter(f);) {
            File_Writer.write(str);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        MyFrame myframe = new MyFrame();
    }
}
