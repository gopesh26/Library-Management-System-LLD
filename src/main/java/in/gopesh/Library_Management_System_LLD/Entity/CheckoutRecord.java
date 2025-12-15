package in.gopesh.Library_Management_System_LLD.Entity;

import java.time.LocalDate;

public class CheckoutRecord {
    private String bookISBN;
    private Integer patronId;
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private boolean isReturned = false;


    public CheckoutRecord(String isbn, Integer patronId) {
        this.bookISBN = isbn;
        this.patronId = patronId;
        this.checkoutDate = LocalDate.now();
        this.dueDate = checkoutDate.plusDays(14);
    }


    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public Integer getPatronId() {
        return patronId;
    }

    public void setPatronId(Integer patronId) {
        this.patronId = patronId;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public String printCheckoutDetails(){
        return new StringBuilder()
                .append("checkoutRecord{")
                .append("bookISBN='").append(bookISBN).append("', ")
                .append("patronId='").append(patronId).append("', ")
                .append("checkoutDate='").append(checkoutDate).append("', ")
                .append("dueDate='").append(dueDate).append("', ")
                .append("isReturned='").append(isReturned)
                .append("}")
                .toString();
    }
}
