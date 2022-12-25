package com.example.demo7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Information{
        public  static void Dcc(){
            Stage primaryStage=new Stage();
        GridPane grid2 = new GridPane();
        grid2.setHgap(10);
        grid2.setVgap(10);
        grid2.setPadding(new Insets(25, 25, 25, 25));

        Label area=new Label("   =>this is a student registration application.for registration you can use the form listed in" +
                " registration page\n then fill all necessary information about you.\n " +
                "then press submit. if there is ambiguity contact us abebe@gthanks for using our application.\n \n\n\n" +
                "Developed by abdlwahid and addisu\n" +
                "email abdlwahedakrem@gmail.com\n" +
                " " );
               area.setPrefSize(1000,200);
                grid2.add(area, 5, 5);
                //area.setStyle("-fx-background-color: Orange;");

                area.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: Black;");

                area.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
               // grid2.setStyle("-fx-background-color: Orange;");
        Scene scene = new Scene(grid2,1100, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("OptionPage");


        primaryStage.show();
    }

}