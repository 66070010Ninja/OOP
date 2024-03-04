// Import
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

// StudentView
public class StudentView implements ActionListener {

    // Variable
    private JFrame jf;
    private JLabel l1, l2, l3, l4;
    private JTextField tf1, tf2;
    private JButton bt1, bt2;
    private JPanel p1, p2;
    private Student student;

    // Init
    public StudentView() {
        student = Read_Data();
        jf = new JFrame();
        l1 = new JLabel("  ID :");
        l2 = new JLabel("  Name :");
        l3 = new JLabel("  Money :");
        l4 = new JLabel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        p1 = new JPanel();
        p2 = new JPanel();
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        jf.setLayout(new GridLayout(4, 2));
        jf.add(l1);
        jf.add(tf1);
        jf.add(l2);
        jf.add(tf2);
        jf.add(l3);
        jf.add(l4);
        p1.add(bt1);
        p2.add(bt2);
        jf.add(p1);
        jf.add(p2);
        tf1.setText(String.valueOf(student.getID()));
        tf2.setText(student.getName());
        l4.setText(String.valueOf(student.getMoney()));
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    // Action Event
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt1)){
            l4.setText(String.valueOf(Integer.valueOf(l4.getText()) + 100));
            Write_Data(student);
        }
        else if (ae.getSource().equals(bt2)) {
            l4.setText(String.valueOf(Integer.valueOf(l4.getText()) - 100));
            Write_Data(student);
        }
    }

    // Read And Write Object
    public Student Read_Data() {
        Student s = null;
        try {
            FileInputStream File_In = new FileInputStream("dataStudent.dat");
            ObjectInputStream In = new ObjectInputStream(File_In);
            s = (Student)In.readObject();
            In.close();
            File_In.close();
        }
        catch (IOException i) {
            System.out.println(i);
        }
        catch (ClassNotFoundException c) {
            System.out.println(c);
        }
        if (s == null) {
            s = new Student();
        }
        return s;
    }

    public void Write_Data(Student student) {
        try {
            FileOutputStream File_Out = new FileOutputStream("DataStudent.dat");
            ObjectOutputStream Object_Out = new ObjectOutputStream(File_Out);
            student.setID(Integer.valueOf(tf1.getText()));
            student.setName(tf2.getText());
            student.setMoney(Integer.valueOf(l4.getText()));
            Object_Out.writeObject(student);
            Object_Out.close();
            File_Out.close();
        }
        catch (IOException i) {
            System.out.println(i);
        }
    }

    // Test
    public static void main(String[] args) {
        new StudentView();
    }
}
