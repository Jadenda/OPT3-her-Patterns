package com.example.opt3pattern;

import com.example.opt3pattern.Model.Belasting1;
import com.example.opt3pattern.Model.Kosten1;
import com.example.opt3pattern.Model.Opbrengsten1;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class HomeController {
//
//    private Opbrengsten1 op;
//
//    private Kosten1 ko;
//
//    private Belasting1 be;
    public static ArrayList<Double> empty = new ArrayList<>();
    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField Opbrengsten;

    @FXML
    private TextField Kosten;

    @FXML
    private TextField BTW;

    @FXML
    private Button Volgende;

    @FXML
    private Button Loguit;

    public void addToOpbrengsten1(){
        double o = Double.parseDouble(Opbrengsten.getText());
            if(Opbrengsten1.getOpbrengstenList().equals(empty)){
                Opbrengsten1.getOpbrengstenList().add(new Opbrengsten1(o));
            }
//        op = new Opbrengsten1(o);
    }

    public void addToKosten1(){
        double k = Double.parseDouble(Kosten.getText());
        if(Kosten1.getKostenList().equals(empty)){
            Kosten1.getKostenList().add(new Kosten1(k));
        }
//        ko = new Kosten1(k);
    }

    public void addToBelasting1(){
        double b = Double.parseDouble(BTW.getText());
        if(Kosten1.getKostenList().equals(empty)){
            Belasting1.getBelastingList().add(new Belasting1(b));
        }
//        be = new Belasting1(b);
    }

    public void onVolgendeClick(MouseEvent mouseEvent) throws IOException {
        addToOpbrengsten1();
        addToKosten1();
        addToBelasting1();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Berekening.fxml"));
        rootPane.getChildren().setAll(pane);

//        BerekeningController ber = new BerekeningController(op, ko, be);
////         setBelasting(b / 100);
////         setBerekening(o * getBelasting());
//        belasting = b/100;
//        berekening = 0 * belasting;



    }

    public void onLoguitClick(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}
