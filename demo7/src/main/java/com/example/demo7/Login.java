package com.example.demo7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Login extends Application {
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);


        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label ps = new Label("Password:");
        grid.add(ps, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        btn.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
        ps.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
        userName.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
        grid.setStyle("-fx-background-color: PINK;");


        btn.setOnAction(actionEvent ->{
            Optionclass.Dbc();


        } );
       Alert aaa=new Alert(Alert.AlertType.INFORMATION);
btn.setOnAction(e -> {
    String hh = "java";
    String hg = "0000";
    if (hh.equals(userTextField.getText()) && hg.equals(pwBox.getText())){

    Optionclass.Dbc();
    primaryStage.close();
}

else
{
    aaa.setContentText("Incorrect Try Again");
    aaa.show();
        }
});
        Scene scene = new Scene(grid, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Welcome");

        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
