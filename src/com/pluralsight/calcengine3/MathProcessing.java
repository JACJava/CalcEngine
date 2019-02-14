package com.pluralsight.calcengine3;

// An interface is a reference type in Java.  It is similar to class.  it is a collection of abstract methods.
// A class implements an interface, thereby inheriting the abstract methods of the interface.
// Along with abstract methods, an interface may also contain constants, default methods, static methods, and nexted types.
// Interfaces are more flexible, because a class can implement multiple interfaces.  Since Java does not have multiple
// inheritance, using abstract classes prevents your users from using any other class hierarchy.
// In short, the main use of interfaces is to facilitate polymorphism.  Interfaces allo a class to behave like multiple types
// which is not possible without multiple inheritances of class.

// That's the interface, no implementations, it's just a contract.  Classes that implement this will conform to the
// MathProcessing contract, which means they have to identiry the keywords that they know how to work on, return back
// a symbol that will be used to produce the output, and then do the calculation that goes with that keyword.


public interface MathProcessing {

    String SEPARATOR = " ";
    String getKeyword(); // add
    char getSymbol(); // +
    double doCalculation(double leftVal, double rightVal);

}
