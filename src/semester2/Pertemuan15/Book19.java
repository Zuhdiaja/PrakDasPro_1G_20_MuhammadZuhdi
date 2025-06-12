package semester2.Pertemuan15;

public class Book19 {
    public String isbn;
    public String title;

    public Book19() {

    }

    public Book19(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + " Title: " +this.title;
    }
}
