package oops;

public class Dog {
	
	String name;
	String bread;
	
	
	public void setDog(String n,String b) {
	name=n;
	bread=b;
	}
	public void getDog() {
		System.out.println("dogname:"+name);
		System.out.println("dogbread:"+bread);
	}
	
	

	public static void main(String[] args) {
	Dog nalu=new Dog();
	nalu.setDog("dddd"," gghh");
	nalu.getDog();

	}

}
