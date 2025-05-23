/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATTANI COMPUTERS
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package togglebuttonjavafx;

/**
 *
 * @author FATTANI COMPUTERS
 */
import javafx.application.*;
import static javafx.application.Application.launch;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;


public class RadioButtonJavaFx extends Application{
    Label response;
      
    public static void main(String[] args) {
        launch(args);  
    }
    
    // Override the Start() method
    public void start(Stage myStage){
        
        // Give the Stage a title
        myStage.setTitle("Demonstration of RadioButton");
        // Using a  flow pane
        FlowPane rootNode = new FlowPane(10,10);
        //Center the controls in the Scene.
        rootNode.setAlignment(Pos.CENTER);
        // Create  a Scene 
        Scene myScene = new Scene(rootNode,220,120);
        // Set the Scene on the Stage.
        myStage.setScene(myScene);
        //Create a Label that will report the selection.
        response = new Label("");
        // Create the radio buttons
        RadioButton rbTrain = new RadioButton("Train");
        RadioButton rbCar = new RadioButton("Car");
        RadioButton rbPlane = new RadioButton("AirPlane");
        //Create a Toggle Group
        ToggleGroup tg = new ToggleGroup();
        //ADD Each Button to the toggle group 
        rbTrain.setToggleGroup(tg);
        rbCar.setToggleGroup(tg);
        rbPlane.setToggleGroup(tg);
        //Handle action events for the radio Buttons.
        rbTrain.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("Transport selected is the Train");
            }
        });
        rbTrain.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("Transport selected is the Car");
        }
        });
        rbPlane.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("Transport selected is the AirPlane");
        }
        });              
       
    // Fire the event for the  first selection.This causes that radio
//    button to be selected and action event for that button occur
    rbTrain.fire();
    
    // Add the label and button tothe scene graph 
    rootNode.getChildren().addAll(rbTrain,rbPlane,rbCar,response);
    // Show the stage and its Scene.
    myStage.show();
    
 }
}