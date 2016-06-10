# Printing

Printing is the simplest way of outputting something from your program for you to see. The line of code for printing any message is as follows:
```Java
System.out.println("Your Message");
```

The double quotation marks around `Your Message` identify the characters as text. This is called a `String` which we will discuss in more detail in the following lesson. Without these quotation marks the line of code will not work because Java cannot recognize `Your message` as text. Additionally, for those of you familiar with `Javascript`, single quotation marks will not work either. Any text in Java must be surrounded by double quotation marks.

Some syntax notes:

- Every line of Java code should end in a semicolon (`;`) unless it ends in curly braces (i.e. `{` or `}`)
- Java does not recognize any characters on the same line following `//` and the `//` is used to write notes within the code for the programmer or others looking at the code. These are called comments. It is VERY VERY VERY useful to write these comments because good documentation helps you, the programmer, and helps others when they are looking at your code and trying to help you. 
- A way to write multiline comments is by using `/*` to start the comment and `*/` to end it (see the [code](https://github.com/RamV13/iDTech-Java/blob/master/Lesson%201/Code.java) for an example of this). Note that whenever a `/**` is used to begin the comment, this is used for `Javadoc` which you can read more about [here](https://en.wikipedia.org/wiki/Javadoc).
