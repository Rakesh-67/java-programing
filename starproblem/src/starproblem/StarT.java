package starproblem;

public class StarT {

	public static void main(String[] args) {
  int x=5;
  for(int i=1;i<=x;i++) {
	  for( int j=i;j<=x;j++) {
		System.out.println(" ");  
	  }
	  for(int j=1;j<i;j++) {
		  System.out.println("@");
	  }
	  for(int j=1; j<=i;j++) {
		  System.out.println("@");
	  }
	  }
    System.out.println();
	}

}
