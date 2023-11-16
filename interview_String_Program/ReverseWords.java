package interview_String_Program;

public class ReverseWords {

	    public static void main(String[] args) {
	        // Example string
	        String inputString = "Hello World Java Program";

	        // Reverse each word in the string
	        String reversedString = reverseEachWord(inputString);

	        // Print the result
	        System.out.println("Original String: " + inputString);
	        System.out.println("String with Reversed Words: " + reversedString);
	    }

	    // Method to reverse each word in a string
	    static String reverseEachWord(String input) {
	        // Split the string into words
	        String[] words = input.split("\\s");

	        // Reverse each word
	        StringBuilder reversedWords = new StringBuilder();
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedWords.append(reversedWord.reverse()).append(" ");
	        }

	        // Remove the trailing space
	        return reversedWords.toString().trim();
	    }
	}


