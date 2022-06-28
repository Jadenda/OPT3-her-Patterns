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
//    private Opbrengsten1 op;
//    private Kosten1 ko;
//    private Belasting1 be;
//
//    public BerekeningController(Opbrengsten1 op, Kosten1 ko, Belasting1 be){
//        this.op = op;
//        this.ko = ko;
//        this.be = be;
//    }
//th

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

    public void onBrutowinstClick(MouseEvent mouseEvent) throws IOException {
        Double opbrengsten = Opbrengsten1.getOpbrengstenList().get(0).getOpbrengsten();
        //Double kosten
        Text.setText("U belasting bedraagt:");
        Antwoord.setText(String.valueOf(opbrengsten));


//        Double belasting = Belasting / 100;
//        Double berekening = Opbrengsten * belasting;
//        System.out.print("De belasting bedraagt: €" + berekening);
    }


    public void onNettowinstClick(MouseEvent mouseEvent) throws IOException {
        Text.setText("U nettowinst bedraagt:");

//        public void KMinvullen() throws IOException {
//            int a = Integer.parseInt(aantalKM.getText());
//            int antwoord = a * 120;
//            String b = String.valueOf(antwoord);
//            CO2.setText(b);
//        }

//        Double belasting = Belasting / 100;
//        Double berekening = Opbrengsten - (Opbrengsten * belasting);
//        Double berekening2 = Kosten - (Kosten * belasting);
//        Double nettowinst = berekening - berekening2;
//        System.out.print("De nettowinst bedraagt: €" + nettowinst);
    }


    public void onBTWClick(MouseEvent mouseEvent) throws IOException {
        Text.setText("U belasting bedraagt:");

//        Double brutowinst = Opbrengsten - Kosten;
//        System.out.print("De brutowinst bedraagt: €" + brutowinst);
    }


    public void onLoguit2Click(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
        rootPane.getChildren().setAll(pane);
    }



}
