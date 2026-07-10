import java.util.*;
public class Faculty extends User{
    
    private ArrayList<String> borrowedBooks = new ArrayList<>();
    private int borrowLimit = 10;

    public Faculty(String name, String ID, String password) {
        super(name, ID, password);
    }
    
    @Override
    public void login(String inputID, String inputPass) {
        super.login(inputID, inputPass);
    }
    
    
    public void borrowedBooks(Book book){
        if(borrowedBooks.size() < borrowLimit ){
            borrowedBooks.add(book.getTitle());
            System.out.println("Borrowed: " + book.getTitle());
        }
        else{
            System.out.println("Borrowing limit reached");
        }
    }
    
    public void removeBooks(Book book){
        if(!borrowedBooks.isEmpty()){
            borrowedBooks.remove(book.getTitle());
            System.out.println("Removed: " + book.getTitle());
        }
        else{
            System.out.println("Book not found");
        }
    }
    
    @Override
    public void logout(){
        System.out.println("Faculty logged out");
    }
    
    public void displayBorrowHistory(){
        super.displayInfo();
        for(String record : borrowedBooks){
            System.out.println(record);
        }
    }  
}
