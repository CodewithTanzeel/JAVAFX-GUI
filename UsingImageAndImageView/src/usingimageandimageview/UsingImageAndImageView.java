/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.image.*;
public class UsingImageAndImageView extends Application {

    /**
     * @param args the command line arguments
     */
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
        
        
       Image hourglass = new Image("/images/hourglass.JPEG");  // Leading '/' means from root of classpath
      
       
       // Create an image view that uses the image
       ImageView  hourglassIV = new ImageView(hourglass);
       
       // add image to the scene graph.
       rootNode.getChildren().add(hourglassIV);
       
       
       // show the Stage and its scene
       myStage.show();
       
        
        
        
     
        
        
        
        
    }
    
}

