package in.gopesh.Library_Management_System_LLD.Entity;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    private boolean isAvailable = true;

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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book(String title, String author, String ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }

    public String printBook() {
        return new StringBuilder()
                .append("Book{")
                .append("title='").append(title).append("', ")
                .append("author='").append(author).append("', ")
                .append("isbn='").append(ISBN).append("', ")
                .append("isAvailable='").append(isAvailable)
                .append("}")
                .toString();
    }
}
