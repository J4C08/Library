package library;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
//---------------------------------------------------------------------------------------
//  The Scanner is declared here for use throughout the whole Main.
//---------------------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception 
    {
        new Main().start();

    }
    
    public void start()throws Exception 
    {
       
        Library lib = new Library();
        LocalDate date = LocalDate.now();
       
        
        //Book a = new Book("Pan Adam", "Jan Kowalski","Opera", 2000, 3);
        //Book b = new Book("W miescie i w puszczy", "Aleksander Maciej","Kozok", 1998, 4);
        //Book c = new Book("California", "Milosh Miodek","US", 2019, 1);
        //lib.addBook(a);
        //lib.addBook(b);
        //lib.addBook(c);
        
        //Reader d = new Reader("Tomasz", "Nowak",15, "Kolorowa 11", "nie", "Inna Ksiazka", 65093046874L);
        //Reader e = new Reader("Anna", "Kwiat", 13, "Kwiatowa 2", "nie", "Inna Ksiazka 2", 83031046546L);
        //Reader f = new Reader("Szymon", "Wiœniewski",18, "Miodowa 7", "nie", "Inna Ksiazka 3", 80022331881L);
        //lib.addReader(d);
        //lib.addReader(e);
        //lib.addReader(f);
        
        
        
        // tworzenie ksiazek
        //Reader d = new Reader("Jas", "Kowalski",18, "XD 11", "NIE", "65093045874");
        //Book c = new Book("Pan Tadeusz", "Adam Mickiewicz","Polska", 2019, 1);
        
        // testowa historia wypozyczenia do wyswietlenia 
        Loan e = new Loan(date.toString(),date.plusWeeks(2).toString());
        e.addLoan(e);
        e.printLoan();
        //lib.addReader(d);
        //lib.addBook(c);
        //lib.booksWrite();
        //lib.readerWrite();
        
        //Zapisywanie
        //lib.booksWrite();
        //lib.readerWrite();
        //Wypozycz
        
        //lib.wypozycz("65093045874",c);
        
        //Zapisz wypozyczenie
        //lib.readerWrite();
       //lib.booksRead();
       //lib.readerRead();
        
       // lib.searchReader(readers.get(d), 65093045874L);

       //lib.dajmiwszystkiewypozyczone();
        
        //RandomAccessFile file = new RandomAccessFile("Ksiazki.txt","rw");
       
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
            choice = MenuMethods.getMenuChoice( "1.\tView books" +
                                                "\n2.\tAdd book"+ 
                                                "\n3.\tEdit book" + 
                                                "\n4.\tDelete book." + 
                                                "\n5.\tSearch for a book by parameter"+ 
                                                "\n6.\tView readers by parameter" + 
                                                "\n7.\tAdd reader" + 
                                                "\n8.\tEdit reader" +
                                                "\n9.\tBlock reader" +
                                                "\n10.\tBorrow book" +
                                                "\n11.\tShow all books that are borrowed" +
                                                "\n12.\tShow books borrowed by the selected reader" +
                                                "\n13.\tShow books that are overdue returns." +
                                                "\n14.\tExit", 14,
                                                "Please enter your choice:", "Error [1,14] Only");
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

                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 2: Add
//          Description: Choice 2 is to add an Book to the store.
        //---------------------------------------------------------------------------------------
                    case 2:
                  System.out.println("Add");
                        Book book = MenuMethods.userInputBook();
                        lib.addBook(book);
                        lib.booksWrite();
                        //file.write(book.toString().getBytes());
                   
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 3: Delete by Name.
//          Description: Choice 3 gives the user an option to delete an Book by name.
        //---------------------------------------------------------------------------------------
                    case 3:
                        System.out.println("Delete by Name.");
                        String delBook = MenuMethods.userInputByBookName();
                        lib.deleteBook(delBook);
                        lib.booksWrite();
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
                        Book bookEdit = MenuMethods.userInputBook();
                         String searchBook = MenuMethods.userInputByBookName();
                        lib.updateBook(searchBook, bookEdit);
                        lib.booksWrite();
                        
                        
                        break;

        //---------------------------------------------------------------------------------------
//          Name:        Case 6: Search.
//          Description: Choice 6 gives the user 5 options: Search by nameBook, Search by author, Search by publisher, Search by publishingYear and Search by numerOfBooks.
//                       Search will run through the store and output the book match the user inputs.
        //---------------------------------------------------------------------------------------
                    case 6:
                        System.out.println("Search");   
                   
                        
                        //lib.FindMatchingBooks("Pan Tadeusz", null,"Polska", 2019, 1);
                        
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 7: WypozyczKsiazke.
//          Description: Choice 7 gives the user an option to copy and read a store
//                       using read and write class from Java.
        //---------------------------------------------------------------------------------------
                    case 7:
                        //lib.zablokujReadera("65093045874");
                        //lib.readerWrite();
                        //Book wypoz = MenuMethods.userInputBook();
                        //lib.wypozyczenieKsiazki(wypoz);

                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 8: Exit.
//          Description: Choice 8 will exit the application.
        //---------------------------------------------------------------------------------------
                    case 8:
                        System.out.println("Exit");

                        break;
                    }

                } while (choice != 14);
    
        }
}

    




		
	
   
