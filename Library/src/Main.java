import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
    // Listy danych do pobrania
    ArrayList<Book> book = new ArrayList<Book>();
    ArrayList<Reader> reader = new ArrayList<Reader>();
    
    //Zmienne o mnie ??? Ogarnac co tu wpisac
    
    //Metoda, która tworzy dane
    public void createData(){
        inputBook();
        inputReader();
    
    
    }
    //Metoda, która tworzy ksi¹zki
    private void inputBook(){
            book.add(new Book("Pan Adam", "Jan Kowalski","Opera", 2000, 3));
            book.add(new Book("W miescie i w puszczy", "Aleksander Maciej","Kozok", 1998, 4));
            book.add(new Book("California", "Milosh Miodek","US", 2019, 1));
    
    }
    
    private void inputReader(){
            reader.add(new Reader("Szymon", "Nowak", 2, "Kolorowa 11", "Nie"));
            reader.add(new Reader("Krystyna", "Wikipedia", 1, "Piekna 2", "Nie"));
            reader.add(new Reader("Jakub", "Tokarczuk", 3, "Midowa 7", "Tak"));
    
    }
    
    public void saveData(){
		//Massive object to store all our objects
		ArrayList<Object> data = new ArrayList<Object>();
		data.add();
		data.add();
		data.add();
		data.add();
		
		try {
			FileOutputStream fileOut = new FileOutputStream("data.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(data);
			out.close();
			fileOut.close();
			System.out.println("Zapisywanie w data.ser");
			
		} catch(IOException i){
			i.printStackTrace();
		}
	}
    
    
}
