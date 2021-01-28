
public class Reader  {

    private String name;
    private String surname;
    private int age;
    private String address;
    private String banned;

    public Reader(String name, String surname, int age, String address, String banned) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
            this.banned = banned;
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
}
