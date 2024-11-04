module org.example.ejercicioevaluablejavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires static lombok;


    opens org.example.ejercicioevaluablejavafx to javafx.fxml;
    exports org.example.ejercicioevaluablejavafx;
}