public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;

    public void addBook(Book book, int slot) {
        if (slot == 1) {
            book1 = book;
        }
        else if (slot == 2) {
            book2 = book;
        }
        else if (slot == 3) {
            book3 = book;
        }
    }

    public void removeBook(int slot) {
        if (slot == 1) {
            book1 = null;
        }
        else if (slot == 2) {
            book2 = null;
        }
        else if (slot == 3) {
            book3 = null;
        }
    }

    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println();
        if (book1 != null) {
            printBookDetails(book1);
        }
        else {
            System.out.println("No book in this slot");
        }
        System.out.println();
        if (book2 != null) {
            printBookDetails(book2);
        }
        else {
            System.out.println("No book in this slot");
        }
        System.out.println();
        if (book3 != null) {
            printBookDetails(book3);
        }
        else {
            System.out.println("No book in this slot");
        }
    }

    public void checkBookAvailability(int slot) {
        if ((slot == 1)&&(book1 == null)) {
            System.out.println(book1.title + "is not available.");
        }
        else if ((slot == 2)&&(book2 == null)) {
            System.out.println(book2.title + "is not available.");
        }
        else if ((slot == 3)&&(book3 == null)) {
            System.out.println(book3.title + "is not available.");
        }
        else if ((slot == 1)&&(book1 != null)) {
            System.out.println(book1.title + "is available.");
        }
        else if ((slot == 2)&&(book2 != null)) {
            System.out.println(book2.title + "is available.");
        }
        else if ((slot == 3)&&(book3 != null)) {
            System.out.println(book3.title + "is available.");
        }
    }

    public void updateBookPrice(int slot, double newPrice) {
        if ((slot == 1)&&(book1 != null)) {
            book1.price = newPrice;
            System.out.println("Update price of " + book1.title + " to $" + book1.price);
        }
        else if ((slot == 2)&&(book2 != null)) {
            book2.price = newPrice;
            System.out.println("Update price of " + book2.title + " to $" + book2.price);
        }
        else if ((slot == 3)&&(book3 != null)) {
            book3.price = newPrice;
            System.out.println("Update price of " + book3.title + " to $" + book3.price);
        }
        else {
            System.out.println("No book in this slot.");
        }
    }

    public void printBookDetails(Book book) {
        String text = "Yes";
        if (book == null) {
            System.out.println("No book in this slot");
        }
        else if (book == book1) {
            if (book1.isAvailable == true) {
                text = "Yes";
            }
            else if (book1.isAvailable == false) {
                text = "No";
            }
            System.out.println("Title: " + book1.title);
            System.out.println("Author: " + book1.author);
            System.out.println("Published: " + book1.publisher);
            System.out.println("Year Published: " + book1.yearPublished);
            System.out.println("Price: $" + book1.price);
            System.out.println("Available: " + text);
        }
        else if (book == book2) {
            if (book2.isAvailable == true) {
                text = "Yes";
            }
            else if (book2.isAvailable == false) {
                text = "No";
            }
            System.out.println("Title: " + book2.title);
            System.out.println("Author: " + book2.author);
            System.out.println("Published: " + book2.publisher);
            System.out.println("Year Published: " + book2.yearPublished);
            System.out.println("Price: $" + book2.price);
            System.out.println("Available: " + text);
        }
        else if (book == book3) {
            if (book3.isAvailable == true) {
                text = "Yes";
            }
            else if (book3.isAvailable == false) {
                text = "No";
            }
            System.out.println("Title: " + book3.title);
            System.out.println("Author: " + book3.author);
            System.out.println("Published: " + book3.publisher);
            System.out.println("Year Published: " + book3.yearPublished);
            System.out.println("Price: $" + book3.price);
            System.out.println("Available: " + text);
        }
    }
}
