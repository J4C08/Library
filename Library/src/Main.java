import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.UTFDataFormatException;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) throws IOException  {
        ArrayList<Book> book = new ArrayList<Book>();
        ArrayList<Reader> reader = new ArrayList<Reader>();    
          
        book.add(new Book("Pan Adam", "Jan Kowalski","Opera", 2000, 3));
        book.add(new Book("W miescie i w puszczy", "Aleksander Maciej","Kozok", 1998, 4));
        book.add(new Book("California", "Milosh Miodek","US", 2019, 1));
          
        reader.add(new Reader("Szymon", "Nowak", 2, "Kolorowa 11", "Nie"));
        reader.add(new Reader("Krystyna", "Wikipedia", 1, "Piekna 2", "Nie"));
        reader.add(new Reader("Jakub", "Tokarczuk", 3, "Midowa 7", "Tak"));  
        DataOutputStream out;
        DataInputStream in = null;
         try {
            out = new DataOutputStream( new BufferedOutputStream( new FileOutputStream("text.txt")));

            for (int i = 0; i < 1; i++) {
             out.write(book.getNameBook("Wuwu"));
            }
            
            out.close();

        } catch (EOFException ex) {
            System.out.println("Koniec pliku do odczytu...");
        } catch (UTFDataFormatException ex) {
            System.err.println("Plik nie posiada danych zakodowanych w UTF...");
        } catch (IOException ex) {
            if (in != null) {
                in.close();
            }
            System.err.println("Nie uda³o siê otworzyæ pliku do odczytu...");
        }
    
        }}
    




		
	
   
