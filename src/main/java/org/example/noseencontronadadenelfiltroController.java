package org.example;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class noseencontronadadenelfiltroController {

    @FXML
    void regresaralfiltroButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                noseencontronadadenelfiltroController.class.getResource("/sugerencias.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }

}

