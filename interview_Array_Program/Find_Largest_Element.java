package interview_Array_Program;

public class Find_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initializing the array 
		int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  

	}

}
