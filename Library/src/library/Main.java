package library;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.Scanner;

public class Main {
//---------------------------------------------------------------------------------------
//  The Scanner is declared here for use throughout the whole MainApp.
//---------------------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception 
    {
        new Main().start();

    }
    
 
     
    public void start()throws Exception 
    {
       
        BookStore bs = new BookStore();
        ReaderStore rs = new ReaderStore();
      
        
        //Book a = new Book("Pan Adam", "Jan Kowalski","Opera", 2000, 3);
        //Book b = new Book("W miescie i w puszczy", "Aleksander Maciej","Kozok", 1998, 4);
        //Book c = new Book("California", "Milosh Miodek","US", 2019, 1);
        //bs.add(a);
        //bs.add(b);
        //bs.add(c);
        
        //Reader a = new Reader("Tomasz", "Nowak",15, "Kolorowa 11", "nie", "Inna Ksiazka");
        //Reader b = new Reader("Anna", "Kwiat", 13, "Kwiatowa 2", "nie", "Inna Ksiazka 2");
        //Reader c = new Reader("Szymon", "Wiœniewski",18, "Miodowa 7", "nie", "Inna Ksiazka 3");
        //rs.add(a);
        //rs.add(b);
        //rs.add(c);
          //bs.testWrite();
          bs.testRead();
          //rs.testWrite();
          rs.testRead();
          rs.borrowedBooks();
        


        RandomAccessFile file = new RandomAccessFile("Ksiazki.txt","rw");
       
        //getBytes() returns an array of bytes.
        //Because i have put the store in a static Array.(I done this because i could find no other
        //Simple way to write a Student Object.)
        //None of the methods of the RandomAccessFile write class worked with this.
        //Book[] books = {a,b,c,d,e};
        //bs.write(file);
        //details.readAll(file);
        int choice;
        System.out.println("Witaj w Bibliotece!");
        do 
        {
            choice = MenuMethods.getMenuChoice( "1.\tView" +
                                                "\n2.\tAdd"+ 
                                                "\n3.\tDelete" + 
                                                "\n4.\tDelete All " + 
                                                "\n5.\tEdit"+ 
                                                "\n6.\tSearch" + 
                                                "\n7.\tStore" + 
                                                "\n8.\tExit", 8,
                                                "Please enter your choice:", "Error [1,8] Only");
        // String temp = keyboard.nextLine(); This prevented entering the choice.
        //---------------------------------------------------------------------------------------
//          Name:        Switch Statement.
//          Description: This is used for a menu system.
        //---------------------------------------------------------------------------------------
                    switch (choice) 
                    {
        //---------------------------------------------------------------------------------------
//          Name:        Case 1: View All
//          Description: Choice 1 is to view all book's in the store.
        //---------------------------------------------------------------------------------------
                    case 1:
                        System.out.println("View All");
                       
                        //bs.readAll(file);    
                        bs.print();
                        //
                        
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 2: Add
//          Description: Choice 2 is to add an Book to the store.
        //---------------------------------------------------------------------------------------
                    case 2:
                  System.out.println("Add");
                        Book book = MenuMethods.userInput();
                        bs.add(book);
                        bs.testWrite();
                        //file.write(book.toString().getBytes());
                   
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 3: Delete by Name.
//          Description: Choice 3 gives the user an option to delete an Book by name.
        //---------------------------------------------------------------------------------------
                    case 3:
                        System.out.println("Delete by Name.");

                        //Employee employeeDelete = MenuMethods.userInputByName();
                        //Store.searchByName(employeeDelete.getEmployeeName());
                        //Store.remove(employeeDelete.getEmployeeName());
                        break;
        //---------------------------------------------------------------------------------------
//                      Name:        Case 4: Delete All.
//                      Description: Choice 4 gives the user a choice to delete all book's in the store.
        //---------------------------------------------------------------------------------------
                    case 4:
                        System.out.println("Delete All.");
                        //Store.clear();

                        break;
        //---------------------------------------------------------------------------------------
//                      Name:        Case 4: Edit.
//                      Description: Choice 4 gives the user an option to edit the book's in the store.
//                                   This consists of changing nameBook, author, publisher, publishingYear and numerOfBooks.
        //---------------------------------------------------------------------------------------
                    case 5:
                        System.out.println("Edit");

                        break;

        //---------------------------------------------------------------------------------------
//          Name:        Case 6: Search.
//          Description: Choice 6 gives the user 5 options: Search by nameBook, Search by author, Search by publisher, Search by publishingYear and Search by numerOfBooks.
//                       Search will run through the store and output the book match the user inputs.
        //---------------------------------------------------------------------------------------
                    case 6:
                        System.out.println("Search by name book");                    
                        String book1 = MenuMethods.userInputByBookName();
                        bs.searchBook(book1);
                        
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 7: Store.
//          Description: Choice 7 gives the user an option to copy and read a store
//                       using read and write class from Java.
        //---------------------------------------------------------------------------------------
                    case 7:


                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 8: Exit.
//          Description: Choice 8 will exit the application.
        //---------------------------------------------------------------------------------------
                    case 8:
                        System.out.println("Exit");

                        break;
                    }

                } while (choice != 8);



        file.close();
    
    /*
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
        }*/
    
        }}

    




		
	
   
