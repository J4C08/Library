
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
import java.util.Collections;
import java.util.List;
//---------------------------------------------------------------------------   
public class Library implements Serializable { 
//---------------------------------------------------------------------------
//ArrayList declaration.
//---------------------------------------------------------------------------
    ArrayList<Reader> readers = new ArrayList<Reader>();
    ArrayList<Book> books = new ArrayList<Book>();
    
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
                    System.out.println("Uda³o ci siê zmotyfikowaæ czytelnika.");
                    readers.set(i, reader);
                }
            }
    }
    
     //Szukanie po parametrze czytelnika.
     public void FindMatchingReaders(String name, String surname, int age, String address, String banned, String PIN) {
       
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
                
                 if (address != null && !reader.getSurname().equals(address)) {
                    
                    continue;
                }
                
                if (banned != null && !reader.getSurname().equals(banned)) {
                  
                     continue;
                } 
                
               if (PIN != null && !reader.getSurname().equals(PIN)) {
                    
                    continue;
                }
                
                System.out.println("Matching user found: \n" + reader.toString());
        }
    }
    
    

   
    
     
//---------------------------------------------------------------------------
//Name:          Ban method.
//Description:   Ban reader
//---------------------------------------------------------------------------
    /*public void zablokujReadera(String PIN) {
        searchReader(PIN);
        Reader x = znajdzUzytkownika(PIN);
        x.IsDisabled = true;
    }
    */
//---------------------------------------------------------------------------
//Name:          Print method.
//Description:   Prints out the contents of the ArrayList.
//---------------------------------------------------------------------------
    public void printReaders() 
    {
        for (Reader r : readers) {
            System.out.print(r.toString());
        }
    }
    
   /* 
  public void searchReader(String name) {

    System.out.println("\n"+"Enter the title of the book you would like to search for: ");

    for (int i = 0; i < readers.size(); i++) {

        // IF statement to check that any book in the array list equals what
        // the user has typed in
        if (readers.get(i).getName().equalsIgnoreCase(name)) {
        
            System.out.println(("Znalazles: " + readers.get(i).getName()));

        } 
       
           
        }

    }*/ // end of for

// end of method  
//Szukanie po pesel
 public Reader searchReader(List<Reader> readers, String PIN) {
        for(Reader reader : readers){
              if (reader.getPIN() == PIN) {
                return reader;
            }
        }return null;
 }
 
 public void searchReader2(String PIN) {

    System.out.println("\n"+"Enter the title of the book you would like to search for: ");

    for (int i = 0; i < readers.size(); i++) {

        // IF statement to check that any book in the array list equals what
        // the user has typed in
        if (readers.get(i).getPIN().equalsIgnoreCase(PIN)) {
        
            System.out.println(("Znalazles: " + readers.get(i).getPIN()));

        } 
       
           
        }

    } 
 
    public int size()
    {
        return (readers == null) ? 0 : readers.size();
    }
    // Szukanie po peselu.
      public void searchPIN(long PIN) {

    System.out.println("\n"+"Enter the title of the book you would like to search for: ");

    for (int i = 0; i < readers.size(); i++) {

        // IF statement to check that any book in the array list equals what
        // the user has typed in
        if (readers.get(i).getName().equals(PIN)) {

            System.out.println(("Znalazles: " + readers.get(i).getPIN()));

        } 
    }
  }

    // Zapisywanie czytelnika 
     public void readerWrite() throws Exception {
        // Create student object
        // Create file output stream
        FileOutputStream fos = new FileOutputStream("reader.txt");
        // Create object output stream
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Write student object data
        oos.writeObject(readers);
        // Close the output stream
        fos.close();
        oos.close();
    }
    
    // Wyswietlanie czytelnikow
    public void readerRead() throws Exception {                                             
    // Create file input stream                                                                        
    FileInputStream fis = new FileInputStream("reader.txt");       
    // Create object input stream                                                                        
    ObjectInputStream ois = new ObjectInputStream(fis);                               
    // Read student object data                                                                       
    readers = (ArrayList) ois.readObject();   
    
    // Output student information                                                                         
    System.out.println(readers);                                                      
    // Close the input stream                                                                          
    fis.close();                                                                      
    ois.close();                                                                      
}  
    
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
//Description:   Adds a book to the ArrayList.
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
//Description:   Mofidy a book from the ArrayList.
//---------------------------------------------------------------------------
    public void updateBook(String nameBook, Book book)
    {
            
            System.out.println("\n"+"Enter the title of the book you would like to modify: ");
            
    for (int i = 0; i < books.size(); i++) {
        if (books.get(i).getNameBook().equalsIgnoreCase(nameBook)) {
            System.out.println(("Zmodyfikowales: " + books.get(i).getNameBook()));
            books.set(i, book);
       
        } 
    }
    }
    
    //Szukanie po parametrze ksiazki.
    public void FindMatchingBooks(String nameBook, String author, String publisher, int publishingYear, int numberOfBooks) {
        
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
                
                if (numberOfBooks != -1 && book.getNumberOfBooks() != numberOfBooks) {
                    
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
       for (Book b : books) {
            System.out.println(b.toString());
        }
    }
    

     public void booksWrite() throws Exception {
        // Create student object
        // Create file output stream
        FileOutputStream fos = new FileOutputStream("book.txt");
        // Create object output stream
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Write student object data
        oos.writeObject(books);
        // Close the output stream
        fos.close();
        oos.close();
    }
    
    public void booksRead() throws Exception {                                             
    // Create file input stream                                                                        
    FileInputStream fis = new FileInputStream("book.txt");       
    // Create object input stream                                                                        
    ObjectInputStream ois = new ObjectInputStream(fis);                               
    // Read student object data                                                                       
    books = (ArrayList) ois.readObject();   
    
    // Output student information                                                                         
    System.out.println(books);                                                      
    // Close the input stream                                                                          
    fis.close();                                                                      
    ois.close();                                                                      
}                           
    /*
    public void wypozyczenieKsiazki(long PIN, String nameBook){
         for (int i = 0; i < readers.size(); i++) {

        // IF statement to check that any book in the array list equals what
        // the user has typed in
        
        if (readers.get(i).getName().equals(PIN)) {
            
                if(readers.get(i).getName().equalsIgnoreCase(nameBook)){
                    wypozyczone.add(books.get(i));
                    books.remove(i);
                }
                
        } 
        
        
        
        
        
         }
    }*/
    /*
    public void wypozyczoneWrite() throws Exception {
        // Create student object
        // Create file output stream
        FileOutputStream fos = new FileOutputStream("borrowed.txt");
        // Create object output stream
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Write student object data
        oos.writeObject(wypozyczone);
        // Close the output stream
        fos.close();
        oos.close();
    }
    
    public void wypozyczoneRead() throws Exception {                                             
    // Create file input stream                                                                        
    FileInputStream fis = new FileInputStream("borrowed.txt");       
    // Create object input stream                                                                        
    ObjectInputStream ois = new ObjectInputStream(fis);                               
    // Read student object data                                                                       
    wypozyczone = (ArrayList) ois.readObject();   
    
    // Output student information                                                                         
    System.out.println(wypozyczone);                                                      
    // Close the input stream                                                                          
    fis.close();                                                                      
    ois.close();                                                                      
}      
    
   public ArrayList<Book> Library.wszystkieWypozyczoneKsiazki(){
       ArrayList<Book> = returnval;
      return guardaSugestao;
   }
      */
    

    
    public void wypozycz(String PIN, Book lib) {
        Reader x = searchReader(readers, PIN);
        x.wypozycz(lib);
        books.remove(lib);
}
    public ArrayList<Book> dajmiwszystkiewypozyczone() {
        ArrayList<Book> allBorrowed = new ArrayList<Book>();
       for (Reader r : readers) {
            for (Book b : r.wypozyczone) {
                allBorrowed.add(b);
                System.out.println(allBorrowed);
            }
            }
           return allBorrowed;
        } 
    
        
        
    }
    
         
 
         
    
    



    

