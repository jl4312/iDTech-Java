# Variables

Variables are the primary means of storing information (data) in any program. A variable can be any object (objects are defined in more detail in later lessons) that you define but we will restrict this lesson to some of the basic variable types in Java (you can read more about variables [here](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html) and [here](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)). A variable type is formally known as a **data type**. The syntax for creating (defining) a variable is as follows (see the [code](https://github.com/RamV13/iDTech-Java/blob/master/Lesson%202/Code.java) for more on the syntax and how to use variables):
```Java
<Data Type> <Variable Name>;
```
Ex. 
```Java
int num;
```
Here `int` is the variable type or data type. The following is a list of common Java data types:

**int** - stores integers (i.e. numbers that can be written without a fractional component)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.g. -1, 0, 5, 13, -47

**double** - stores decimal numbers

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.g. -1.3, 0.21, 5.0, 13.5, -47.100001

**float** - stores decimal numbers (less precise than the `double` data type but uses less memory)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.g. -1.3, 0.21, 5.0, 13.5, -47.100001

**boolean** - stores a **true** or a **false**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.g. true, false

**char** - stores a single character

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.g. a, ~, b, z, @

**String** - stores a sequence of characters (or text)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.g. hello, name, cool, Java, &1snn, !#hi

The lowercased data types are called **primitives** and they exhibit some special properties which will be discussed in the methods lesson. Although the `String` data type is not a primitive it is included in this list because it is very useful and often exhibits the same properties as primitives.

Note that these data types are all instances of what is formally known as a **reserved word** which means that you cannot use these data types as the names for any variable. Java cannot interpret this.

Ex.
```Java
int int;
```
```Java
double boolean;
```

In general variables should start with lowercase letters. You can read more about conventions for variable naming [here](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html). Please look into CamelCase as it is one of the most important aspects of naming in Java.
