package interview_String_Program;

public class ReverseString {

	public static void main(String[] args)
    {
        //give a string input 
		String input = "HAPPY";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
    }
}
