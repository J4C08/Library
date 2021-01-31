package library;


    //---------------------------------------------------------------------------------------
//  Name:           Imports. 
//  Description:    To allow the use of different Java classes.
//---------------------------------------------------------------------------------------
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//---------------------------------------------------------------------------------------
public class MenuMethods {
    
    
    private static Scanner keyboard = new Scanner(System.in);
//---------------------------------------------------------------------------------------
//  Methods for the Library Application menu.
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
//  Description: This method is used in the Main to give the user capability to enter
//               the details when adding details of an employee into the store.
//---------------------------------------------------------------------------------------
    public static Book userInputBook() 
    {
        String temp = keyboard.nextLine();
        Book s = null;
        System.out.println("Please enter the name book:");
        String nameBook = keyboard.nextLine();
        System.out.println("Please enter the author:");
        String author = keyboard.nextLine();
        System.out.println("Please enter the publisher:");
        String publisher = keyboard.nextLine();
        System.out.println("Please enter the publisher year:");
        int publishingYear = keyboard.nextInt();
        System.out.println("Please enter the numer of books:");
        int numberOfBooks = keyboard.nextInt();
        
        return s = new Book(nameBook, author, publisher, publishingYear, numberOfBooks );

    }

//---------------------------------------------------------------------------------------
//  Name:        userInputByName.
//  Description: This method is used in the MainApp to give the user capability to search by name.
//---------------------------------------------------------------------------------------
 public static String userInputByBookName() 
    {
        // String temp is for some reason needed. If it is not included
        // The code will not execute properly.
        String temp = keyboard.nextLine();
        Book s = null;
        System.out.println("Please enter the Student Name:");
        String nameBook = keyboard.nextLine();

        return nameBook;

    }
 
  public static Reader userInputReader() 
    {
        String temp = keyboard.nextLine();
        Reader x = null;
        System.out.println("Please enter the name:");
        String name = keyboard.nextLine();
        System.out.println("Please enter the surname:");
        String surname = keyboard.nextLine();
        System.out.println("Please enter the age:");
        int age = keyboard.nextInt();
        System.out.println("Please enter the address:");
        String address = keyboard.nextLine();
        System.out.println("Please enter the publisher year:");
        String banned = null;
        System.out.println("Please enter the numer of books:");
        String PIN = keyboard.nextLine();
        
        return x = new Reader(name, surname, age, address, banned, PIN);

    }
  
    public static Book inputUserFindMatchingBooks(){
    String temp = keyboard.nextLine();
        Book s = null;
        System.out.println("Please enter the name book or type null:");
        String nameBook = keyboard.nextLine();
        System.out.println("Please enter the author or type null:");
        String author = keyboard.nextLine();
        System.out.println("Please enter the publisher or type null:");
        String publisher = keyboard.nextLine();
        System.out.println("Please enter the publisher year or type -1:");
        int publishingYear = keyboard.nextInt();
        System.out.println("Please enter the numer of books or type -1:");
        int numberOfBooks = keyboard.nextInt();
        
        return s = new Book(nameBook, author, publisher, publishingYear, numberOfBooks );
    }
 

  }
    


