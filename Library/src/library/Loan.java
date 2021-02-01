
package library;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Loan implements Serializable {
   ArrayList<Loan> loans = new ArrayList<Loan>();

    private String dateOfReturn;
    private String dateOfLoan;
    
    public Loan(String dateOfLoan, String dateOfReturn) {
        this.dateOfLoan = dateOfLoan ;
        this.dateOfReturn = dateOfReturn;
    }
    
     
    public String getDateOfLoan() {
        return dateOfLoan;
    }

    public String getDateOfReturn() {
        return dateOfLoan;
    }
    
    public void setDateOfLoan(String dateOfLoan) {
        this.dateOfLoan = dateOfLoan;
    }
        
    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
    
    
    public void addLoan(Loan loan) 
    {
        loans.add(loan);
    }
    // TESTOWE
    public void printLoan() 
    {
       for (Loan b : loans) {
            System.out.println(b.toString());
        }
    }
    // TESTOWE
    public void wypozyczz(Loan b) {
        loans.add(b);
        }
    
   @Override
     public String toString() 
    {
        return 
             "---------------------------Wypo¿yczenie---------------------------" +
                "\nData wypo¿yczenia: " + dateOfLoan + 
                "\nData oddania: "+ dateOfReturn+"\n\n";

    }

    
}
