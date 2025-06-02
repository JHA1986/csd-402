/* Jonah Aney CSD-402 Module M1: Heated water program */

import java.util.Scanner;

public class JAneyCSD402Modul1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display prompts user for input
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemperature = input.nextDouble();

        // Calculate energy
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display result
        System.out.printf("The energy needed is %.2f Joules.%n", Q);

        input.close();
    }
}