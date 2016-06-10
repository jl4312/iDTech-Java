/**
 * Code for Lesson 3: Arithmetic Operators
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        
        // ADDITION
        
        /*
         * The following block of code defines two variables num1 and num2
         * and assigns the values 3 and 10 to them respectively.
         * Then a third variable num3 is defined and assigned the value of the
         * sum of the variables num1 and num2. Summing the variables num1 and
         * num2 essentially means the sum of the values of the two variables
         * (i.e. the sum of 3 and 10)   
         */
        int num1 = 3;
        int num2 = 10;
        int num3 = num1 + num2; // 3 + 10 = 13
        System.out.println("num3: " + num3);
        
        // SUBTRACTION
        
        /*
         * The following block of code defines two variables num4 and num5
         * and assigns the values 4 and 10 to them respectively.
         * Then a third variable num6 is defined and assigned the value of the
         * difference of the variables num4 and num5.
         */
        int num4 = 4;
        int num5 = 10;
        int num6 = num4 - num5; // 4 - 10 = -6
        System.out.println("num6: " + num6);
        
        // MULTIPLICATION
        
        /*
         * The following block of code defines three variables num7, num8, 
         * and num9 then assigns the values 3, 5, and 6 to them respectively.
         * Then a fourth variable num10 is defined and assigned the value of the
         * product of the variables num7, num8, and num9. Note that you can also
         * use an operator multiple times in an assignment.
         */
        int num7 = 3;
        int num8 = 5;
        int num9 = 6;
        int num10 = num7 * num8 * num9; // 3 x 5 x 6 = 90
        System.out.println("num10: " + num10);
        
        // DIVISION
        
        /*
         * The following block of code defines two variables num11 and num12
         * and assigns the values 8 and 4 to them respectively.
         * Then a third variable num13 is defined and assigned the value of the
         * division of the variable num11 by the variable num12.
         */
        int num11 = 8;
        int num12 = 4;
        int num13 = num11/num12; // 8 / 4 = 2
        System.out.println("num13: " + num13);
        
        // REMAINDER (MODULO)
        
        /*
         * The following block of code defines two variables num14 and num15
         * and assigns the values 8 and 4 to them respectively.
         * Then a third variable num16 is defined and assigned the value of the
         * remainder of the variable num14 divided by the variable num15.
         */
        int num14 = 9;
        int num15 = 4;
        int num16 = num14 % num15; // 9 % 4 = 1
        System.out.println("num16: " + num16);
        
        // INCREMENT BY 1
        
        /*
         * The following block of code defines a variable num17 and assigns the
         * value 2 to it. Then the number is incremented by 1.
         */
        int num17 = 2;
        num17++; // 2 + 1 = 3
        System.out.println("num17: " + num17);
        
        
        // DECREMENT BY 1
        
        /*
         * The following block of code defines a variable num18 and assigns the
         * value 2 to it. Then the number is decremented by 1.
         */
        int num18 = 2;
        num18--; // 2 - 1 = 1
        System.out.println("num18: " + num18);
        
        // COMBINING MULTIPLE OPERATIONS
        
        /*
         * The following block of code defines multiple variables and performs
         * a sequence of operations within a single assignment. Note that
         * parentheses can be used to enforce an order of operations.
         */
        int num19 = 1;
        int num20 = 3;
        int num21 = 13;
        int num22 = ((num20+num21)*5)/8 + num19*3; // ((3+13)*5)/8 + 1*3 = 13
        System.out.println("num22: "+num22);
        
    }
    
}
