package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class rechazomikuController {

    @FXML
    void aceptarcadeButtonPressed(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/acptarcade.fxml")
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
    void rechazarcadeButtonPressed(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sinmensajes.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();


    }

}
