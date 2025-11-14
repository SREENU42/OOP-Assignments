// 🧾 9. Library Book Borrow
// Scenario:
// A user can borrow a book only if they are a library member and the book is available in the collection.
// Task:
// Use both logical and membership operators to verify and print the result.

import java.util.*;

class LibraryBookBorrow{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>books=new ArrayList<>();
        books.add("Java");
        books.add("DSA");
        books.add("Python");
        books.add("C++");
        
        
        System.out.println("Are You A Libraby Member?(yes/no):");
        String member=sc.nextLine();
        
        System.out.println("Which Book Do you Want to Borrow:");
        String bookName=sc.nextLine();
        
        boolean bookAvailable=books.contains(bookName);
        
        if(member.equalsIgnoreCase("yes")&&bookAvailable){
            System.out.println("You can Borrow the Book:"+bookName);
        }else{
            System.out.println("You can't Borrow The Book");
        }
    }
}