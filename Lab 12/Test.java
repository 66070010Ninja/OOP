
// Test
import java.io.*;

import Ex02.Student;

// Test
public class Test {
    public static void main(String[] args) {
        Student s = null;
        try {
            FileOutputStream File_Out = new FileOutputStream("DataStudent.dat");
            ObjectOutputStream Object_Out = new ObjectOutputStream(File_Out);
            Object_Out.writeObject(s);
            Object_Out.close();
            File_Out.close();
            System.out.println("Serialized data is saved");
        }
        catch (IOException i) {
            i.printStackTrace();
        }

        try {
            FileInputStream File_In = new FileInputStream("dataStudent.dat");
            ObjectInputStream In = new ObjectInputStream(File_In);
            s = (Student)In.readObject();
            In.close();
            File_In.close();
        }
        catch (IOException i) {
            i.printStackTrace();
        }
        catch (ClassNotFoundException c) {
            c.printStackTrace();
        }

        // System.out.println(s.getName());
        // System.out.println(s.getID());
        // System.out.println(s.getMoney());
    }
}
