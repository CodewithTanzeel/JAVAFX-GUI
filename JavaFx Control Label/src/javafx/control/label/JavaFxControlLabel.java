/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javafx.control.label;


import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;



public class JavaFxControlLabel extends Application {

    
    public static void main(String[] args) {
        
        // Start the JavaFx application by calling launch()
        launch(args);
     
    }
    
    // OverRide the start() method.
    @Override 
    public void start(Stage myStage){
        
        // Give stage a title .
        myStage.setTitle("Demonstrating JavaFx Label. ");
        
        // Use a FlowPane for the root node.
        FlowPane rootNode = new FlowPane();
        
        //Create a scene 
        Scene myScene = new Scene(rootNode,300,200);
        
        // set the Scene on Stage.
        myStage.setScene(myScene);
        
        
        // Create a Label.
        Label myLabel = new Label("This is a JavaFx Label. ");
        
        //Add the label to the scene graph;
       rootNode.getChildren().add(myLabel);
                
       // Show the Stage and its Scene.
       myStage.show();
    }
    
}
