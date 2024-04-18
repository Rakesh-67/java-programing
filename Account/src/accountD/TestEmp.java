package accountD;

public class TestEmp {

	public static void main(String[] args) {
		Emp[] riki=new Emp[5];
		
		
		 riki[0] = new Emp(1,"Emp1","CEO",30000.00,50);
		 riki[1] = new Emp(2,"Emp2","VP",20000.00,30); 
		 riki[2] = new Emp(3,"Emp3","Manager",10000.00,30); 
		 riki[3] = new Emp(4,"Emp4","Junior Engineer",5000.00,40); 
		 riki[4] = new Emp(5,"Emp5","Senior Engineer",5000.00,30); 
	  for(int i=0;i<riki.length;i++) {
		  System.out.println(riki[i].toString());
	  }	
	  Emp[]age=TestEmp.showage(riki);
	  System.out.println("basdonage");
	  for(int i=0;i<age.length;i++) {
		  if(age [i]!=null)
		  {
			  System.out.println(age[i].toString());
		  }  
	  }
	  Emp[]salary=TestEmp.showsalary(riki);
	  System.out.println("basdonsalary");
	  for(int i=0;i<salary.length;i++) {
		  if(salary [i]!=null)
		  {
			  System.out.println(salary[i].toString());
		  }
	  }
	  Emp[]designation=TestEmp.showdesignation(riki);
	  System.out.println("basdonsalary");
	  for(int i=0;i<designation.length;i++) {
		  if(designation [i]!=null)
		  {
			  System.out.println(designation[i].toString());
		  }
	  }
	}

	public static Emp[] showdesignation(Emp[] riki) {
		Emp[] n= new Emp[ riki.length];
		for(int i=0;i<riki.length;i++) {
			if(riki[i].designation==("manager")) {
				n[i]=riki[i];
			}
		}
		return n;
	}

	public static Emp[] showsalary(Emp[] riki) {
		Emp[] n= new Emp[ riki.length];
		for(int i=0;i<riki.length;i++) {
			if(riki[i].salary==(5000)) {
				n[i]=riki[i];
			}
		}
		return n;
	}

	public static Emp[] showage(Emp[] riki) {
		Emp[] n= new Emp[ riki.length];
		for(int i=0;i<riki.length;i++) {
			if(riki[i].Empage==(30)) {
				n[i]=riki[i];
			}
		}
		return n;
	}
	
}