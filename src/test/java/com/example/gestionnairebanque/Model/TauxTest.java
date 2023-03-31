package com.example.gestionnairebanque.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TauxTest {
    private Taux t = new Taux(1.5,"double");
    @Test
    void getValeurTaux() {
        assertEquals(1.5,t.getValeurTaux());
    }

    @Test
    void getNomTaux() {
        assertEquals("double",t.getNomTaux());
    }
}