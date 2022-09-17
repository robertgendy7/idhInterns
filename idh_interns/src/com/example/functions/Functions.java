package com.example.functions;


/***
 * function deceleration :
 * [return data type]  identifier (parameter list) {
 *     // function logic
 *     return [return data type]
 * }
 *
 * parameter list is the list of variables that the function
 * receive as a parameter
 * function call :
 * identifier()
 *
 * if the function doesn't have a return type then it return 'void' type.
 *
 */
public class Functions {

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }


    public static void main(String[] args) {

        int someNumber = -33;

        int result = addTwoNumbers(4, someNumber);


        if (isPositive(result)) {
            System.out.println("Number is Positive !");
        }

        printValue(result);


    }


    public static void printValue(int value) {
        System.out.println("Value " + value);
    }


}
