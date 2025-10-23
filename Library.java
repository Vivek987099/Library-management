import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Users> users;

    Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addUser(Users user) {
        users.add(user);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String bookName, int userId) {

        for (Book b : books) {

            if (b.getBookName().equalsIgnoreCase(bookName) && !b.isIssued()) {
                b.issueBook();
                System.out.println("Book issued to user ID: " + userId);
                return;

            }

        }
        System.out.println("Book not available.");

    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getBookName().equalsIgnoreCase(title) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found or already returned.");
    }
    public void viewBooks(){


         System.out.println();
         System.out.println("======== List of Books ===========");
        for (Book book : books) {
            System.out.println("Book Name : "+ book.getBookName()+"  Book Author : "+book.getBookAuthor());
            
        }
    }
}
