package interview_String_Program;

public class RemoveVowels {

	public static void main(String[] args) {
        // Example string with vowels
        String inputString = "Hello, World!";

        // Remove vowels from the string
        String stringWithoutVowels = removeVowels(inputString);

        // Print the result
        System.out.println("Original String: " + inputString);
        System.out.println("String without Vowels: " + stringWithoutVowels);
    }

    // Method to remove vowels from a string
    static String removeVowels(String input) {
        // Use regular expression to remove vowels
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}
