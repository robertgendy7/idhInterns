package com.example.controlFlow;

public class IfStatement {


    public static void main(String[] args) {

        int someNumber = 5;
        boolean isPositive = someNumber >= 0;
        if (isPositive) {
            System.out.println("Number is +ve");
        } else {
            System.out.println("Number is -ve");
        }
    }
}
