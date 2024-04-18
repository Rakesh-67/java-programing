package project1;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
	int n;
	int temp=0;
	Scanner sc= new Scanner(System.in);	
	System.out.println("Enter a number: ");
	 n = sc.nextInt();
	for(int i = 1;i<=n;i++) {
	if( n%i==0) {
		temp++;
	} 
	}
	if(temp==2){
		System.out.println("The prime number is "+n);
	}
	else
	{
	  System.out.println("number is not a prime number");	
		
	}
	 
	
	 	
	

	}

}
