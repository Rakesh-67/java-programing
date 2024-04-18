package project1;

public class Small1 {

	public static void main(String[] args) {
		int [] array = new int [5];
		double max = array[2];
		int index =1;
		for(int i=1;i<array.length;i++) {
			 System.out.print(array[i] + " ");
		}
    if(max<array[index]) {
    	max=array[index];
    	
      }
    System.out.println(max+"  "+ index);

	}

}
