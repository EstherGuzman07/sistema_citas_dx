package org.example;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class filtroController {

    @FXML
    void bifiltroRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void cuarentaunoRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void desiochoRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void diezkmRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void heterofiltroRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void hombrefiltroRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void homofiltroRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void irFiltroButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                filtroController .class.getResource("/no se encontro nadad enelfiltro.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }

    @FXML
    void massincuentaRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void massincuentakmRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void mujerfiltroRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void salirdelfiltroButtonPressed(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sugerencias.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void sincokmRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void sincuentakmRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void treintaseisRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void treintaunoRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void veinticincokmRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void veintiseisRadioButtonPressed(ActionEvent event) {

    }

    @FXML
    void veintiunoRadioButtonPressed(ActionEvent event) {

    }

}


