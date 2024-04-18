package accountD;
import java.util.Scanner;
public class AccountDa {
  String AccountNum;
  String custName;
  Double AccountBal;
  Double Withdrawal;
  Double Deposite;
  public void setAccountDa() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Account Number :");
	  AccountNum=sc.nextLine();
	  System.out.println("Enter custName :");
	  custName=sc.nextLine();
	  System.out.println("Enter AccountBal:");
	  AccountBal=sc.nextDouble();
	  System.out.println("Enter withdrawal amount:");
	  Withdrawal=sc.nextDouble();
	  
	  if(AccountBal>=Withdrawal) {
		  AccountBal=AccountBal-Withdrawal;
		  System.out.println("show Accountbal:"+AccountBal);
		  
	  }
	  else  {
		  System.out.println("Your do not have Sufficent Balance");
	  }
	 
	  System.out.println("Enter Deposite Amount:"+Deposite);
	  Deposite=sc.nextDouble();
	  
		  
	  }
  
  // Main method
     public static void main(String[] dd) {
    	 // object of AccountDa class
    	 AccountDa aa = new AccountDa();
    	 aa.setAccountDa();
     }
     public void getAccountDa() {
    	System.out.println("Number:"+AccountNum);
    	System.out.println("Name:"+custName);
    	System.out.println("Ballance:"+AccountBal);
    	System.out.println("Amount:"+Withdrawal);
    	System.out.println("Amount:"+Deposite);

     }
	  
   }
		
		
	


