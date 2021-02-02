package library;

//---------------------------------------------------------------------------------------
//  Name:           Imports. 
//  Description:    To allow the use of different Java classes.
//---------------------------------------------------------------------------------------
import java.util.InputMismatchException;
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
        boolean OK;
        int publishingYear = 0;
        System.out.println("Please enter the name book:");
        String nameBook = keyboard.nextLine();
        System.out.println("Please enter the author:");
        String author = keyboard.nextLine();
        System.out.println("Please enter the publisher:");
        String publisher = keyboard.nextLine();
        do{
         try {
            OK = true;
            System.out.println("Please enter the publisher year:");
            publishingYear = keyboard.nextInt();
            } catch (InputMismatchException e) {
           
            OK=false;keyboard.nextLine();
            }
        }while(!OK || String.valueOf(publishingYear).length() != 4);
        
        

        
        return s = new Book(nameBook, author, publisher, publishingYear);

    }

//---------------------------------------------------------------------------------------
//  Name:        userInputByName.
//  Description: This method is used in the MainApp to give the user capability to search by name.
//---------------------------------------------------------------------------------------
 public static String userInputBookName() 
    {
        // String temp is for some reason needed. If it is not included
        // The code will not execute properly.
        String temp = keyboard.nextLine();
        String nameBook = keyboard.nextLine();

        return nameBook;

    }
 
  public static Reader userInputReader() 
    {
        boolean OK;
        Reader x = null;
        int age = 0;
        String PIN = null;
        System.out.println("Please enter the name:");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        
        System.out.println("Please enter the surname:");
        String surname = keyboard.next();
        keyboard.nextLine();
        do{
         try {
            OK = true;
            System.out.println("Please enter the age:");
            age = keyboard.nextInt();
            } catch (InputMismatchException e) {
           
            OK=false;keyboard.nextLine();
            }
        }while(!OK);
       
        keyboard.nextLine();
        System.out.println("Please enter the address:");
        String address = keyboard.nextLine();
        
        
        String banned = "NO";
        
         do{
         System.out.println("Please enter the PIN:"); 
         PIN = keyboard.next();
         }while(PIN.length() != 11);
        
        
        
       
        return x = new Reader(name, surname, age, address, banned, PIN);

    } 
    
    public static String userInputByPIN() 
    {
        // String temp is for some reason needed. If it is not included
        // The code will not execute properly.
       
        String PIN = null;
        
        do{
         System.out.println("Please enter the PIN:"); 
         PIN = keyboard.next();
         }while(PIN.length() != 11);

        return PIN;

    }

    
     public static String userInputAuthor() 
    {
        // String temp is for some reason needed. If it is not included
        // The code will not execute properly.
        
        String author = keyboard.nextLine();

        return author;

    }
 

  }
    


