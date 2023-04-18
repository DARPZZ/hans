module com.example.hans {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hans to javafx.fxml;
    exports com.example.hans;
}