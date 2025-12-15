package in.gopesh.Library_Management_System_LLD.Entity;

import java.util.ArrayList;
import java.util.List;

public class Patron {

    private int id;
    private String name;
    private String email;
    private List<CheckoutRecord> borrowingHistory = new ArrayList<>();


    public Patron(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CheckoutRecord> getBorrowingHistory() {
        return borrowingHistory.stream().toList();
    }

    public void addCheckoutRecord(CheckoutRecord record) {
        borrowingHistory.add(record);
    }

}
