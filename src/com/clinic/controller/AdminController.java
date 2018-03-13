package com.clinic.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class AdminController {

    @FXML
    private VBox adVbAddMember;

    @FXML
    private VBox adVbViewDoctor;

    @FXML
    private VBox adVbViewReceptionist;

    @FXML
    private VBox adVbViewPatient;

    @FXML
    private VBox adChangePassword;

    @FXML
    void AdAddMember(ActionEvent event) {
    	System.out.println("blah");
    }

    @FXML
    void AdChangePassword(ActionEvent event) {

    }

    @FXML
    void AdLogout(ActionEvent event) {

    }

    @FXML
    void AdViewDoctor(ActionEvent event) {

    }

    @FXML
    void AdViewPatient(ActionEvent event) {

    }

    @FXML
    void AdViewReception(ActionEvent event) {

    }

}
