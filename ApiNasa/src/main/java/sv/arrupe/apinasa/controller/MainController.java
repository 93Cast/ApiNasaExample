package sv.arrupe.apinasa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sv.arrupe.apinasa.model.ApodResponse;
import sv.arrupe.apinasa.service.NasaService;

import java.time.LocalDate;

public class MainController {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblDescripcion;

    @FXML
    private ImageView imageView;

    private NasaService nasaService = new NasaService();

    @FXML
    public void initialize() {
        datePicker.setValue(LocalDate.now());
    }

    @FXML
    private void buscarImagen() {

        try {
            String fecha = datePicker.getValue().toString();

            ApodResponse apod = nasaService.getApod(fecha);

            lblTitulo.setText(apod.getTitle());
            lblDescripcion.setText(apod.getExplanation());

            if (apod.getMedia_type().equals("image")) {
                Image image = new Image(apod.getUrl(), true);
                imageView.setImage(image);
            } else {
                lblDescripcion.setText("El contenido es un video.\n\n"
                        + apod.getExplanation());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
