package com.clinic.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

public class AdminController {

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
	private VBox adVbViewReceptionist;

	@FXML
	private VBox adVbViewPatient;

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
				System.out.println("blah");
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
}