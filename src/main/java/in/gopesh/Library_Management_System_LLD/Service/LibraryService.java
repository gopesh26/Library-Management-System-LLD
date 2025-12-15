package in.gopesh.Library_Management_System_LLD.Service;

import in.gopesh.Library_Management_System_LLD.Entity.Book;
import in.gopesh.Library_Management_System_LLD.Repository.Library;
import in.gopesh.Library_Management_System_LLD.Entity.Patron;
import in.gopesh.Library_Management_System_LLD.Entity.CheckoutRecord;

import java.util.ArrayList;
import java.util.Map;

public class LibraryService {

    Library repository = new Library();

    public LibraryService() {}

    // Patron management
    public void addPatron(Integer id, String name, String email) {
        Patron patron = new Patron(id, name, email);
        repository.addPatron(patron);
    }

    public void updatePatron(Integer id, String name, String email) {
        Patron patron = repository.getPatronById(id);
        if (patron != null) {
            patron.setName(name);
            patron.setEmail(email);
            System.out.println("Patron updated");
        }
    }

    // Lending management
    public Book checkoutBook(Integer patronId, String bookISBN) {
        Book bookFound = repository.getBooksByISBN(bookISBN).get(0);
        Patron patronFound = repository.getPatronById(patronId);

        if(bookFound == null || patronFound == null) return null;
        if(!bookFound.isAvailable()) return null;
        bookFound.setAvailable(false);
        CheckoutRecord record = new CheckoutRecord(bookISBN, patronId);
        patronFound.addCheckoutRecord(record);
        System.out.println("checkout Book");
       return bookFound;
    }

    public void returnBook(String bookISBN){
        Book bookFound = repository.getBooksByISBN(bookISBN).get(0);
        bookFound.setAvailable(true);
        System.out.println("Book returned");
    }

    public void addBook(String title, String author, String ISBN, int publicationYear){
        Book book = new Book(title, author, ISBN, publicationYear);
        repository.addBook(book);
    }

    public void getInventory() {
        for ( Map.Entry<String, ArrayList<Book>> entry : repository.getInventory().entrySet()) {
            System.out.println(entry.getKey() + " : ");
            for (Book book : entry.getValue()) {
                System.out.println(book.printBook());
            }
        }
    }

    public void getPatronCheckoutRecords(){
        for (Map.Entry<Integer, Patron> entry : repository.getPatrons().entrySet()) {
            System.out.println(entry.getValue().getId() + " : " + entry.getValue().getName());
            for (CheckoutRecord record : entry.getValue().getBorrowingHistory()){
                System.out.println( " : " + record.printCheckoutDetails());
            }
        }
    }
}
