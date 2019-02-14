package com.pluralsight.calcengine3;

public class Main {

    public static void main(String[] args) {


        Earth planet1 = new Earth();
        planet1.printEarth();

        // Test to see how to initialize opcode to 'a'
        //MathEquation testEquation = new MathEquation();
        //testEquation.execute();
        //System.out.print("Test = ");
        //System.out.println(testEquation.getResult());

        // define an array of math equation classes, still need to create the instances for each array member
        MathEquation[] equations_class = new MathEquation[4];
        // e.g. Flight lax1 = new Flight();

        /*
        // define each array instance
        equations_class[0] = new MathEquation();
        equations_class[1] = new MathEquation();
        equations_class[2] = new MathEquation();
        equations_class[3] = new MathEquation();

        //define each variable in each instance
        equations_class[0].leftVal = 100.0d;
        equations_class[0].rightVal = 50.0d;
        equations_class[0].opCode = 'd';

        equations_class[1].leftVal = 25.0d;
        equations_class[1].rightVal = 92.0d;
        equations_class[1].opCode = 'a';

        equations_class[2].leftVal = 225.0d;
        equations_class[2].rightVal = 17.0d;
        equations_class[2].opCode = 's';

        equations_class[3].leftVal = 11.0d;
        equations_class[3].rightVal = 3.0d;
        equations_class[3].opCode = 'm';

        //execute to do the math and print the result
        equations_class[0].execute();
        System.out.print("Result = ");
        System.out.println(equations_class[0].result);

        equations_class[1].execute();
        System.out.print("Result = ");
        System.out.println(equations_class[1].result);

        equations_class[2].execute();
        System.out.print("Result = ");
        System.out.println(equations_class[2].result);

        equations_class[3].execute();
        System.out.print("Result = ");
        System.out.println(equations_class[3].result);
        */

        // OR -- write a loop to do all of the above */

        // fill those equation classes with values using the create method below
        //equations_class[0] = create_eq_instance(100.0d, 50.0d, 'd');
        //equations_class[1] = create_eq_instance(25.0d, 92.0d, 'a');
        //equations_class[2] = create_eq_instance(225.0d, 17.0d, 's');
        //equations_class[3] = create_eq_instance(11.0d, 3.0d, 'm');

        // Use new constructors to initialize values
        equations_class[0] = new MathEquation('d',100.0d, 50.0d);
        equations_class[1] = new MathEquation('a',25.0d, 92.0d);
        equations_class[2] = new MathEquation('s',225.0d, 17.0d);
        equations_class[3] = new MathEquation('m',11.0d, 3.0d);

        for(MathEquation equation_loop : equations_class) {
            equation_loop.execute();
            System.out.print("Result = ");
            System.out.println(equation_loop.getResult());
        }

        // 20180716 Using Overloads
        System.out.println();
        System.out.print("*** Using Overloads ***");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble,rightDouble);
        System.out.print("Result with Double = ");
        System.out.println(equationOverload.getResult());


        // will this work with integers rather than doubles even tho double is specified in the execute method??
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload2 = new MathEquation('d');

        equationOverload2.execute(leftInt,rightInt);
        System.out.print("Result with Int = ");
        System.out.println(equationOverload2.getResult());

        // yes!  it works cuz integers get widened to doubles  -- but then we add an integer execute!

        // will this work with integers rather than doubles even tho double is specified in the execute method??
        int leftInt2 = 9;
        int rightInt2 = 4;

        MathEquation equationOverload3 = new MathEquation('d');

        equationOverload3.execute((double)leftInt2,rightInt2); // will choose two doubles
        System.out.print("Result with Int2 = ");
        System.out.println(equationOverload3.getResult());

        // 20180730 Using Overloads
        System.out.println();
        System.out.print("*** Using Inheritance ***");
        System.out.println();

        // declare an array of type Calculate Base
        CalculateBase[] calculators = {
            new Divider(100.0d, 50.0d),
            new Adder(25d, 92d),
            new Subtracter(225.0d, 17.0d),
            new Multiplier(11.0d, 3.0d),
        };

        for (CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.print("Result with Inheritance = ");
            System.out.println(calculator.getResult());
        }


    }




}
