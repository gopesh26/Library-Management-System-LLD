package in.gopesh.Library_Management_System_LLD.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
     Map <String, List<Book>> inventory = new HashMap<>();
     Map<String, Patron> patrons = new HashMap<>();
}
