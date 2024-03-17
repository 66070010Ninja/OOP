
package EX_02;

import java.awt.event.*;
import javax.swing.*;

public class BookController implements ActionListener {
    private BookView view;
    private BookAdd view_add;
    private BookModel model;
    private int index;

    public BookController() {
        view = new BookView();
        model = new BookModel();
        index = 0;
        init();
    }

    public void init() {
        if (model.loadData()) {
            if ((int)model.getData().size() != 0) {
                index = model.getData().size();
                view.setData(model.getBook(index-1).getName(), model.getBook(index-1).getPrice(), model.getBook(index-1).getType());
                view.setIndex(index);
            }
            
        }
        view.getButton01().addActionListener(this);
        view.getButton02().addActionListener(this);
        view.getButton03().addActionListener(this);
        view.getButton04().addActionListener(this);
        view.getButton05().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(view.getButton01())) {
            if (index != 1) {
                index -= 1;
                view.setData(model.getBook(index-1).getName(), model.getBook(index-1).getPrice(), model.getBook(index-1).getType());
                view.setIndex(index);
            }
            else if (index == 1 && (int)model.getData().size() != 0) {
                index = model.getData().size();
                view.setData(model.getBook(index-1).getName(), model.getBook(index-1).getPrice(), model.getBook(index-1).getType());
                view.setIndex(index);
            }
            else {
                view.setData("", 0.0, "General");
                index = 0;
            }
        }
        else if (ae.getSource().equals(view.getButton02())) {
            if (index < model.getData().size()) {
                index += 1;
                view.setData(model.getBook(index-1).getName(), model.getBook(index-1).getPrice(), model.getBook(index-1).getType());
                view.setIndex(index);
            }
            else if (index == model.getData().size() && (int)model.getData().size() != 0) {
                index = 1;
                view.setData(model.getBook(index-1).getName(), model.getBook(index-1).getPrice(), model.getBook(index-1).getType());
                view.setIndex(index);
            }
            else {
                view.setData("", 0.0, "General");
                index = 0;
            }
        }
        else if (ae.getSource().equals(view.getButton03())) {
            view_add = new BookAdd();
            view_add.getButton().addActionListener(this);
        }
        else if (ae.getSource().equals(view.getButton04())) {
            JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.PLAIN_MESSAGE);
            Book book = new Book();
            book.setName(view.getTextName());
            book.setPrice(view.getTextPrice());
            book.setType(view.getTextType());
            model.setBook(index-1, book);
        }
        else if (ae.getSource().equals(view.getButton05())) {
            if ((int)model.getData().size() != 0) {
                model.removeBook(index-1);
            }
            if ((int)model.getData().size() != 0) {
                index -= 1;
                view.setData(model.getBook(index-1).getName(), model.getBook(index-1).getPrice(), model.getBook(index-1).getType());
            }
            else {
                index = 0;
                view.setData("", 0.0, "General");
                view.setIndex(index);
            }
            if (model.saveData()) {
                JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else if (ae.getSource().equals(view_add.getButton())) {
            view.setData(view_add.getTextName(), view_add.getTextPrice(), view_add.getTextType());
            model.addBook(view_add.getBook());
            System.out.println(model.getData().size());
            index = model.getData().size();
            view.setIndex(index);
            if (model.saveData()) {
                JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
                view_add.dispose();
            }
        }
    }
}
