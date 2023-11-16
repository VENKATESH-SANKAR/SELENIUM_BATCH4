package interview_Array_Program;

import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        // Print the original arrays
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // Find and print common elements
        int[] commonElements = findCommonElements(array1, array2);
        System.out.println("Common Elements: " + Arrays.toString(commonElements));
    }

    // Method to find common elements in two arrays
    static int[] findCommonElements(int[] array1, int[] array2) {
        // Sort the arrays to simplify the comparison
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Calculate the maximum size of the common elements array
        int maxSize = Math.min(array1.length, array2.length);

        // Create a new array to store common elements
        int[] commonElements = new int[maxSize];

        // Initialize variables to track indices
        int index1 = 0, index2 = 0, indexCommon = 0;

        // Compare elements and store common elements in the new array
        while (index1 < array1.length && index2 < array2.length) {
            if (array1[index1] == array2[index2]) {
                commonElements[indexCommon++] = array1[index1];
                index1++;
                index2++;
            } else if (array1[index1] < array2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }

        // Create a trimmed array with the exact size of common elements
        return Arrays.copyOf(commonElements, indexCommon);
    }
}

