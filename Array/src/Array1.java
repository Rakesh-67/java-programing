
public class Array1 {

	public static void main(String[] args) {
        int[] my_array =new int[] {10,20,30,40,50,60,70};
      
        int Index_position = 2;
        
       
        int newValue = 5;

       
		System.out.println("Original Array : " + my_array.toString()+',');     
        
      
        for (int i = my_array.length - 1; i > Index_position; i--) {
            my_array[i] = my_array[i - 1];
        }


        my_array[Index_position] = newValue;
        
      
        System.out.println("New Array: " +my_array.toString()+',');
    


	}

}
