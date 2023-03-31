package com.example.gestionnairebanque;

import com.example.gestionnairebanque.Model.GestionnaireBancaire;
import com.example.gestionnairebanque.Model.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    private GestionnaireBancaire gestionnaireBancaire;


    @FXML
    private void initialize() {
     gestionnaireBancaire=new GestionnaireBancaire();
     obsListCompte = FXCollections.observableArrayList();
     ObservableList<String>listeCombo = FXCollections.observableArrayList();
     listeCombo.add("Crédit");
     listeCombo.add("Débit");
     ComboCredit.setItems(listeCombo);
     BtnEnregistrer.setOnMouseClicked(event -> actionEnregistrer(new ActionEvent() ));

    }
    private void actionEnregistrer(ActionEvent event){
      obsListCompte.add("test");
      ListVCompte.setItems(obsListCompte);


    }
}