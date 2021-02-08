/*
 * Mohammad Abdulhussain
 * Student ID: 991629791
 * Assignment 1
 * Date: February 7, 2020
 */

package myInitials;

import content.firstInitial;
import content.secondInitial;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    private Rectangle rectOne = new Rectangle (
            30,
            50,
            150,
            200);
    private Ellipse ellipseOne = new Ellipse(
            300,
            200,
            40,
            50);

    private Pane pane = new Pane(rectOne, ellipseOne);
    private Scene scene = new Scene(pane, 600, 400);

    private firstInitial one = new firstInitial();
    private secondInitial two = new secondInitial();

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Mohammad Abdulhussain");
        primaryStage.setScene(new Scene(root, 300, 275));

        // Sets the text which will appear in the stage
        Text text = new Text();

        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        text.setX(50);
        text.setY(50);
        text.setText("Mohammad Abdulhussain");

        // Add a picture source
        ImageView landscape= new ImageView("image/discordkitty.gif");
        landscape.setFitWidth(400);
        landscape.setFitHeight(300);
        Pane pane= new Pane(landscape, text);
        Scene scene=new Scene(pane, 400,300);
        primaryStage.setScene(scene);

        // Sets titles for the first and second windows
        one.setTitle("First initial");
        two.setTitle("Second initial");

        // Set First Initial stage coordinates
        one.setX(150);
        one.setY(200);
        // Set Second initial stage coordinates
        two.setX(900);
        two.setY(200);
        // Set primaryStage stage coordinates
        primaryStage.setX(1650);
        primaryStage.setY(200);

        // Outputs all three stages
        primaryStage.show();
        one.show();
        two.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
