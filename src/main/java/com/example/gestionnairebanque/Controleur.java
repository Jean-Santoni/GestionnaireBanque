package com.example.gestionnairebanque;

import com.example.gestionnairebanque.Model.GestionnaireBancaire;
import com.example.gestionnairebanque.Model.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

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
    @FXML
    private Label LabelValeurSolde;

    private GestionnaireBancaire gestionnaireBancaire;

 /**
  * Gère les différentes actions de la fenêtre
  */
    @FXML
    private void initialize() {
     gestionnaireBancaire=new GestionnaireBancaire();
     gestionnaireBancaire.recuprationListe();
     obsListCompte = FXCollections.observableArrayList();
     ObservableList<String>listeCombo = FXCollections.observableArrayList();
     listeCombo.add("Crédit");
     listeCombo.add("Débit");
     ComboCredit.setItems(listeCombo);
     BtnEnregistrer.setOnMouseClicked(event -> actionEnregistrer(new ActionEvent() ));
     LabelValeurSolde.setText(gestionnaireBancaire.getSoldeCompte().toString());
     if (gestionnaireBancaire.getSoldeCompte()<0){
      LabelValeurSolde.setTextFill(Color.rgb(255,0,0));
     }else{
      LabelValeurSolde.setTextFill(Color.rgb(0,255,0));
     }

    }
 /**
  * Gère l'evenement crée par le clique du bouton
  * @param event
  */
    private void actionEnregistrer(ActionEvent event){
     Character c=' ';
     if(ComboCredit.toString().equals("Crédit")){
      c='c';
     }else{
      c='d';
     }
     Transaction t1 = new Transaction(TextFieldNom.getText(),c,Double.valueOf(TextFieldMontant.getText()));
     gestionnaireBancaire.getListTransaction().add(t1);
     gestionnaireBancaire.operationCompte(t1);
      obsListCompte.add(t1.getNom()+t1.getMontant());
      ListVCompte.setItems(obsListCompte);
      gestionnaireBancaire.enregistrementList();
     LabelValeurSolde.setText(gestionnaireBancaire.getSoldeCompte().toString());


    }
}