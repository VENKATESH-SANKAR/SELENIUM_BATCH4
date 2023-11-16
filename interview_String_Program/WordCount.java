package interview_String_Program;

import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
        // Example string
        String inputString = "This is a sample sentence.";

        // Count the number of words
        int wordCount = countWords(inputString);

        // Print the result
        System.out.println("Number of words in the string: " + wordCount);
    }

    // Method to count the number of words in a string
    static int countWords(String input) {
        // Using StringTokenizer to count words
        StringTokenizer tokenizer = new StringTokenizer(input);
        return tokenizer.countTokens();
    }
}
