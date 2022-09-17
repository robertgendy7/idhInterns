package com.example.dataTypes;



/**
 * Arrays are contiguous memory spaces
 *
 */
public class Arrays {


    public static void main(String[] args) {



        //  RAM at runtime
        // | address 0x10 || address 0x14 || address 0x18 || address 0x22 |
        // |      1       ||       2      ||     3        ||      4       |
        //
        //  ------------------------------------------------------------------
        //        ^
        //        |
        //       arr  is a pointer to the address of the first element in the array.

        int arr[] = {1,2,3,4};


        // also note that array spaces are 4 bytes apart
        // because this is an array of 'int' and each int is 4 bytes
        // if it was a char array. Array spaces will only be 1 byte apart. @see Variables
        // e.g ox10 ..  0x11 .. 0x12

        int arraySize = arr.length;  // returns 4

        int lastElement = arr[3];  // we start counting from zero
                                   // arr[4] -- Runtime Exception



    }
}
