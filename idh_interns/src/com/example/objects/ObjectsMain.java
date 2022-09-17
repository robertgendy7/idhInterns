package com.example.objects;



/**
 * classes will not run by themselves
 */
public class ObjectsMain {



    public static void main(String[] args) {


        // We get an instance out of the class when we instantiate it
        // we do so using the 'new' keyword + the constructor we want to use
        User someUser = new User(12, "user@domain.com","Zim");

        System.out.println(someUser.name);


        // compilation error 'age is private'
        // System.out.println(someUser.age);

        System.out.println(someUser.getAge());  // form of 'Encapsulation'
                                                // the class hides the age but we offer
                                                // but offers its own way to expose it



        // unlike the primitive types classes are reference types
        int x = 10;
        int y = x;  // copy the value from x to y;


        // they are the same thing
        User userRef = someUser;
        // a good visualization for this can be found at please check it:
        // click control and click on the link
        // https://www.realpythonproject.com/day9-pass-by-value-pass-by-reference-and-pythons-pass-by-object-reference/



    }
}
