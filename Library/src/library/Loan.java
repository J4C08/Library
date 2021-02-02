
package library;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Loan implements Serializable {
    
    private static final long serialVersionUID = 3100732459499690237L;
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
    
   @Override
     public String toString() 
    {
        return 
             "---------------------------Loan history---------------------------" +
                "\nDate of loan: " + dateOfLoan + 
                "\nDate of return: "+ dateOfReturn+"\n\n";

    }

    
}
