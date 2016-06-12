# Loops

**Loops** enable you to perform sections of code multiple times repeatedly without having to write thousands of lines of code. You might think why would I want to run the same exact block of code multiple times? However, it's important to remember that while the code itself is the same, the values of the variables that the code uses can change between each loop iteration which leads to different behavior. For example, you could have a simple print statement in a loop which prints a number but if that number is incremented by 1 on each loop iteration, then you have just created a program that prints the numbers 1 through 100!

#### For Loop
**For loops** are a type of loop that runs as long as a certain condition is true and performs a single line of code on each loop iteration (that piece of code is what causes the condition to eventually evaluate to false and terminates the loop). The syntax is as follows:

```Java
for (<Variable Declaration>; <Condition>; <Termination Code>) {
  // whatever code you want to loop
}
```
Ex.
```Java
// The following loop prints the numbers 1 through 100
for (int i = 1; i <= 100; i++)
  System.out.println(i);
```
```Java
for (int i = 1; i <= 100; i--) // INCORRECT! THIS LOOP WILL NEVER TERMINATE!
  System.out.println(i);
```

#### While Loop
**While loops** are a type of loop that runs as long as a certain condition is true but does not have a dedicated single line of code that runs on each loop iteration unlike for loops. The syntax is as follows:

```Java
while (<Condition>) {
  // whatever code you want to loop
}
```
Ex.
```Java
// The following has the same result as the first for loop above
int i = 1;
while (i <= 100) {
  System.out.println(i);
  i++;
}
```
```Java
while (true) { // AVOID THIS! THIS LOOP WILL NEVER TERMINATE!

}
```
