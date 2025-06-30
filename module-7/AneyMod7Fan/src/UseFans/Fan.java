/*
Jonah Aney 06/26/25 CSD-402 Module 7: UseFans

Starting with your code from the Module 6 Programming Assignment, create the following new class titled UseFans:

    Create a collection of Fan instances.
    Create a method taking a collection of Fan instances for displaying without using the toString() method.
    Create a method that takes a single instance of a Fan for displaying without using the toString() method.
    Use the ‘this’ reference throughout the Fan class where allowed.
    Write test code that creates a collection of Fans and displays the functionality of all the Fan instances in the collection.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
@author Jonah
 */

package UseFans;

public class Fan {
// Constant values for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

// Instance variables for fan properties
    private int speed;
    private boolean on;
    private String color;
    private double radius;

// Default constructor initializing the fan with default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.color = "white";
        this.radius = 6.0;
    }

// Getter for speed    
    public int getSpeed() {
        return this.speed;
    }

// Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

// Getter for on/off state
    public boolean isOn() {
        return this.on;
    }

// Setter for on/off state
    public void setOn(boolean on) {
        this.on = on;
    }

// Getter for color
    public String getColor() {
        return this.color;
    }

// Setter for color
    public void setColor(String color) {
        this.color = color;
    }

// Getter for radius
    public double getRadius() {
        return this.radius;
    }

// Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}


