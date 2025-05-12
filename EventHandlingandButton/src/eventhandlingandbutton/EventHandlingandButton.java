/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class EventHandlingandButton extends Application{
    
    Label response;

    public static void main(String[] args) {
        // Starting the application by launch arge;
        launch(args);
        
    }
    
    //Overide the start() method.
    public void start(Stage myStage){
        
        //Give the stage the title.
        myStage.setTitle("Demonstrating JavaFx Buttons And Events");
        
        //Use a flowPane for the root node. In this case ,
        //vertical and horizontal gaps in 10;
        FlowPane rootNode = new FlowPane(10,10);
        
        // Center the Controls in the Scene.
        rootNode.setAlignment(Pos.CENTER);
        
        //Create a Scene
        Scene myScene = new Scene(rootNode,300,100);
        
        
        // set the Scene on the Stage
        myStage.setScene(myScene);
        
        // Create a Label
         response = new Label("Push a button");
          // Create  Two pushbuttons.
          Button btnAlpha = new Button("Aplha");
          Button btnBeta = new Button("Beta");
          
          // Handle the action events for the Alpha .
          
        btnAlpha.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
            response.setText("Alpha was pressed");
            }
        });
       

        btnBeta.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
            response.setText("Beta was Pressed");
        }
        });
        
        
        // ADD THE BUTTONS AND LABEL TO THE SCENE GRAPH.
        rootNode.getChildren().addAll(btnAlpha,btnBeta,response);
        
        
        // Show the Stage and its Scene;
        myStage.show();
        
        
                
        
        
          
                
        
    }
    
}
