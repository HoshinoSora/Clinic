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
			System.out.println("");
=======
			System.out.println("idbakgj");
>>>>>>> f59e32e0cc52aed254a12c6e4c3fb9d070788cf0
			Parent root = FXMLLoader.load(getClass().getResource("view/ClinicHome.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println("blah blah");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
