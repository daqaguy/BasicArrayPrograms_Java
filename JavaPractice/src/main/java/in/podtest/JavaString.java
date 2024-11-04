package in.podtest;

public class JavaString
{
    public static void main(String[] args)
    {
        String name = "Java Programming";

        // Get the length of the string
        int length = name.length();
        System.out.println("Length: " + length); // Output: 16

        // Accessing individual characters
        char firstChar = name.charAt(0);
        System.out.println("First character: " + firstChar); // Output: J

        // Concatenating two strings
        String greeting = "Hello, ";
        String message = greeting.concat(name);
        System.out.println("Concatenated message: " + message);
        //Output: Hello, Java Programming

        // Substring of a string
        String substring = name.substring(5, 16);
        System.out.println("Substring: " + substring);
        // Output: Programming

        // Converting to uppercase
        String upperCaseName = name.toUpperCase();
        System.out.println("Uppercase: " + upperCaseName);
        //Output: JAVA PROGRAMMING

        // Checking if two strings are equal
        boolean isEqual = name.equals("Java Programming");
        System.out.println("Is equal: " + isEqual); // Output: true
    }
}
