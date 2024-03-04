// Student
import java.io.*;

// Student
public class Student implements Serializable {

    // Variable
    private String name;
    private int ID;
    private int money;

    // Init
    public Student() {
        name = "";
        ID = 0;
        money = 0;
    }
    public Student(String name, int ID, int money) {
        this.name = name;
        this.ID = ID;
        this.money = money;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    // Gettrt
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public int getMoney() {
        return money;
    }

}
