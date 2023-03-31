package com.example.gestionnairebanque;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controleur {
   @FXML
   private TextField TextFieldNom;
    @FXML
    private TextField TextFieldMontant;

    @FXML
    private ComboBox ComboCredit;
    @FXML
    private Button BtnEnregistrer;

    @FXML
    private ListView ListVCompte;
    @FXML
    private ObservableList<String> obsListCompte;


    @FXML
    private void initialize() {

    }
}