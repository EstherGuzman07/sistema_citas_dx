package org.example;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class seugerenciasController {

    @FXML
    void MensajesButtonPressed(ActionEvent event) {

    }

    @FXML
    void PerfilButtonPressed(ActionEvent event) {

    }

    @FXML
    void filtrarButtonPressed(ActionEvent event) {

    }

    @FXML
    void sugerenciagoticaButtonPressed(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(
                    seugerenciasController.class.getResource("/solicitudenvidadgotica.fxml")
            );

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

    }

    @FXML
    void sugerenciavegettaButtonPressed(ActionEvent event){



    }

}
