package interview_Array_Program;

public class Print_2D_Array {
	
	    public static void main(String[] args) {
	        // Example 2D array
	        int[][] myArray = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	        };

	        // Call the method to print the 2D array
	        print2DArray(myArray);
	    }

	    // Method to print a 2D array
	    static void print2DArray(int[][] array) {
	        // Loop through each row
	        for (int i = 0; i < array.length; i++) {
	            // Loop through each element in the current row
	            for (int j = 0; j < array[i].length; j++) {
	                // Print the current element with a space for formatting
	                System.out.print(array[i][j] + " ");
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	


}
