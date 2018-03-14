package com.clinic.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdminController {

	@FXML
	private VBox admin;

	@FXML
	private MenuItem addMember;

	@FXML
	private MenuItem changePassword;

	@FXML
	private MenuItem logout;

	@FXML
	private MenuItem viewDoctor;

	@FXML
	private MenuItem viewReception;

	@FXML
	private MenuItem viewPatient;

	@FXML
	private VBox adVbAddDoctor;

	@FXML
	private VBox adVbViewDoctor;

	@FXML
	private TextField doctorName;

	@FXML
	private TableView<?> doctorTable;

	@FXML
	private VBox adVbViewReceptionist;

	@FXML
	private TextField receptionistName;

	@FXML
	private VBox adVbViewPatient;

	@FXML
	private TextField patientName;

	@FXML
	private VBox adChangePassword;

	@FXML
	void EditMenu() {
		addMember.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				adVbAddDoctor.visibleProperty().set(true);
				adVbViewDoctor.visibleProperty().set(false);
				adVbViewPatient.visibleProperty().set(false);
				adVbViewReceptionist.visibleProperty().set(false);
				adChangePassword.visibleProperty().set(false);
			}
		});

		changePassword.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				adVbAddDoctor.visibleProperty().set(false);
				adVbViewDoctor.visibleProperty().set(false);
				adVbViewPatient.visibleProperty().set(false);
				adVbViewReceptionist.visibleProperty().set(false);
				adChangePassword.visibleProperty().set(true);
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
					admin.getScene().getWindow().hide();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@FXML
	void ViewMenu(ActionEvent event) {
		viewDoctor.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				adVbAddDoctor.visibleProperty().set(false);
				adVbViewDoctor.visibleProperty().set(true);
				adVbViewPatient.visibleProperty().set(false);
				adVbViewReceptionist.visibleProperty().set(false);
				adChangePassword.visibleProperty().set(false);
			}
		});

		viewPatient.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				adVbAddDoctor.visibleProperty().set(false);
				adVbViewDoctor.visibleProperty().set(false);
				adVbViewPatient.visibleProperty().set(true);
				adVbViewReceptionist.visibleProperty().set(false);
				adChangePassword.visibleProperty().set(false);
			}
		});

		viewReception.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				adVbAddDoctor.visibleProperty().set(false);
				adVbViewDoctor.visibleProperty().set(false);
				adVbViewPatient.visibleProperty().set(false);
				adVbViewReceptionist.visibleProperty().set(true);
				adChangePassword.visibleProperty().set(false);
			}
		});
	}

	@FXML
	void findDoctor(ActionEvent event) {

	}

	@FXML
	void findPatient(ActionEvent event) {

	}

	@FXML
	void findReceptionist(ActionEvent event) {

	}

	@FXML
	void updatePassword(ActionEvent event) {

	}
}