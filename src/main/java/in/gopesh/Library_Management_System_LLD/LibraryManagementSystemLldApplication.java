package in.gopesh.Library_Management_System_LLD;

import in.gopesh.Library_Management_System_LLD.Service.LibraryService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementSystemLldApplication {

	public static void main(String[] args) {
        LibraryService LibraryService = new LibraryService();
        
        // add patrons
        LibraryService.addPatron(1,"gopesh","gopesh.yada@gmail.com");
        LibraryService.addPatron(2,"sam","sam.ya@gmail.com");

        // add books
        LibraryService.addBook("The Hobbit","","1234567890",2000);
        LibraryService.addBook("Iphone Mechanical","","1134567810",2001);
        LibraryService.addBook("The operation","","2134567810",2002);

        //checkout book
        LibraryService.checkoutBook(1,"1134567810");
        LibraryService.checkoutBook(1,"1234567890");
        LibraryService.checkoutBook(1,"1134567810");

        System.out.println("Print inventory");

       LibraryService.getInventory();

        System.out.println("Print checkout records");
        LibraryService.getPatronCheckoutRecords();
	}
}
