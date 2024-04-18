package project1;
import java.util.Scanner;
public class Perfectnumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=n/2) 
		{
			if(n%i==0) 
			{
				sum=sum+i;
			}
			i++;
		}
		if(n==sum) {
			System.out.println("This is a perfect number.");
		}
		else {
			System.out.println("This is not a perfect number.");	
		}

	}

}
