/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATTANI COMPUTERS
 */
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.geometry.*;


       
public class CheckBoxJavaFx  extends Application{

    CheckBox cbWeb;
    CheckBox cbDesktop;
    CheckBox cbMobile;
    Label response;
    Label  allTargets;
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage myStage){
        
        // Give the Stage a title.
        myStage.setTitle("Check Box demonstration");
        // Use a flowpane for the root notee. iN this case.
        // Vertical and horizontal gaps of 10.
        FlowPane rootNode = new FlowPane(10,10);
        //Center the Controls in the Scene.
        rootNode.setAlignment(Pos.CENTER);
        //Create a Scene
        Scene myScene = new Scene(rootNode,220,140);
        // set the scene on the Stage .
        myStage.setScene(myScene);
        Label heading = new Label("Select Deployment Options");
        // Label that will report the status of the selected check box;
        response = new Label("No Deployment Seleceted");
        // Create a label that will report all targets selected. 
        Label allTargets = new Label("Taget list: <None>");
        // Create The check boxes.
        cbWeb = new CheckBox("web");
        cbDesktop = new CheckBox("Desktop");
        cbMobile = new CheckBox("Mobile");
        // Handle the action event fot the CheckBoxes;
        cbWeb.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                if(cbWeb.isSelected()){
                    response.setText("Web Deployment Selected");
                   
                }else{
                    response.setText("WebDeploymentCleared");
                      showAll();
                    
                }
            }
        });
        cbDesktop.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                if(cbDesktop.isSelected()){
                    response.setText("Desktop Deployment Selected");
                   
                }else{
                    response.setText("DesktopDeploymentCleared");
                    showAll();
                    
                }
            }
        });
           cbMobile.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                if(cbMobile.isSelected()){
                    response.setText("Mobile Deployment Selected");
                   
                }else{
                    response.setText("MobileDeploymentCleared");
                      showAll();
                    
                }
            }
        });
           // Use the seperator to better organise the layout
           Separator separator = new Separator();
           separator.setPrefWidth(200);
           // Adding Control to the scene Graph.
           rootNode.getChildren().addAll(heading,separator,cbWeb,cbDesktop,cbMobile,response,allTargets);
             
          // Show the Stage and its Scene.
          myStage.show();
          
           
    }
   void showAll(){
        String targets = "";
       if(cbWeb.isSelected()) targets = "wen";
       if(cbDesktop.isSelected()) targets += "Desktop";
       if(cbMobile.isSelected()) targets += "Mobile";
       
       if(targets.equals(" ")) targets = "<none>";
       allTargets.setText("Targetlist: "+ targets);
       
   }
          
    
}
