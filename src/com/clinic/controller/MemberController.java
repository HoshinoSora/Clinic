package com.clinic.controller;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MemberController {
	
	
	public static void showView(String str) {
		try {
			Parent root = FXMLLoader.load(MemberController.class.getResource(str));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
