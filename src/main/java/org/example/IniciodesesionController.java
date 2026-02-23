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
    void Equipo(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                IniciodesesionController.class.getResource("/nombresdeequipos.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,450, 750));
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
        Parent root = FXMLLoader.load(getClass().getResource("/Registro.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }

}
