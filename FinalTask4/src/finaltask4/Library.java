/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltask4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author macproavid
 */
public class Library {
    private List<Book> books;
    public Library(){
        this.books = new ArrayList();
    }
    public Library(List<Book> books){
        this.books = books;
    }
    public Library (Library other){
        this.books = new ArrayList(other.books);
    }
    public ArrayList<Book> searchBook(String keyword){
        ArrayList<Book> search = new ArrayList();
        for (int i = 0; i < books.size(); i++){
            Object x = books.get(i);
            if (x instanceof Book){
                Book book = (Book) x;
                if (book.getTitle() != null && book.getTitle().contains(keyword) || book.getAuthor() != null && book.getAuthor().contains(keyword)){
                    search.add(book);
                }
            }
        }
        return search;
    }
    public boolean equals(Object y){
        if (this == y) return true;
        if (y == null || getClass() != y.getClass()) return false;
        Library library = (Library)y;
        return books.equals(library.books);
    }
    public String toString(){
        String result = "";
        for (int i = 0; i < books.size(); i++){
            Object y = books.get(i); 
            if (y instanceof Book){
                result += ((Book) y).toString();
            }
        }
        return result;
    } 
     public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void Bookexamples(){
        books.add(new Book("Moby-Dick", "Herman Melville", 12.50, "Harper & Brothers", "978-1503280786"));
        books.add(new Book("War and Peace", "Leo Tolstoy", 14.99, "The Russian Messenger", "978-1400079988"));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 9.99, "George Allen & Unwin", "978-0261103344"));
        books.add(new Book("Brave New World", "Aldous Huxley", 11.50, "Chatto & Windus", "978-0060850524"));
        books.add(new Book("The Odyssey", "Homer", 13.00, "Penguin Classics", "978-0140268867"));
    }
    public void display(){
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(book);
        }
    }
}
