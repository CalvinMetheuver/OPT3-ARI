package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.Model;
import model.Onderdeel;
import model.Voorraad;

import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VoorraadController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private ChoiceBox model;

    @FXML
    private ChoiceBox onderdeel;

    public void back(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        onderdeel.getItems().add(new Onderdeel("batterij").getOnderdeel());
        model.getItems().add(new Model("Iphone 8").getOnderdeel());
    }
}
