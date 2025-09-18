/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listviewjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.beans.value.*;
import javafx.collections.*;



public class ListViewJavaFx extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);        
    }

    public void start(Stage myStage) {
        // Set title of the stage
        myStage.setTitle("ListView Demo");

        // Create the root layout
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        // Create a label
        response = new Label("Select Transport Type");

        // Observable list of transport types
        ObservableList<String> transportTypes = 
                FXCollections.observableArrayList("Train", "Car", "Airplane");
        
        // When your add more number of items which can be displayed in a certain
        // dimension then it will be displayed  with a scroll bar
        

        // Create ListView
        ListView<String> lvTransport = new ListView<>(transportTypes);
        lvTransport.setPrefSize(100, 100);

        // Get selection model
        MultipleSelectionModel<String> lvSelModel = lvTransport.getSelectionModel();

        // Add change listener
        lvSelModel.selectedItemProperty().addListener(
            new ChangeListener<String>() {
                public void changed(ObservableValue<? extends String> changed,
                                    String oldVal, String newVal) {
                    response.setText("Transport selected is: " + newVal);
                }
            }
        );

        // Add elements to the layout
        rootNode.getChildren().addAll(lvTransport, response);

        // Set scene and show
        Scene scene = new Scene(rootNode, 300, 200);
        myStage.setScene(scene);
        myStage.show();
    }
    
}
