package com.clinic;

import javafx.application.Application;
<<<<<<< HEAD
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
=======
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
>>>>>>> ffc046f038e6839dbfc4f65558d656bb12251014

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		try {
<<<<<<< HEAD
			Parent root=FXMLLoader.load(getClass().getResource("view/Loginform.fxml"));
=======
			Parent root = FXMLLoader.load(getClass().getResource("view/ClinicHome.fxml"));
>>>>>>> ffc046f038e6839dbfc4f65558d656bb12251014
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
