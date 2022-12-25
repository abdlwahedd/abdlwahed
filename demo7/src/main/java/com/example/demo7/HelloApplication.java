package com.example.demo7;

import com.example.login.Controller;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloApplication  {
public  static void DDD(){

        Stage primaryStage=new Stage();
        Label a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,z;
        a=new Label("First Name");
        b=new Label("last Name");
        c=new Label("Date Of Birth");
        d=new Label("E_mail");
        e=new Label("Mobile Number");
        f=new Label("Gender");
        g=new Label("Address");
        h=new Label("State");
        i=new Label("City");
        j=new Label("ID");
        k=new Label("State");
        l=new Label("Country");
        m=new Label("Hobbies");
        n=new Label("Department");
        o=new Label("Course");
        p= new Label("STUDENT REGISTRATION FORM");


        TextField txt1 ,txt2,txt3,txt4,txt5 ,txt6,txt7,txt8,txt9;
        txt1= new TextField();
        txt2= new TextField();
        txt3= new TextField();
        txt4= new TextField();
        txt5= new TextField();
        txt6= new TextField();
        txt7= new TextField();
        txt8= new TextField();
        txt9=new TextField();

        Button btn=new Button("SUBMIT");


        ToggleGroup group = new ToggleGroup();
        RadioButton r1 = new RadioButton("male");
        RadioButton r2 = new RadioButton("female");
        r1.setToggleGroup(group);
        r2.setToggleGroup(group);
        HBox hBox= new HBox();
        hBox.setSpacing(10);
        hBox.getChildren().addAll(r1,r2);


        CheckBox c1 = new CheckBox("C");
        CheckBox c2 = new CheckBox("C++");
        CheckBox c3 = new CheckBox("Java");
        CheckBox c4 = new CheckBox("Discreat Mathematics");
        CheckBox c5 = new CheckBox("Networking");
        CheckBox c6 = new CheckBox("Advance Java");
        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(l,c1,c2,c3,c4);
        hBox2.setSpacing(5);

        CheckBox c7 = new CheckBox("CS");
        CheckBox c8 = new CheckBox("IT");
        CheckBox c9 = new CheckBox("IS");
        HBox hBox3 = new HBox();
        hBox3.getChildren().addAll(l,c7,c8,c9);
        hBox3.setSpacing(5);


          String days[] =
                { "day","Monday", "Tuesday", "Wednesday",
                        "Thursday", "Friday" };
          ComboBox combo_box1 =
                new ComboBox(FXCollections
                        .observableArrayList(days));
        combo_box1.getSelectionModel().selectFirst();
        String month[] =
                { "Month", "1", "2",
                        "3", "4","5", "6", "7",
                        "8", "9","10", "11", "12",
                        };
        ComboBox combo_box2 =
                new ComboBox(FXCollections
                        .observableArrayList(month));
        combo_box2.getSelectionModel().selectFirst();
        String years[] =
                { "year","2000", "2001", "2002",
                        "2003"};
        ComboBox combo_box3 =
                new ComboBox(FXCollections
                        .observableArrayList(years));
       combo_box3.getSelectionModel().selectFirst();
        HBox hBox4 = new HBox();
        hBox4.getChildren().addAll(combo_box1,combo_box2,combo_box3 );
        hBox4.setSpacing(5);

        String country[] =
                {"country" ,"etiopia","america", "turkey", "sudan",
                        "somalia"};
        ComboBox combo =
                new ComboBox(FXCollections
                        .observableArrayList(country));
              combo.getSelectionModel().selectFirst();

        BorderPane BPane = new BorderPane();



        GridPane root=new GridPane();
        root.addColumn(1, a, b, c,d,e,f,g,h,i,j,l,n,o);
        root.addColumn(2,txt1,txt2,hBox4,txt3,txt4,hBox,txt5,txt6,txt7,txt8,combo, hBox3,hBox2);
        root.setPadding(new Insets(40, 40, 20, 20));
        root.add(btn, 2, 14);
        BPane.setCenter(root);
        root.setVgap(20);
        root.setHgap(20);

    Text title = new Text();
    title.setText("Student Registration");
    title.setX(300);
    title.setY(300);
    title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
    title.setUnderline(true);


    BPane.setTop(title);


    a.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    b.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    c.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    d.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    e.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    f.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    g.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    h.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    i.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    j.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    k.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    l.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    n.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    m.setStyle("-fx-background-color: Blue; -fx-text-fill: white;");
    o.setStyle("-fx-background-color: Blue; -fx-text-fill: White;");
   // btn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: White;");


    a.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    b.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    c.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    d.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    e.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    f.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    g.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
   h.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
   i.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    j.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    k.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    l.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    m.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    n.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    o.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
    btn.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));


btn.setOnAction( new Controller(txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,r1,r2,combo,combo_box1,combo_box2,combo_box3,c7,c8));





    root.setStyle("-fx-background-color: BEIGE;");
    Scene scene = new Scene(BPane,900,800);
    scene.getStylesheets().add("path/stylesheet.css");
        primaryStage.setScene(scene);
       primaryStage.setResizable(false);
        primaryStage.setTitle("Student Registration Form");
        primaryStage.show();

    }


}
