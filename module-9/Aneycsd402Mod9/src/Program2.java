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
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();
        
        try {
            // Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending data.");
            }
            
            // Write or append 10 random numbers to the file
            FileWriter writer = new FileWriter(file, true); // true = append mode
            
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100); // random number 0-99
                writer.write(number + " ");
            }
            
            writer.close();
            System.out.println("Successfully wrote numbers to the file.");
            
            // Read and display the data
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            System.out.println("Contents of the file:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            bufferedReader.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
    

