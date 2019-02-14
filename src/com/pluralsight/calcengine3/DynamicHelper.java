package com.pluralsight.calcengine3;

public class DynamicHelper {
    private MathProcessing[] handlers; //stores a list of handlers that a given instance has access to

    //constructor accepts an array of handlers and stores inside class variable
    //so when we create an instance of this class we pass in an array of the handlers we want it to use
    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    //add a method that accepts a string to process and returns a string of results
    public String process(String statement) {
        // IN:  add 1.0 2.0
        // OUT:  1.0 + 2.0 = 3.0

        String[] parts = statement.split(MathProcessing.SEPARATOR);//split statement, use constant defined in interface
        String keyword = parts[0]; // add, first part of statement

        MathProcessing theHandler = null; //declare local variable of handler called type mathprocessing

        // go thru handlers, current handler and get keyword method does the statement match what we can handle?
        for (MathProcessing handler:handlers) {
            if(keyword.equalsIgnoreCase(handler.getKeyword())){
                theHandler = handler;
                break;
            }
        }

        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);

        double result = theHandler.doCalculation(leftVal, rightVal);
        StringBuilder sb = new StringBuilder(20);

        sb.append(leftVal);
        sb.append(' ');
        sb.append(theHandler.getSymbol());
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);
        return sb.toString();
    }


}
