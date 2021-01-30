
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
//---------------------------------------------------------------------------   
public class Library implements Serializable { 
//---------------------------------------------------------------------------
//ArrayList declaration.
//---------------------------------------------------------------------------
    List<Reader> readers = new ArrayList<Reader>();
    List<Book> books = new ArrayList<Book>();
    
//---------------------------------------------------------------------------
//Name:          Add method.
//Description:   Adds a student to the ArrayList.
//---------------------------------------------------------------------------
    public void addReader(Reader reader) 
    {
        readers.add(reader);
    }
    
    public void deleteAllReaders()
     {
           readers.clear();
     }
    //---------------------------------------------------------------------------
//Name:          Delete method.
//Description:   Delete's book by name in the ArrayList.
    //---------------------------------------------------------------------------

 public void deleteReader(String s)
     {
         readers.remove(s);
     }
           
     
//---------------------------------------------------------------------------
//Name:          Print method.
//Description:   Prints out the contents of the ArrayList.
//---------------------------------------------------------------------------
    public void printReaders() 
    {
        for (int i = 0; i < readers.size(); i++) 
        {
          Reader a = readers.get(i);
            System.out.println(a.toString());
        }
    }
    
    //Szukanie
  public void searchReader(String name) {

    System.out.println("\n"+"Enter the title of the book you would like to search for: ");

    for (int i = 0; i < readers.size(); i++) {

        // IF statement to check that any book in the array list equals what
        // the user has typed in
        if (readers.get(i).getName().equalsIgnoreCase(name)) {
        
            System.out.println(("Znalazles: " + readers.get(i).getName()));

        } 
       
           
        }

    } // end of for

// end of method  

    public int size()
    {
        return (readers == null) ? 0 : readers.size();
    }


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
//Description:   Adds a student to the ArrayList.
//---------------------------------------------------------------------------
    public void addBook(Book book) 
    {
        books.add(book);
    }
    
    public void deleteAllBooks()
     {
           books.clear();
     }
    
    public void updateBook(String nameBook, Book book)
    {
            
            System.out.println("\n"+"Enter the title of the book you would like to search for: ");
            
    for (int i = 0; i < books.size(); i++) {

        // IF statement to check that any book in the array list equals what
        // the user has typed in
        if (books.get(i).getNameBook().equalsIgnoreCase(nameBook)) {
            System.out.println(("Zmodyfikowales: " + books.get(i).getNameBook()));
            books.set(i, book);
       
        } 
    }
    }
    //---------------------------------------------------------------------------
//Name:          Delete method.
//Description:   Delete's book by name in the ArrayList.
    //---------------------------------------------------------------------------

 public void deleteBook(String nameBook)
     {
          System.out.println("\n"+"Enter the title of the book you would like to search for: ");

    for (int i = 0; i < books.size(); i++) {

        // IF statement to check that any book in the array list equals what
        // the user has typed in
        if (books.get(i).getNameBook().equalsIgnoreCase(nameBook)) {
            System.out.println(("Usun¹³eœ: " + books.get(i).getNameBook()));
            books.remove(i);
        } 
         
     }
     }
           
     
//---------------------------------------------------------------------------
//Name:          Print method.
//Description:   Prints out the contents of the ArrayList.
//---------------------------------------------------------------------------
    public void printBooks() 
    {
        for (int i = 0; i < books.size(); i++) 
        {
          Book a = books.get(i);
            System.out.println(a.toString());
        }
    }
    
  public void searchBook(String nameBook) {

    System.out.println("\n"+"Enter the title of the book you would like to search for: ");

    for (int i = 0; i < books.size(); i++) {

        // IF statement to check that any book in the array list equals what
        // the user has typed in
        if (books.get(i).getNameBook().equalsIgnoreCase(nameBook)) {
            System.out.println(("Znalazles: " + books.get(i).getNameBook()));
        } 

           
    }

} 
  
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
    

    
    public void wypozycz(long PIN, Book lib) {
        Reader r = new Reader();
        Reader x = r.znajdzUzytkownika(readers, PIN);
        x.wypozycz(lib);
        books.remove(lib);
}
    
         
 
         }
    
    



    

