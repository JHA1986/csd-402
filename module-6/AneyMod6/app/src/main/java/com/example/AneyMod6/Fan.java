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

public class Fan {
// Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

// Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

/*
No-argument constructor.
Initializes the fan to STOPPED, off, radius 6, and color white.
*/
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

// Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

// Getters and setters
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public boolean isOn() { return on; }
    public void setOn(boolean on) { this.on = on; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

/*
Returns a string representation of the fan's state.
@return a description of the fan
*/
    @Override
    public String toString() {
        return "Fan [speed=" + speedToString() +
               ", on=" + on +
               ", radius=" + radius +
               ", color=" + color + "]";
    }

/*
Helper method to convert speed int to a readable string.
@return the speed as a string
*/
    private String speedToString() {
        switch (speed) {
            case STOPPED: return "STOPPED";
            case SLOW: return "SLOW";
            case MEDIUM: return "MEDIUM";
            case FAST: return "FAST";
            default: return "UNKNOWN";
        }
    }
}