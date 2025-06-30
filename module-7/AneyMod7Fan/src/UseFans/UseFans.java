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

import java.util.ArrayList;

// The UseFans class creates a collection of Fan instances and displays their properties.

public class UseFans {

/*
* Displays the properties of a single Fan instance (without using toString()).
* @param fan The Fan object to display.
*/    

    public static void displayFan(Fan fan) {
        System.out.println("Fan Info:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("-------------------");
    }

/*
* Displays the properties of all Fan instances in a collection.
* @param fans The list of Fan objects to display.
*/

    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

/*
* Main method to test Fan functionality.
* Creates several Fan objects, adds them to a collection, and displays them.
*/

    public static void main(String[] args) {
        ArrayList<Fan> fanList = new ArrayList<>();

// Create and customize first Fan
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setOn(true);
        fan1.setColor("blue");
        fan1.setRadius(10.0);

// Create and customize second Fan
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.SLOW);
        fan2.setOn(false);
        fan2.setColor("green");
        fan2.setRadius(7.5);

// Create third Fan with default values
        Fan fan3 = new Fan();  // default values

// Add all fans to the collection
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

// Display all fans in the collection        
        displayFans(fanList);
    }
}
    
