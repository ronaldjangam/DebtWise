package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/view/DebtManagementView.fxml"));
        Parent root = loader.load();

  
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Debt Management Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
