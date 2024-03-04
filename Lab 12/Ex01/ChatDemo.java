
// Import
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;

// ChatDemo
public class ChatDemo implements ActionListener {

    // Variable
    private JFrame fr;
    private JPanel p1, p2;
    private JTextArea ta;
    private JTextField tf;
    private JButton bt1, bt2;

    // Init
    public ChatDemo() {
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        bt1 = new JButton("Submit");
        bt2 = new JButton("Reset");
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField(45);
        ta = new JTextArea(20, 45);
        ta.setEditable(false);
        ta.setText(Read_File());
        fr.setLayout(new BorderLayout());
        p1.add(tf);
        p2.add(bt1);
        p2.add(bt2);
        fr.add(ta, BorderLayout.NORTH);
        fr.add(p1, BorderLayout.CENTER);
        fr.add(p2, BorderLayout.SOUTH);
        fr.pack();
        fr.setVisible(true);
    }

    // Action Event
    @Override
    public void actionPerformed(ActionEvent ae) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        if (ae.getSource().equals(bt1)) {
            ta.setText(ta.getText() + "\n" + (dtf.format(LocalDateTime.now())) + " : " + tf.getText());
            tf.setText(null);
            Write_File(ta.getText());
        }
        else if (ae.getSource().equals(bt2)) {
            ta.setText(null);
            Write_File(ta.getText());
        }
    }

    // Read and Write
    public String Read_File() {
        String str = "";
        try (FileInputStream file_in = new FileInputStream("ChatDemo.dat");) {
            int i = file_in.read();
            while (i != -1) {
                str += (char)i;
                i = file_in.read();
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return str;
    }

    public void Write_File(String str) {
        try (FileOutputStream file_out = new FileOutputStream("ChatDemo.dat");) {
            for (int i = 0; i < str.length(); i++) {
                file_out.write(str.charAt(i));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Test
    public static void main(String[] args) {
        new ChatDemo();
    }
}
