# Conditionals

#### Boolean

What exactly is a **boolean**? This data type was briefly mentioned in the [Variables](https://github.com/RamV13/iDTech-Java/blob/master/Lesson%202/Guide.md) lesson. A boolean is used to keep track of logic in your programs. So a boolean variable can only hold one of two values: **true** and **false**.

Ex.
```Java
boolean gameStarted = false;
// do some stuff to start the game here ...
gameStarted = true;
```

#### Boolean Operators

The following operators provide ways to manipulate boolean variables and compare numbers. They are used very similar to the arithmetic operators covered in the [previous lesson](https://github.com/RamV13/iDTech-Java/blob/lesson4/Lesson%203/Guide.md).

- `!`: not (inverts the value of a boolean i.e. converts true to false and vice versa)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ex. `!false // true`

- `==`: equal to

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ex. `1 == 1 // true`

- `!=`: not equal to

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ex. `1 != 1 // false`

- `>`: greater than

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ex. `1 > 1 // false`

- `>=`: greater than or equal to

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ex. `1 >= 1 // true`

- `<`: less than 

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ex. `1 < 5 // true`

- `<=`: less than or equal to

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ex. `1 <= 5 // true`

#### If Statements

**If statements** are a way of checking the values of boolean variable(s) and executing some block of code based on these values. The syntax is as follows:

```Java
boolean b = true;
if (b) {
  // do this block of code when b is true
} else {
  // do this block when b is not true
}
```

You can also combine boolean operators and arithmetic operators with if statements as follows ....

```Java
boolean b = (1 != 2) || (1 == 1); // true
if (b && (1 != 2 % 2)) {
  // do this block of code when the statement evaluates to true
} else {
  // do this block of code when the statement evaluates to false
}
```

#### Switch Statements

**Switch statements** are another way of checking the values of not just boolean variable(s) but other primitive types of variables as well and executing some block of code based on these values. The syntax is as follows:

```Java
int num = 1;
switch(num) {
case 1: // do this when num is 1
  break;
case 2: // do this when num is 2
  break;
// ... add whatever cases you need
default: // do this when num is none of the above
  break;
}
```

It is important to remember to include the `break` statement along with each `case` statement so Java knows where to stop running the switch statement. You can read more about switch statements [here](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html).
