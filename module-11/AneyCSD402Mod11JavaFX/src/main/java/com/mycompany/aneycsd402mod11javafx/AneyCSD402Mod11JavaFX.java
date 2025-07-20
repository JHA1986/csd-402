/**
Jonah Aney July 20th, 2025 
CSD-402 Module 11: JavaFX Assignment
*/

// JavaFX application to demonstrate TitledPane and an Accordion layout

package com.mycompany.aneycsd402mod11javafx;

// Import necessary JavaFX classes
import javafx.application.Application;  // Base class for JavaFX applications
import javafx.scene.Scene;             // Represents the visual scene graph
import javafx.scene.control.*;         // UI controls like Accordion, TitledPane, Label
import javafx.scene.layout.VBox;       // Vertical box layout container
import javafx.stage.Stage;             // Top-level window container

/**
 * Main JavaFX application class that extends Application
 * This class demonstrates the use of TitledPane components within an Accordion layout
 */
public class AneyCSD402Mod11JavaFX extends Application {
    
/**
 * The start method is the main entry point for JavaFX applications
 * Sets up the primary stage (window) and initializes the UI components.
 * @param stage The primary stage (window) for this application
*/
    @Override
    public void start(Stage stage) {
        
// Create three TitledPane objects - collapsible panels with titles
        TitledPane pane1 = new TitledPane("Section 1", new Label("Content for section 1"));
        TitledPane pane2 = new TitledPane("Section 2", new Label("Content for section 2"));
        TitledPane pane3 = new TitledPane("Section 3", new Label("Content for section 3"));

// Create an Accordion control and add all three TitledPanes to it
        Accordion accordion = new Accordion(pane1, pane2, pane3);

// Create a VBox to hold the accordion. VBox puts children in a single vertical column
        VBox root = new VBox(accordion);
        
// Create a Scene with the root container, specifying width and height
        Scene scene = new Scene(root, 300, 250);
        
// Configure the stage (window) properties
        stage.setTitle("JavaFX Accordion Example");  // Set the window title
        stage.setScene(scene);                       // Attach the scene to the stage
        stage.show();                                // Make the window visible
    }

/**
 * The main method - entry point of the Java application
 * Calls launch() which starts the JavaFX application lifecycle
 * @param args Command line arguments passed to the application
*/
    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
}
