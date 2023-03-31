package com.example.gestionnairebanque.Model;

import java.io.Serializable;

public class Transaction implements Serializable {
    private String Nom;
    private Character Type;
    private double Montant;

    public Transaction(String nom,Character type,double montant) {
        this.Nom = nom;
        this.Montant=montant;
        this.Type=type;
    }

    public String getNom() {
        return Nom;
    }

    public Character getType() {
        return Type;
    }

    public double getMontant() {
        return Montant;
    }
}
