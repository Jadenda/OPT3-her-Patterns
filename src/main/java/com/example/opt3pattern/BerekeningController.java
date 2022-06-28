package com.example.opt3pattern;

import com.example.opt3pattern.Model.Belasting1;
import com.example.opt3pattern.Model.Kosten1;
import com.example.opt3pattern.Model.Opbrengsten1;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

public class BerekeningController{
    private Double opbrengsten;

    private Double kosten;

    private Double belasting;
    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button Brutowinst;

    @FXML
    private Button Nettowinst;

    @FXML
    private Button BTW;

    @FXML
    private Label Text;

    @FXML
    private Label Antwoord;

    @FXML
    private Button Loguit2;

    public void waardes(){
         this.opbrengsten = Opbrengsten1.getOpbrengstenList().get(0).getOpbrengsten();
         this.kosten = Kosten1.getKostenList().get(0).getKosten();
         this.belasting = Belasting1.getBelastingList().get(0).getBelasting();
    }

    public void onBrutowinstClick(MouseEvent mouseEvent) throws IOException {
        waardes();
        Double antwoord = opbrengsten - kosten;
        Text.setText("U belasting bedraagt:");
        Antwoord.setText("€" + String.valueOf(antwoord));

//        Double brutowinst = Opbrengsten - Kosten;
//        System.out.print("De brutowinst bedraagt: €" + brutowinst);
    }


    public void onNettowinstClick(MouseEvent mouseEvent) throws IOException {
        waardes();
        Double Belasting = belasting / 100;
        Double berekening = opbrengsten - (opbrengsten * Belasting);
        Double berekening2 = kosten - (kosten * Belasting);
        Double nettowinst = berekening - berekening2;
        Text.setText("U nettowinst bedraagt:");
        Antwoord.setText("€" + String.valueOf(nettowinst));

//        Double belasting = Belasting / 100;
//        Double berekening = Opbrengsten - (Opbrengsten * belasting);
//        Double berekening2 = Kosten - (Kosten * belasting);
//        Double nettowinst = berekening - berekening2;
//        System.out.print("De nettowinst bedraagt: €" + nettowinst);
    }


    public void onBTWClick(MouseEvent mouseEvent) throws IOException {
        waardes();
        Double Belasting = belasting / 100;
        Double berekening = opbrengsten * Belasting;
        Text.setText("U belasting bedraagt:");
        Antwoord.setText("€" + String.valueOf(berekening));

//        Double belasting = Belasting / 100;
//        Double berekening = Opbrengsten * belasting;
//        System.out.print("De belasting bedraagt: €" + berekening);
    }


    public void onLoguit2Click(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
        rootPane.getChildren().setAll(pane);
    }



}
