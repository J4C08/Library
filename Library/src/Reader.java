import java.io.Serializable;

public class Reader implements Serializable {
    private String name;
    private String surname;
    private int age;
    private String address;
    private String banned;
    public Reader(String name, String surname, int age, String address, String banned){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.address=address;
        this.banned=banned;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getBanned(){
        return banned;
    }
    
}
