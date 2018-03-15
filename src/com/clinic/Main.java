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
			Parent root = FXMLLoader.load(getClass().getResource("view/Loginform.fxml"));
>>>>>>> d00bc603222b34b05d4c6c748083e3d8b79008e5
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
