/*
Jonah Aney 07/06/25 CSD-402 Module 9
For this assignment, you will create two different programs. Follow the instructions for each below.

    Program 1: Write a program that uses an ArrayList filled with a minimum of 10 Strings. Use a ‘for-each’ loop to print the ArrayList collection. 
Then ask a user which element they would like to see again. Then, attempt printing the element in a try/catch format which will result in the element being displayed. 
If the element value received is invalid, display a message that an Exception has been thrown displaying “Out of Bounds”. 
In this program, include the use of Autoboxing/Auto-Unboxing, working with a user String input.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AneyProgram1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        
// Add 10 strings - Batman villains
        words.add("Joker");
        words.add("Penguin");
        words.add("Riddler");
        words.add("Two-Face");
        words.add("Scarecrow");
        words.add("Bane");
        words.add("Poison Ivy");
        words.add("Mr. Freeze");
        words.add("Mad Hatter");
        words.add("Killer Croc");
        
// Print all elements using for-each loop
        System.out.println("Here are the top 10 Batman villians:");
        for (String word : words) {
            System.out.println(word);
        }
        
        Scanner scanner = new Scanner(System.in);
        
// Ask the user which index (villian) they want to see again
        System.out.print("Enter the index (0-9) of the villian you want to see again: ");
        String input = scanner.nextLine();
        
        try {
// Auto-unboxing: converting String input to int
            int index = Integer.parseInt(input); 
            
            String selectedWord = words.get(index);
            System.out.println("Element at index " + index + ": " + selectedWord);
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number index.");
        } finally {
            scanner.close();
        }
    }
}
    

