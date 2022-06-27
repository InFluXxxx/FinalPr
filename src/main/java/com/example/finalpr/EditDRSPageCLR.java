package com.example.finalpr;

import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

import static com.example.finalpr.HelloApplication.documentRegistrationSystem;

public class EditDRSPageCLR {

    @FXML
    private JFXTextArea Address;

    @FXML
    private TextField Cost;

    @FXML
    private TextField DocumentRegistrationCode;

    @FXML
    private TextField OwnerID;

    @FXML
    private Label status;

    @FXML
    void Edit(MouseEvent event) {
        String documentRegistrationCode = DocumentRegistrationCode.getText();
        String ownerID = OwnerID.getText();
        String address = Address.getText();
        LocalDate date = LocalDate.now();
        double cost = Double.parseDouble(Cost.getText());

        documentRegistrationSystem.editEstate(documentRegistrationCode, ownerID, address, date, cost);
        status.setText("Estate Edited Successfully... :)");
    }

    @FXML
    void back(MouseEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DocumentRegistrationSystemPage.fxml"));
            Stage s1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            s1.setScene(scene);
            s1.show();
        }
        catch (IOException e) {

        }
    }

}