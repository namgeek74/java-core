package com.helloworld.demo;

public class StaticExplain {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main() {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        StaticExplain myObj = new StaticExplain(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
    }
}
