
public class Small {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		
		
		    
		    for (int i = 0; i < array.length; i++) { 
		      System.out.print(array[i] + " "); 
		    } 

		    double max = array[0]; 
		    int indexOfMax = 0; 
		    for (int i = 1; i < array.length; i++) { 
		       if (array[i] > max) { 
		        max = array[i]; 
		        indexOfMax = i; 
		      } 
		    } 

		    System.out.println(max+" @ "+ indexOfMax);


	}

}
