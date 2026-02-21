module sistema.citas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens org.example to javafx.fxml, javafx.controls, javafx.graphics;
    exports org.example;
}