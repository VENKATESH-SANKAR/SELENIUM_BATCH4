package interview_String_Program;

public class CharCount {

	public static void main(String[] args) {
        // Example string
        String inputString = "Java programming is fun and Java is versatile.";

        // Character to count
        char charToCount = 'a';

        // Count the occurrences of the character
        int charCount = countOccurrences(inputString, charToCount);

        // Print the result
        System.out.println("Number of occurrences of '" + charToCount + "': " + charCount);
    }

    // Method to count the occurrences of a character in a string
    static int countOccurrences(String input, char character) {
        // Replace all occurrences of the character with an empty string
        String modifiedString = input.replaceAll(String.valueOf(character), "");

        // Calculate the difference in length to get the count
        return input.length() - modifiedString.length();
    }
}
