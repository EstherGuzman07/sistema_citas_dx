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

public class sesionController {

    @FXML
    private TextField contraseñasesionTextField;

    @FXML
    private TextField correosesionTextField;

    @FXML
    void iniciiarsecionButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                sesionController.class.getResource("/sugerencias.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void olvidaedatosButtonPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                sesionController.class.getResource("/perdida de datos.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }
    @FXML
    void regresoButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                sesionController.class.getResource("/iniciodesesion.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,450, 750));
        stage.show();
    }

}
