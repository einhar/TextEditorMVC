package com.ehr.editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EditorApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        primaryStage.setTitle("Text Editor");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        */

        FXMLLoader loader = new FXMLLoader(getClass().getResource("UI.fxml"));
        loader.setControllerFactory( t -> new EditorController(new EditorModel()));

        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
