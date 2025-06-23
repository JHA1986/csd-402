/*
Jonah Aney June 22nd, 2025 CSD-402 Module 6: Fan class

Write a program with a class titled Fan. This class is to contain:

    Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3 respectively. 
    A private field named speed that holds one of the constant values with the default being STOPPED. 
    A private Boolean field titled on that specifies whether the fan is on or off. 
    A private field named radius that holds the radius of the fan with a default value of 6. 
    A String field that holds the color, with the default being white. 
    Setter and getter methods for all mutable fields. 
    A no-argument constructor that sets all fields with a default value. 
    A constructor takes arguments and sets values. 
    Write a toString() method that returns a description of the Fans state. 
    Write test code that creates two instances of the Fan class, one using the default constructor and the other using the argument constructor. Write code that displays the functionality of the Fan class methods.
 */
package com.example.AneyMod6;

/*
 The App class contains the main method to test and demonstrate the functionality
 of the Fan class.
 */

public class App {

/*
The main method creates two Fan objects (one with default values and one with custom values),
displays their state, modifies one Fan using setters, and prints the updated state and properties.
@param args Command-line arguments (not used)
*/
public static void main(String[] args) {
// Create two Fan objects
    Fan fan1 = new Fan(); // default constructor
    Fan fan2 = new Fan(Fan.FAST, true, 10, "yellow"); // argument constructor

// Display initial state
    System.out.println("Fan 1: " + fan1);
    System.out.println("Fan 2: " + fan2);

// Demonstrate setters and getters
    fan1.setSpeed(Fan.MEDIUM);
    fan1.setOn(true);
    fan1.setRadius(8);
    fan1.setColor("blue");

    System.out.println("Fan 1 after changes: " + fan1);
    System.out.println("Fan 1 is on? " + fan1.isOn());
    System.out.println("Fan 1 speed: " + fan1.getSpeed());
    System.out.println("Fan 1 radius: " + fan1.getRadius());
    System.out.println("Fan 1 color: " + fan1.getColor());
    }
}