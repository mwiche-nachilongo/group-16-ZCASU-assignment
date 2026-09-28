package Bank;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
    	 super(message);
    	
    	String insufficient  = "Funds not sufficient";
    	 message = insufficient;
       
    }
}
