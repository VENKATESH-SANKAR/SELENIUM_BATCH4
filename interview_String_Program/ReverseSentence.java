package interview_String_Program;

public class ReverseSentence {

	public static void main(String[] args) {
        // Example sentence
        String sentence = "Hello World Java Program";

        // Reverse the sentence word by word
        String reversedSentence = reverseWords(sentence);

        // Print the result
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    // Method to reverse a sentence word by word
    static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s");

        // Reverse the order of words
        StringBuilder reversedWords = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]).append(" ");
        }

        // Remove the trailing space
        return reversedWords.toString().trim();
    }
}
