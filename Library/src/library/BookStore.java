package library;
    //---------------------------------------------------------------------------
//Imports.
//---------------------------------------------------------------------------   

//---------------------------------------------------------------------------   
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class BookStore {

//---------------------------------------------------------------------------
//ArrayList declaration.
//---------------------------------------------------------------------------
    List<Book> books = new ArrayList<Book>();
//---------------------------------------------------------------------------
//Name:          Add method.
//Description:   Adds a student to the ArrayList.
//---------------------------------------------------------------------------
    public void add(Book book) 
    {
        books.add(book);
    }
    
    public void deleteAll()
     {
           books.clear();
     }
    //---------------------------------------------------------------------------
//Name:          Delete method.
//Description:   Delete's book by name in the ArrayList.
    //---------------------------------------------------------------------------

 public void delete(String s)
     {
         books.remove(s);
     }
           
     
//---------------------------------------------------------------------------
//Name:          Print method.
//Description:   Prints out the contents of the ArrayList.
//---------------------------------------------------------------------------
    public void print() 
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

    } // end of for

// end of method
        
        /*
        boolean exist=false;
        for(int i=0;i<books.size();i++){
            if(){
                exist=true;
                break;
            }
           
        
             if(exist){
                System.out.println("Ta znalazlem");
            }
            else {
                System.out.println("XD");
            }
    */

        
    
    
    public int size()
    {
        return (books == null) ? 0 : books.size();
    }
    public void write(RandomAccessFile file) throws IOException
    {
        for (Book s: books)
        {
            byte[] bytes = s.toString().getBytes();
            for(byte byteWrite : bytes)
            {
                file.writeByte(byteWrite);
            }
        }
        
        

    }
    


    public void readAll(RandomAccessFile file) throws IOException
    {
        file.seek(0);

        String code;
while((code=file.readLine())!=null)
        System.out.println(code);
    }


    
       
    
     public void testWrite() throws Exception {
        // Create student object
        // Create file output stream
        FileOutputStream fos = new FileOutputStream("test1.txt");
        // Create object output stream
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Write student object data
        oos.writeObject(books);
        // Close the output stream
        fos.close();
        oos.close();
    }
    
    public void testRead() throws Exception {                                             
    // Create file input stream                                                                        
    FileInputStream fis = new FileInputStream("test1.txt");       
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
     
}



