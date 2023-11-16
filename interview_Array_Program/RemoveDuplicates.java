package interview_Array_Program;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Example array with duplicates
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 3};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Remove duplicates from the array
        int[] uniqueArray = removeDuplicates(array);

        // Print the array after removing duplicates
        System.out.println("Array After Removing Duplicates: " + Arrays.toString(uniqueArray));
    }

    // Method to remove duplicates from an array
    static int[] removeDuplicates(int[] array) {
        // Sort the array to bring duplicate elements together
        Arrays.sort(array);

        // Count the number of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueCount++;
            }
        }
        uniqueCount++; // Increment for the last element

        // Create a new array to store unique elements
        int[] uniqueArray = new int[uniqueCount];

        // Copy unique elements to the new array
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueArray[index++] = array[i];
            }
        }
        uniqueArray[index] = array[array.length - 1]; // Copy the last element

        return uniqueArray;
	}

}
