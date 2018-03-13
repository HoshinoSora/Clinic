package com.clinic;
	
import javafx.application.Application;
<<<<<<< HEAD
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
=======
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
>>>>>>> parent of 7834722... Merge branch 'master' of https://github.com/HoshinoSora/Clinic

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		try {
<<<<<<< HEAD
			Parent root = FXMLLoader.load(getClass().getResource("view/ClinicHome.fxml"));
=======
			Parent root=FXMLLoader.load(getClass().getResource("view/Loginform.fxml"));
>>>>>>> parent of 7834722... Merge branch 'master' of https://github.com/HoshinoSora/Clinic
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
