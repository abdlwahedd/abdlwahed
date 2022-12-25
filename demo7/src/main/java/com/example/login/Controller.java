package com.example.login;

import com.example.demo7.DbConetion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

import java.sql.Connection;
import java.sql.Statement;

public class Controller implements EventHandler<ActionEvent> {
    String str1,str2,str3,str4 ,str5,str6,str7,str8,str9,str10,str11,str12,str13,Str14= null;
    TextField txt1;
    TextField txt2;
    TextField txt3;
    TextField txt4;
    TextField txt5;
    TextField txt6;
    TextField txt7;
    TextField txt8;
    RadioButton r1,r2;
    CheckBox c7,c8;
    ComboBox combo,combo_box1,combo_box2,combo_box3;
 Alert al = new Alert(Alert.AlertType.INFORMATION);

   // double h,r,ot=0,da,gross,tax,net,pension;
   public Controller(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5, TextField txt6,
                     TextField txt7, TextField txt8, RadioButton r1, RadioButton r2, ComboBox combo, ComboBox combo_box1, ComboBox combo_box2, ComboBox combo_box3, CheckBox c7, CheckBox c8) {

        this.txt1= txt1;
        this.txt2 = txt2;
        this.txt3 = txt3;
        this.txt4 = txt4;
        this.txt5 = txt5;
        this.txt6 = txt6;
        this.txt7= txt7;
        this.txt8= txt8;
        this.r1=r1;
       this.r2=r2;
       this.combo=combo;
       this.combo_box1=combo_box1;
       this.combo_box2=combo_box2;
       this.combo_box3=combo_box3;

        //this.totime = totime;
        //this.ta = ta;

      DbConetion connectionDB=new DbConetion();
       connectionDB.conMethod();

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        str1 =txt1.getText();
        str2 = txt2.getText();
        str3 =txt3.getText();
        str4 = txt4.getText();
        str5 =txt5.getText();
        str6 = txt6.getText();
        str7 =txt7.getText();
        str8 = txt8.getText();
        str9=r1.getText();
        str10=r2.getText();
        str11=combo.getSelectionModel().getSelectedItem().toString();
        str12=combo_box1.getSelectionModel().getSelectedItem().toString()+"/"+
                combo_box2.getSelectionModel().getSelectedItem().toString()+"/"+
        combo_box3.getSelectionModel().getSelectedItem().toString();


        queryHandler();


   }

    private void queryHandler() {
        try {
            String query = "Insert into DATA(FIRST_NAME,LAST_NAME,EMAIL,MOBILE_NUMBER,ADDRESS," +
                    "STATE,CITY,ID,GENDER1,DATE_OF_BIRTH,COUNTRY) " +
                    "VALUES" +"('" + str1 + "','" + str2 + "','"+str3+"','"+str4+"','"+str5+"','"+str6+"'," +
                    "'"+str7+"','"+str8+"','"+str9+"','"+str11+"','"+str12+"')";
            DbConetion db = new DbConetion();
            Connection connection = db.conMethod();
            Statement statement = connection.createStatement();
            boolean status = statement.execute(query);
            if (!status) {
                al.setContentText("successfuly inserted");
                al.showAndWait();
            } else {
                al.setContentText("Not successfuly inserted");
                al.showAndWait();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }
}