package com.clinic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
<<<<<<< HEAD
			Parent root = FXMLLoader.load(getClass().getResource("view/Admin.fxml"));
=======
<<<<<<< HEAD
			Parent root = FXMLLoader.load(getClass().getResource("view/Admin.fxml"));
=======
			Parent root = FXMLLoader.load(getClass().getResource("view/Reception.fxml"));
>>>>>>> 3575be49fae3cf655e2c3f799c3d747f498c32e8
>>>>>>> 91b0d26fd920a83cfa27b3841c65abc7d7b31d11
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
