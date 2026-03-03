package sv.arrupe.apinasa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/sv/arrupe/apinasa/view/main.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 900, 700);

        stage.setTitle("NASA APOD Viewer");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
