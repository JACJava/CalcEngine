package com.pluralsight.calcengine3;

public class Main {

    public static void main(String[] args) {

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


        Earth planet1 = new Earth();
        planet1.printEarth();

    }


    /* Not needed anymore since we are now initializing with constructors
    // return back a new instance of mathequation (return type)
    public static MathEquation create_eq_instance(double leftVal, double rightVal, char opCode ) {

        MathEquation equation_here = new MathEquation();
        equation_here.setLeftVal(leftVal);
        equation_here.setRightVal(rightVal);
        equation_here.setOpCode(opCode);

        return equation_here;
    }
    */


}
