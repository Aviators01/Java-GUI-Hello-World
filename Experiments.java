/*
Timothy Queva
CS3010 Lab5
March 28, 2021

*/
package Lab5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class Experiments extends Application{
    @Override
    public void start(Stage primaryStage){
        StackPane rootpane = new StackPane();
        Pane crcpane = new Pane();
        Pane rectpane = new Pane();
        Pane btpane = new Pane();
        Pane phrases = new Pane();
        
        //Circle object in pane
        Circle circle = new Circle();
        circle.setCenterX(320);
        circle.setCenterY(240);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);
        circle.setFill(Color.RED);
        crcpane.getChildren().add(circle);
        
        //Rectangle Object
        Rectangle square = new Rectangle();
        square.setX(100);
        square.setY(190);
        square.setHeight(100);
        square.setWidth(100);
        square.setStroke(Color.BLUE);
        square.setStrokeWidth(3);
        square.setFill(Color.AQUAMARINE);
        rectpane.getChildren().add(square);
        
        //Button object
        Button wowbt = new Button("Wow!");
        wowbt.setLayoutX(100);
        wowbt.setLayoutY(100);
        btpane.getChildren().add(wowbt);
        
        //Sets everything else to ignore mouse so buttons works
        crcpane.setMouseTransparent(true);
        rectpane.setMouseTransparent(true);
        phrases.setMouseTransparent(true);
        
        Label words = new Label("Testing this out now here.");
        words.setFont(Font.font("Times New Roman",20));
        words.setLayoutX(50);
        words.setLayoutY(400);
        phrases.getChildren().add(words);
        
        Text t1 = new Text(400,150,"A text object made\nthis phrase.");
        t1.setFont(Font.font("Ariel",FontWeight.BOLD,25));
        t1.setStrikethrough(true);
        phrases.getChildren().add(t1);
        
        //adds all the panes to rootpane
        rootpane.getChildren().addAll(btpane,crcpane,rectpane,phrases);
        
        //Sets the scene
        Scene scene = new Scene(rootpane,640,480);
        
        //Deals with stage
        primaryStage.setTitle("CS3010 Lab5 Assignment");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        Application.launch(args);
    }
}