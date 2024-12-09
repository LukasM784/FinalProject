/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finaltask4;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author macproavid
 */
public class FinalTask4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Seatch for a book title or Author:");
        String x = input.nextLine();
        Library library = new Library();
        library.Bookexamples();
        library.searchBook(x);
        library.display();
        System.out.println("Search results for" + x);
        List<Book> searchResults =library.searchBook(x);
        for (int i = 0; i < searchResults.size(); i++) {
            Book book = searchResults.get(i);
            System.out.println(book);
        }
        
        
    }
    
}
