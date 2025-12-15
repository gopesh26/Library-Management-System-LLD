package in.gopesh.Library_Management_System_LLD.Repository;

import in.gopesh.Library_Management_System_LLD.Entity.Book;
import in.gopesh.Library_Management_System_LLD.Entity.Patron;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    Map <String, ArrayList<Book>> inventory = new HashMap<>();
    Map<Integer, Patron> patrons = new HashMap<>();

    public Library() {}

    public Map<String, ArrayList<Book>> getInventory() {
        return inventory;
    }

    public Map<Integer, Patron> getPatrons() {
        return patrons;
    }

    public Book addBook(Book book){
        inventory.put(book.getISBN(),new ArrayList<>(List.of(book)));
        System.out.println("Book added");
        return book;
    }

    public Patron addPatron(Patron patron){
        patrons.put(patron.getId(),patron);
        System.out.println("patron added");
        return patron;
    }

    public Patron getPatronById(int id){
        return patrons.get(id);
    }

    public  List<Book> getBooksByISBN(String ISBN){
        return inventory.get(ISBN);
    }

    public List<Book> searchBooksByTitle(String title){
        List<Book> results = new ArrayList<>();
        if (title == null || title.trim().isEmpty()) return results;
        String q = title.toLowerCase();
        for (ArrayList<Book> books : inventory.values()) {
            for (Book b : books) {
                if (b != null && b.getTitle() != null && b.getTitle().toLowerCase().contains(q)) {
                    results.add(b);
                }
            }
        }
        return results;
    }
}
