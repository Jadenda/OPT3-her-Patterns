package com.example.opt3pattern;

import com.example.opt3pattern.Model.Gebruiker;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Login.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Login");
//        stage.setScene(scene);
//        stage.show();
//    }
@Override
public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
    primaryStage.setScene(new Scene(root));
    primaryStage.setTitle("OPT2 navigation example");
    primaryStage.show();
}

    public static void main(String[] args) {
    Gebruiker a = new Gebruiker("a", "a");
        launch();
    }
}