package library;


    //---------------------------------------------------------------------------------------
//  Name:           Imports. 
//  Description:    To allow the use of different Java classes.
//---------------------------------------------------------------------------------------
import java.util.Scanner;
//---------------------------------------------------------------------------------------
public class MenuMethods {


    private static Scanner keyboard = new Scanner(System.in);
//---------------------------------------------------------------------------------------
//  Methods for the Company Application menu.
//---------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------
//  Name:           getMenuChoice.
//  Description:    Method for validating the choice.
//---------------------------------------------------------------------------------------
    public static int getMenuChoice(String menuString, int limit,String prompt, String errorMessage) 
    {
        System.out.println(menuString);
        int choice = inputAndValidateInt(1, limit, prompt, errorMessage);
        return choice;
    }

//---------------------------------------------------------------------------------------
//  Name:        inputAndValidateInt.
//  Description: This method is used in the getMenuChoice method.
//---------------------------------------------------------------------------------------
    public static int inputAndValidateInt(int min, int max, String prompt,String errorMessage) 
    {
        int number;
        boolean valid;
        do 
        {
            System.out.print(prompt);
            number = keyboard.nextInt();
            valid = number <= max && number >= min;
            if (!valid) 
            {
                System.out.println(errorMessage);
            }
        } while (!valid);
        return number;
    }

//---------------------------------------------------------------------------------------
//  Name:        userInput
//  Description: This method is used in the MainApp to give the user capability to enter
//               the details when adding details of an employee into the store.
//---------------------------------------------------------------------------------------
    public static Book userInput() 
    {
        String temp = keyboard.nextLine();
        Book s = null;
        System.out.println("Please enter the Student Name:");
        String nameBook = keyboard.nextLine();
        System.out.println("Please enter the Student ID:");
        String author = keyboard.nextLine();
        System.out.println("Please enter the Student E-mail address:");
        String publisher = keyboard.nextLine();
        System.out.println("Please enter the Student telephone number:");
        int publishingYear = keyboard.nextInt();
        System.out.println("Please enter the Student telephone number:");
        int numberOfBooks = keyboard.nextInt();
        
        return s = new Book(nameBook, author, publisher, publishingYear, numberOfBooks );

    }

//---------------------------------------------------------------------------------------
//  Name:        userInputByName.
//  Description: This method is used in the MainApp to give the user capability to search by name.
//---------------------------------------------------------------------------------------
    public static Book userInputByBookName() 
    {
        // String temp is for some reason needed. If it is not included
        // The code will not execute properly.
        String temp = keyboard.nextLine();
        Book s = null;
        System.out.println("Please enter the Student Name:");
        String bookName = keyboard.nextLine();

        return s = new Book(bookName);

    }

//---------------------------------------------------------------------------------------
//  Name:        userInputByEmail
//  Description: This method is used in the MainApp to give the user capability to search by email.
//---------------------------------------------------------------------------------------
    public static String userInputByAuthor() 
    {
        // String temp is for some reason needed. If it is not included
        // The code will not execute properly.
        String temp = keyboard.nextLine();
        Book s = null;
        System.out.println("Please enter the StudentEmail:");
        String author = keyboard.nextLine();
        // This can use the employeeName's constructor because java accepts the
        // parameters instead
        // of the name's.
        return author;

    }
//---------------------------------------------------------------------------------------
 
//---------------------------------------------------------------------------------------
//  Name:        userInputByEmail
//  Description: This method is used in the MainApp to give the user capability to search by email.
//---------------------------------------------------------------------------------------
    public static String userInputByPublisher() 
    {
        // String temp is for some reason needed. If it is not included
        // The code will not execute properly.
        String temp = keyboard.nextLine();
        Book s = null;
        System.out.println("Please enter the StudentEmail:");
        String publisher = keyboard.nextLine();
        // This can use the employeeName's constructor because java accepts the
        // parameters instead
        // of the name's.
        return publisher;

    }
//---------------------------------------------------------------------------------------
        
//---------------------------------------------------------------------------------------
//  Name:        userInputByEmail
//  Description: This method is used in the MainApp to give the user capability to search by email.
//---------------------------------------------------------------------------------------
    public static String userInputByPublishingYear() 
    {
        // String temp is for some reason needed. If it is not included
        // The code will not execute properly.
        String temp = keyboard.nextLine();
        Book s = null;
        System.out.println("Please enter the StudentEmail:");
        String publishingYear = keyboard.nextLine();
        // This can use the employeeName's constructor because java accepts the
        // parameters instead
        // of the name's.
        return publishingYear;

    }
//---------------------------------------------------------------------------------------
        
//---------------------------------------------------------------------------------------
//  Name:        userInputByEmail
//  Description: This method is used in the MainApp to give the user capability to search by email.
//---------------------------------------------------------------------------------------
    public static String userInputByNumberOfBooks() 
    {
        // String temp is for some reason needed. If it is not included
        // The code will not execute properly.
        String temp = keyboard.nextLine();
        Book s = null;
        System.out.println("Please enter the StudentEmail:");
        String numberOfBooks = keyboard.nextLine();
        // This can use the employeeName's constructor because java accepts the
        // parameters instead
        // of the name's.
        return numberOfBooks;

    }
//---------------------------------------------------------------------------------------
    
    
}

