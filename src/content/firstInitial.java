/*
 * Mohammad Abdulhussain
 * Student ID: 991629791
 * Assignment 1
 * Date: February 7, 2020
 */


package content;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class firstInitial extends Stage {

    private final Rectangle one = new Rectangle(100,100, 60, 500);
    private final Rectangle two = new Rectangle(550,100, 60, 500);
    private final Rectangle three = new Rectangle(200,50, 60, 350);
    private final Rectangle four = new Rectangle(420,50, 60, 350);
    private final Circle circleOne = new Circle();
    private final Polygon polygonOne = new Polygon();
    private final Polygon polygonTwo = new Polygon();
    private final Text text = new Text();

    private Group polygonGrOne = new Group(polygonOne);
    private Group polygonGrTwo = new Group(polygonTwo);


    private final Pane pane1 = new Pane(one, two, three, four, circleOne, polygonGrOne, polygonGrTwo, text);


    private final Scene sceneOne = new Scene(pane1, 700, 800);

    public firstInitial() {
        setScene(sceneOne);
        setPolygon();
        setRectangle();
        setCircleOne();
        Text();
    }

    // Sets polygon coordinates & set color
    private void setPolygon() {
        polygonOne.getPoints().addAll(100.0, 500.0, 100.0, 100.0, 200.0, 200.0);
        polygonTwo.getPoints().addAll(600.0, 500.0, 600.0, 100.0, 500.0, 200.0);
        polygonOne.setFill(Color.CRIMSON);
        polygonTwo.setFill(Color.CRIMSON);
    }
    // Rotates Rectangle & set color
    private void setRectangle() {
        three.setRotate(327);
        four.setRotate(40);
        one.setFill(Color.CRIMSON);
        two.setFill(Color.CRIMSON);
        three.setFill(Color.CRIMSON);
        four.setFill(Color.CRIMSON);
    }
    // Sets a circle in the middle
    private void setCircleOne() {
        circleOne.setCenterX(325);
        circleOne.setCenterY(350);
        circleOne.setRadius(45);
        circleOne.setFill(Color.CRIMSON);
    }
    // Shows the text on top of the "M"
    private void Text() {

        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        text.setX(50);
        text.setY(50);
        text.setText("Mohammad Abdulhussain");
    }
}
