public class Book {
    private String bookName;
    private String bookAuthor;
    private boolean isIssued;

    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.isIssued = false;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public boolean isIssued() {
        return isIssued;
    }

       public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

}
