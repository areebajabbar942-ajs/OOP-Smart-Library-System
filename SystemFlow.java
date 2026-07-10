public class SystemFlow {
    public static void main(String[] args){
        Book b1 = new Book("Kite Runner", "Khaled Hosseini");
        Book b2 = new Book("Never Lie", "Frieda McFadden");
        Book b3 = new Book("The Alchemist", "Paulo Coehlo");
        Book b4 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki");
        Book b5 = new Book("Outliers", "Malcolm Gladwell");
      
        
        Student s1 = new Student("Abeeha", "02-1543", "AB-5897");
        Student s2 = new Student("Areeba", "02-1544", "AR-7096;");
        
        Faculty f1 = new Faculty("Ali", "12-6782","987632");
        Faculty f2 = new Faculty("Sara", "12-5432", "764365");
        
        Librarian lib1 = new Librarian("Akil", "22-7891", "A-0987");
        Librarian lib2 = new Librarian("Mohammad", "22-7897", "M-6754");
      
        System.out.println("Librarian:");
        lib1.login("22-7891", "A-0987");
        lib1.addBooks(b1);
        lib1.addBooks(b3);
        lib1.displayBooks();
        lib1.logout();
        System.out.println();
        
        System.out.println("Librarian:");
        lib2.login("22-7897", "M-6754");
        lib2.addBooks(b2);
        lib2.addBooks(b5);
        lib2.addBooks(b4);
        lib2.displayBooks();
        lib2.logout();
        System.out.println();
        
        System.out.println("Student:");
        s1.login("02-1543", "AB-5897");
        s1.borrowedBooks(b2);
        s1.borrowedBooks(b1);
        s1.removeBooks(b2);
        s1.displayBorrowHistory();
        s1.logout();
        System.out.println();
        
        System.out.println("Student:");
        s2.login("02-1544", "AR-7096");
        s2.borrowedBooks(b3);
        s2.borrowedBooks(b5);
        s2.displayBorrowHistory();
        s2.logout();
        System.out.println();
        
        System.out.println("Faculty:");
        f1.login("12-6782", "987632");
        f1.borrowedBooks(b5);
        f1.displayBorrowHistory();
        f1.logout();
        System.out.println();
        
        System.out.println("Faculty:");
        f2.login("12-5432", "764365");
        f2.borrowedBooks(b4);
        f2.displayBorrowHistory();
        f2.logout();
        System.out.println();
    }
}
