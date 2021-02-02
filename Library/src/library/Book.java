package library;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable {
     ArrayList<Loan> loanHistory = new ArrayList<Loan>();
    
    
    // UID
    private static final long serialVersionUID = 7724325370012823291L;

    // Zmienne klasy
    private String nameBook;
    private String author;
    private String publisher;
    private int publishingYear;
  

     public Book() {
         
    }
    
    // Konstruktor
    public Book(String nameBook, String author, String publisher, int publishingYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
       

    }
    
    // Gettery
    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

   
    // Settery

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void loan(Loan loan) {
        loanHistory.add(loan);
        
        }
    
    // toString.
     public String toString() 
    {
        return 
                "---------------------------Books---------------------------" +
                "\nNazwa ksi¹¿ki: " + nameBook + 
                "\nBook author: "+ author + 
                "\nPublisher : "+ publisher + 
                "\nPublication year : " + publishingYear +"\n\n";
              
    }

 

}
