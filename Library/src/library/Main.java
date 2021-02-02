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
        
         lib.booksRead();
         lib.readersRead();

        int choice;
        System.out.println("Welcome to the library!");
        do 
        {
            choice = MenuMethods.getMenuChoice( "1.\tView books" +
                                                "\n2.\tView readers"+ 
                                                "\n3.\tAdd book"+ 
                                                "\n4.\tEdit book" + 
                                                "\n5.\tDelete book" + 
                                                "\n6.\tSearch for a book by parameter"+ 
                                                "\n7.\tView readers by parameter" + 
                                                "\n8.\tAdd reader" + 
                                                "\n9.\tEdit reader" +
                                                "\n10.\tBlock reader" +
                                                "\n11.\tBorrow book" +
                                                "\n12.\tShow all books that are borrowed" +
                                                "\n13.\tShow books borrowed by the selected reader" +
                                                "\n14.\tShow books that are overdue returns." +
                                                "\n15.\tExit", 15,
                                                "Please enter your choice:", "Error [1,15] Only");
        
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
                        
                    case 2:
                        System.out.println("View readers");
                        lib.printReaders();
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 2: Add
//          Description: Choice 2 is to add an Book to the store.
        //-------------------------------------------2--------------------------------------------
                    case 3:
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
                    case 4:
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
                    case 5:
                        System.out.println("Delete book");
                      
                        System.out.println("Please state the title of the book you wish to remove.");
                        String delete = MenuMethods.userInputBookName();
                        lib.deleteBook(delete);
                        lib.booksWrite();

                        break;
        //---------------------------------------------------------------------------------------
//                      Name:        Case 4: Search.
//                      Description: 
        //---------------------------------------------------------------------------------------
                    case 6:
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

                        lib.findMatchingBooks(nameBook, author, publisher, publishingYear);
                        
                        
                        break;

        //---------------------------------------------------------------------------------------
//          Name:        Case 6: Search.
//          Description: Choice 6 gives the user 5 options: Search by nameBook, Search by author, Search by publisher, Search by publishingYear and Search by numerOfBooks.
//                       Search will run through the store and output the book match the user inputs.
        //---------------------------------------------------------------------------------------
                    case 7:
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
                        surname = keyboard.nextLine();
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
                        
                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 7: WypozyczKsiazke.
//          Description: Choice 7 gives the user an option to copy and read a store
//                       using read and write class from Java.
        //---------------------------------------------------------------------------------------
                    case 8:
                        System.out.println("Add reader");
                        
                        Reader addReader = MenuMethods.userInputReader();
                        lib.addReader(addReader);
                        lib.readersWrite();

                        break;
        //---------------------------------------------------------------------------------------
//          Name:        Case 8: Exit.
//          Description: Choice 8 will exit the application.
        //---------------------------------------------------------------------------------------
                    case 9:
                        System.out.println("Edit reader");
                       
                        System.out.println("Please, enter the parameters of the reader.");
                        Reader readerEdit = MenuMethods.userInputReader();
                        
                        
                        String searchReader = MenuMethods.userInputByPIN();
                        lib.updateReader(searchReader, readerEdit);
                        lib.readersWrite();
                        break;
                   
                    
                    case 10:
                        System.out.println("Block reader");
                        
                        String banReader = MenuMethods.userInputByPIN();
                       
                       
                        lib.banReader(banReader);
                        lib.readersWrite();
                        break;
                        
                        
                        
                    case 11:
                        System.out.println("Borrow book");
                       
                        
                        String PIN = MenuMethods.userInputByPIN();
                        
                        System.out.println("Please enter the title of the book you wish to borrow.");                        
                        String nB = MenuMethods.userInputBookName();
                        
                        System.out.println("Please enter the author of this book.");
                        String authoR = MenuMethods.userInputAuthor();
                        
                        lib.borrowBook(PIN, nB, authoR);
                        lib.readersWrite();
                        lib.booksWrite();
                        break;
                        
                    case 12:
                        System.out.println("Show all books that are borrowed");
                       
                        System.out.println(lib.allBorrowedBooks());
                        break;    
                    
                    case 13:
                        System.out.println("Show books borrowed by the selected reader");
                        
                        String pinB = MenuMethods.userInputByPIN();
                        
                        
                        lib.allBorrowedBooksByReader(pinB);
                        break;    
                        
                    case 14:
                        System.out.println("Show books that are overdue returns");
                        lib.overdueBooks();
                        break;   
                        
                    case 15:
                        System.out.println("Exit");

                        break;    
                    }
                    
                } while (choice != 15);
    
        }
}

    




		
	
   
