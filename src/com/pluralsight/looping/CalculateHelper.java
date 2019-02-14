package com.pluralsight.calcengine3;

public class CalculateHelper {
    // one field to hold the command
    MathCommand command;
    double leftValue;
    double rightValue;
    double result;

    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';

    // accept input string and do the work to parse it out "add 1.0 2.0"
    public void process(String statement) {
        //add 1.0 2.0
        String[] parts = statement.split(" "); //string array called parts, which splits by space
        String commandString = parts[0]; // "add"
        leftValue = Double.parseDouble(parts[1]); // "1.0" then converted to a double
        rightValue = Double.parseDouble(parts[2]); // "2.0" then converted to a double

        setCommandFromString(commandString); //convert command from string to a mathcommand -- create setcommandfromstring

        CalculateBase calculator = null; //create local variable and then can reference any variable that derive from calculate base
        switch (command) {
            case Add: //only value inside of switch command
                calculator = new Adder(leftValue, rightValue);
                break;
            case Subtract:
                calculator = new Subtracter(leftValue, rightValue);
                break;
            case Multiply:
                calculator = new Multiplier(leftValue, rightValue);
                break;
            case Divide:
                calculator = new Divider(leftValue, rightValue);
                break;
        }

        calculator.calculate();  //will do actual operation
        result = calculator.getResult(); //store in result field

    }

    private void setCommandFromString(String commandString) {
        // take string value like "add" and convert it to MathCommand.Add

        if(commandString.equalsIgnoreCase(MathCommand.Add.toString())) //convert Add to string "Add", taking enum value and make string
            command = MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;

    }

    @Override
    public String toString() {
        // 1.0 + 2.0 = 3.0
        char symbol = ' ';
        switch (command) {
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(20);

        sb.append(leftValue);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);
        return sb.toString();
    }

}
