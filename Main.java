public class Main {

    public static void main(String[] args) {
            Library library = new Library();

        // Add users
        library.addUser(new Users(1, "ali"));
        library.addUser(new Users(2, "sara"));

        // Add books
        library.addBook(new Book("Java Basics", "vivek kumar"));
        library.addBook(new Book("Python Intro", "saurav"));   

        // Issue and return books
        library.issueBook("Java Basics", 1);

        library.returnBook("Java Basics");
        library.returnBook("Java Advanced");               //  book is not available here


        library.viewBooks();
    }
}