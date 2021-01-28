package library;
    //---------------------------------------------------------------------------
//Imports.
//---------------------------------------------------------------------------   

//---------------------------------------------------------------------------   
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

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
//---------------------------------------------------------------------------
//Name:          DeleteAll method.
//Description:   Delete's everything in the ArrayList.
    //---------------------------------------------------------------------------
     public void deleteAll()
     {
           books.clear();
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

}

