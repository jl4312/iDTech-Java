/**
 * Code for Lesson 2: Variables
 */
public class Variables {

    public static void main(String[] args) {
        
        // INTEGER
        
        // the following line defines an integer variable named num
        int num;
        // the following line assigns the value 0 to the variable named num
        num = 0;
        // the following line defines an integer variable named mynum 
        // and assigns the value 1 to the variable
        int mynum = 1;
        
        // you can print integers as follows
        System.out.println(num);
        // you can add a message to the print statement as follows
        // the + simply concatenates the value of the variable num with the text
        System.out.println("The value of num is "+num);
        
        // DOUBLE
        
        // the following line defines a double variable named dub
        // and assigns the value 0.3 to the variable
        double dub = 0.3;
        
        // the following prints the value of dub
        System.out.println("dub: "+dub);

        // FLOAT
        
        // the following line defines a double variable named flt and assigns 
        // the value 0.3 to the variable (floats require an 'f' suffix)
        float flt = 0.3f;
        
        // the following prints the value of flt
        System.out.println("flt: "+flt);
        
        // BOOLEAN
        
        // the following line defines a boolean variable named bool and assigns
        // the value true to the variable
        boolean bool = true;
        
        // the following prints the value of bool
        System.out.println("bool: "+bool);
        
        // the following line defines a boolean variable named b and assigns
        // the value false to the variable      
        boolean b = false;
        
        // the following prints the value of b
        System.out.println("b: "+b);
        
        // CHAR

        // the following line defines a char variable named c and assigns the
        // value a to the variable (chars can only be a single character 
        // between single quotation marks)
        char c = 'a';
        
        // the following prints the value of c
        System.out.println("c: "+c);
        
        // STRING
        
        // The following lines defines a String variable named str and assigns
        // the value hello to the variable. Strings are not a primitive data
        // type unlike the other types above and are treated as objects in Java.
        // We will talk about what an object really is in later lessons.
        // (Strings must be defined with double quotation marks)
        String str = "hello";
        
        // the following prints the value of str
        System.out.println("str: "+str);
        
    }
    
}
