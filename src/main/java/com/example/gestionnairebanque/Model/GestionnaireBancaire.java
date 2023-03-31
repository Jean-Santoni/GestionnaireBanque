package com.example.gestionnairebanque.Model;

import java.util.*;

public class GestionnaireBancaire {
    private ArrayList<Transaction> listTransaction;
    private ArrayList<Taux> listTaux;
    private Double soldeCompte;

    public GestionnaireBancaire() {
        this.listTransaction = new ArrayList<Transaction>() ;
        this.listTaux = new ArrayList<Taux>();
        this.soldeCompte = 0.0;
    }
}
