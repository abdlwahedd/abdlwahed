module com.example.demo7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.demo7 to javafx.fxml;
    exports com.example.demo7;
    exports com.example.login;
    opens com.example.login to javafx.fxml;
}