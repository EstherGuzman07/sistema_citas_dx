package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class datosdetecuperacionController {

    @FXML
    private TextField datosderecuperacionTextField;

    @FXML
    void enviarButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                datosdetecuperacionController.class.getResource("/sesion.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void regreso1(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                datosdetecuperacionController.class.getResource("/perdida de datos.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

}
