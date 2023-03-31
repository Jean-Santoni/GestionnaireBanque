package com.example.gestionnairebanque.Model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GestionnaireBancaireTest {
    @Test
    void testChargementTaux() {
        GestionnaireBancaire g = new GestionnaireBancaire();
        g.chargementTaux();
    }
    @Test
    void testChargementTransaction() {
        GestionnaireBancaire g = new GestionnaireBancaire();
        g.getListTransaction().add(new Transaction("sdhg",'c',10.0));
        ArrayList<Transaction> t = g.getListTransaction();
        g.enregistrementList();
        g.recuprationListe();
        assertEquals(t.get(0).getNom(),g.getListTransaction().get(0).getNom());
    }
    @Test
    void testOpreation() {
        GestionnaireBancaire g = new GestionnaireBancaire();
        Transaction t = new Transaction("sdhg",'d',10.0);
        g.operationCompte(t);
        assertEquals(-10.0,g.getSoldeCompte());
        Transaction t1 = new Transaction("sdhg",'c',10.0);
        g.operationCompte(t1);
        assertEquals(-0.3000000000000007,g.getSoldeCompte());
    }
}