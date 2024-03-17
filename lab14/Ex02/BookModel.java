
package EX_02;

import java.io.*;
import java.util.*;

public class BookModel {
    private ArrayList<Book> list_data;

    public BookModel() {
        list_data = new ArrayList<Book>();
    }

    public boolean loadData() {
        File f = new File("Book.data");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("Book.data");
                ObjectInputStream in = new ObjectInputStream(fin);) {
                list_data = (ArrayList<Book>)in.readObject();
                return true;
            }
            catch (Exception i) {
                return false;
            }
        }
        return false;
    }

    public boolean saveData() {
        try (FileOutputStream fOut = new FileOutputStream("Book.data");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(list_data);
            return true;
        }
        catch (Exception i) {
            return false;
        }
    }

    public ArrayList<Book> getData() {
        return list_data;
    }
    public void setData(ArrayList<Book> list_data) {
        this.list_data = list_data;
    }

    public Book getBook(int index) {
        return (Book)list_data.get(index);
    }
    public void setBook(int index, Book book) {
        this.list_data.set(index, book);
    }
    public void addBook(Book book) {
        list_data.add(book);
    }
    public void removeBook(int index) {
        list_data.remove(index);
    }
}
