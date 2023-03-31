package com.example.gestionnairebanque.Model;

import java.io.Serializable;

public class Transaction implements Serializable {
    private String Nom;
    private Character Type;
    private Double Montant;
    /**
     * Constructeur de Transaction
     *
     * @param nom nom de la transaction
     * @param type type de la transaction
     * @param montant montant de la transaction
     */
    public Transaction(String nom,Character type,double montant) {
        this.Nom = nom;
        this.Montant=montant;
        this.Type=type;
    }
    /**
     * retourne le nom de la transaction
     */
    public String getNom() {
        return Nom;
    }
    /**
     * retourne le type de la transaction
     */
    public Character getType() {
        return Type;
    }
    /**
     * retourne le montant de la transaction
     */
    public double getMontant() {
        return Montant;
    }
}
