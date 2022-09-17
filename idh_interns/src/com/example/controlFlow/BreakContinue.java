package com.example.controlFlow;

public class BreakContinue {


    public static void main(String[] args) {
        // break is like return for loops

        // this code will print only the first element
        // in the array

        int arr [] ={1,2,3,4,5};

        for (int i = 0; i <arr.length ; i++) {
            if(i > 0){
               break;
            }
            System.out.println(arr[i]);
        }
        System.out.println("===================== End of th first loop");

        // continue skips the current iteration
        // this code will skip  the first element
        // in the array

        for (int i = 0; i <arr.length ; i++) {
            if(i == 0){
                continue;
            }
            System.out.println(arr[i]);
        }

    }




}
