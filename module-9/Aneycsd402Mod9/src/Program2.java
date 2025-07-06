/*
Jonah Aney 07/06/25 CSD-402 Module 9
For this assignment, you will create two different programs. Follow the instructions for each below.

    Program 2: Write a program to create a new file titled data.file, if the file does not exist. 
Then write to the new file, adding 10 randomly generated numbers, or append 10 randomly generated numbers to a previous file. 
Each integer is to be separated by a space. Close the file, then reopen the file and read the data from the file and display it.
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
            
// Write or append 10 random numbers to the file. True = append mode
            FileWriter writer = new FileWriter(file, true);
            
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100); 
                writer.write(number + " ");
            }
            
            writer.close();
            System.out.println("Numbers successfully written to the file.");
            
// Read and display the data to the user.
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            System.out.println("File contents:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            bufferedReader.close();
            
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
    

