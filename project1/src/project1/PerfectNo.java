package project1;
import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();
		int sum=0;
		int i=1;
	for(i=1;i<=n/2;	i++) {
		if(n%i==0) 
		{
			sum=sum+i;
		}
	
	}
		
	if(n==sum) {
		System.out.println("This is a perfect number.");
	}
	else {
		System.out.println("This is not a perfect number.");	
	}

	}
}