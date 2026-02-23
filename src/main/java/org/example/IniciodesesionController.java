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
    void equipo(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                IniciodesesionController.class.getResource("/nombres de equipos.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }
    @FXML
    void iniciosecionButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                IniciodesesionController.class.getResource("/sesion.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,450, 750));
        stage.show();
    }

    @FXML
    void irASegundaEscena(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                IniciodesesionController.class.getResource("/Registro.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,450, 750));
        stage.show();
    }
    }
