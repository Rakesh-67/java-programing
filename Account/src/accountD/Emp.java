package accountD;
import java.util.Scanner;
public class Emp {
	int Empid;
	String EmpName;
	String designation;
	double salary;
	int Empage;
	public Emp() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter empid:");
		Empid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter EmpName:");
		EmpName=sc.nextLine();
		System.out.println("enter designation:");
		designation=sc.nextLine();
		System.out.println("enter salary:");
		salary=sc.nextDouble();
		System.out.println("enter Empage:");
		Empage=sc.nextInt();
	}
	
	public Emp(int Empid,String EmpName,String designation,double salary,int Empage) 
	{
		this.Empid=Empid;
		this.EmpName=EmpName;
		this.designation=designation;
		this.salary=salary;
		this.Empage=Empage;
		
		}
	public String toString()
	{
		return"{EmpId:"+this.Empid+",EmpName:"+this.EmpName+",Designation:"+this.designation+",Salary:"+this.salary+",age:"+this.Empage+"}";
		
	}
	
		
		
		
		
		
		
		
		
		
	
	

}
