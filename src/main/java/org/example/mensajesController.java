package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;
public class mensajesController {

    @FXML
    void aceptarcadeButtonPressed(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/rechazocade.fxml"));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();


    }

    @FXML
    void aceptarmikuButtonPressed(ActionEvent event) {

    }

    @FXML
    void inicioButtonPressed(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sugerencias.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void rechazarcadeButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                mensajesController.class.getResource("/rechazocade.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void rechazarmikuButtonPressed(ActionEvent event) {

    }
}


