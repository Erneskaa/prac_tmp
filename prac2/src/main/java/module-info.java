module com.example.prac {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.example.prac2 to javafx.fxml;
    exports com.example.prac2;
}