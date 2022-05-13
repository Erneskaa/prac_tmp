module com.example.prac1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires java.desktop;


    opens com.example.prac1 to javafx.fxml;
    exports com.example.prac1;
}