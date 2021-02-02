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
        
         lib.booksRead();
         lib.readersRead();
        
        // tworzenie ksiazek
        //Reader d = new Reader("Jas", "Kowalski",18, "XD 11", "NIE", "65093045874");
        //Book c = new Book("Pan Tadeusz", "Adam Mickiewicz","Polska", 2019, 1);
        //Reader e = new Reader("TestNIE", "Test",18, "test", "NIE", "65093045875");
        // testowa historia wypozyczenia do wyswietlenia 
        //Reader test = new Reader("Test2", "Test2",18, "XD 11", "NIE", "65093045872");
        //Book test1 = new Book("przeterminowanaojedendzien", "ABCD","ENGLANDO", 2019, 9);
        //lib.addReader(d);
         //lib.addReader(f);
        //lib.addBook(test1);
        //lib.booksWrite();
        //lib.readersWrite();
        
        //Zapisywanie
        //lib.booksWrite();
        //lib.readerWrite();
        //Wypozycz
       
         //lib.wypozycz("65093045872","przeterminowanaojedendzien","ABCD");
         //lib.booksWrite();
        //lib.readersWrite();
        //lib.overdueBooks();
        //System.out.println(lib.allBorrowedBooksByReader("65093045872"));
        
        //Zapisz wypozyczenie
        //lib.readerWrite();
      
        //lib.banReader("65093045874");
        //lib.readersWrite();
       // lib.searchReader(readers.get(d), 65093045874L);

       //lib.dajmiwszystkiewypozyczone();
        
        //RandomAccessFile file = new RandomAccessFile("Ksiazki.txt","rw");
       

        int choice;
        System.out.println("Witaj w Bibliotece!");
        do 
        {
            choice = MenuMethods.getMenuChoice( "1.\tView books" +
                                                "\n2.\tAdd book"+ 
                                                "\n3.\tEdit book" + 
                                                "\n4.\tDelete book" + 
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
                        System.out.println("View books");
                        lib.printBooks();
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 2: Add
//          Description: Choice 2 is to add an Book to the store.
        //-------------------------------------------2--------------------------------------------
                    case 2:
                        System.out.println("Add book");
                        
                        Book addBook = MenuMethods.userInputBook();
                        lib.addBook(addBook);
                        lib.booksWrite();
                        //file.write(book.toString().getBytes());
                   
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 3: Delete by Name.
//          Description: Choice 3 gives the user an option to delete an Book by name.
        //---------------------------------------------------------------------------------------
                    case 3:
                        System.out.println("Edit book");
                        
                        System.out.println("Enter the parameters of the book.");
                        Book bookEdit = MenuMethods.userInputBook();
                        
                        System.out.println("Please provide the title of the book you wish to edit.");
                        String searchBook = MenuMethods.userInputBookName();
                        lib.updateBook(searchBook, bookEdit);
                        lib.booksWrite();
                       
                        break;
        //---------------------------------------------------------------------------------------
//                      Name:        Case 4: Delete All.
//                      Description: Choice 4 gives the user a choice to delete all book's in the store.
        //---------------------------------------------------------------------------------------
                    case 4:
                        System.out.println("Delete book");
                      
                        System.out.println("Please state the title of the book you wish to remove.");
                        String delete = MenuMethods.userInputBookName();
                        lib.deleteBook(delete);
                        lib.booksWrite();

                        break;
        //---------------------------------------------------------------------------------------
//                      Name:        Case 4: Edit.
//                      Description: Choice 4 gives the user an option to edit the book's in the store.
//                                   This consists of changing nameBook, author, publisher, publishingYear and numerOfBooks.
        //---------------------------------------------------------------------------------------
                    case 5:
                        System.out.println("Search for a book by parameter");
 
                        String nameBook = null;
                        String author = null;
                        String publisher = null;
                        int publishingYear = -1;
                        int numberOfBooks = -1;
                        
                        System.out.println("Do you want to filter by name? Type YES");
                        String useNameBook = keyboard.nextLine();
                        
                        if(useNameBook.equals("YES")){
                        System.out.println("Please enter the name book.");
                        nameBook = keyboard.nextLine();
                        }
                        
                        System.out.println("Do you want to filter by author? Type YES");
                        String useAuthor = keyboard.nextLine();
                        
                        if(useAuthor.equals("YES")){
                        System.out.println("Please enter the author.");
                        author = keyboard.nextLine();
                        }
                        
                        System.out.println("Do you want to filter by publisher? Type YES");
                        String usePublisher = keyboard.nextLine();
                        
                        if(usePublisher.equals("YES")){
                        System.out.println("Please enter the publisher.");
                        publisher = keyboard.nextLine();
                        }
                        
                         System.out.println("Do you want to filter by publishing year? Type YES");
                        String usePublishingYear = keyboard.nextLine();
                        
                        if(usePublishingYear.equals("YES")){
                        System.out.println("Please enter the publishing year.");
                        publishingYear = keyboard.nextInt();
                        }
                        
                         System.out.println("Do you want to filter by number of books? Type YES");
                        String useNumberOfBooks  = keyboard.nextLine();
                        
                        if(useNumberOfBooks.equals("YES")){
                        System.out.println("Please enter the number of books.");
                         numberOfBooks = keyboard.nextInt();
                        }
                        
                        lib.findMatchingBooks(nameBook, author, publisher, publishingYear, numberOfBooks);
                        
                        
                        break;

        //---------------------------------------------------------------------------------------
//          Name:        Case 6: Search.
//          Description: Choice 6 gives the user 5 options: Search by nameBook, Search by author, Search by publisher, Search by publishingYear and Search by numerOfBooks.
//                       Search will run through the store and output the book match the user inputs.
        //---------------------------------------------------------------------------------------
                    case 6:
                        System.out.println("View readers by parameter");
                       
                        String name = null;
                        String surname = null;
                        int age = -1;
                        String address = null;
                        String banned = null;
                        String pin = null;
                        
                        
                        System.out.println("Do you want to filter by name? Type YES");
                        String useName = keyboard.nextLine();
                        
                        if(useName.equals("YES")){
                        System.out.println("Please enter the name.");
                        name = keyboard.nextLine();
                        }
                        
                        System.out.println("Do you want to filter by surname? Type YES");
                        String useSurname = keyboard.nextLine();
                        
                        if(useSurname.equals("YES")){
                        System.out.println("Please enter the surname.");
                        author = keyboard.nextLine();
                        }
                        
                        System.out.println("Do you want to filter by age? Type YES");
                        String useAge = keyboard.nextLine();
                        
                        if(useAge.equals("YES")){
                        System.out.println("Please enter the age.");
                        age = keyboard.nextInt();
                        keyboard.nextLine();
                        }
                        
       
                        System.out.println("Do you want to filter by address? Type YES");
                        String useAddress = keyboard.nextLine();
                        
                        if(useAddress.equals("YES")){
                        System.out.println("Please enter the address.");
                        address = keyboard.nextLine();
                        }
                        
                        
                         System.out.println("Do you want to filter by banned readers? Type YES");
                        String useBanned = keyboard.nextLine();
                        
                        if(useBanned.equals("YES")){
                        System.out.println("Please enter the YES or NO.");
                        banned = keyboard.nextLine();
                        }
                        
                         System.out.println("Do you want to filter by PIN? Type YES");
                        String usePIN  = keyboard.nextLine();
                        
                        if(usePIN.equals("YES")){
                        System.out.println("Please enter the PIN.");
                         pin = keyboard.nextLine();
                        }
                        
                     
                        lib.findMatchingReaders(name, surname, age, address, banned, pin);
                        //lib.FindMatchingReaders();
                        
                        //lib.FindMatchingBooks("Pan Tadeusz", null,"Polska", 2019, 1);
                        
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 7: WypozyczKsiazke.
//          Description: Choice 7 gives the user an option to copy and read a store
//                       using read and write class from Java.
        //---------------------------------------------------------------------------------------
                    case 7:
                        System.out.println("Add reader");
                        
                        Reader addReader = MenuMethods.userInputReader();
                        lib.addReader(addReader);
                        lib.readersWrite();

                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 8: Exit.
//          Description: Choice 8 will exit the application.
        //---------------------------------------------------------------------------------------
                    case 8:
                        System.out.println("Edit reader");
                       
                        System.out.println("Please, enter the parameters of the book.");
                        Reader readerEdit = MenuMethods.userInputReader();
                        
                        
                        String searchReader = MenuMethods.userInputByPIN();
                        lib.updateReader(searchReader, readerEdit);
                        lib.readersWrite();
                        break;
                   
                    
                    case 9:
                        System.out.println("Block reader");
                        
                        String banReader = MenuMethods.userInputByPIN();
                       
                       
                        lib.banReader(banReader);
                        lib.readersWrite();
                        break;
                        
                        
                        
                    case 10:
                        System.out.println("Borrow book");
                       
                        
                        String PIN = MenuMethods.userInputByPIN();
                        
                        System.out.println("Please enter the title of the book you wish to borrow.");                        
                        String nB = MenuMethods.userInputBookName();
                        
                        System.out.println("Please enter the author of this book.");
                        String authoR = MenuMethods.userInputAuthor();
                        
                        lib.wypozycz(PIN, nB, authoR);
                        lib.readersWrite();
                        lib.booksWrite();
                        //lib.wypozycz("65093045872","przeterminowanaojedendzien","ABCD");
                        break;
                        
                    case 11:
                        System.out.println("Show all books that are borrowed");
                       
                        lib.allBorrowedBooks();
                        break;    
                    
                    case 12:
                        System.out.println("Show books borrowed by the selected reader");
                        
                        String pinB = MenuMethods.userInputByPIN();
                        
                        System.out.println(pinB);
                        lib.allBorrowedBooksByReader(pinB);
                        break;    
                        
                    case 13:
                        System.out.println("Show books that are overdue returns");
                        lib.overdueBooks();
                        break;   
                        
                    case 14:
                        System.out.println("Exit");

                        break;    
                    }
                    
                } while (choice != 14);
    
        }
}

    




		
	
   
