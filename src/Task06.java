import java.time.LocalDate;

public class Task06 {
    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;
    private LocalDate dueDat;
    private boolean isBorrowed;
    private String Borrower;


    public Task06(String title, String author, Integer isbn, Object dueDat) {
        this.title = title;
        this.author = author;
        this.isbn = null;
        this.isIssued = false;
        this.dueDat = null;
        this.isBorrowed = false;
        this.Borrower = null;

    }

    // Геттеры и сеттеры для полей

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = null;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public LocalDate getDueDat() {
        return dueDat;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getBorrower() {
        return Borrower;
    }

    public void setBorrower(String borrower) {
        Borrower = borrower;
    }

    public void setDueDat(LocalDate dueDat) {
        this.dueDat = dueDat;


    }
}