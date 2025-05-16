

import java.lang.classfile.Label;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.image.*;


public class AddingAnImageToALabel extends Application{

       public static void main(String[] args) {
        launch(args);
        
    }
    
    @Override
    public  void start(Stage myStage) {
        
        // Give Stage a Title
        myStage.setTitle("Display an Image");
        
        
        //USE a FLOW Pane for Root NODE:
        FlowPane rootNode = new FlowPane();
        
        // Use Center akignment .
        rootNode.setAlignment(Pos.CENTER);
        
        // Create a Scene
        Scene myScene = new Scene(rootNode,300,200);
        
       // Set the Scene on the Stage
       myStage.setScene(myScene);
       ImageView hourglassIV = new ImageView("/images/hourglass.JPEG");  // Leading '/' means from root of classpath
       // Create a Label that contains both an imagine and text ;
       Label  hourglassLabel = new Label("Hourglass",hourglassIV);
       // add Label to the scene graph.
       rootNode.getChildren().add(hourglassLabel);
         
       // show the Stage and its scene
       myStage.show();
    }
    
}
