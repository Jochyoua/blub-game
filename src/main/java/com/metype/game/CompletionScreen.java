package com.metype.game;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class CompletionScreen {

    HBox rootPane;

    public CompletionScreen() {

        try {
            rootPane = new FXMLLoader(HelloApplication.class.getResource("workingCompletionScreen.fxml")).load();
        } catch (IOException ignored){

        }
    }

    public Pane getRootPane() {
        return rootPane ;
    }
}