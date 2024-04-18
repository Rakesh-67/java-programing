package project1;

public class Armstrong {

	public static void main(String[] args) {
		 int num=153;
		   int sum=0;
		   int temp=num; 
		  while(num!=0){
		    int digit=num%10;
		    sum=sum+(digit*digit*digit);
		    
		   }
		   if(sum==temp){
		   System.out.println("number is an armstrong");
		   }
		   else {
			System.out.println(" number is not an armstrong ");
		   }


	}

}
