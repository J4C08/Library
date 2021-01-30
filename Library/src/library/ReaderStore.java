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

public class ReaderStore {

//---------------------------------------------------------------------------
//ArrayList declaration.
//---------------------------------------------------------------------------
    List<Reader> readers = new ArrayList<Reader>();
    List<Book> wypozyczoneKsiazki = new ArrayList<Book>();
//---------------------------------------------------------------------------
//Name:          Add method.
//Description:   Adds a student to the ArrayList.
//---------------------------------------------------------------------------
    public void add(Reader reader) 
    {
        readers.add(reader);
    }
    
    public void borrowedBooks(){
       for (int i = 0; i < wypozyczoneKsiazki.size(); i++) 
        {
          Book a = wypozyczoneKsiazki.get(i);
            System.out.println(a.toString());
        }
    }
    
    public void deleteAll()
     {
           readers.clear();
     }
    //---------------------------------------------------------------------------
//Name:          Delete method.
//Description:   Delete's book by name in the ArrayList.
    //---------------------------------------------------------------------------

 public void delete(String s)
     {
         readers.remove(s);
     }
           
     
//---------------------------------------------------------------------------
//Name:          Print method.
//Description:   Prints out the contents of the ArrayList.
//---------------------------------------------------------------------------
    public void print() 
    {
        for (int i = 0; i < readers.size(); i++) 
        {
          Reader a = readers.get(i);
            System.out.println(a.toString());
        }
    }
    
  public void searchBook(String name) {

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
        return (readers == null) ? 0 : readers.size();
    }
    public void write(RandomAccessFile file) throws IOException
    {
        for (Reader s: readers)
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
        FileOutputStream fos = new FileOutputStream("czytelnik.txt");
        // Create object output stream
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Write student object data
        oos.writeObject(readers);
        // Close the output stream
        fos.close();
        oos.close();
    }
    
    public void testRead() throws Exception {                                             
    // Create file input stream                                                                        
    FileInputStream fis = new FileInputStream("czytelnik.txt");       
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
}