package com.example.gestionnairebanque.Model;

public class Taux {
    private Double valeurTaux;
    private String nomTaux;

    public Taux(Double valeurTaux, String nomTaux) {
        this.valeurTaux = valeurTaux;
        this.nomTaux = nomTaux;
    }

    public Double getValeurTaux() {
        return valeurTaux;
    }

    public String getNomTaux() {
        return nomTaux;
    }
}
