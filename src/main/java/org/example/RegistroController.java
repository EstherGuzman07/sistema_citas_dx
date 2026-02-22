package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistroController {

    @FXML
    private TextField apellidoTextField;

    @FXML
    private TextField codpostalTextField;

    @FXML
    private TextField contraseñaTextField;

    @FXML
    private TextField correoTextField;

    @FXML
    private TextField nacionalidaTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField numtelfTextField;

    @FXML
    void SubirButtonPressed(MouseEvent event) {

    }

    @FXML
    void hombreRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void mujerRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void otroRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void registraseButtonPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                RegistroController.class.getResource("/avisodeprivacidad.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,450, 750));
        stage.show();
    }

}
