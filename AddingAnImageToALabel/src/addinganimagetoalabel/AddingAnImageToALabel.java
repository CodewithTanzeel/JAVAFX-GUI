


import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.image.*;
import javafx.scene.control.Label;  // Correct import for Label

public class AddingAnImageToALabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage myStage) {
        // Give Stage a Title
        myStage.setTitle("Display an Image");
        
        // USE a FLOW Pane for Root NODE:
        FlowPane rootNode = new FlowPane();
        
        // Use Center alignment
        rootNode.setAlignment(Pos.CENTER);
        
        // Create a Scene
        Scene myScene = new Scene(rootNode, 300, 200);
        
        // Set the Scene on the Stage
        myStage.setScene(myScene);
        
        // Load image (make sure the path is correct)
        ImageView hourglassIV = new ImageView(getClass().getResource("/images/hourglass.JPEG").toString());
        
        // Create a Label that contains both an image and text
        Label hourglassLabel = new Label("Hourglass", hourglassIV);
        
        // add Label to the scene graph
        rootNode.getChildren().add(hourglassLabel);
         
        // show the Stage and its scene
        myStage.show();
    }
}