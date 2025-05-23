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

public class ToggleButtonJAVAFX extends Application {
    ToggleButton tbOnOff;
    Label response;
    public static void main(String[] args) {
        launch(args);
    }
   
    public void start(Stage myStage){
        // Give the Stage a title
        myStage.setTitle("JAVA FX TOGGLE BUTTON");
        // Use a Flowpane for the rootNode. In this Case,
        //vertical and horizontal gaps of 10.
        FlowPane rootNode = new FlowPane(10,10);
        //Center the controls in the Scene.
        rootNode.setAlignment(Pos.CENTER);
        
        //Create a scene
        Scene myScene = new Scene(rootNode,220,120);
        //Set the Scene on Stage.
        myStage.setScene(myScene);
        //Create a Label 
        response = new Label("Push the Button");
        // Create the toggle button.
        tbOnOff = new ToggleButton("On/Off");
        //Handle Action events for the toggle button.
        tbOnOff.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                if(tbOnOff.isSelected())response.setText("Button is on.");
                else response.setText("Button is off");
            }
        });
        //Add the label and button to the scene graph.
        rootNode.getChildren().addAll(tbOnOff,response);
        
        // Show the stage and its Scene
        myStage.show();
    }
    
    
}
