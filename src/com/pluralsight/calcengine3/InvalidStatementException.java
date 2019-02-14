package com.pluralsight.calcengine3;

public class InvalidStatementException extends Exception {//all exception classes extend Exception, only have constructors inside

    public InvalidStatementException(String reason, String statement) {//takes two values reason and statement
        super(reason + ":  " + statement);//calls superclass constructor that accepts a string
    }

    public InvalidStatementException(String reason, String statement, Throwable cause) {//normally two constructors, one that lets us associate another exception with it
        super(reason + ":  " + statement, cause); //pass to base class constructor
    }

    //add in appropriate error checks



}
