package library;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Reader implements Serializable {
private static final long serialVersionUID = -2908137848364231871L;
    
    
    private String name;
    private String surname;
    private int age;
    private String address;
    private String banned;
    private String test;

    public Reader(String name, String surname, int age, String address, String banned, String test) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
            this.banned = banned;
            this.test = test;
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
    
    
    // toString.
     public String toString() 
    {
        return 
             "---------------------------Czytelnik---------------------------" +
                "\nImiê: " + name + 
                "\nNazwisko: "+ surname + 
                "\nWiek: "+ age + 
                "\nAdres: " + address +
                "\nZablokowany: " + banned +
                "\nWypo¿yczona ksi¹¿ka: " + test +"\n\n";
    }


}
