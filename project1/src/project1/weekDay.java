package project1;

import java.util.Scanner;

public class weekDay {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		 int day;
		 System.out.println("enter day in number:");
		 day = sc.nextInt();
		 String dayName;
		 switch(day) {
		 case 1:
			 dayName = "monday";
			 break;
		 case 2:
			 dayName = "tuesday";
			 break;
		 case 3:
			 dayName = "wednessday";
			 break;
		 case 4: 
			 dayName = "thursday";
			 break;
		 case 5:
			 dayName = "friday";
			 break;
		 case 6:
			 dayName = "saturday";
			 break;
		 case 7:
			 dayName = "sunday";
			 break;
		default :
			dayName = "invalid day number";
			 }
		System.out.println(dayName);
		 
	}

}
