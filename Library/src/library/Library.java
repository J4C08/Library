
package library;

//---------------------------------------------------------------------------
//Imports.
//---------------------------------------------------------------------------   
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Collections;
//---------------------------------------------------------------------------   
public class Library implements Serializable { 
//---------------------------------------------------------------------------
//ArrayList declaration.
//---------------------------------------------------------------------------
    ArrayList<Reader> readers = new ArrayList<Reader>();
    ArrayList<Book> books = new ArrayList<Book>();


    LocalDate date = LocalDate.now();
//---------------------------------------------------------------------------
//-------------------------------READERS-------------------------------------                                
//---------------------------------------------------------------------------


    
//---------------------------------------------------------------------------
//Name:          Add method.
//Description:   Adds a student to the ArrayList.
//---------------------------------------------------------------------------
    public void addReader(Reader reader) 
    {
        readers.add(reader);
    }
    
//---------------------------------------------------------------------------
//Name:          Modify method.
//Description:   Modify reader by PIN in the ArrayList.
//---------------------------------------------------------------------------

    public void updateReader(String PIN, Reader reader)
    {
            for (int i = 0; i < readers.size(); i++) {
                if (readers.get(i).getPIN().equalsIgnoreCase(PIN)) {
                    System.out.println("You have successfully modified the reader...");
                    readers.set(i, reader);
                }
            }
    }
    
//---------------------------------------------------------------------------
//Name:          FindMatchingReaders method.
//Description:   Finds matching readers by name, surname, address, pesel in ArrayList
//---------------------------------------------------------------------------
     public void findMatchingReaders(String name, String surname, int age, String address, String banned, String PIN) {
       
        for (Reader reader : readers) {
                if (name != null && !reader.getName().equals(name)) {
                    
                   continue;
                }
                
                if (surname != null && !reader.getSurname().equals(surname)) {
                    
                    continue;
                }
                
                if (age != -1 && reader.getAge() != age) {
                  
                     continue;
                }
                
                 if (address != null && !reader.getAddress().equals(address)) {
                    
                    continue;
                }
                
                if (banned != null && !reader.getBanned().equals(banned)) {
                  
                     continue;
                } 
                
               if (PIN != null && !reader.getPIN().equals(PIN)) {
                    
                    continue;
                }
                
                System.out.println("Matching user found: \n" + reader.toString());
        }
    }
      
//---------------------------------------------------------------------------
//Name:          Ban method.
//Description:   Ban reader.
//---------------------------------------------------------------------------
   public void banReader(String PIN) {
       
      Reader r = searchReader(PIN);
      if(r != null){
        r.setBanned("YES"); 
      }
      else{
      System.out.println("There is no such reader in the database...");
      }
      
    }
//---------------------------------------------------------------------------
//Name:          Print method.
//Description:   Prints out the contents of the ArrayList.
//---------------------------------------------------------------------------
    public void printReaders() 
    {
        Collections.sort(readers);
        for (Reader r : readers) {
            System.out.print(r.toString());
        }
    }   

//---------------------------------------------------------------------------
//Name:          readerWrite() method.
//Description:   Saves the reader object to a file.
//---------------------------------------------------------------------------
     public void readersWrite() throws Exception {
        // Create reader object
        // Create file output stream
        FileOutputStream fos = new FileOutputStream("reader.txt");
        // Create object output stream
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Write reader object data
        oos.writeObject(readers);
        // Close the output stream
        fos.close();
        oos.close();
    }
    
//---------------------------------------------------------------------------
//Name:          readerReader() method.
//Description:   Reads a reader object from a file and loads an ArrayList.
//---------------------------------------------------------------------------   
    public void readersRead() throws Exception {                                             
    // Create file input stream                                                                        
    FileInputStream fis = new FileInputStream("reader.txt");       
    // Create object input stream                                                                        
    ObjectInputStream ois = new ObjectInputStream(fis);                               
    // Read reader object data                                                                       
    readers = (ArrayList) ois.readObject();   
    // Output readers information                                                                         
    //System.out.println(readers);                                                      
    // Close the input stream                                                                          
    fis.close();                                                                      
    ois.close();                                                                      
}  

    
    
//---------------------------------------------------------------------------
//-------------------------------BOOKS---------------------------------------                                 
//---------------------------------------------------------------------------
    
    
//---------------------------------------------------------------------------
//Name:          Add method.
//Description:   Adds a book to the ArrayList.
//---------------------------------------------------------------------------
    public void addBook(Book book) 
    {
        books.add(book);
    }
    
//---------------------------------------------------------------------------
//Name:          Delete method.
//Description:   Delete a book from ArrayList.
//---------------------------------------------------------------------------    
        
    public void deleteBook(String nameBook)
     {
        List<Book> found = new ArrayList<Book>();
        for(Book book : books){
            if(book.getNameBook().equals(nameBook)){
        found.add(book);
            }
     }
        books.removeAll(found);
     }
//---------------------------------------------------------------------------
//Name:         Modify method.
//Description:  Mofify a book from the ArrayList.
//---------------------------------------------------------------------------
    public void updateBook(String nameBook, Book book)
    {
      System.out.println("\n"+"Enter the title of the book you would like to modify: ");
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getNameBook().equalsIgnoreCase(nameBook)) {
                        System.out.println("The book has been successfully modified...");
                        books.set(i, book);
                } 
            }
    }
    
//---------------------------------------------------------------------------
//Name:         findMatchingBooks method.
//Description:  Search for a book by any parameter.
//---------------------------------------------------------------------------
    public void findMatchingBooks(String nameBook, String author, String publisher, int publishingYear) {
        
        for (Book book : books) {
                if (nameBook != null && !book.getNameBook().equals(nameBook)) {
                    
                   continue;
                }

                if (author != null && !book.getAuthor().equals(author)) {
                    
                    continue;
                }
                
                if (publisher != null && !book.getPublisher().equals(publisher)) {
                    
                     continue;
                }
                
                if (publishingYear != -1 && book.getPublishingYear() != publishingYear) {
                  
                     continue;
                }
                
                System.out.println("Matching user found: \n" + book.toString());
        }
    }
  
//---------------------------------------------------------------------------
//Name:          Print method.
//Description:   Prints out the contents of the ArrayList.
//---------------------------------------------------------------------------
    public void printBooks() 
    {
        Collections.sort(books);
       for (Book b : books) {
            System.out.println(b.toString());
        }
    }
    
//---------------------------------------------------------------------------
//Name:          booksWrite() method.
//Description:   Saves the books object to a file.
//---------------------------------------------------------------------------
     public void booksWrite() throws Exception {
        // Create book object
        // Create file output stream
        FileOutputStream fos = new FileOutputStream("book.txt");
        // Create object output stream
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Write book object data
        oos.writeObject(books);
        // Close the output stream
        fos.close();
        oos.close();
    }

//---------------------------------------------------------------------------
//Name:          booksReader() method.
//Description:   Reads a books object from a file and loads an ArrayList.
//---------------------------------------------------------------------------        
    public void booksRead() throws Exception {                                             
    // Create file input stream                                                                        
    FileInputStream fis = new FileInputStream("book.txt");       
    // Create object input stream                                                                        
    ObjectInputStream ois = new ObjectInputStream(fis);                               
    // Read student object data                                                                       
    books = (ArrayList) ois.readObject();   
    
    // Output book information                                                                         
    //System.out.println(books);                                                      
    // Close the input stream                                                                          
    fis.close();                                                                      
    ois.close();                                                                      
}                           
     public Book searchBook(List<Book> books, String nameBook, String author) {
        for(Book book : books){
              if (book.getNameBook().equals(nameBook) && book.getAuthor().equals(author)  ) {
                return book;
            }
        }return null;
 }
     
      public Reader searchReader(List<Reader> readers, String PIN) {
        for(Reader reader : readers){
              if (reader.getPIN().equals(PIN)) {
                return reader;
            }
        }return null;
 }
    
    public boolean borrowBook(String PIN, String nameBook, String author) {
         
        Book y = searchBook(books, nameBook, author);
        Reader x = searchReader(readers, PIN);
        
            if (x == null || y == null || x.getBanned().equals("YES")) 
            { 
                System.out.println("Book not found, author or reader is blocked.");
                return false;
            } 
                 
        Loan z = new Loan(date.toString(),date.plusWeeks(2).toString());    
        x.addBookBorrowed(y);
        x.loan(z);
        y.loan(z);
        books.remove(y);
        return true;
        }
        

    public ArrayList<Book> allBorrowedBooks() {
        ArrayList<Book> allBorrowed = new ArrayList<Book>();
        
       for (Reader r : readers) {
            for (Book b : r.loanBook) {
                allBorrowed.add(b);
            }
            
            }
       books.removeAll(allBorrowed);
           return allBorrowed;
        } 
    
        public ArrayList<Book> allBorrowedBooksByReader(String PIN) {
            Reader x = searchReader(PIN);
            System.out.println(x.loanBook.toString());
            return x.loanBook;
    }
        
        private Reader searchReader(String PIN) {
        for(Reader reader : readers){
              if (reader.getPIN().equals(PIN)) {
                return reader;
            }
        }return null;
    }
        
     public ArrayList<Book> overdueBooks() {
        ArrayList<Book> overdueBooks = new ArrayList<Book>();
        books.removeAll(overdueBooks);
            for (Reader r : readers) {
                for (Book b : r.loanBook) {
                    for(Loan l : r.loanHistory){
                        if(LocalDate.parse(l.getDateOfReturn()).compareTo(date) <= -1 || LocalDate.parse(l.getDateOfReturn()).compareTo(date) <= -14 ){
                        overdueBooks.add(b);
                        System.out.println(overdueBooks.toString());
                        }
                }
            }
           
        } 
        return overdueBooks;
     }
}
               
            
           
            
        
        

    

    
         
 
         
    
    



    

