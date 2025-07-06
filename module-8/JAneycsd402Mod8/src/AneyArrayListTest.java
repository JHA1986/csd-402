/**
Jonah Aney July 6th, 2025 CSD-402 Module-8 M8 Programming Assignment

Create a class [yourName]ArrayListTest . Examples:

    TomArrayListTest
    SueArrayListTest
    CindyArrayListTest

Etc.
This class is to contain:

    A method that receives an ArrayList populated with an Integer data type holding the integers received from user input.
    The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
    The ArrayList is then to be sent to the method.
    The method is then to return the largest value in the ArrayList.
    If the ArrayList is sent in empty, the method will then return 0.
    The method signature is to be public static Integer max (ArrayList list).
    Write additional code for testing your method.
    The method will return the largest value that is displayed to the user.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class AneyArrayListTest {


// Method to find the maximum value in an ArrayList of Integers
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        
        Integer maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
    
// Main method to test the max method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Hello! Enter your numbers or enter 0 to finish:");
        int input;

// Loop to accept user input until 0 is entered
        do {
            System.out.print("Please enter a number: ");
            input = scanner.nextInt();
            numbers.add(input);
        } while (input !=0);
        
// Call the max method to find the largest number and display the largest value in the list
        Integer largest = max(numbers);
        
        System.out.println("The largest value is: " + largest);
    }
}
