import java.util.*;
public class Librarian extends User{
    
    private ArrayList<String> books = new ArrayList<>();

    public Librarian(String name, String ID, String password) {
        super(name, ID, password);
    }
    
    @Override
    public void login(String inputID, String inputPass) {
        super.login(inputID, inputPass);
    }
    
    public void addBooks(Book book){
        books.add(book.getTitle());
        System.out.println("Book added");
    }
    
    public void removeBooks(Book book){
        books.remove(book.getTitle());
        System.out.println("Book removed");
    }
    
    @Override
    public void logout(){
        System.out.println("Librarian logged out");
    }
    
    public void displayBooks(){
        super.displayInfo();
        
        for(String record : books){
            System.out.println(record );
        }
    }
}
