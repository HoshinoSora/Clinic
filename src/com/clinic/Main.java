package com.clinic;
	
import javafx.application.Application;
<<<<<<< HEAD
<<<<<<< HEAD
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
=======
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
=======
>>>>>>> parent of 814ed28... LoginDesign
import javafx.stage.Stage;
import javafx.scene.Scene;
<<<<<<< HEAD
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
>>>>>>> parent of 7834722... Merge branch 'master' of https://github.com/HoshinoSora/Clinic
=======
import javafx.scene.layout.BorderPane;

>>>>>>> parent of 814ed28... LoginDesign

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
<<<<<<< HEAD
<<<<<<< HEAD
			Parent root = FXMLLoader.load(getClass().getResource("view/ClinicHome.fxml"));
=======
			Parent root=FXMLLoader.load(getClass().getResource("view/Loginform.fxml"));
>>>>>>> parent of 7834722... Merge branch 'master' of https://github.com/HoshinoSora/Clinic
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("view/application.css").toExternalForm());
=======
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
>>>>>>> parent of 814ed28... LoginDesign
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
