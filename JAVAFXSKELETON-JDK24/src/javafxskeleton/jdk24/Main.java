/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxskeleton.jdk24;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author FATTANI COMPUTERS
 */
public class Main extends Application {
    @Override
    public void start(Stage stage)throws Exception{
        VBox root  = new VBox();
        Label label = new Label("JAVA SKELETON");
        root.getChildren().add(label);
        Scene scene= new Scene(root,1200,400);
        stage.setTitle("java Skeleton");
        stage.setScene(scene);
        stage.show();
     
      
    }
     
    public static void main(String[] args) {
        launch(args);
    }
   
    
}
