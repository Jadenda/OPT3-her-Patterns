package com.example.opt3pattern;

import com.example.opt3pattern.Model.Belasting1;
import com.example.opt3pattern.Model.Kosten1;
import com.example.opt3pattern.Model.Opbrengsten1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HomeController implements Initializable {


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
    private Label CollegaNummer;
    @FXML
    private Label Colleganaam;

    @FXML
    private Button Volgende;

    @FXML
    private Button Loguit;

    public void addToOpbrengstenList(){
        double o = Double.parseDouble(Opbrengsten.getText());
        if(Opbrengsten1.getOpbrengstenList().equals(empty)) {
            Opbrengsten1.getOpbrengstenList().add(new Opbrengsten1(o));
        }
    }

    public void addToKostenList(){
        double k = Double.parseDouble(Kosten.getText());
        if(Kosten1.getKostenList().equals(empty)) {
            Kosten1.getKostenList().add(new Kosten1(k));
        }
    }

    public void addToBelastingList(){
        double b = Double.parseDouble(BTW.getText());
        if(Belasting1.getBelastingList().equals(empty)) {
            Belasting1.getBelastingList().add(new Belasting1(b));
        }
    }

    public void onVolgendeClick(MouseEvent mouseEvent) throws IOException {
        addToOpbrengstenList();
        addToKostenList();
        addToBelastingList();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Berekening.fxml"));
        rootPane.getChildren().setAll(pane);

//        BerekeningController ber = new BerekeningController(op, ko, be);
////         setBelasting(b / 100);
////         setBerekening(o * getBelasting());
//        belasting = b/100;
//        berekening = 0 * belasting;
    }

    public void onLoguitClick() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NaamPrinten p = new PrintHome();
        p.naam();
        Colleganaam.setText(p.getNaam());
        p.collegaNummer();
        CollegaNummer.setText("Collega: " + String.valueOf(p.getCollegaNummer()));
    }
    public void melding(){
        AnchorPane popup = new AnchorPane();
        Stage stage = new Stage();
        stage.setScene(new Scene(popup, 350, 120));
        stage.setResizable(false);

        Label melding = new Label("Weet u zeker dat u wilt uitloggen?");
        melding.setStyle("-fx-font-size: 14");
        melding.setLayoutX(70);
        melding.setLayoutY(20);

        Button Uitloggen = new Button("Uitloggen");
        Uitloggen.setCursor(Cursor.HAND);
        Uitloggen.setLayoutX(110);
        Uitloggen.setLayoutY(70);

        Button Annuleer = new Button("Annuleer");
        Annuleer.setCursor(Cursor.HAND);
        Annuleer.setLayoutX(190);
        Annuleer.setLayoutY(70);

        popup.getChildren().addAll(melding, Uitloggen, Annuleer);

        EventHandler<ActionEvent> uitloggen = actionEvent -> {
            try {
                onLoguitClick();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.close();
        };
        Uitloggen.addEventHandler(ActionEvent.ACTION, uitloggen);
        Annuleer.setOnAction(args -> stage.close());
        stage.show();
    }
}

