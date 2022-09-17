package com.example.dataTypes;

/**
 * !!!!  Be aware
 * Java syntax is CASE SENSITIVE :
 * 'int' is not the same as Int
 * <p>
 * ****  variables  ****
 * --- variable declaration --
 * Data type  identifier ;
 * <p>
 * -- variable assignment --
 * identifier = value  ;
 * '=' is called  assignment operator moves from right to left
 * you can initialize a variable and assign it in  one step
 * int x = 10 ;
 * then you only refer to the variable with its identifier
 * x =20 ; changes the value of x from 10 to 20
 * <p>
 * Example data types :
 * int  -> numbers without floating pensions , 4 bytes
 * long -> numbers without floating pensions , 8  bytes
 * float -> numbers with floating pensions  , 8 bytes
 * double -> numbers with floating pensions  , 8 bytes
 * boolean -> true or false value  -> 1 byte
 * char  -> only one character  -> 1 byte
 */
public class Variables {

    // global variable
    static char firstChaInName ;


    public static void main(String[] args) {
        // local variables live until the function executes !


        boolean isAbsent = false;
        int peopleInTheRoom;
        float bodyTemperature = 37.6f;   // the 'f' indicates value is float and not double

        long initValue = 0L ;           // guess why we used the 'L' ???

        peopleInTheRoom = 20;

        firstChaInName = 'R';


    }

}
