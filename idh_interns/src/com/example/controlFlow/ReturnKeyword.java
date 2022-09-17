package com.example.controlFlow;

public class ReturnKeyword {

    public static void main(String[] args) {
        // return keyword will return the control
        // to the caller

        int someNumber = 5;
        boolean isPositive = someNumber >= 0;
        if (isPositive) {
            System.out.println("Number is +ve");
            return;
        }
        // this part of the code is unreachable if the
        // number is positive
        System.out.println("Number is -ve");
    }

}
