import java.util.Scanner; // this import statement enables us to use the Scanner

/**
 * Code for Lesson 1: Printing
 *
 * This defines a class which we will discuss in a later lesson
 */
public class Printing {

    /**
     * For all Java programs, the block of code within the curly braces below
     * is the first thing that runs when the program is run. This is called the
     * main method. The syntax is always 
     *      public static void main(String[] args)
     * followed by the curly braces.
     */
    public static void main(String[] args) {
        // The following line of code prints the message "Hello World!" to the 
        // screen. The double quotation marks around the Hello World! identify 
        // the characters as text.
        System.out.println("Hello world!");
        
        // the following line prints an empty line
        System.out.println();
        
        // the following line prints the message without a new line at the end
        System.out.print("Enter your name: ");
        
        // The following lines are a bit more complicated and you will 
        // understand this after reading the next couple of lessons.
        // Here, the program reads in your name and then says hello back to you!
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hello "+name+"!");
    }
    
}
