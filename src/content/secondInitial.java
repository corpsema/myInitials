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
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class secondInitial extends Stage {

    private final Rectangle one = new Rectangle(200,100, 60, 500);
    private final Rectangle two = new Rectangle(450,100, 60, 500);
    private final Polygon polygonOne = new Polygon();

    private final Text text = new Text();
    private final Group polygonGrOne = new Group(polygonOne);

    private final Circle circleOne = new Circle();

    private final Pane paneOne = new Pane(polygonGrOne, one, two, circleOne, text);
    private Scene sceneOne = new Scene(paneOne,
            700,
            800);

    public secondInitial() {
        setScene(sceneOne);
        setRectangle();
        setCircleOne();
        setPolygon();
        Text();
    }

    private void setRectangle() {
        one.setRotate(29);
        two.setRotate(338);
        one.setFill(Color.BLUE);
        one.setStroke(Color.PURPLE);
        one.setStrokeWidth(5);
        two.setFill(Color.BLUE);
        two.setStroke(Color.PURPLE);
        two.setStrokeWidth(5);

    }
    private void setCircleOne() {
        circleOne.setCenterX(370);
        circleOne.setCenterY(130);
        circleOne.setRadius(47);
        circleOne.setFill(Color.BLUE);
        circleOne.setStroke(Color.PURPLE);
        circleOne.setStrokeWidth(2);
    }
    private void setPolygon() {
        polygonOne.getPoints().addAll(500.0, 400.0, 200.0, 400.0, 200.0, 350.0);
        polygonOne.setFill(Color.BLUE);
        polygonOne.setStroke(Color.PURPLE);
        polygonOne.setStrokeWidth(2);
    }
    private void Text() {

        text.setFont(Font.font("verdana", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
        text.setX(50);
        text.setY(50);
        text.setText("Mohammad Abdulhussain");
    }
}
