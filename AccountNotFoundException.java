package Bank;

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
    	super(message);
       String unfound  ="Account not found.";
       message = unfound;
        
    }
}
