package com.pluralsight.calcengine3;

public abstract class CalculateBase {

    //act as a common point of inheritance

    private double leftVal;
    private double rightVal;
    private double result;

    // getters and setters for private variables
    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public double getResult() {return result;}
    public void setResult(double result) {this.result = result;}

    public CalculateBase() {};

    public CalculateBase (double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();  // must be inherited from -- must be empty





}
