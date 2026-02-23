package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class nombresdeequposController {

    @FXML
    void regresaratrasButtonPressed(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(
                nombresdeequposController.class.getResource("/iniciodesesion.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void slirdenombresdeequiposButtonPressed(MouseEvent event) {

    }

}
