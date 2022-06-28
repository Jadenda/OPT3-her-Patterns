package com.example.opt3pattern;

import com.example.opt3pattern.Model.Gebruiker;
import com.example.opt3pattern.Model.Opbrengsten1;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

public class LoginController {


    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField Gebruikersnaam;

    @FXML
    private PasswordField Wachtwoord;

    @FXML
    private Label Foutmelding;

    @FXML
    private Button LoginButton;

    @FXML
    public void onLoginButtonClick() throws IOException {
        for (Gebruiker i : Gebruiker.getGebruikerList()) {
            if (Gebruikersnaam.getText().equals(i.getGebruikersnaam()) && Wachtwoord.getText().equals(i.getWachtwoord())) {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("Home.fxml"));
                rootPane.getChildren().setAll(pane);
            } else {
                Foutmelding.setText("Het wachtwoord/gebruikersnaam is fout");
            }
        }
    }
}