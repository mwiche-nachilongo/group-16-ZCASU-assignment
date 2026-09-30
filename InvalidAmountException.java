package Bank;

public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
    	super(message);
    	String invalid  = "This ammount is not valid";
    	message = invalid;
        
    }
}
