package com.example.gestionnairebanque.Model;

public class Taux {
    private Double valeurTaux;
    private String nomTaux;
    /**
     * Constructeur de Taux
     *
     * @param valeurTaux valeur du taux
     * @param nomTaux nom du taux
     */
    public Taux(Double valeurTaux, String nomTaux) {
        this.valeurTaux = valeurTaux;
        this.nomTaux = nomTaux;
    }
    /**
     * retourne la valeur du taux
     */
    public Double getValeurTaux() {
        return valeurTaux;
    }
    /**
     * retourne le nom du taux
     */
    public String getNomTaux() {
        return nomTaux;
    }
}
