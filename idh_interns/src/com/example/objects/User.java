package com.example.objects;



/**
 * classes are designed to behave as the predefined
 * data types in the language .
 *
 * they are the blueprint for there instances!
 *
 * use keyword 'class' to define a the type
 *
 * public , private , .. are called the access modifiers
 * they control which part of the class to be visible
 *
 */
public class User {


    // class members

    // age is not accessible
    private  int age ;
    public String email ;
    public String name;


    // by default if we didn't specify a constructor
    // java offers empty constructor
    // constructors are function responsible for the creation
    // of the "object"
    public User(int age, String email, String name) {
        this.age = age;   // this refers to -> (current instance age)
        this.email = email;
        this.name = name;
    }


    // class methods
    public int getAge(){
        return this.age;
    }

    // static members / methods are associated with the class
    // itself and not a particular instance thus
    // you cannot access a non-static elements from static context
    // but the opposite is true
    private static int initializationCounts =0;

    public static void emptyFunction(){
       //  String tempName = name;     // compilation error
    }


    public User() {
        initializationCounts++;
    }



}
