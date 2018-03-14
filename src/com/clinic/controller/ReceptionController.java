package com.clinic.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ReceptionController {

	@FXML
	private VBox reception;

	@FXML
	private MenuItem addPatient;

	@FXML
	private MenuItem createToken;

	@FXML
	private MenuItem dischargePatient;

	@FXML
	private MenuItem changePassword;

	@FXML
	private MenuItem logout;

	@FXML
	private VBox reVbAddPatient;

	@FXML
	private VBox reCreateToken;

	@FXML
	private VBox reViewPrescription;

	@FXML
	private VBox reChangePassword;

	@FXML
	void EditMenu(ActionEvent event) {
		changePassword.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				reChangePassword.visibleProperty().setValue(true);
				reVbAddPatient.visibleProperty().setValue(false);
				reCreateToken.visibleProperty().setValue(false);
				reViewPrescription.visibleProperty().setValue(false);
			}
		});
		
		logout.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					Parent root = FXMLLoader.load(getClass().getResource("../view/Loginform.fxml"));
					Stage stage = new Stage();
					stage.setScene(new Scene(root));
					stage.show();
					reception.getScene().getWindow().hide();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@FXML
	void PatientMenu(ActionEvent event) {
		addPatient.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				reChangePassword.visibleProperty().setValue(false);
				reVbAddPatient.visibleProperty().setValue(true);
				reCreateToken.visibleProperty().setValue(false);
				reViewPrescription.visibleProperty().setValue(false);
			}
		});
		
		createToken.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				reChangePassword.visibleProperty().setValue(false);
				reVbAddPatient.visibleProperty().setValue(false);
				reCreateToken.visibleProperty().setValue(true);
				reViewPrescription.visibleProperty().setValue(false);
			}
		});
		
		dischargePatient.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				reChangePassword.visibleProperty().setValue(false);
				reVbAddPatient.visibleProperty().setValue(false);
				reCreateToken.visibleProperty().setValue(false);
				reViewPrescription.visibleProperty().setValue(true);
			}
		});
	}

}
