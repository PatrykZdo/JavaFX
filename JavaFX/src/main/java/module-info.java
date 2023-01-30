module com.example.zaczynamyfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.zaczynamyfx to javafx.fxml;
    exports com.example.zaczynamyfx;
}