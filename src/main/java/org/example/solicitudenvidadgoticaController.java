package org.example;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class solicitudenvidadgoticaController {

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
    void sugerenciagotica1ButtonPressed(ActionEvent event) {

    }

    @FXML
    void sugerenciavegeta1ButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                seugerenciasController.class.getResource("/soliencviadagoticamasvegeta.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }

}

