package com.example.objects.principles;


/**
 * Inheritance and Polymorphism
 *
 */
public class Main {

    /**
     * the class #[NegativeNumberException] behaved exactly like
     * a #[RuntimeException] this due to "Inheritance".
     * It also can be considered a #[RuntimeException]
     * this is due to "Polymorphism"
     */
    public static int getAgeInYears(int birthYear){
        if(birthYear<0)
             throwRuntimeExceptions(new RuntimeException());

        return 2022 - birthYear;

    }

    /**
     * note how the throw keyword will stop the execution just like
     * the return statement
     * */
    public static void  throwRuntimeExceptions(RuntimeException r){
        throw r;
    }


    public static void main(String[] args) {

        try{
            int ageInYears =  getAgeInYears(1915);
            System.out.println("Your age is: "+ageInYears);

        }catch (NegativeNumberException n){
            System.out.println("Invalid Input");
        }

    }
}
