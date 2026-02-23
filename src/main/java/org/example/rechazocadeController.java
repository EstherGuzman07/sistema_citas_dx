package org.example;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class rechazocadeController {

    @FXML
    void aceptarmikuButtonPressed(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/acptarmiku.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();


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
    void rechazarmikuButtonPressed(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sinmensajes.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }

}
