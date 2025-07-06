/*
Jonah Aney 07/06/25 CSD-402 Module 9
For this assignment, you will create two different programs. Follow the instructions for each below.

    Program 1: Write a program that uses an ArrayList filled with a minimum of 10 Strings. Use a ‘for-each’ loop to print the ArrayList collection. 
Then ask a user which element they would like to see again. Then, attempt printing the element in a try/catch format which will result in the element being displayed. 
If the element value received is invalid, display a message that an Exception has been thrown displaying “Out of Bounds”. 
In this program, include the use of Autoboxing/Auto-Unboxing, working with a user String input.
    Program 2: Write a program to create a new file titled data.file, if the file does not exist. 
Then write to the new file, adding 10 randomly generated numbers, or append 10 randomly generated numbers to a previous file. 
Each integer is to be separated by a space. Close the file, then reopen the file and read the data from the file and display it.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jonah
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        
// Add 10 strings
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");
        words.add("Elderberry");
        words.add("Fig");
        words.add("Grape");
        words.add("Honeydew");
        words.add("Kiwi");
        words.add("Lemon");
        
// Print all elements using for-each loop
        System.out.println("Here are the elements in the list:");
        for (String word : words) {
            System.out.println(word);
        }
        
        Scanner scanner = new Scanner(System.in);
        
// Ask the user which index they want to see again
        System.out.print("Enter the index (0-9) of the element you want to see again: ");
        String input = scanner.nextLine();
        
        try {
// Auto-unboxing: converting String input to int
            int index = Integer.parseInt(input); // auto-unboxing from String to int
            
            String selectedWord = words.get(index);
            System.out.println("Element at index " + index + ": " + selectedWord);
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer index.");
        } finally {
            scanner.close();
        }
    }
}
    

