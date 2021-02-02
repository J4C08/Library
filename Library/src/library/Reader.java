package library;

import java.io.Serializable;
import java.util.ArrayList;


public class Reader implements Serializable {
private static final long serialVersionUID = -2908137848364231871L;
    ArrayList<Loan> loanHistory = new ArrayList<Loan>();
    ArrayList<Book> loanBook = new ArrayList<Book>();
    private String name;
    private String surname;
    private int age;
    private String address;
    private String banned;
    private String PIN;

    public Reader(){
    }
    
    public Reader(String name, String surname, int age, String address, String banned, String PIN) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
            this.banned = banned;
            this.PIN = PIN;
    }
    // Gettery
    public String getName() {
            return name;
    }

    public String getSurname() {
            return surname;
    }

    public int getAge() {
            return age;
    }

    public String getAddress() {
            return address;
    }

    public String getBanned() {
            return banned;
    }
    
     public String getPIN() {
            return PIN;
    }
    // Settery
    public void setName(String name) {
            this.name = name;
    }
    
    public void setSurname(String surname) {
            this.surname = surname;
    }
    
    public void setAge(int age){
            this.age = age;
    }
    
    public void setAddress(String address){
            this.address = address;
    }
    
    public void setBanned(String banned){
            this.banned = banned;
    }
    
    public void setPIN(String PIN){
            this.PIN = PIN;
    }
    
    public void addBookBorrowed(Book b) {
        loanBook.add(b);
        
        }
    
    public void loan(Loan loan) {
        loanHistory.add(loan);
        
        }
    // toString.
@Override
     public String toString() 
    {
        return 
             "---------------------------Readers---------------------------" +
                "\nName: " + name + 
                "\nSurname: "+ surname + 
                "\nAge: "+ age + 
                "\nAddress: " + address +
                "\nBanned: " + banned +"\n\n";
                
    }
     
      
}
      


     



