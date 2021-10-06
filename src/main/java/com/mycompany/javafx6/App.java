package com.mycompany.javafx6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 * JavaFX App
 */
public class App extends Application {
        Label label;
        TextField tf, tf2;
    @Override
    public void start(Stage stage) {
        
        label = new Label("");
        label.setLayoutX(400); label.setLayoutY(200);
      
        
        Button btn2 = new Button("Btn 2");
        btn2.setLayoutX(400);
        btn2.setLayoutY(150);
        btn2.setOnAction(  this::processBttn2 );
        
        tf = new TextField("");
        tf.setLayoutX(200); tf.setLayoutY(150);
        tf2 = new TextField("");
        tf2.setLayoutX(200); tf2.setLayoutY(200);
        
        Group gp = new Group(label, btn2, tf, tf2);
        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("GUI demo 2");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void processBttn2(ActionEvent arg0) {
        String cntnt = tf.getText().trim();
        int nm =Integer.parseInt(cntnt);
        String cntnt2 = tf2.getText().trim();
        int nm2 = Integer.parseInt(cntnt2);
        label.setText("num1 + num2 = " + (nm + nm2));
        label.setTextFill(Color.RED);
    }
}