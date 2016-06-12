/**
 * Code for Lesson 5: Loops 
 */
public class Loops {
    
    public static void main(String[] args) {
        
        // The following block of code loops through the numbers 1 to 100
        // and prints all of them. Note that you do not need to include curly
        // braces for one line bodies of loops (just like if statements).
        for (int i = 1; i <= 100; i++)
            System.out.println(i);
        
        System.out.println("--------------------------------------------");
        
        // The following block of code loops through the numbers from 1 until
        // a number other than 50 that is divisible by 50 ... i.e. 100. Note
        // that 100 itself is not printed because the conditional in the while
        // loop statement evaluates to false ON 100 so the loop iteration
        // is not executed when count is 100.
        int count = 1;
        while(count % 50 != 0 || count == 50) {
            System.out.println(count);
            count++;
        } 
        
    }

}
