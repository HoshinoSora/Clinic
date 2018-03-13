package com.clinic.controller;

import com.clinic.model.MemberLoginModel;
import com.clinic.model.entities.MemberEntity;
import com.clinic.model.entities.MemberEntity.Role;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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

	private MemberLoginModel memberLogin;

	@FXML
	void close(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	void toLoginForm(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Loginform.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			((Node) (event.getSource())).getScene().getWindow().hide();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void login(ActionEvent event) {
		try {
			String str = null;
			MemberEntity member = memberLogin.find(userName.getText(), password.getText());
			if (member.getRole() == Role.Admin) {
				str = "../view/Admin.fxml";
			} else if (member.getRole() == Role.Doctor) {
				str = "../view/Doctor.fxml";
			} else {
				str = "../view/Reception.fxml";
			}
			MemberController.showView(str);
			((Node) (event.getSource())).getScene().getWindow().hide();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
