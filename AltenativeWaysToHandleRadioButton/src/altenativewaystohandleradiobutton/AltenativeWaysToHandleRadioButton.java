/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package altenativewaystohandleradiobutton;

/**
 *
 * @author FATTANI COMPUTERS
 */

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class AltenativeWaysToHandleRadioButton extends Application {

    public static void main(String[] args) {
        // Start the application by launching args;
        launch(args);
    }
    // Override the Start method 
    public void start(Stage myStage){
        // Give the Stage a title
        myStage.setTitle("Alternative ways to handle radio button");
        //Use a flowpane for the root node. In this case.
        //vertical and horizontal gaps of 10.
        FlowPane rootNode = new FlowPane(10,10);
        //  Center the controls in the Scene;
        rootNode.setAlignment(Pos.CENTER);
        // Create a Scene.
        Scene myScene = new Scene(rootNode,200,150);
        // Set the scene on the Stage;
        myStage.setScene(myScene);
        // Create two labels.
        Label choose = new Label("Select a transport Type ");
        Label response = new Label("NO Transport confirmed");
        //Create a push button used to confirm the  selection
        Button btnConfirm = new Button("Confirm Transport Selection");
        
        //Create Radio button.
        RadioButton rbTrain = new RadioButton("Train");
        RadioButton rbCar = new RadioButton("Car");
        RadioButton rbPlane = new RadioButton("Airplane");
        // Create a toggle group 
        ToggleGroup tg = new ToggleGroup();
        // ADD each button to a Toggle Group.
        rbTrain.setToggleGroup(tg);
        rbCar.setToggleGroup(tg);
        rbPlane.setToggleGroup(tg);
        // Intially select one of the radio buttons.
        rbTrain.setSelected(true);
        // Handle the radio button action using event handler.
        btnConfirm.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                // Get the radio  which is currently selected;
                RadioButton rb = (RadioButton) tg.getSelectedToggle();
                // Display the Selection.
                response.setText(rb.getText()+ "is Confirmed.");
            }
        });
        // Use a Seperator to better organize the layout.
        Separator seperator = new Separator();
        seperator.setPrefWidth(180);
        // Add the label and buttons to the scene graph.
        rootNode.getChildren().addAll(choose,rbTrain,rbCar,rbPlane,seperator,btnConfirm,response);
        // Show the Stage and its Scene.
        myStage.show();
               
       
    }
}
