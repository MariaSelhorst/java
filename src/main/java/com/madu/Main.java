package com.madu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Scene scene = LoginSceneController.CreateScene();
        stage.setScene(scene);
        stage.show();
    }
}
