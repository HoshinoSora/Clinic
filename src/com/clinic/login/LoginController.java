package com.clinic.login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private TextField userName;

	@FXML
	private PasswordField password;

	@FXML
	private RadioButton adminRole;

	@FXML
	private RadioButton doctorRole;

	@FXML
	private RadioButton receptionRole;

	@FXML
	void close(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	void toLoginForm(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Loginform.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public static void login(ActionEvent event) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
