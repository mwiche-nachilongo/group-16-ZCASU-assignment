package Bank;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


@SuppressWarnings("serial")
public class Bankingapp extends Repoinfo {
	

	public Bankingapp(String accountNumber, double initialBalance, String customerName) {
		super(accountNumber, initialBalance, customerName);
		this.accountNumber = accountNumber;
 	   try {
		Repoinfo.initialBalance = initialBalance;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 	   this.customerName = customerName;
 	   
	}

	@SuppressWarnings("static-access")
	public static void main(String [] args ) throws IOException, ArrayIndexOutOfBoundsException, InsufficientFundsException, AccountNotFoundException {
			FileWriter writeme = new FileWriter ("Bankrepository.txt");
			
		Scanner selector = new Scanner (System.in);

    
    System.out.println(" *****SELECT ONE OPTION AND ENTER OPTION NUMBER*****");
	System.out.println(" Option 1-----------------Create Account");
	System.out.println(" Option 2-----------------Update customer name");
	System.out.println(" Option 3-----------------Check balance");
	System.out.println(" Option 4-----------------Search Account");
	System.out.println(" Option 5-----------------Transfer money");
	System.out.println(" Option 6-----------------Delete account");
	System.out.println(" Option 7-----------------Display all my accounts");
	 System.out.println("Option 8-----------------Withdraw");
	 
	 int selection = selector.nextInt();
	   
	
	Scanner read = new Scanner (System.in);
	
	
	 
		
	Repoinfo o = new Repoinfo (null, 0, null);
     
		String process;
		
		switch (selection){
			case 1: 
				process = "Creating Account, follow prompts";
				System.out.println(process);
				
				o.createAccount(); 
				String accLine = o.toString();
				writeme.write(accLine);
		     break;
				
			case 2:
				process = "Updating customer name";
				System.out.println(process);
				o.updateCustomerName(); 
				String newAccline = o.toString();
				writeme.write(newAccline);
				break;
			case 3:
				process ="Checking balance";
				System.out.println(process);
				o.checkBalance();
				break;
			case 4: 
				process = "Searching accounts";
				System.out.println(process);
				o.searchAccount();
				break;
				
			case 5:
				 process = "Transferring funds";
				 System.out.println(process);
				 o.transferFunds();
	        break;
	 
		    case 6 :
				 process = "Deleting account";
				 System.out.println(process);
				 o.deleteAccount();
				 break;
				 
		    case 7 :
		     process = "Displaying all accounts";
		     System.out.println(process);
		    	o.displayAllAccounts();
		    	break;
		    case 8:
		    	process = "Withdrawing money";
		    	System.out.println(process);
		    	o.withDraw();
		    	break;
		}
		
	  read.close();
	  writeme.close();
	  selector.close();
	 
  
		}

	}


