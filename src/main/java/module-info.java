module com.example.maconversion {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.maconversion to javafx.fxml;
    exports com.example.maconversion;
}