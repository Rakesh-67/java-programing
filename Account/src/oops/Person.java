package oops;
import java.util.Scanner;
public class Person {
	String Name;
	int age;
	
	public void setPerson() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name");
		Name=sc.nextLine();
		System.out.println("enter age");
		age=sc.nextInt();
		
	}
	public void getPerson() {
		System.out.println("Name:"+Name);
		System.out.println("age:"+age);
	}
	public Person(String name, int age) {
		
		Name = name;
		this.age = age;
	}

}
