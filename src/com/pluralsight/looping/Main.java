package com.pluralsight.looping;

public class Main {

    public static void main(String[] args) {

/*
    int kVal = 5;
    int factorial = 1;


    // While Loop
    while(kVal > 1) {
        factorial *= kVal;
        kVal -= 1;
        System.out.println(factorial);
        System.out.println(kVal);
    }

    while(kVal > 1)
        factorial *= kVal--;
        System.out.println(factorial);
        System.out.println(kVal);



    //Do-While Loop, check condition at end of loop, will always execute one time

    int iVal = 5;

    do {

        System.out.print(iVal);
        System.out.print(" * 2 = ");
        iVal *= 2;
        System.out.println(iVal);

    } while(iVal < 100);

*/

    //For Loop, condition checked at loop
    /*
    int iVal = 1;

    while(iVal < 100) {
        System.out.println(iVal);
        iVal *= 2;
    }


     for (int iVal = 1; iVal < 100; iVal *=2) {
         System.out.println(iVal);
         System.out.println("hello");
     }


    float[] theVals = new float[3];

    theVals[0] = 10.0f;
    theVals[1] = 20.0f;
    theVals[2] = 15.0f;

    float sum = 0.0f;

    for (int i = 0; i < theVals.length; i++)
        sum += theVals[i];

    System.out.println(sum);



    float[] theVals = {10.0f, 20.0f, 15.0f};

    float sum = 0.0f;

    for (int i = 0; i < theVals.length; i++)
        sum += theVals[i];

    System.out.println(sum);


    float[] theVals = {10.0f, 20.0f, 15.0f};
    float sum = 0.0f;

    for(float currentval : theVals)
        sum += currentval;

    System.out.println(sum);


    int iVal = 11;

    switch(iVal % 2) {
        case 0:
            System.out.print(iVal);
            System.out.println(" is even");
            break;
        case 1:
            System.out.print(iVal);
            System.out.println(" is odd");
            break;
        default:
            System.out.println("oops it broke");
            break;
    }


    // parallel arrrays

    double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
    double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
    char[] opCodes = {'d', 'a', 's', 'm'};
    double[] results = new double[opCodes.length];

    for (int i = 0; i < opCodes.length; i++)
        if (opCodes[i] == 'a')
            results[i] = leftVals[i] + rightVals[i];

        else if (opCodes[i] == 's')
            results[i] = leftVals[i] - rightVals[i];

        else if (opCodes[i] == 'm')
            results[i] = leftVals[i] * rightVals[i];

        else if (opCodes[i] == 'd') {
            results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
        }
        else {
            System.out.println("Error - invalid opCode");
            results[i] = 0.0d;
        }

        for(double theResult : results) {
            System.out.print("Result = ");
            System.out.println(theResult);
        }
*/
    // parallel arrrays

    double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
    double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
    char[] opCodes = {'d', 'a', 's', 'm'};
    double[] results = new double[opCodes.length];

    for (int i = 0; i < opCodes.length; i++)
        switch (opCodes[i]) {

            case 'a':
                results[i] = leftVals[i] + rightVals[i];
                break;
            case 's':
                results[i] = leftVals[i] - rightVals[i];
                break;
            case 'm':
                results[i] = leftVals[i] * rightVals[i];
                break;
            case 'd':
                results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                break;
            default:
                System.out.println("Error - invalid opCode");
                results[i] = 0.0d;
                break;
        }

    for(double theResult : results) {
        System.out.print("Result = ");
        System.out.println(theResult);
    }



    }
}
