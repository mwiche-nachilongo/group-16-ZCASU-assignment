package Bank;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Repoinfo extends Exception {
	public String accountNumber;
	public static double initialBalance;
	 public String customerName;
       int accountType;	
       public Repoinfo (String accountNumber, double initialBalance, String customerName ) {
    	   this.accountNumber = accountNumber;
    	   Repoinfo.initialBalance = initialBalance;
    	   this.customerName = customerName;
    	   
    	   
       }
       
		 void accountinfo (){
			 System.out.printf(customerName, accountNumber, initialBalance);
	}
		 @SuppressWarnings("unused")
		public void createAccount()  throws IOException {
	    	 FileWriter Bankrepo = new FileWriter ("Bankrepository.txt");
	    	 Scanner read = new Scanner (System.in);
	        System.out.println("\n--- Create Account ---");
	        System.out.println("Enter account number: ");
	        String accountNumber = read.nextLine();
	        		Bankrepo.write(accountNumber);
	        String customerName = read.nextLine();
	        Bankrepo.write(customerName);
	        System.out.println("Enter initial deposit amounk (in K) for recored puposes"); 
	         double initialBalance =read.nextDouble();
	       System.out.println("Choose account type: ");
            System.out.println("1. Savings Account");
	        System.out.println("2. Current Account");
	        
	        int accountType = read.nextInt();
	       
	        
	        Bankrepo.close();
	        read.close();
	        if (accountType == 1) {
	            if ((initialBalance < 100 ) && (accountType == 1)) {
	            	Repoinfo o = new Repoinfo ( accountNumber,initialBalance, customerName);

	      	         throw new IllegalArgumentException(
	                        "A savings account requires an initial balance of at least K100.00."
	                );

	            }
	            if(accountType == 2) {
	            	Repoinfo o = new Repoinfo ( accountNumber,initialBalance, customerName);
	        } else {
	            throw new IllegalArgumentException("Invalid account type.");
	        }
	            
	        System.out.println("Account created successfully.");
	       
	        }
		 }
			        
			    
			  

			    private int getInitialbalance() {
					return 0;
				}

				public void displayAllAccounts() throws IOException {
					FileReader display = new FileReader ("Bankrepository.txt");
					Repoinfo o = new Repoinfo (accountNumber, accountType, accountNumber);
					 String  [] accounts = {null};
					String account1 = o.toString();
					accounts [0] = account1;
					while (accounts != null) {
				    String accountdetails = o.toString();
				    System.out.println("The account details are as stated below");
				System.out.println(accountdetails);
				display.close();
				
					}
			   
			    }
				
				public void transferFunds() 
	            {
					Scanner find = new Scanner (System.in);
					System.out.println("\n--- Transfer Funds ---");
	   	System.out.println("Enter sender account number: ");
	       String fromAccount = find.next();
	       System.out.println("Enter receiver account number: ");
	       String toAccount =find.next();
	       System.out.println("Enter amount to transfer (K): ");
	       double amount = find.nextDouble();
	       find.close();

	        if (fromAccount.equalsIgnoreCase(toAccount)) {
	            throw new IllegalArgumentException("Source and destination accounts must be different.");
	        }
	        double sender = getInitialbalance() - amount;
	        double reciever = getInitialbalance() + amount;
	        
	        System.out.printf("Transfer  of K%d successful.", reciever);
		       System.out.printf(
		               "Sender's new balance: K%.2f%n" + sender);
		     
	       
	    }

	

	   public  void checkBalance() throws AccountNotFoundException, IOException {
		   Scanner checker = new Scanner (System.in);
		   FileReader readme = new FileReader ("Bankrepository.txt");
	       System.out.println("\n--- Check Balance ---");
	       System.out.println("Enter account number: ");
	       String accountNumber = checker.next();
	       if (accountNumber.equalsIgnoreCase(readme.toString())) {
	       System.out.printf("%s (%s) balance: K%.2f%n", readme.getClass());
	       readme.close(); 
	       checker.close();
	   } 
	   }

	   public  void searchAccount() throws AccountNotFoundException {
		   Scanner searcher = new Scanner (System.in);
	       System.out.println("\n--- Search Account ---");
	       System.out.println("Enter account number: ");
	       String accountNumber = searcher.next();
	       System.out.println(searcher.findInLine(accountNumber));
	       searcher.close();
	   }

	   public void updateCustomerName() throws AccountNotFoundException, IOException {
		   Scanner updater = new Scanner (System.in);
		   FileReader finr = new FileReader ("Bankrepository.txt");
	       System.out.println("\n--- Update Customer Name ---");
	       System.out.println("Enter account number: ");
	       String accountNumber = updater.next();
	      if ( accountNumber.contains(finr.toString())) {
	       System.out.println("Enter new customer name");
	       String newName = updater.next();
	       String customerName = newName;
	       Repoinfo o =  new Repoinfo (accountNumber, initialBalance, customerName );
          System.out.println("Customer name updated successfully," +o);
          updater.close();
          finr.close();
	   }
	   }

	   public static void deleteAccount() throws AccountNotFoundException {
		   Scanner deleter = new Scanner (System.in);
	       System.out.println("\n--- Delete Account ---");
	       System.out.println("Enter account number: ");
	      String accountNumber = deleter.next();
	    accountNumber.replaceAll(accountNumber, null);
         Repoinfo.deleteAccount();
	       System.out.println("Account deleted successfully.");
	       deleter.close();
	   }
	   
	 public void withDraw () throws   AccountNotFoundException, InsufficientFundsException, IOException {
		 Scanner withdraw = new Scanner (System.in);
		 FileWriter write = new FileWriter ("Bankrepository");
		 FileReader bankrecs = new FileReader ("Bankrepository.txt");
		 System.out.println("hELLO!");
		 System.out.println("Enter amount you wish to withdraw");
		 double amount = withdraw.nextDouble();
		 String nameRecs = bankrecs.toString();
	     System.out.println("Enter account holder name: ");
	     String customerName = withdraw.nextLine();
	     if (customerName.equalsIgnoreCase(nameRecs)) {
	    	 double remainingBal = initialBalance - amount;
		 System.out.println("Thank you!");
		 Repoinfo o = new Repoinfo(accountNumber, remainingBal, accountNumber);
		 String newAccounts = o.toString();
		write.write(newAccounts);
		System.out.println("Remaining balance below");
		System.out.println(remainingBal );
		write.close();
		withdraw.close();
		bankrecs.close();
	     }
	
	}

}


	    
	  
		 

		 
	   

	  
	       

	  
		    


		
	 
	 
	

	
	
	
	 
