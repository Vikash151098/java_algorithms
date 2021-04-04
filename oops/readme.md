# Datatype in java 
primitive
non primitive

# Java Primitive datatype
boolean
byte
short
int 
long
float
double
char

# Non Primitive Datatype
classes
Interface
Array
String

## Note- instance  means object

# this Keyword
this is a Keyword which refers to current invoking Object. this keyword is used to access instance variable and instance methods . keyword cannot be used within the static context. i.e.., this keyword cannot be written within static method or static block.


# Variables
1. Globle Variable
    i) static variable/class variable
    ii) non static variable/instance variable
2. Local Variable


# Instance variable:
• A non static Global variable is called Instance Variable.
• Instance Variable is created in memory only when an Object gets created.
• Number of copies of each instance variable depends on number of objects.
• Instance Variable is stored inside an Object as a part of Heap memory.
If Instance variable is not initialized at the time of declaration then it is Initialized to a default value at the time of Object creation.

# Scope of Instance Variable:
An Instance Variable can be accessed throughout the class and also can be accessed outside class.
An Instance Variable can be accessed within same class by using this keyword.
Instance variable can be accessed outside class using Object reference.

# Static Variable:
A static variable is common to all the instances (or objects) of the class because it is a class level variable. In other words you can say that only a single copy of static variable is created and shared among all the instances of the class. Memory allocation for such variables only happens once when the class is loaded in the memory.

## syntax : static data_type  variable_name;

# Variable Shadowing
In java local variable and an instance variable can have same name , and in this case , inside local scope the local variable dominates over instance variable , and this concept is called Variable Shadowing.

# Constructor
## Rules
There are 3 rules defined for the constructor.
1. Constructor name must be the same as its class name
2. A Constructor must have no explicit return type
3. A Java constructor cannot be abstract, static, final, and synchronized

## Types
1. Default Constructor
2. Parameterized constructor


When Global & Local variable has same name…………

int price;
String color;
public Mobile(int price,String color ) {
this.price=price; // we have to assign this way
this.color =color;
}


# Methods
1. Abstract Method.
2. Concrete Method.

## Abstract Method
An Abstract Method is a Method which has only Method Declaration , But no method implementation.
Abstract Method must be terminated with semicolon.
Abstract method must be declared by using keyword called abstract.
Abstract method cannot have body.

abstract void meth();

abstract method |-------->abstract class
                |-------->Interface

## Concrete Method.
A Concrete Method is a method which has both declaration as well as implementation
void meth()
{
    // body ,logic , implementation
}

# Overloading
In Overloading we have 2 Types:
1. Method Overloading
2. Constructor Overloading

## Method Overloading
In a class when we have more than one method with same name but change in Signature is called as Method Overloading.
In Method Overloading we don’t consider Method return type.
### Advantage of method overloading
• Method overloading increases the readability of the program.
• To achieve compile time Polymorphism.
In a class when we have more than one method with same name and same Signature is called as Method Duplication.

Can we overload java main() method?
Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only.
## Constructor Overloading
In a class having more than one Constructor with change in Signature is called Constructor Overloading.


# INHERITANCE
Inheritance is a process of acquiring the properties or members(States & Behavior) of one class into another class.
Programmatically we can achieve Inheritance by using extends keyword.
Constructors cannot be inherited , rather only variable and methods get inherited
Note:Every class in java automatically extends the Super most class called Object.
Object class has 11 Concrete Methods.

final class cannot have a subclass i.e., Final class cannot be extended.
final variable & final method can be inherited but private method and private variable cannot be inherited

## Types of Inheritance:
1. Single Level inheritance
2. Multi Level inheritance
3. Hierarchical Level inheritance
4. Multiple Level inheritance -|_____ Not possible using class
5. Hybrid Level inheritance   -|

# Overriding
It is the the process of providing the subclass specific method implementation for an inherited method.

When a method from super class is inherited to subclass , in subclass we can change the method logic by keeping the same method declaration.
If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
Method overriding is possible only in case of Inheritance

## Usage of Java Method Overriding
• Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
• Method overriding is used for runtime polymorphism

## Rules for Method overriding
I. The return type of method must be same as declared in super class.
II. Method name must be same as declared in super class.
III. Signature must be same as declared as in super class. Logic can be different

## Note we can optionally use an annotation @Override.

## access modifier
1. private
2. default
3. protected
4. public

private Method cannot be Overridden , because it cannot be inherited.
Final method can be inherited but cannot be overridden.
The purpose of method overriding is to achieve Runtime Polymorphism.
Note: we can Overload main method , but we cannot override main method because it is static.

