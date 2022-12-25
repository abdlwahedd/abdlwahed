package com.example.demo7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.Statement;

import static javafx.application.Application.launch;

public class Optionclass {
    public  static void Dbc() {
        Stage primaryStage = new Stage();
        {


            GridPane grid1 = new GridPane();

            grid1.setHgap(10);
            grid1.setVgap(10);
            grid1.setPadding(new Insets(25, 25, 25, 25));

            Button btn = new Button("RegistrationPage");
            btn.setStyle("-fx-background-color: Pink;");

            grid1.add(btn, 15, 20);

            Button btn1 = new Button("InformationPage");
            btn1.setStyle("-fx-background-color: Pink;");
            grid1.add(btn1, 10 ,20);

            btn.setFont(Font.font("Tahoma", FontWeight.NORMAL, 35));
            btn1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 35));

            grid1.setStyle("-fx-background-color: Green;");

            btn.setOnAction(actionEvent ->{
                HelloApplication.DDD();
            } );
            btn1.setOnAction(actionEvent ->{
                Information.Dcc();
            } );




            Scene scene = new Scene(grid1, 900, 600);
            primaryStage.setScene(scene);
            primaryStage.setTitle("OptionPage");
            primaryStage.setResizable(false);

            primaryStage.show();
        }
    }

}
