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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BerekeningController implements Initializable {
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
    private Label CollegaNummer;

    @FXML
    private Label Colleganaam;

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
        Text.setText("U brutowinst bedraagt:");
        Antwoord.setText("€" + String.format("%.2f", antwoord));

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
        Antwoord.setText("€" + String.format("%.2f", nettowinst));

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
        Antwoord.setText("€" + String.format("%.2f", berekening));

//        Double belasting = Belasting / 100;
//        Double berekening = Opbrengsten * belasting;
//        System.out.print("De belasting bedraagt: €" + berekening);
    }


    public void onLoguit2Click() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NaamPrinten p = new PrintBerekening();
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
                onLoguit2Click();
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
