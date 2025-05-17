
package usingaimagewithabutton;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.image.*;

public class UsingAImageWithAButton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Use images with Buttons");
        
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 250, 450);
        myStage.setScene(myScene);
        
        Label response = new Label("PUSH A BUTTON");
        
        // Load images properly using getResource()
        ImageView hourglassIV = createImageView("/images/hourglass.JPEG");
        ImageView analogIV = createImageView("/images/analog.PNG");
        
        // Create buttons with images
        Button btnHourglass = new Button("Hourglass", hourglassIV);
        Button btnAnalogClock = new Button("AnalogClock", analogIV);
        
        // Position text under image
        btnHourglass.setContentDisplay(ContentDisplay.TOP);
        btnAnalogClock.setContentDisplay(ContentDisplay.TOP);
        
        // Event handlers
        btnHourglass.setOnAction(e -> response.setText("HOURGLASS PRESSED"));
        btnAnalogClock.setOnAction(e -> response.setText("ANALOG CLOCK PRESSED"));
        
        // Add components to scene
        rootNode.getChildren().addAll(btnHourglass, btnAnalogClock, response);
        
        myStage.show();
    }
    
    private ImageView createImageView(String path) {
        try {
            Image img = new Image(getClass().getResourceAsStream(path));
            return new ImageView(img);
        } catch (Exception e) {
            System.err.println("Error loading image: " + path);
            e.printStackTrace();
            return new ImageView(); // Return empty ImageView if image fails to load
        }
    }
}