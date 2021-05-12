package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.Database;

import javafx.scene.control.TextField;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    Database db = Database.getInstance();


    @FXML
    private AnchorPane rootPane;

    @FXML
    private PasswordField wachtwoord;

    @FXML
    private TextField gebruikersnaam;

    @FXML
    private Label onvolledig;

    @FXML
    private Label onjuist;


    public void login(MouseEvent mouseEvent) throws IOException {
        onvolledig.setVisible(false);
        onjuist.setVisible(false);

        if(gebruikersnaam.getText().equals("") || wachtwoord.getText().equals("")){
            onvolledig.setVisible(true);
        }else if (db.loginCheck(gebruikersnaam.getText(), wachtwoord.getText()) != null) {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HUB.fxml"));
                rootPane.getChildren().setAll(pane);
            } else {
            onjuist.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
