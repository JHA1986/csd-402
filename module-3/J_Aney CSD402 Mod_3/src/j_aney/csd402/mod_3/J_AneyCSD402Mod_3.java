/* Jonah Aney 06/06/2025 CSD-402 Module 3: Number Pyramid
Directions: Write a program that uses nested for loops to output all the following with the shown display format

Source material: 
Java - making tree with nested loops - stack overflow. (n.d.-a). 
https://stackoverflow.com/questions/35946348/making-tree-with-nested-loops
YouTube. (n.d.-a). YouTube. https://www.youtube.com/watch?v=_V86FEthSvM 
*/

/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j_aney.csd402.mod_3;

/**
 *
 * @author Jonah
 */
public class J_AneyCSD402Mod_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Establish the number of rows in the pyramid
        int rows = 7;
// Total width of each line to keep "@" spacing consistent
        int maxwidth = 40;
// Loop through each row
        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();

// Adding leading spaces to center the pryamid
            for (int s = 0; s < rows - i - 1; s++) {
                line.append("  ");
            }

 // Print left side numbers, increasing powers of 2
            int num = 1;
            for (int j = 0; j <= i; j++) {
                line.append(num).append(" ");
                num *= 2;
            }

// Print right side numbers, decreasing powers of 2
            num /= 2;
            for (int j = 0; j < i; j++) {
                num /= 2;
                line.append(num).append(" ");
            }

// Add padding with spaces so the @ always aligns at the same spot
            while (line.length() < maxwidth) {
                line.append(" ");
            }
// Adding the "@" symbol to the end of each line
            line.append("@");

// Print and display the pyramid
            System.out.println(line.toString());
        }
    }
}
