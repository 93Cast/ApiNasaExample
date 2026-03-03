module sv.arrupe.apinasa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;

    opens sv.arrupe.apinasa.controller to javafx.fxml;
    opens sv.arrupe.apinasa.model to com.google.gson;

    exports sv.arrupe.apinasa;
}