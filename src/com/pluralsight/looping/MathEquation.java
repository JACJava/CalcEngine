package com.pluralsight.calcengine3;

public class MathEquation {

    /* public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;
    */

    private double leftVal;
    private double rightVal;
    private char opCode = 'a'; // initialize to a
    private double result;

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public double getOpCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}
    // Since result is created by this class, shouldn't be updated from outside the class
    public double getResult() {return result;}

    public MathEquation() {}; //constructor that doesn't take any arguments

    // constructor that accepts opcode
    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    // chains up to the prior constructor
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    public void execute(){
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }

}
