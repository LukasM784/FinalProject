/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltask4;

/**
 *
 * @author macproavid
 */
public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;
    
    public Book(){
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.publisher = "Uncomfirmed";
        this.isbn = "";
    }
    public Book(String Title){
        this.title = title;
        this.author = "";
        this.price = 0.0;
        this.publisher = "Uncomfirmed";
        this.isbn = "";
    }
    public Book(String Title,String author,double price,String piblisher,String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }
    public Book(Book other){
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.publisher = other.publisher;
        this.isbn = other.isbn;
    }
    public int checkIsbnStatus(){
        if (isbn.length()== 13 && isbn.startsWith("978")){
            return 1;
        }
        else if(isbn.length() == 10){
            return 0;
        }
           
        else {
            return -1;
        }
    }
    public void ToTitleCase(){
        this.title = convertToTitleCase(this.title);
        this.author = convertToTitleCase(this.author);
    }
    private String convertToTitleCase(String x){
        String[] word = x.split(" ");
        int j;
        String firstUpper = "";
        for (j = 0; j < word.length; j++){
            String currentWord = word[j];           
             firstUpper += currentWord.substring(0,1).toUpperCase() + currentWord.substring(1).toLowerCase() + " ";          
        }
        return firstUpper;
    }
    public String toString(){
        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Price: " + price + "\n" +
               "Publisher: " + publisher + "\n" +
               "ISBN: " + isbn;
    }
    public boolean equals(Object y){
        if (this == y) return true;
        if (y == null || getClass() != y.getClass()) return false;
        Book book = (Book) y;
        if (book.price != price) return false;
        if (book.title != title) return false;
        if (book.author != author) return false;
        if (book.publisher != publisher) return false;
        if (book.isbn != isbn) return false;
        return true;
    }
    public Book clone(){
        return new Book(this);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}
