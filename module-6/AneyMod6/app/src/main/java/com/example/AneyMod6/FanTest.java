/*
Jonah Aney June 22nd, 2025 CSD-402 Module 6: Fan class
Write test code that creates two instances of the Fan class, one using the default constructor and the other using the argument constructor. 
Write code that displays the functionality of the Fan class methods.
*/

package com.example.AneyMod6;

public class FanTest {
// Main method to test the Fan class
    public static void main(String[] args) {
// Create a Fan object with custom values
        Fan testFan = new Fan(Fan.SLOW, false, 7.5, "green");
        System.out.println(testFan);

// Modify the Fan's properties
        testFan.setOn(true);
        testFan.setSpeed(Fan.FAST);
        testFan.setColor("red");

// Display the updated state
        System.out.println("After changes: " + testFan);
    }
}