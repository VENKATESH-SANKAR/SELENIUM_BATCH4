package interview_String_Program;

public class RemoveSpaces {

	public static void main(String[] args)
    {
        String str = "Java   programming   is    fun   and  Java  is  versatile";
 
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
 
        System.out.println("String without Spaces: " + str);
    }
}
