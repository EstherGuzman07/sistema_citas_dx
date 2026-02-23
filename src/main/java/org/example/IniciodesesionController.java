package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class IniciodesesionController {

    @FXML
    void equipo(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("/nombresdeequipos.fxml")
            );

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();

    }

    @FXML
    void iniciosecionButtonPressed(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/iniciodesesion.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void registroButtonPressed(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Registr.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }

}
