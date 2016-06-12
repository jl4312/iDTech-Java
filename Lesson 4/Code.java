/**
 * Code for Lesson 4: Conditionals 
 */
public class Conditionals {
    
    public static void main(String[] args) {
        
        // the following line defines a boolean variable b which is set to the 
        // value true
        boolean b = true;
        
        // The following block of code uses the if statement to print 
        // "b is true" if b is actually true and "b is false" if b is false
        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }
        
        // The following block of code uses the if statement to print 
        // "b is true" if b is actually true and "b is false" if b is false.
        // Note that you do not need the curly braces for single line if statements.
        if (!b)
            System.out.println("b is false");
        else
            System.out.println("b is true");
        
        // The following block of code uses the switch statement on an integer
        // to see print different messages based on the number
        int num = 13;
        
        switch(num) {
        case 1: System.out.println("WOOHOO! num is 1");
            break;
        case 2: System.out.println("YES! num is 2");
            break;
        case 13: System.out.println("YAY! num is 13 (aka Nash's number)");
            break;
        default: System.out.println("BOOOOO! num is not 1, 2, or 13");
            break;
        }
        
        // The following block exhibits the same behavior as the switch
        // statement but uses an else-if part in addition to a normal if
        // statement.
        if (num == 1)
            System.out.println("WOOHOO! num is 1");
        else if (num == 2)
            System.out.println("YES! num is 2");
        else if (num == 13)
            System.out.println("YAY! num is 13 (aka Nash's number)");
        else
            System.out.println("BOOOOO! num is not 1, 2, or 13");
        
        // The following if statements use some boolean operators with if
        // statements and print appropriate messages.
        if (true)
            System.out.println("Of course true is true");
        else
            System.out.println("Since when is true not true");
        
        if (1 == 1)
            System.out.println("Of course 1 is equal to 1");
        else
            System.out.println("Huh? 1 is not equal to 1?");
        
        if (1 != 1)
            System.out.println("Huh? 1 is not equal to 1?");
        else // read this one carefully!
            System.out.println("Of course 1 is not not equal to 1");
        
        boolean b1 = 1 == 1; // true
        boolean b2 = false;
        if (b1 || b2)
            System.out.println("At least one of b1 and b2 is true");
        else
            System.out.println("Neither of b1 and b2 are true");
        
        if (b1 && b2)
            System.out.println("Both b1 and b2 are true");
        else
            System.out.println("At least one of b1 and b2 are false");
        
        if ((b1 || b2) || (!b1 && b2))
            System.out.println("EITHER one of b1 and b2 are true OR "
                    + "b1 is false and b2 is true");
        else
            System.out.println("b1 and b2 are both false AND "
                    + "either b1 is true or b2 is false");
        
    }

}
