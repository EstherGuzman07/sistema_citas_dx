package org.example;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class solicitudenvidadvegetaController {

    @FXML
    void MensajesButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                solicitudenvidadvegetaController.class.getResource("/mensajes.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void PerfilButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                solicitudenvidadvegetaController .class.getResource("/perfil.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }

    @FXML
    void filtrarButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                solicitudenvidadvegetaController.class.getResource("/filtro.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }

    @FXML
    void sugerenciagotica1ButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                solicitudenvidadvegetaController.class.getResource("/soliencviadagoticamasvegeta.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void sugerenciavegeta1ButtonPressed(ActionEvent event) {

    }

}
